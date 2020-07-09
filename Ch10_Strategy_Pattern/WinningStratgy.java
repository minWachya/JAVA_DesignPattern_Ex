package test;
import java.util.Random;

public class WinningStratgy implements Strategy {
	private Random random;
	private boolean won = false;
	private Hand preHand;
	
	public WinningStratgy(int seed) {
		random = new Random(seed);
	}
	
	@Override
	public Hand nextHand() {
		if(!won) {
			preHand = Hand.getHand(random.nextInt(3));
		}
		return preHand;
	}
	@Override
	public void study(boolean win) {
		won = win;
	}
}
