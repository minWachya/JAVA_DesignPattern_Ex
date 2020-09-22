package TemplateMethodPattern;

//AbstractCook를 상속받아 추상 메소드들을 구체적으로 구현하는 클래스
//레시피의 클을 따라 파이 레시피를 만드는 클래스
public class Pie extends AbstractCook {
	@Override
	public void ready() {		// 요리 재료 준비
		System.out.println("밀가루, 버터, 설탕, 소금, 계란, 사과를 준비합니다.");
		appleFilling();			// 사과 필링 만들기
	}
	@Override
	public void bake() {		// 굽기
		System.out.println("맛있는 파이를 굽습니다.");
	}
	@Override
	public void decoration() {	// 장식하기
		System.out.println("남은 사과로 파이를 장식합니다.");
	}
	
	public void appleFilling() {// Pie 클래스에서 자체적으로 생성한 클래스, 사과 필링 만들기
		System.out.println("사과로 필링을 만듭니다.");
	}
}
