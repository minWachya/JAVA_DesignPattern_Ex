package ch16;
import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {
	private Mediator mediator;
	
	public ColleagueButton(String caption) {
		super(caption);
	}
	
	@Override
	public void setMediator(Mediator mediator) {		//Mediator�� ����
		this.mediator = mediator;
	}
	@Override
	public void setColleagueEnabled(boolean enabled) {	//Mediator���� ��/��ȿ�� ����
		setEnabled(enabled);
	}
}
