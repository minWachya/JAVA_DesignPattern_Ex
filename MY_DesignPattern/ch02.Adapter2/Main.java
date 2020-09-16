package AdapterPattern1;

// Adapter 클래스
public class Adapter extends Charger_microUSB implements Charger_TypeC {
	public Adapter(String device) {
		super(device);
	}
	
	@Override						     // 5핀 충전기 --> 어댑터 --> C타입 충전기 --> C타입 충전기를 가진 기기 충전하기
	public void charging_TypeC() {	// C타입 충전기로 충전하는 메소드
		charging_microUSB();		// 진짜 충전은 5핀 충전기가 함
	}
}
