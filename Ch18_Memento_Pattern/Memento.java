package ch18_game;
import java.util.*;

public class Memento {
	int money;						//������
	ArrayList fruits;				//����
	
	Memento(int money) {			//������(wide interface)
		this.money = money;
		this.fruits = new ArrayList();
	}
	
	public int getMoney() {			//�������� ��´�.(narrow interface)
		return money;
	}
	void addFruit(String fruit) {	//������ �߰��Ѵ�.(wide interface)
		fruits.add(fruit);
	}
	List getFruits() {				//������ ��´�.(wide interface)
		return (List)fruits.clone();
	}
}
