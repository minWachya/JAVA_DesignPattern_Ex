package IteratorPattern;

// �����ǿ� �� ��� Ŭ����
public class People {
	private String name;		// �̸�
	private String phoneNumber;	// �ڵ��� ��ȣ
	private String time;		// ���� �ð�, ��
	
	public People(String n, String p, String t) {	// �̸�, ��ȣ, ���� �ð��� �Է¹޾� ��ü ����
		name = n;
		phoneNumber = p;
		time = t;
	}
	
	public String getInformation() {	// �ڽ��� ������ ��ȯ 
		return name + " " + phoneNumber + " " + time;
	}
}
