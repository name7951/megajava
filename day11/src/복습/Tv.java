package ����;

public class Tv {
	// �޼ҵ� ����
	// �������, ��������, �ڵ� �ʱ�ȭ
	int channel;
	int vol;
	boolean onoff;
	static int count;
	
	// ������ �����ε�, �Է°� �ٸ����ϸ� ������ �޼ҵ带 ���
	public Tv(int channel, int vol, boolean onoff) {
		count++; // ��������
//		System.out.println("��ü ���� ������ " + count);
		this.channel = channel;
		this.vol = vol;
		this.onoff = onoff;
	}

	@Override
	public String toString() {
		return "Tv [ä�� =" + channel + ", ���� =" + vol + ", ���� =" + onoff + "]";
	}
	
}
