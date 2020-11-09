package CompositePattern;

import java.util.Vector;

import java.util.Iterator;

// �߻����� ��ǥ
public class AbstractGoal extends Entry {
	private String goal;	// ��ǥ
	private Vector v = new Vector();	// ��ǥ���� ������ ����
	
	public AbstractGoal(String goal) {	// ��ǥ�� �Է¹޾� ����
		this.goal = goal;
	}
	
	@Override
	public Entry add(Entry entry) {	// ��ǥ �߰�
		v.add(entry);	// �߻����� ��ǥ���� �߻�/��ü�� ��ǥ�� ��� ������ �� �ְ� �ϱ�
		return this;
	}
	@Override
	protected void printList(String prefix) {	// ��ǥ ��� ���
		System.out.println(prefix + goal);	// �߻����� ��ǥ ���
		// ��ü���� ��ǥ ���
		Iterator it = v.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			// entry�� �߻��� ��ǥ���� ��üô ��ǥ���� ��� ���� printList() ȣ��
			entry.printList(prefix + "\t");
			// => �߻����� ��ǥ�� ��ü���� ��ǥ�� ���Ͻõ�
		}
	}

}
