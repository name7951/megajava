package crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링1 {

	public static void main(String[] args) {

		Document doc = null; // 지역(local)변수

		try {
			doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=068270").get();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("Crawling 하는 중 에러 발생");
		}

//		System.out.println(doc);
		Elements list = doc.select(".code");
//		System.out.println(list.size() + "개");
		String code = list.get(0).text();
		System.out.println("코드 : " + code);

		Elements list1 = doc.select(".wrap_company a"); // wrap_company 하위 어딘가에 소속
//		System.out.println(list1.size() + "개");
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println(i + " : " + list1.get(i).text());
//		}
		String name = list1.get(0).text();
		System.out.println("회사명 : " + name);

	}
}
