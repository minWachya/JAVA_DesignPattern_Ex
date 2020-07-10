package ch20;

public class FlyweightMain {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: java Main digits.");
			System.out.println("Ex: java Main 1212123");
			System.exit(0);
		}
		BigString bs = new BigString(args[0]);
		bs.print();
	}
}
