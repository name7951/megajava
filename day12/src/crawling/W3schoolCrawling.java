package crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class W3schoolCrawling {

	public static void main(String[] args) {
		// 예외처리 해야되는 경우
		// 에러가 발생하여 프로그램이 중단될 것 같은 경우
		// 중단되지 않고 처리를 계속하기 위해서

		// 외부 자원을 연결하여 사용하는 경우 (네트워크, 파일, db, CPU)
		Document doc = null; // 지역(local)변수

		try {
			doc = Jsoup.connect("https://www.w3schools.com/").get();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("Crawling 하는 중 에러 발생");
		}

		System.out.println(doc);
		Elements list = doc.select("h1");
		System.out.println(list.size() + "개 있음");

		for (Element e : list) {
			System.out.println(e.text());
		}

		for (int i = 0; i < list.size(); i++) {
			if (i == 2 || i == 5) {
				continue; // skip
			}
			System.out.println(list.get(i).text());
		}

		System.out.println("------------------");

		Elements list1 = doc.select("h3");

		System.out.println(list1.size() + "개");

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + " : " + list1.get(i).text());
		}
		
		System.out.println("------------");
		System.out.println(list1.get(24).text());

	}

}
