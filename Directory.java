package ch13;
import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
	private String name;							//���� ���͸� �̸�
	private ArrayList dir = new ArrayList();	//���͸� ��Ʈ���� ����
	
	public Directory(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {						//�̸��� ��´�.
		return name;
	}
	@Override
	public int getSize() {							//����� ��´�.
		int size = 0;
		Iterator it = dir.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			size += entry.getSize();
		}
		return size;
	}
	@Override
	public Entry add(Entry entry) {					//��Ʈ���� �߰�
		dir.add(entry);
		return this;
	}
	@Override
	public Iterator iterator() {					//Iterator ����
		return dir.iterator();
	}
	@Override
	public void accept(Visitor v) {					//�湮�� �³�
		v.visit(this);
	}
}