package crawling;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링2 {

	public static void main(String[] args) {

		String[] codes = { "068270", "005930", "035720", "010145", "006405", 
				 			"207940", "004310", "095700", "091990", "017670" };

		for (int i = 0; i < codes.length; i++) {

			Document doc = null; // 지역(local)변수

			try {
				doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + codes[i]).get();
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

			try {
				FileWriter file = new FileWriter(name + ".txt");
				file.write(code + "\n");
				file.write(name + "\n");
				file.write(now + "\n");
				file.write(low + "\n");
			} catch (IOException e) {
				System.out.println("파일 저장 중 에러 발생");
			}

			System.out.println("--------------");

		}

	}
}
