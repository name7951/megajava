package �������;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {

	public static void main(String[] args) throws Exception {
		// ü�ν� �ڵ� - ����ؼ� �ڵ� ����
		// �ܺ� �ڿ��� ������ ��� ����ó��
		Document doc = Jsoup.connect("http://www.naver.com").get();
		System.out.println(doc);

		// <span class = "date"> 20200609 </span>
		// ��Ÿ ������ (�ΰ����� ������)
		Elements list = doc.select(".current");
		// select �ȿ� �˻� ������ ��
		// �±��̸�(�±��̸�), Ŭ�����̸�(.Ŭ����), id�̸�(#id)
		System.out.println(list.size());

		FileWriter file = new FileWriter("naver.txt");

		for (Element e : list) {
			System.out.println(e.text());
			file.write(e.text() + "\n");
		}
		file.close(); // stream

	}

}
