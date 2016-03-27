package crawler.example;
import com.github.abola.crawler.CrawlerPack;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * 範例: 使用爬蟲包取得八卦版最後50篇文章的網址
 */
class PttLion {

    final static String LionMainPage = "https://www.ptt.cc/bbs/Lions/index.html";
    final static String LionIndexPage = "https://www.ptt.cc/bbs/Lions/index%s.html";
    // 取得最後幾篇的文章數量
    static Integer loadLastPosts = 50;

    public static void main(String[] argv){

       /* String prevPage =
            CrawlerPack.start()
                .getFromHtml(LionMainPage)            // 遠端資料格式為 HTML
                .select(".action-bar .pull-right > a")  // 取得右上角『前一頁』的內容
                .get(1).attr("href")
                .replaceAll("/bbs/Lions/index([0-9]+).html", "$1");
        // 目前最末頁 index 編號
        Integer lastPage = Integer.valueOf(prevPage)+1;

        List<String> lastPostsLink = new ArrayList<String>();

        while ( loadLastPosts > lastPostsLink.size() ){
            String currPage = String.format(LionIndexPage, lastPage--);

            Elements links =
                CrawlerPack.start()
                    .addCookie("over18", "1")
                    .getFromHtml(currPage)
                    .select(".title > a");

            for( Element link: links) lastPostsLink.add( link.attr("href") );
        }

        // 檢視結果
        for(String url : lastPostsLink){
        	
            System.out.println("https://www.ptt.cc"+url);
        }
        
       String url1 ="https://www.ptt.cc/bbs/StupidClown/index.html";
       String title0=
        CrawlerPack.start()
            .getFromHtml(url1)
            .select("div.title > a").text();
       		.select("div.bbs-screen bbs-content > a").text();
       		.select("span:containsOwn(標題) + span:eq(1)").text();
       System.out.println(title0);
        
       */
      String url2 = "https://www.ptt.cc/bbs/Lions/M.1458829865.A.AFF.html";
      String title2 =
        CrawlerPack.start()
            .getFromHtml(url2)
            .select("span:containsOwn(標題) + span:eq(1)").text();
      String title3 =
    	CrawlerPack.start()
    	    .getFromHtml(url2)
      		.select("span:containsOwn(時間) + span:eq(1)").text();
      String title4 =
    	CrawlerPack.start()
    	    .getFromHtml(url2)
    	    .select(".f3.push-content").text();
      String title5 =
    	    	CrawlerPack.start()
    	    	    .getFromHtml(url2)
    	    	    .select(".f3.push-content").text();
        System.out.println(title2+"\n"+title3+"\n"+title4+"\n"+title5);
        
    }
}

