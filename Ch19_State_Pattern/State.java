package ch19;

public interface State {
	public abstract void doClock(Context context, int hour);	//�ð� ����
	public abstract void doUse(Context context);				//�ݰ� ���
	public abstract void doAlam(Context context);				//���
	public abstract void doPhone(Context context);				//�Ϲ� ��ȭ
}
