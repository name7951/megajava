package bbs;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BbsUi extends JFrame {

	public BbsUi() {

		setTitle("게시판");
		setSize(400, 600);

		JLabel l1 = new JLabel("나의 게시판");
		JLabel l2 = new JLabel("   ID   ");
		JLabel l3 = new JLabel("  TITLE ");
		JLabel l4 = new JLabel(" CONTENT");
		JLabel l5 = new JLabel(" WRITER ");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);

		JButton b1 = new JButton("게시물 작성");
		JButton b2 = new JButton("게시물 삭제");
		JButton b3 = new JButton("게시물 검색");

		Font font1 = new Font("굴림", Font.BOLD, 50);
		Font font2 = new Font("굴림", Font.BOLD, 30);

		FlowLayout flow = new FlowLayout();
		setLayout(flow);

		l1.setFont(font1);
		l2.setFont(font2);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);

		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		t4.setFont(font2);

		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);

		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(l5);
		add(t4);
		add(b1);
		add(b2);
		add(b3);

		getContentPane().setBackground(Color.lightGray);
		b1.setBackground(Color.cyan);
		b2.setBackground(Color.red);
		b3.setBackground(Color.green);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 입력한 값 가지고 오기
				String id = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				String writer = t4.getText();

				// DAO에 전달
				BbsDAO dao = new BbsDAO();

				BbsBag bag = new BbsBag();
				bag.setId(id);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);

				dao.create(bag);
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();

				BbsDAO dao = new BbsDAO();
				dao.delete(id);
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();

				BbsDAO dao = new BbsDAO();
				BbsBag bag = dao.read(id);

				t1.setText(bag.getId());
				t2.setText(bag.getTitle());
				t3.setText(bag.getContent());
				t4.setText(bag.getWriter());

				t1.setForeground(Color.red);
				t2.setForeground(Color.red);
				t3.setForeground(Color.red);
				t4.setForeground(Color.red);

			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {

		new BbsUi();

	}

}
