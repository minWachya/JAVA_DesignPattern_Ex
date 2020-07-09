package ch14;

public abstract class Suppert {
	private String name;									//�� Ʈ������ �ذ��� �̸�
	private Suppert next;									//���ѱ�� ��
	
	public Suppert(String name) {							//Ʈ���� �ذ��� ����
		this.name = name;
	}
	
	public Suppert setNext(Suppert next) {					//���ѱ�� ���� ����
		this.next = next;	
		return next;
	}
	public final void suppert(Trouble trouble) {			//Ʈ���� �ذ� ����
		if(resolve(trouble)) 
			done(trouble);
		else if(next != null)
			next.suppert(trouble);
		else
			fail(trouble);
	}
	public String toString() {								//���ڿ� ǥ��
		return "[" + name + "]";
	}
	protected abstract boolean resolve(Trouble trouble);	//�ذ�� �޼ҵ�
	protected void done(Trouble trouble) {					//�ذ�
		System.out.println(trouble + " is resolved by " + this + ".");
	}
	protected void fail(Trouble trouble) {					//���ذ�
		System.out.println(trouble + " cannot be resolved.");
	}
}
