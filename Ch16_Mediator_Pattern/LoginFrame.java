package ch16;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends Frame implements ActionListener, Mediator {
	private ColleagueCheckbox checkGuest;
	private ColleagueCheckbox checkLogin;
	private ColleagueTextField textUser;
	private ColleagueTextField textPass;
	private ColleagueButton buttonOk;
	private ColleagueButton buttonCancel;
	
	//������, Colleague���� �����ϰ�, ���ġ�� �� ǥ�ø� �����Ѵ�.
	public LoginFrame(String title) {
		super(title);
		setBackground(Color.lightGray);
		//���̾ƿ� �Ŵ����� ����ؼ� 4x2�� �׸��带 �����.
		setLayout(new GridLayout(4, 2));
		//Colleague���� ����
		createColleagues();
		//��ġ
		add(checkGuest);
		add(checkLogin);
		add(new Label("Username:"));
		add(textUser);
		add(new Label("Password:"));
		add(textPass);
		add(buttonOk);
		add(buttonCancel);
		//��/��ȿ �ʱ� ����
		colleagueChanged();
		//ǥ��
		pack();
		show();
	}
	
	//Colleague���� �����Ѵ�.
	@Override
	public void createColleagues() {
		//����
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new ColleagueCheckbox("Guest", g, true);
		checkLogin = new ColleagueCheckbox("Login", g, false);
		textUser = new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("", 10);
		textPass.setEchoChar('*');
		buttonOk = new ColleagueButton("Ok");
		buttonCancel = new ColleagueButton("Cancle");
		//Mediator�� ��Ʈ
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);
		//Listener�� ��Ʈ
		checkGuest.addItemListener(checkGuest);
		checkLogin.addItemListener(checkLogin);
		textUser.addTextListener(textUser);
		textPass.addTextListener(textPass);
		buttonOk.addActionListener(this);
		buttonCancel.addActionListener(this);
	}
	//Colleague���� ������ Colleague�� ��/��ȿ�� �����Ѵ�.
	@Override
	public void colleagueChanged() {
		if(checkGuest.getState()) {					//Guest ���
			textUser.setColleagueEnabled(false);
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(true);
		} else {									//Login ���
			textUser.setColleagueEnabled(true);
			userpassChanged();
		}
	}
	//textUser �Ǵ� textPass�� ������ �־���.
	//�� Colleague�� ��/��ȿ�� �����Ѵ�.
	private void userpassChanged() {
		if(textUser.getText().length() > 0) {											//����� �� �� ���ڶ� �ԷµǾ� ������
			textPass.setColleagueEnabled(true);											//�н������ ��ȿ����
			if(textPass.getText().length() > 0) buttonOk.setColleagueEnabled(true);		//�н����忡 �� ���ڶ� �ԷµǾ� ������, Ok��ư ��ȿ����
			else buttonOk.setColleagueEnabled(false);									//�ƴϸ� Ok��ư ��ȿ����
		} else {																		//����� �� �ƹ� �Էµ� �ȵǾ� ������
			textPass.setColleagueEnabled(false);										//�н������ ��ȿ����
			buttonOk.setColleagueEnabled(false);										//Ok��ư�� ��ȿ����
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		System.exit(0);
	}
}
