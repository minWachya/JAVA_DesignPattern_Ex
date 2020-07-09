package ch14;

public class NoSuppert extends Suppert {
	public NoSuppert(String name) {
		super(name);
	}
	
	@Override
	protected boolean resolve(Trouble trouble) {	//해결용 메소드, 자신은 아무것도 처리하지 않는다.
		return false;
	}
}
