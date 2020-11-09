package CompositePattern;

// ��ü���� ��ǥ
public class DetailedGoal extends Entry {
	private String goal;	// ��ǥ
	
	public DetailedGoal(String goal) {	// ��ǥ�� �Է¹޾� ����
		this.goal = goal;
	}
	
	@Override
	protected void printList(String prefix) {	// ��ü���� ��ǥ ����
		System.out.println(prefix + "-" + goal);
	}

}
