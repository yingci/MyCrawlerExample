package crawler.example;
//ptt取內文
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.github.abola.crawler.CrawlerPack;

public class PttReply {

	public static void main(String[] args) {
		
		String uri = "https://www.ptt.cc/bbs/Lions/M.1458829865.A.AFF.html";

		Elements elems =
				CrawlerPack.start()
			    .addCookie("over18", "1")
				.getFromHtml(uri)
				.select("#main-content") ;
			
			for( Element elem: elems.select("span,div") ){
				elem.remove();
			}
			
			System.out.println(elems.text());
	}

}
