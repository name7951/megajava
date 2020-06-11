package crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3 {

	public String[] naver(String data) {

		Document doc = null; // 지역(local)변수

		try {
			doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + data).get();
		} catch (IOException e) {
			System.out.println("Crawling 하는 중 에러 발생");
		}

		Elements list = doc.select(".code");
		String code = list.get(0).text();
		System.out.println("코드 : " + code);

		Elements list1 = doc.select(".wrap_company a"); // wrap_company 하위 어딘가에 소속
		String name = list1.get(0).text();
		System.out.println("회사명 : " + name);

		Elements list2 = doc.select("span.blind"); // wrap_company 하위 어딘가에 소속
		String now = list2.get(12).text();
		System.out.println("현재가 : " + now + "원");

		Elements list3 = doc.select("span.blind");
		String low = list3.get(20).text();
		System.out.println("저가 : " + low + "원");

		System.out.println("--------------");

		String[] value = { now, low };
		return value;

	}

}
