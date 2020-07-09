package ch14;

public class LimitSuppert extends Suppert {
	private int limit;								//�� ��ȣ �̸��̸� �ذ��� �� �ִ�.
	
	public LimitSuppert(String name, int limit) {	//������
		super(name);
		this.limit = limit;
	}
	
	@Override
	protected boolean resolve(Trouble trouble) {	//�ذ�� �޼ҵ�
		if(trouble.getNumber() < limit) return true;
		else return false;
	}
}
