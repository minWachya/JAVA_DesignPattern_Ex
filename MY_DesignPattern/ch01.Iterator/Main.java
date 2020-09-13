package IteratorPattern;

public class Main {
	public static void main(String[] args) {
		StudyingRoom studyingRoom = new StudyingRoom(10);	// 10명만 들어갈 수 있는 독서실 생성
		
		// 사람들 입장
		studyingRoom.enterRoom(new People("철수", "010-1111-1111", "10:01"));   // 10시 1분 철수 입장
		studyingRoom.enterRoom(new People("훈이", "010-2222-2222", "10:30"));   // 10시 30분 훈이 입장
		studyingRoom.enterRoom(new People("맹구", "010-3333-3333", "10:30"));	   // 10시 30분 맹구 입장
		studyingRoom.enterRoom(new People("짱구", "010-4444-4444", "12:50"));	   // 12시 50분 짱구 입장
		studyingRoom.enterRoom(new People("흰둥이", "010-5555-5555", "13:00"));   // 1시 흰둥이 입장
		
		Iterator it = studyingRoom.iterator();	// 독서실 iterator 얻기
		
		while (it.hasNext()) {	// 다음 사람이 더 있는 동안
			People p = (People)it.next();				// 다음 사람 선택하기
			System.out.println(p.getInformation());		// 정보 출력
		}
	}
}
