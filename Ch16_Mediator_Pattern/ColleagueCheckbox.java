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
	public void setMediator(Mediator mediator) {			//Mediator�� ����
		this.mediator = mediator;
	}
	@Override
	public void setColleagueEnabled(boolean enabled) {		//Mediator���� ��/��ȿ�� ����
		setEnabled(enabled);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {				//���°� �ٲ�� Mediator���� ����
		mediator.colleagueChanged();
	}
}
