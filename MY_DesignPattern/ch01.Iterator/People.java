package IteratorPattern;

// 독서실에 들어갈 사람 클래스
public class People {
	private String name;		// 이름
	private String phoneNumber;	// 핸드폰 번호
	private String time;		// 입장 시간, 분
	
	public People(String n, String p, String t) {	// 이름, 번호, 입장 시간을 입력받아 객체 생성
		name = n;
		phoneNumber = p;
		time = t;
	}
	
	public String getInformation() {	// 자신의 정보를 반환 
		return name + " " + phoneNumber + " " + time;
	}
}
