package StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Player player = new Player("minWachya", new Level1());	// 레벨 1 플레이어 생성
		String str = "";
		
		System.out.println("게임을 시작합니다.");
		
		while(true) {
			// 입력받기
			System.out.print(player.getName());
			str = br.readLine();
			
			if (str.equals("종료")) break;	// "종료" 입력하면 게임 끝
			
			if (str.equals("얍")) {	// "얍" 입력 시 공격
				player.attack(); // 공격, 경험치 ++
				
				if(player.getAttackNum() == 3) {	// 경첨치가 3이면(공격을 3번 하면)
					System.out.println("~~~Level up!!!~~~");// 레벨업
					player.levelUp(new Level2());		// 레벨 2가 됨
				}
			}
		}
		
		System.out.println("종료되었습니다.");
	}

}
