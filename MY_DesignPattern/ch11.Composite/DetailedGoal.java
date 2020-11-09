package CompositePattern;

// 구체적인 목표
public class DetailedGoal extends Entry {
	private String goal;	// 목표
	
	public DetailedGoal(String goal) {	// 목표를 입력받아 생성
		this.goal = goal;
	}
	
	@Override
	protected void printList(String prefix) {	// 구체적인 목표 리턴
		System.out.println(prefix + "-" + goal);
	}

}
