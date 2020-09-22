package TemplateMethodPattern;

// 추상 클래스(추상 메소드들을 이용해 큰 흐름을 구성하는 Template Method를 가지고 있음)
// 요리하기 위한 레시피
public abstract class AbstractCook {
	// 하위 클래스에 구현을 맡기는 추상 메소드들
	public abstract void ready();		// 요리 재료 준비
	public abstract void bake();		// 굽기
	public abstract void decoration();	// 장식하기
	
	// Template 메소드, 요리의 큰 흐름을 결정함
	public final void cook(String dessert) {
		System.out.println("<오늘의 간식> - " + dessert);
		ready();		// 요리 재료 준비
		bake();			// 굽기
		decoration();	// 장식하기
		System.out.println(dessert + "완성!\n");
	}
}
