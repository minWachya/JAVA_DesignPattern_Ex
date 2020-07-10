package ch19;

public class NightState implements State {
	private static NightState singleton = new NightState();
	
	private NightState() {}								//생성자는 private
	
	public static State getInstance() {					//유일한 인스턴스를 얻는다.
		return singleton;
	}
	@Override
	public void doClock(Context context, int hour) {	//시간 설정
		if (9 <= hour && hour < 17)
			context.changeState(DayState.getInstance());
	}
	@Override
	public void doUse(Context context) {				//금고 사용
		context.callSecurityCenter("비상 : 야간금고 사용!");
	}
	@Override
	public void doAlam(Context context) {				//비상벨
		context.callSecurityCenter("비상벨(야간)");
	}
	@Override
	public void doPhone(Context context) {				//일반통화
		context.recordLog("야간통화 녹음");
	}
	public String toString() {							//문자열 표현
		return "[야간]";
	}
}
