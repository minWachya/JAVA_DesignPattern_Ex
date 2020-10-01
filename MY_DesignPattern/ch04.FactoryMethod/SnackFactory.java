package FactoryMethodPattern.snack;

import java.util.Iterator;
import java.util.Vector;
import FactoryMethodPattern.framework.Factory;
import FactoryMethodPattern.framework.Product;

// ���ڸ� �����ϴ� ���� ���� �����(�⺻���� ������ ū Ʋ(Factory)�� ��ӹް�, ��ü���� ����(SnackFactory)�� �����ϴ� Ŭ����)
public class SnackFactory extends Factory {
	// ��ǰ�� ����ȣ�� �����ϴ� ����
	private Vector<String> v = new Vector<String>();
	
	// �� ������ ��ǰ�� Sanck�� �����ϰ� �����ϱ�
	@Override
	protected Product createProduct(String luckyNumber) {
		return new Snack(luckyNumber);
	}
	// ������ ��ǰ�� ��� ��ȣ�� numberVector�� ����
	@Override
	protected void registerProduct(Product product) {
		v.add(((Snack)product).getLuckyNumner());
	}
	// ��� ��ȣ�� �����ϴ� ���͸� �����ϴ� �żҵ�
	public void printAllLuckyNumbers() {
		Iterator it = v.iterator();
		
		while(it.hasNext()) {
			String luckyNumber = (String)it.next();
			System.out.println(luckyNumber);
		}
	}
}
