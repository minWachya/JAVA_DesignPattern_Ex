package ch13;
import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
	private String name;							//가상 디렉터리 이름
	private ArrayList dir = new ArrayList();	//디렉터리 엔트리의 집합
	
	public Directory(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {						//이름을 얻는다.
		return name;
	}
	@Override
	public int getSize() {							//사이즈를 얻는다.
		int size = 0;
		Iterator it = dir.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			size += entry.getSize();
		}
		return size;
	}
	@Override
	public Entry add(Entry entry) {					//엔트리의 추가
		dir.add(entry);
		return this;
	}
	@Override
	public Iterator iterator() {					//Iterator 생성
		return dir.iterator();
	}
	@Override
	public void accept(Visitor v) {					//방문자 승낙
		v.visit(this);
	}
}