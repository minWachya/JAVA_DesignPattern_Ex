package ch14;

public class ChainOfResponsibilitMain {
	public static void main(String[] args) {
		Suppert alice 	= new NoSuppert("Alice");
		Suppert bob		= new LimitSuppert("Bob", 100);
		Suppert charlie = new SpecialSuppert("Charlie", 429);
		Suppert diana 	= new LimitSuppert("Diana", 200);
		Suppert elmo	= new OddSuppert("Elmo");
		Suppert fred	= new LimitSuppert("Fred", 300);
		//사슬 형성
		alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
		//다양한 트러블 발생
		for(int i=0; i < 500; i += 33) {
			alice.suppert(new Trouble(i));
		}
		
		}
}
