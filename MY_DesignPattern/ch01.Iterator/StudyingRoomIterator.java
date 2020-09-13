package IteratorPattern;

// �����ǿ� �� ���Ե��� �Ѹ��Ѹ� ���ʴ�� �����ϴ� Ŭ����
public class StudyingRoomIterator implements Iterator {
	private StudyingRoom studyingRoom;	// Iterator�� ���ƴٴ� ������
	private int index;					// ���� �� ��° ����� ����Ű�� �ִ��� �˷��ִ� ����
	
	public StudyingRoomIterator(StudyingRoom studyingRoom) {	// ���ƴٴ� �������� �μ��� �����鼭 ��ü ����
		this.studyingRoom = studyingRoom;
		index = 0;	// ������� ������� �����ϱ� ���̴ϱ� ���� ���� ���� ������� �Ÿ�Ű��(=0)
	}
	
	@Override
	public boolean hasNext() {	// ���� ����� �� �ִ���? O - true, X - false ��ȯ
		if (index < studyingRoom.getLength()) return true;
		else return false;
	}
	@Override
	public Object next() {		// ���� ������ ���� ��� ��ȯ
		People p = studyingRoom.getPeopleAt(index);
		index++;	// ���� ��� ����Ű���� 1 ����
		return p;
	}
}
