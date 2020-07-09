package ch14;

public class OddSuppert extends Suppert {
	public OddSuppert(String name) {				//생성자
		super(name);
	}
	
	@Override
	protected boolean resolve(Trouble trouble) {	//해결용 메소드
		if(trouble.getNumber() % 2 == 1) return true;
		else return false;
	}
}
