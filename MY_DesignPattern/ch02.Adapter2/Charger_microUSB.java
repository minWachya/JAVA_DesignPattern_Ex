package AdapterPattern2;

// 5핀 충전기(내가 지금 갖고 있는 것)
public class Charger_microUSB {
	private String device = "";		// 장치 이름
	
	public Charger_microUSB(String device) {	// 장치 이름을 인자로 받으면서 성생
		this.device = device;
	}
	
	public void charging_microUSB() {	// 5핀 충전기로 충전하는 메소드
		System.out.println("---" + device + " 충전중 ---");
	}
}
