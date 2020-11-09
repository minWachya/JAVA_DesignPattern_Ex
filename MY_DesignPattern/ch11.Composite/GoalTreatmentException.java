package CompositePattern;

// 구체적인 목표에 구체적인 목표를 추가할 때 발생하는 오류
public class GoalTreatmentException extends RuntimeException {
	public GoalTreatmentException() {}
	
	public GoalTreatmentException(String msg) {
		super(msg);
	}
}
