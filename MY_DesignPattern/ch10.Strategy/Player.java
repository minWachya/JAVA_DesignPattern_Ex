package StrategyPattern;

// �÷��̾�
public class Player {
	private String name;		// �̸�
	private Strategy strategy;	// ���� ��ų(������ ���� �޶���)
	private int attackNum = 0;	// ����ġ(���� Ƚ��)
	
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}
	
	public void attack() {		// ���� ��ų�� Strategy���� ����
		strategy.attact();		// ����
		attackNum++;			// ����ġ++
	}
	public String getName() {	// �̸� ����
		return "[" + name  + "]:";
	}
	public int getAttackNum() {	// ��÷ġ ����
		return attackNum;
	}
	public void levelUp(Strategy strategy) {	// �˰��� �ٲٱ�(������)
		this.strategy = strategy;
	}
}
