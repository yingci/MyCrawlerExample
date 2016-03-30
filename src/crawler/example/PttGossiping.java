package crawler.example;

import com.github.abola.crawler.CrawlerPack;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.ArrayList;
import java.util.List;

/**
 * 範例: 使用爬蟲包取得八卦版最後50篇文章的網址   !finish!
 */
class PttGossiping {

    final static String gossipMainPage = "hhttp://www.cpbl.com.tw/web/team_playergrade.php?&gameno=01&team=A02&year=2015&grade=3&syear=2015";
    final static String gossipIndexPage = "http://www.cpbl.com.tw/players/person.html?player_id=%s&teamno=A02";
    // 取得最後幾篇的文章數量
    static Integer loadLastPosts = 85;

    public static void main(String[] argv){

        String prevPage =
            CrawlerPack.start()
                .addCookie("over18","1")                // 八卦版進入需要設定cookie
                .getFromHtml(gossipMainPage)            // 遠端資料格式為 HTML
                .select(".action-bar .pull-right > a")  // 取得右上角『前一頁』的內容
                .get(1).attr("href")
                .replaceAll("([A-Z0-9]+)", "$1");
       
        // 目前最末頁 index 編號
        Integer lastPage = Integer.valueOf(prevPage)+1;
 
        List<String> lastPostsLink = new ArrayList<String>();

        while ( loadLastPosts > lastPostsLink.size() ){
            String currPage = String.format(gossipIndexPage, lastPage--);

            Elements links =
                CrawlerPack.start()
                    .addCookie("over18", "1")
                    .getFromHtml(currPage)
                    .select(".title > a");

            for( Element link: links) lastPostsLink.add( link.attr("href") );
           
        }
// System.out.println(lastPostsLink);
      //   檢視結果
        for(String url : lastPostsLink){
            System.out.println("https://www.ptt.cc"+url);
        }
        
        
        
        
    }
}