package AdapterPattern2;

// Adapter Ŭ����
public class Adapter extends Charger_TypeC {
	private Charger_microUSB chargerMicroUSB;		//Charger_microUSB(5�� ������) ��ü�� ����
	
	public Adapter(String device) {
		chargerMicroUSB = new Charger_microUSB(device);	//Charger_microUSB(5�� ������) ��ü�� ����
	}
	
	@Override									// 5�� ������ --> ����� --> CŸ�� ������ --> CŸ�� �����⸦ ���� ��� �����ϱ�
	public void charging_TypeC() {				// CŸ�� ������� �����ϴ� �޼ҵ�
		chargerMicroUSB.charging_microUSB();	// ��¥ ������ 5�� �����Ⱑ ��
	}
}
