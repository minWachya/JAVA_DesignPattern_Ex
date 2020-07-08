package test;
import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
	private String name;	//가상 디렉터리 이름
	private ArrayList directory = new ArrayList();	//디렉터리 엔트리의 집합
	
	public Directory(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public int getSize() {
		int size = 0;
		Iterator it = directory.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			size += entry.getSize();
		}
		return size;
	}
	public Entry add(Entry entry) {	//엔트리의 추가
		directory.add(entry);
		return this;
	}
	@Override
	protected void printList(String prefix) {	//엔트리의 종류
		System.out.println(prefix + "/" + this);
		Iterator it = directory.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.printList(prefix + "/" + name);
		}
	}
}
