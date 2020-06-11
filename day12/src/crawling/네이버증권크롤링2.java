package crawling;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ�2 {

	public static void main(String[] args) {

		String[] codes = { "068270", "005930", "035720", "010145", "006405", 
				 			"207940", "004310", "095700", "091990", "017670" };

		for (int i = 0; i < codes.length; i++) {

			Document doc = null; // ����(local)����

			try {
				doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + codes[i]).get();
			} catch (IOException e) {
				System.out.println("Crawling �ϴ� �� ���� �߻�");
			}

			Elements list = doc.select(".code");
			String code = list.get(0).text();
			System.out.println("�ڵ� : " + code);

			Elements list1 = doc.select(".wrap_company a"); // wrap_company ���� ��򰡿� �Ҽ�
			String name = list1.get(0).text();
			System.out.println("ȸ��� : " + name);

			Elements list2 = doc.select("span.blind"); // wrap_company ���� ��򰡿� �Ҽ�
			String now = list2.get(12).text();
			System.out.println("���簡 : " + now + "��");

			Elements list3 = doc.select("span.blind");
			String low = list3.get(20).text();
			System.out.println("���� : " + low + "��");

			try {
				FileWriter file = new FileWriter(name + ".txt");
				file.write(code + "\n");
				file.write(name + "\n");
				file.write(now + "\n");
				file.write(low + "\n");
			} catch (IOException e) {
				System.out.println("���� ���� �� ���� �߻�");
			}

			System.out.println("--------------");

		}

	}
}
