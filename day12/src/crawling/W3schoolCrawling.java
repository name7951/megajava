package crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class W3schoolCrawling {

	public static void main(String[] args) {
		// ����ó�� �ؾߵǴ� ���
		// ������ �߻��Ͽ� ���α׷��� �ߴܵ� �� ���� ���
		// �ߴܵ��� �ʰ� ó���� ����ϱ� ���ؼ�

		// �ܺ� �ڿ��� �����Ͽ� ����ϴ� ��� (��Ʈ��ũ, ����, db, CPU)
		Document doc = null; // ����(local)����

		try {
			doc = Jsoup.connect("https://www.w3schools.com/").get();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("Crawling �ϴ� �� ���� �߻�");
		}

		System.out.println(doc);
		Elements list = doc.select("h1");
		System.out.println(list.size() + "�� ����");

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

		System.out.println(list1.size() + "��");

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + " : " + list1.get(i).text());
		}
		
		System.out.println("------------");
		System.out.println(list1.get(24).text());

	}

}
