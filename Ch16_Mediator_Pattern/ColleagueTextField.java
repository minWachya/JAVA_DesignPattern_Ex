package ch16;
import java.awt.TextField;
import java.awt.Color;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
	private Mediator mediator;
	
	public ColleagueTextField(String text, int colums) {
		super(text, colums);
	}
	
	@Override
	public void setMediator(Mediator mediator) {		//Mediator�� ����
		this.mediator = mediator;
	}
	@Override
	public void setColleagueEnabled(boolean enabled) {	//Mediator���� ��/��ȿ�� ����
		setEnabled(enabled);
		setBackground(enabled ? Color.white : Color.lightGray);
	}
	@Override
	public void textValueChanged(TextEvent arg0) {		//���ڿ��� ���ϸ� Mediator���� ����
		mediator.colleagueChanged();
	}
}
