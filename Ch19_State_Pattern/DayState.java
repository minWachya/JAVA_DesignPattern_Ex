package ch19;

public class DayState implements State {
	private static DayState singleton = new DayState();
	
	private DayState() {}								//�����ڴ� private
	
	public static State getInstance() {					//������ �ν��Ͻ��� ��´�.
		return singleton;
	}
	@Override
	public void doClock(Context context, int hour) {	//�ð� ����
		if(hour < 9 || 17 <= hour)
			context.changeState(NightState.getInstance());
	}
	@Override
	public void doUse(Context context) {				//�ݰ� ���
		context.recordLog("�ݰ���(�ְ�)");
	}
	@Override
	public void doAlam(Context context) {				//���
		context.callSecurityCenter("���(�ְ�)");
	}
	@Override
	public void doPhone(Context context) {				//�Ϲ���ȭ
		context.callSecurityCenter("�Ϲ���ȭ(�ְ�)");
	}
	public String toString() {							//���ڿ� ǥ��
		return "[�ְ�]";
	}
}
