package StrategyPattern;

// 레벨 1
public class Level1 implements Strategy {
	@Override
	public void attact() {	// 레벨 1 공격
		// 레벨 1 알고리즘
		System.out.println("옷---->");
	}
}
