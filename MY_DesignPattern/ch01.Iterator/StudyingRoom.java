package IteratorPattern;

// 독서실(방 하나)
public class StudyingRoom implements Aggregate {
	private People[] peoples;	// 독서실에 들어간 사람들 배열, 독서실에 들어갈 수 있는 최대 사람 수는 아직 할당 X
	private int last = 0;		// 마지막 사람이 들어간 순서
	
	public StudyingRoom(int maxSize) {	// 독서실에 들어갈 수 있는 최대 사람 수를 정하면서 객체 생성
		peoples = new People[maxSize];
	}
	
	public People getPeopleAt(int index) {	// index 번째로 입장한 사람 반환
		return peoples[index];
	}
	public void enterRoom(People p) {		// 독서실에 사람이 듣어감(peoples에 p 추가)
		peoples[last] = p;
		last++;	// 다음 사람이 들어올 수 있도록 이동
	}
	public int getLength() {				// 독서실에 들어간 사람이 몇 명인지 반환
		return last;
	}
	@Override
	public Iterator iterator() {			// 독서실의 사람 한명한명을 선택하는 StudyingRoomIterator를 반환
		return new StudyingRoomIterator(this);
	}
}
