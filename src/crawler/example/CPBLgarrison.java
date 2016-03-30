package crawler.example;

import java.util.ArrayList;
import java.util.List;

import com.github.abola.crawler.CrawlerPack;

public class CPBLgarrison {

	public static void main(String[] args) {
		String uri = "http://www.cpbl.com.tw/web/team_playergrade.php?&gameno=01&team=L01&year=2015&grade=3&syear=2015";
		
		String NAME=
				CrawlerPack.start()
				    .getFromXml(uri)
				    .select("td:eq(0)").text();.
				    
		 System.out.println(NAME3);
			//String[] NAME2=NAME.split(" ");
			System.out.println("NAME");
			for(String NAME3 : NAME2){
				System.out.println(NAME3);
			}	
//			
////				
//			String PO=
//					CrawlerPack.start()
//					    .getFromXml(uri)
//					    .select("td:eq(5)").text();
//					
//				String[] PO2=PO.split(" ");
//				System.out.println("PO");
//				for(String PO3 : PO2){
//		            System.out.println(PO3);
//				}		    
//		 
//				String A=
//						CrawlerPack.start()
//						    .getFromXml(uri)
//						    .select("td:eq(6)").text();
//						
//					String[] A2=A.split(" ");
//					System.out.println("A");
//					for(String A3 : A2){
//			            System.out.println(A3);
//					}

		 

	}

}
