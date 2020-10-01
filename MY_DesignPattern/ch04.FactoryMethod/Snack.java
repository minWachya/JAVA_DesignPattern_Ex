package FactoryMethodPattern.snack;

import FactoryMethodPattern.framework.Product;

// 기본적인 제품의 큰 틀(Product)을 상속받고, 구체적인 제품(Snack)을 구현하는 클래스
public class Snack extends Product {
	private String luckyNumber;	// 행운 번호
	
	// 같은 패키지와 상속받은 클래스만 접근 가능한 생성자
	Snack(String luckyNumber) {
		System.out.println("과자를 구입합니다.");
		this.luckyNumber = luckyNumber;
	}
	
	@Override
	public void printLuckyNumber() {	// 행운번호 출력
		System.out.println("이 과자의 행운 번호는 " + luckyNumber +"입니다.");
	}
	
	// 행운 번호를 리턴하는 메소드
	public String getLuckyNumner() {
		return luckyNumber;
	}
}
