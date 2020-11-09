package CompositePattern;

// 구체적인 목표와 추상적인 목표를 동일시 해주는 클래스
public abstract class Entry {
	public Entry add(Entry entry) throws GoalTreatmentException {	// 목표 추가
		throw new GoalTreatmentException();	// 구체적인 목표에 구체적인 목표를 주가하려할 때 오류 발생(디폴트)
	}
	public void printList() {	// 목표 경로 출력
		printList("");
	}
	protected abstract void printList(String prefix);	// 목표 경로 출력
}
