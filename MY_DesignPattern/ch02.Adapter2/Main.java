package AdapterPattern2;

// Ŭ���̾�Ʈ = ��
public class Main {
	public static void main(String[] args) {
		Charger_TypeC chargerTypeC = new Adapter("�̺ϸ�����");		// CŸ�� �����⿡ ����� �����
		chargerTypeC.charging_TypeC();	// �����ϱ�
	}
}
