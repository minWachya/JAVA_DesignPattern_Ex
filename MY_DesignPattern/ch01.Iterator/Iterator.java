package IteratorPattern;

// 집합체 원소를 하나하나 선택하는 for문의 i같은 역할을 함
public interface Iterator {
	public abstract boolean hasNext();	// 다음 원소가 존재하는지? O - true, X - false 반환
	public abstract Object next();		// 다음 원소 얻어오기, 다형성을 위해 반환형은 Object
}
