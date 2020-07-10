package ch19;

public class NightState implements State {
	private static NightState singleton = new NightState();
	
	private NightState() {}								//�����ڴ� private
	
	public static State getInstance() {					//������ �ν��Ͻ��� ��´�.
		return singleton;
	}
	@Override
	public void doClock(Context context, int hour) {	//�ð� ����
		if (9 <= hour && hour < 17)
			context.changeState(DayState.getInstance());
	}
	@Override
	public void doUse(Context context) {				//�ݰ� ���
		context.callSecurityCenter("��� : �߰��ݰ� ���!");
	}
	@Override
	public void doAlam(Context context) {				//���
		context.callSecurityCenter("���(�߰�)");
	}
	@Override
	public void doPhone(Context context) {				//�Ϲ���ȭ
		context.recordLog("�߰���ȭ ����");
	}
	public String toString() {							//���ڿ� ǥ��
		return "[�߰�]";
	}
}
