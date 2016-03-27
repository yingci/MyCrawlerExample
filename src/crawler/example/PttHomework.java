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
public class PttHomework {
	
	public static void main(String[] args) {
		String uri = "https://www.ptt.cc/bbs/Gossiping/M.1458547807.A.32A.html";
		

		System.out.println( 
			CrawlerPack.start()
			    .addCookie("over18", "1")
				.getFromHtml(uri)
				.select("span:containsOwn(推) + span:eq(1)")// 如何取得按推的id ? >>>Fill here<<<
				.text()  

				//.toString()
		);
	}
}
