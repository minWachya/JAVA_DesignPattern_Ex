package SingletonPattern;

public class Singleton {
	// 객체인 닌텐도를 여기서 처음으로 생성
	// static 메소드인 getInstance 메소드로 얻기 때문에 여기도 static 붙이기
	private static Singleton nintendo = new Singleton();
	
	// 여러 객체를 생성하지 않도록 생성자를 private로 함
	private Singleton() {
		System.out.println("로그인 하였습니다.");
	}
	
	// 하나뿐인 객체(닌텐도)를 리턴함
	public static Singleton getInstance() {
		return nintendo;
	}
	// 닌텐도로 게임하는 메소드 
	public void play() {
		System.out.println("동물의 숲을 합니다...");
	}
}
