package IteratorPattern;

// 원소들을 하나씩 차례로 선택하는 데에 쓰일 Iterator 객체를 반환하는 메소드를 가짐
public interface Aggregate {
	// 이 집합체의 Iterator를 반화하는 메소드
	public abstract Iterator iterator(); 
}
