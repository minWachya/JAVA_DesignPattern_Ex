package ch19;

public interface Context {
	public abstract void setClock(int hour);			//시간 설정
	public abstract void changeState(State state);		//상태 전환
	public abstract void callSecurityCenter(String msg);//경비센터 호충
	public abstract void recordLog(String msg);			//경비센터 기록
}
