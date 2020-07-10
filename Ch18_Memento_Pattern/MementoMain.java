package ch18_game;

public class MementoMain {
	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);				//������ �������� 100
		Memento memento = gamer.createMemento();	//������ ���¸� ������ �д�.
		for(int i = 0; i < 10; i++) {
			System.out.println("====" + i);			//���� ǥ��
			System.out.println("����:" + gamer);		//���� ���ΰ� ǥ��
			
			gamer.bet();							//������ �����Ų��.
			
			System.out.println("�������� " + gamer.getMoney() + "���� �Ǿ����ϴ�.");
			
			//Memento�� ��� ����
			if (gamer.getMoney() > memento.getMoney()) {
				System.out.println(" oO(���� ���������Ƿ� ������ ���¸� ��������.)");
				memento = gamer.createMemento();
			} else if (gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println(" oO(���� ���������Ƿ� ������ ���·� ��������.)");
				gamer.restoreMemento(memento);
			}
			
			//�ð� ��ٸ�
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println();
		}
	}
}
