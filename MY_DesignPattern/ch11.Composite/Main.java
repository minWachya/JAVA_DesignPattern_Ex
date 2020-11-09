package CompositePattern;

public class Main {

	public static void main(String[] args) {
		// 2학년 2학기 목표 만들기
		AbstractGoal school2_2 = new AbstractGoal("<<2학년 2학기 목표>>");
		
		AbstractGoal study = new AbstractGoal("●공부");
		school2_2.add(study);
		study.add(new DetailedGoal("영어"));
		study.add(new DetailedGoal("일본어"));
		study.add(new DetailedGoal("코딩"));
		study.add(new DetailedGoal("주식"));
		
		AbstractGoal future = new AbstractGoal("●진로 고민");
		school2_2.add(future);
		future.add(new DetailedGoal("인턴 알아보기"));
		future.add(new DetailedGoal("공모전 알아보기"));
		future.add(new DetailedGoal("커리어넷 구경하기"));
		
		AbstractGoal extra = new AbstractGoal("●기타");
		school2_2.add(extra);
		
		AbstractGoal readBook = new AbstractGoal("○책읽기");
		extra.add(readBook);
		readBook.add(new DetailedGoal("해가 지는 곳으로(최진영)"));
		readBook.add(new DetailedGoal("이렇게 쉬운 통계학(혼마루 료)"));
		extra.add(new DetailedGoal("운동하기"));
		
		// 2학년 2학기 목표 출력
		school2_2.printList();
	}

}
