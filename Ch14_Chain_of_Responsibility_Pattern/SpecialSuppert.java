package ch14;

public class SpecialSuppert extends Suppert {
	private int number;									//�� ��ȣ�� �ذ��� �� �ִ�.
	
	public SpecialSuppert(String name, int number) {	//������
		super(name);
		this.number = number;
	}
	
	@Override
	protected boolean resolve(Trouble trouble) {		//�ذ�� �޼ҵ�
		if(trouble.getNumber() == number) return true;
		else return false;
	}
}