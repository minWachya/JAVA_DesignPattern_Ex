package ch18_game;
import java.util.*;

public class Memento {
	int money;						//소지금
	ArrayList fruits;				//과일
	
	Memento(int money) {			//생성자(wide interface)
		this.money = money;
		this.fruits = new ArrayList();
	}
	
	public int getMoney() {			//소지금을 얻는다.(narrow interface)
		return money;
	}
	void addFruit(String fruit) {	//과일을 추가한다.(wide interface)
		fruits.add(fruit);
	}
	List getFruits() {				//과일을 얻는다.(wide interface)
		return (List)fruits.clone();
	}
}
