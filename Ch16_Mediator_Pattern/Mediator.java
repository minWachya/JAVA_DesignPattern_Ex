package ch16;

public interface Mediator {
	public abstract void createColleagues();	//관리하는 회원을 생성하는 메소드
	public abstract void colleagueChanged();	//각 회원을 호출하는 메소드
}
