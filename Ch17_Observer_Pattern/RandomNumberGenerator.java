package ch17;
import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
	private Random random = new Random();		//난수 발생기
	private int number;							//현재의 수
	
	@Override
	public int getNumber() {					//수를 취득하다.
		return number;
	}
	@Override
	public void execute() {
		for(int i = 0; i < 20; i++) {
			number = random.nextInt(50);
			notifyObservers();
		}
	}
}
