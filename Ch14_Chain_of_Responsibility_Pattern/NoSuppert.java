package ch14;

public class NoSuppert extends Suppert {
	public NoSuppert(String name) {
		super(name);
	}
	
	@Override
	protected boolean resolve(Trouble trouble) {	//�ذ�� �޼ҵ�, �ڽ��� �ƹ��͵� ó������ �ʴ´�.
		return false;
	}
}
