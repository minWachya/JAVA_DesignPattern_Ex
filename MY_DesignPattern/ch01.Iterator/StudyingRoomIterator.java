package IteratorPattern;

// 독서실에 들어간 사함들을 한명한명 차례대로 선택하는 클래스
public class StudyingRoomIterator implements Iterator {
	private StudyingRoom studyingRoom;	// Iterator가 돌아다닐 독서실
	private int index;					// 현재 몇 번째 사람을 가리키고 있는지 알려주는 변수
	
	public StudyingRoomIterator(StudyingRoom studyingRoom) {	// 돌아다닐 독서실을 인수로 받으면서 객체 생성
		this.studyingRoom = studyingRoom;
		index = 0;	// 사람들을 순서대로 선택하기 전이니까 가장 먼저 들어온 사람부터 거리키기(=0)
	}
	
	@Override
	public boolean hasNext() {	// 다음 사람이 더 있는지? O - true, X - false 반환
		if (index < studyingRoom.getLength()) return true;
		else return false;
	}
	@Override
	public Object next() {		// 다음 순서로 들어온 사람 반환
		People p = studyingRoom.getPeopleAt(index);
		index++;	// 다음 사람 가리키도록 1 증가
		return p;
	}
}
