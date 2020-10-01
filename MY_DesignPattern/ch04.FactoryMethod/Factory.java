package FactoryMethodPattern.framework;

// ��ü���� ������ �������ϴ� �޼ҵ带 ������ �߻� Ŭ����
public  abstract class Factory {
	// ��ǰ ������ ū �帧�� �����ϴ� Factory Method(Template Method�� ���)
	public final Product create(String luckyNumber) {
		Product product = createProduct(luckyNumber);	// ��� ��ȣ�� ���� ��ǰ ����
		registerProduct(product);						// ��ǰ�� ��� ��ȣ ����
		return product;									// ��ǰ ��ȯ
	}
	// ��� ��ȣ�� ���� ��ǰ�� �����ϰ� �ϴ� �߻� �޼ҵ�(���� Ŭ���� �����ϰ� ��)
	protected abstract Product createProduct(String luckyNumber);
	// ��ǰ�� ��� ��ȣ��  �����ϰ� �ϴ� �߻� �޼ҵ�(���� Ŭ������ �����ϰ� ��)
	protected abstract void registerProduct(Product product);
	
}
