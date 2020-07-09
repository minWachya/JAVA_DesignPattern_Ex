package ch14;

public class LimitSuppert extends Suppert {
	private int limit;								//이 번호 미만이면 해결할 수 있다.
	
	public LimitSuppert(String name, int limit) {	//생성자
		super(name);
		this.limit = limit;
	}
	
	@Override
	protected boolean resolve(Trouble trouble) {	//해결용 메소드
		if(trouble.getNumber() < limit) return true;
		else return false;
	}
}
