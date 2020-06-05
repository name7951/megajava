package 생성자;

class BbsUse {

	public static void main(String[] args) {

		// Board 와 비교
		Bbs bbs = new Bbs();

		int number1 = bbs.num(1);
		String title1 = bbs.title("java");
		String content1 = bbs.content("fun java");
		String writer1 = bbs.writer("park");

		int number2 = bbs.num(2);
		String title2 = bbs.title("jsp");
		String content2 = bbs.content("fun jsp");
		String writer2 = bbs.writer("hong");

		int number3 = bbs.num(3);
		String title3 = bbs.title("spring");
		String content3 = bbs.content("fun spring");
		String writer3 = bbs.writer("kim");

	}

}
