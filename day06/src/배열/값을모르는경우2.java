package 배열;

public class 값을모르는경우2 {

	public static void main(String[] args) {

		String[] name = new String[21];
		
		name[0] = "홍길동";
		name[2] = "김길동";
		name[5] = "박길동";
		name[16] = "신길동";
		name[20] = "서길동";
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(i + ": " + name[i]);
		}
	
		
		
	}

}
