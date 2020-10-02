package SingletonPattern;

public class Main {

	public static void main(String[] args) {
		// 언니가 닌텐도를 처음으로 만진다. 로그인 하여 게임을 한다.
		System.out.println("언니 : ");
		Singleton user1 = Singleton.getInstance();
		user1.play();
		System.out.println();
		
		// 동생이 다음으로 닌텐도를 만진다. 이미 로그인 되어져 있다. 그대로 같은 게임을 한다.
		System.out.println("동생 : ");
		Singleton user2 = Singleton.getInstance();
		user2.play();
		System.out.println();
		
		// 언니와 동생이 가진 닌텐도는 같은 닌텐도이다.
		if (user1 == user2) System.out.println("같은 닌텐도 입니다.");
		else System.out.println("다른 닌텐도 입니다.");
	}

}
