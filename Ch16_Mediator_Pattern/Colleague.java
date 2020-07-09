package ch16;

public interface Colleague {
	public abstract void setMediator(Mediator mediator);		//중개인을 설정하는 메소드
	public abstract void setColleagueEnabled(boolean enabled);	//중개인이 내리는 지시, true=유효상태/false=무효상태
}
