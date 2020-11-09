package StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Player player = new Player("minWachya", new Level1());	// ���� 1 �÷��̾� ����
		String str = "";
		
		System.out.println("������ �����մϴ�.");
		
		while(true) {
			// �Է¹ޱ�
			System.out.print(player.getName());
			str = br.readLine();
			
			if (str.equals("����")) break;	// "����" �Է��ϸ� ���� ��
			
			if (str.equals("��")) {	// "��" �Է� �� ����
				player.attack();	// ����, ����ġ ++
				
				if(player.getAttackNum() == 3) {	// ��÷ġ�� 3�̸�(������ 3�� �ϸ�)
					System.out.println("~~~Level up!!!~~~");// ������
					player.levelUp(new Level2());			// ���� 2�� ��
				}
			}
		}
		
		System.out.println("����Ǿ����ϴ�.");
	}

}
