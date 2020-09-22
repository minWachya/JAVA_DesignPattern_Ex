package TemplateMethodPattern;

//AbstractCook�� ��ӹ޾� �߻� �޼ҵ���� ��ü������ �����ϴ� Ŭ����
//�������� Ŭ�� ���� ���� �����Ǹ� ����� Ŭ����
public class Pie extends AbstractCook {
	@Override
	public void ready() {		// �丮 ��� �غ�
		System.out.println("�а���, ����, ����, �ұ�, ���, ����� �غ��մϴ�.");
		appleFilling();			// ��� �ʸ� �����
	}
	@Override
	public void bake() {		// ����
		System.out.println("���ִ� ���̸� �����ϴ�.");
	}
	@Override
	public void decoration() {	// ����ϱ�
		System.out.println("���� ����� ���̸� ����մϴ�.");
	}
	
	public void appleFilling() {// Pie Ŭ�������� ��ü������ ������ Ŭ����, ��� �ʸ� �����
		System.out.println("����� �ʸ��� ����ϴ�.");
	}
}
