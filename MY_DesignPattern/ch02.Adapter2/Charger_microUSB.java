package AdapterPattern2;

// 5�� ������(���� ���� ���� �ִ� ��)
public class Charger_microUSB {
	private String device = "";		// ��ġ �̸�
	
	public Charger_microUSB(String device) {	// ��ġ �̸��� ���ڷ� �����鼭 ����
		this.device = device;
	}
	
	public void charging_microUSB() {	// 5�� ������� �����ϴ� �޼ҵ�
		System.out.println("---" + device + " ������ ---");
	}
}
