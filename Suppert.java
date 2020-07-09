package ch14;

public abstract class Suppert {
	private String name;									//이 트러블의 해결자 이름
	private Suppert next;									//떠넘기는 곳
	
	public Suppert(String name) {							//트러블 해결자 생성
		this.name = name;
	}
	
	public Suppert setNext(Suppert next) {					//떠넘기는 곳을 설정
		this.next = next;	
		return next;
	}
	public final void suppert(Trouble trouble) {			//트러블 해결 수순
		if(resolve(trouble)) 
			done(trouble);
		else if(next != null)
			next.suppert(trouble);
		else
			fail(trouble);
	}
	public String toString() {								//문자열 표현
		return "[" + name + "]";
	}
	protected abstract boolean resolve(Trouble trouble);	//해결용 메소드
	protected void done(Trouble trouble) {					//해결
		System.out.println(trouble + " is resolved by " + this + ".");
	}
	protected void fail(Trouble trouble) {					//미해결
		System.out.println(trouble + " cannot be resolved.");
	}
}
