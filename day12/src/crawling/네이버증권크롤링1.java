package crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ�1 {

	public static void main(String[] args) {

		Document doc = null; // ����(local)����

		try {
			doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=068270").get();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("Crawling �ϴ� �� ���� �߻�");
		}

//		System.out.println(doc);
		Elements list = doc.select(".code");
//		System.out.println(list.size() + "��");
		String code = list.get(0).text();
		System.out.println("�ڵ� : " + code);

		Elements list1 = doc.select(".wrap_company a"); // wrap_company ���� ��򰡿� �Ҽ�
//		System.out.println(list1.size() + "��");
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println(i + " : " + list1.get(i).text());
//		}
		String name = list1.get(0).text();
		System.out.println("ȸ��� : " + name);

	}
}
