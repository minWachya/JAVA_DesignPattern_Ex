package FactoryMethodPattern.framework;

// 구체적인 공장이 가져야하는 메소드를 정의한 추상 클래스
public  abstract class Factory {
	// 제품 생성의 큰 흐름을 결정하는 Factory Method(Template Method와 비슷)
	public final Product create(String luckyNumber) {
		Product product = createProduct(luckyNumber);	// 행운 번호를 가진 제품 생성
		registerProduct(product);					          	// 제품의 행운 번호 저장
		return product;									              // 제품 반환
	}
	// 행운 번호를 가진 제품을 생성하게 하는 추상 메소드(하위 클래스 구현하게 함)
	protected abstract Product createProduct(String luckyNumber);
	// 제품의 행운 번호를  저장하게 하는 추상 메소드(하위 클래스가 구현하게 함)
	protected abstract void registerProduct(Product product);
	
}
