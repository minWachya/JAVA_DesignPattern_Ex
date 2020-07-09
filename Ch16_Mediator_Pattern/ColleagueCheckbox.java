package ch16;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
	private Mediator mediator;
	
	public ColleagueCheckbox(String caption, CheckboxGroup group, boolean status) {
		super(caption, group, status);
	}
	
	@Override
	public void setMediator(Mediator mediator) {			//Mediator를 저장
		this.mediator = mediator;
	}
	@Override
	public void setColleagueEnabled(boolean enabled) {		//Mediator에서 유/무효를 지시
		setEnabled(enabled);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {				//상태가 바뀌면 Mediator에게 통지
		mediator.colleagueChanged();
	}
}
