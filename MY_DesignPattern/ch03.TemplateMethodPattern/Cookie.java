package TemplateMethodPattern;

// AbstractCook�� ��ӹ޾� �߻� �޼ҵ���� ��ü������ �����ϴ� Ŭ����
// �������� Ŭ�� ���� ��Ű �����Ǹ� ����� Ŭ����
public class Cookie extends AbstractCook {
	@Override
	public void ready() {		// �丮 ��� �غ�
		System.out.println("�а���, ����, ����, ���, ���ݸ��� �غ��մϴ�.");
	}
	@Override
	public void bake() {		// ����
		System.out.println("��Ű ������� ����� �����ϴ�.");
	}
	@Override
	public void decoration() {	// ����ϱ�
		System.out.println("��Ű�� ���ڰ� �ٸ��ݴϴ�.");
	}
}
