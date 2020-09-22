package TemplateMethodPattern;

// �߻� Ŭ����(�߻� �޼ҵ���� �̿��� ū �帧�� �����ϴ� Template Method�� ������ ����)
// �丮�ϱ� ���� ������
public abstract class AbstractCook {
	// ���� Ŭ������ ������ �ñ�� �߻� �޼ҵ��
	public abstract void ready();		// �丮 ��� �غ�
	public abstract void bake();		// ����
	public abstract void decoration();	// ����ϱ�
	
	// Template �޼ҵ�, �丮�� ū �帧�� ������
	public final void cook(String dessert) {
		System.out.println("<������ ����> - " + dessert);
		ready();		// �丮 ��� �غ�
		bake();			// ����
		decoration();	// ����ϱ�
		System.out.println(dessert + "�ϼ�!\n");
	}
}
