package TemplateMethodPattern;

// 클라이언트, 직접 요리하는 클래스
public class Main {
	public static void main(String[] args) {
		// 레시피 틀에 따라 작성된 쿠키와 파이 레시피 객체 생성
		AbstractCook dessert1 = new Cookie();
		AbstractCook dessert2 = new Pie();
		
		// 쿠키와 파이를 레시피 순서대로 요리하기
		dessert1.cook("초코 쿠키");
		dessert2.cook("사과 파이");
	}
}
