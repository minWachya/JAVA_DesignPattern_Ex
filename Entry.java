package test;

public abstract class Entry {
	public abstract String getName();	//�̸��� ��´�.
	public abstract int getSize();		//ũ�⸦ ��´�.
	public Entry add(Entry entry) throws FileTreatmentException {
		//��Ʈ���� �߰��Ѵ�.
		throw new FileTreatmentException();
	}
	public void printList() {	//�϶��� ǥ���Ѵ�.
		printList("");
	}
	protected abstract void printList(String prefix);	//prefix�� �տ� �ٿ��� ������ ǥ���Ѵ�.
	public String toString() {	//���ڿ� ǥ��
		return getName() + " <" + getSize() + ">";
	}
}
