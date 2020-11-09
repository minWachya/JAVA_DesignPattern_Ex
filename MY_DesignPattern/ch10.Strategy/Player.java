package StrategyPattern;

// 플레이어
public class Player {
	private String name;		// 이름
	private Strategy strategy;	// 공격 스킬(레벨에 따라 달라짐)
	private int attackNum = 0;	// 경험치(공격 횟수)
	
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}
	
	public void attack() {		// 공격 스킬은 Strategy한테 위임
		strategy.attact();	// 공격
		attackNum++;		// 경험치++
	}
	public String getName() {	// 이름 리턴
		return "[" + name  + "]:";
	}
	public int getAttackNum() {	// 경첨치 리턴
		return attackNum;
	}
	public void levelUp(Strategy strategy) {	// 알고리즘 바꾸기(레벨업)
		this.strategy = strategy;
	}
}
