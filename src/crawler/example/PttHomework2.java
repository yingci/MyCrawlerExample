package crawler.example;

import com.github.abola.crawler.CrawlerPack;


/**
 * 簡易練習
 * 
 * 找出所有文章中按推的id
 * 
 * @author Abola Lee
 *
 */
public class PttHomework2 {
	
	public static void main(String[] args) {
		String uri = "https://www.ptt.cc/bbs/Gossiping/M.1459039136.A.8E7.html";
		

		System.out.println( 
			CrawlerPack.start()
			    .addCookie("over18", "1")
				.getFromHtml(uri)
				//.select("span.f3.push-userid ")// 如何取得按推的id ? >>>Fill here<<< 
				.select("div:contains(作者)")//發文者
				//.select("span.article-meta-value")//文章標題
				//.select("span.article-meta-value")//按推總數
				//.select("span.article-meta-value")//不重複推文數
				//.select("span.article-meta-value")//按噓總數
				//.select("span.article-meta-value")//不重複噓文數
				//.select("span.article-meta-value")//不重複噓文數
				.toString()
				
		);
	}
}
