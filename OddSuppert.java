package ch14;

public class OddSuppert extends Suppert {
	public OddSuppert(String name) {				//������
		super(name);
	}
	
	@Override
	protected boolean resolve(Trouble trouble) {	//�ذ�� �޼ҵ�
		if(trouble.getNumber() % 2 == 1) return true;
		else return false;
	}
}
