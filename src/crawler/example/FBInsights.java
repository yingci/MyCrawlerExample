package crawler.example;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.github.abola.crawler.CrawlerPack;


/**
 * 資料探索練習 Facebook Graph Api Search 
 * 
 * 重點
 * 1. 利用Graph Api調整出需要的資料
 * 2. 取得一組Access Token (long term token)
 * 3. 試著用你會的方式，先行探索資料
 * 
 * @author Abola Lee
 *
 */
public class FBInsights {
	
	public static void main(String[] args) {
		
		// 遠端資料路徑
		// >>>Fill here<<< 
		String uri = 
				"https://graph.facebook.com/v2.5"
				+ "/search?q=%E9%9D%A0%E5%8C%97&type=page&limit=1000&fields=id,name,likes,talking_about_count"  // 補完
				+ "&access_token=CAAWKlrSqgqsBALhWK7CCCmVcECMukBCZCqP0csQOoH1m9dmx2bHLjzgjRRMJgTN3vLqodKjPgwX7FR5zy"
				+ "MMbQZCKXpSE69bT7u2NbHFI7bbJ6YUv9uxNg2usygfN1ujBISZB75xRguBWtF9v4WwsQZBNGq5Kvx48UFGvfZAsriQ72JjL6vk8PlhmQS5lID7IZD";  
		
		// Jsoup select 後回傳的是  Elements 物件
		Elements elems =
				CrawlerPack.start()
				.getFromJson(uri)
				.select("data");
		/* "data": [
		          {
		            "id": "611695668927468",
		            "name": "靠北淡江",
		            "likes": 15913,
		            "talking_about_count": 5129
		          },*/
		String output = "id,按讚數,名稱,討論人數\n";
		
		// 遂筆處理
		for( Element data: elems ){
			
			// 如何取出資料??
			// >>>Fill here<<< 
			String id =  data.select("id").text();
			String likes = data.select("likes").text();
			String name = data.select("name").text();
			String talking_about_count = data.select("talking_about_count").text();
			
			output += id+","+likes+",\""+name+"\","+talking_about_count+"\n";
		}
		
		System.out.println( output );
	} 
}
