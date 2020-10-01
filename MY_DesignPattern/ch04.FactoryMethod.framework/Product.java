package FactoryMethodPattern.framework;

// 구체적인 체품들이 가져야 할 메소드를 정의한 추상클래스
public abstract class Product {
	// 구체적인 제품은 행운 번호를 출력하는 printLuckyNumber() 메소드를 가진다.
	public abstract void printLuckyNumber();	
}
