package FactoryMethodPattern.snack;

import FactoryMethodPattern.framework.Product;

// �⺻���� ��ǰ�� ū Ʋ(Product)�� ��ӹް�, ��ü���� ��ǰ(Snack)�� �����ϴ� Ŭ����
public class Snack extends Product {
	private String luckyNumber;	// ��� ��ȣ
	
	// ���� ��Ű���� ��ӹ��� Ŭ������ ���� ������ ������
	Snack(String luckyNumber) {
		System.out.println("���ڸ� �����մϴ�.");
		this.luckyNumber = luckyNumber;
	}
	
	@Override
	public void printLuckyNumber() {	// ����ȣ ���
		System.out.println("�� ������ ��� ��ȣ�� " + luckyNumber +"�Դϴ�.");
	}
	
	// ��� ��ȣ�� �����ϴ� �޼ҵ�
	public String getLuckyNumner() {
		return luckyNumber;
	}
}
