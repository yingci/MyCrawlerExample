package crawler.example;

import com.github.abola.crawler.CrawlerPack;

public class elephant {

	public static void main(String[] args) {
		String url2 = "https://www.ptt.cc/bbs/Elephants/M.1425740801.A.639.html";
		//ptt取標題
	      String title2 =
	        CrawlerPack.start()
	            .getFromHtml(url2)
	            .select("div>span").text();
	      //ptt取時間
//	      String title3 =
//	    	CrawlerPack.start()
//	    	    .getFromHtml(url2)
//	      		.select("").text();
	      System.out.println(title2);
	}

}
