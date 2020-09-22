package TemplateMethodPattern;

// AbstractCook를 상속받아 추상 메소드들을 구체적으로 구현하는 클래스
// 레시피의 클을 따라 쿠키 레시피를 만드는 클래스
public class Cookie extends AbstractCook {
	@Override
	public void ready() {		// 요리 재료 준비
		System.out.println("밀가루, 버터, 설탕, 계란, 초콜릿을 준비합니다.");
	}
	@Override
	public void bake() {		// 굽기
		System.out.println("쿠키 모양으로 만들어 굽습니다.");
	}
	@Override
	public void decoration() {	// 장식하기
		System.out.println("쿠키를 예쁘게 꾸며줍니다.");
	}
}
