package ch19;

public class DayState implements State {
	private static DayState singleton = new DayState();
	
	private DayState() {}								//생성자는 private
	
	public static State getInstance() {					//유일한 인스턴스를 얻는다.
		return singleton;
	}
	@Override
	public void doClock(Context context, int hour) {	//시간 설정
		if(hour < 9 || 17 <= hour)
			context.changeState(NightState.getInstance());
	}
	@Override
	public void doUse(Context context) {				//금고 사용
		context.recordLog("금고사용(주간)");
	}
	@Override
	public void doAlam(Context context) {				//비상벨
		context.callSecurityCenter("비상벨(주간)");
	}
	@Override
	public void doPhone(Context context) {				//일반통화
		context.callSecurityCenter("일반통화(주간)");
	}
	public String toString() {							//문자열 표현
		return "[주간]";
	}
}
