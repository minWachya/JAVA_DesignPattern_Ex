package ch13;
import java.util.Iterator;

public abstract class Entry implements Element {
	public abstract String getName();								//�̸��� ��´�.
	public abstract int getSize();									//ũ�⸦ ��´�.
	
	public Entry add(Entry entry) throws FileTreatmentException {	//��Ʈ���� �߰��Ѵ�.
		throw new FileTreatmentException();
	}
	
	public Iterator iterator() throws FileTreatmentException {		//Iterator ����
		throw new FileTreatmentException();
	}
	public String toString() {										//���ڿ� ǥ��
		return getName() + " <" + getSize() + ">";
	}
}
