package 정적멤버;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {

	public static void main(String[] args) throws Exception {
		// 체인식 코딩 - 계속해서 코딩 가능
		// 외부 자원과 연결할 경우 예외처리
		Document doc = Jsoup.connect("http://www.naver.com").get();
		System.out.println(doc);

		// <span class = "date"> 20200609 </span>
		// 메타 데이터 (부가적인 데이터)
		Elements list = doc.select(".current");
		// select 안에 검색 가능한 것
		// 태그이름(태그이름), 클래스이름(.클래스), id이름(#id)
		System.out.println(list.size());

		FileWriter file = new FileWriter("naver.txt");

		for (Element e : list) {
			System.out.println(e.text());
			file.write(e.text() + "\n");
		}
		file.close(); // stream

	}

}
