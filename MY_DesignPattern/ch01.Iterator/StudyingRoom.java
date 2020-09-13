package IteratorPattern;

// ������(�� �ϳ�)
public class StudyingRoom implements Aggregate {
	private People[] peoples;	// �����ǿ� �� ����� �迭, �����ǿ� �� �� �ִ� �ִ� ��� ���� ���� �Ҵ� X
	private int last = 0;		// ������ ����� �� ����
	
	public StudyingRoom(int maxSize) {	// �����ǿ� �� �� �ִ� �ִ� ��� ���� ���ϸ鼭 ��ü ����
		peoples = new People[maxSize];
	}
	
	public People getPeopleAt(int index) {	// index ��°�� ������ ��� ��ȯ
		return peoples[index];
	}
	public void enterRoom(People p) {		// �����ǿ� ����� ��(peoples�� p �߰�)
		peoples[last] = p;
		last++;	// ���� ����� ���� �� �ֵ��� �̵�
	}
	public int getLength() {				// �����ǿ� �� ����� �� ������ ��ȯ
		return last;
	}
	@Override
	public Iterator iterator() {			// �������� ��� �Ѹ��Ѹ��� �����ϴ� StudyingRoomIterator�� ��ȯ
		return new StudyingRoomIterator(this);
	}
}
