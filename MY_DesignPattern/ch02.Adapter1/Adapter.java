package AdapterPattern1;

// Adapter Ŭ����
public class Adapter extends Charger_microUSB implements Charger_TypeC {
	public Adapter(String device) {
		super(device);
	}
	
	@Override						// 5�� ������ --> ����� --> CŸ�� ������ --> CŸ�� �����⸦ ���� ��� �����ϱ�
	public void charging_TypeC() {	// CŸ�� ������� �����ϴ� �޼ҵ�
		charging_microUSB();		// ��¥ ������ 5�� �����Ⱑ ��
	}
}
