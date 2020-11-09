package CompositePattern;

// ��ü���� ��ǥ�� �߻����� ��ǥ�� ���Ͻ� ���ִ� Ŭ����
public abstract class Entry {
	public Entry add(Entry entry) throws GoalTreatmentException {	// ��ǥ �߰�
		throw new GoalTreatmentException();	// ��ü���� ��ǥ�� ��ü���� ��ǥ�� �ְ��Ϸ��� �� ���� �߻�(����Ʈ)
	}
	public void printList() {	// ��ǥ ��� ���
		printList("");
	}
	protected abstract void printList(String prefix);	// ��ǥ ��� ���
}
