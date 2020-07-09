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
	public void setMediator(Mediator mediator) {		//Mediator를 저장
		this.mediator = mediator;
	}
	@Override
	public void setColleagueEnabled(boolean enabled) {	//Mediator에서 유/무효를 지시
		setEnabled(enabled);
		setBackground(enabled ? Color.white : Color.lightGray);
	}
	@Override
	public void textValueChanged(TextEvent arg0) {		//문자열이 변하면 Mediator에게 통지
		mediator.colleagueChanged();
	}
}
