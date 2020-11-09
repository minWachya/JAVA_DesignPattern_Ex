package CompositePattern;

import java.util.Vector;

import java.util.Iterator;

// 추상적인 목표
public class AbstractGoal extends Entry {
	private String goal;	// 목표
	private Vector v = new Vector();	// 목표들을 저장할 벡터
	
	public AbstractGoal(String goal) {	// 목표를 입력받아 생성
		this.goal = goal;
	}
	
	@Override
	public Entry add(Entry entry) {	// 목표 추가
		v.add(entry);	// 추상적인 목표에는 추상/구체적 목표를 모두 저장할 수 있게 하기
		return this;
	}
	@Override
	protected void printList(String prefix) {	// 목표 경로 출력
		System.out.println(prefix + goal);	// 추상적인 목표 출력
		// 구체적인 목표 출력
		Iterator it = v.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			// entry가 추상적 목표인지 구체척 목표인지 상관 없이 printList() 호출
			entry.printList(prefix + "\t");
			// => 추상적인 목표와 구체적인 목표가 동일시됨
		}
	}

}
