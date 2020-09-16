package AdapterPattern2;

// Adapter 클래스
public class Adapter extends Charger_TypeC {
	private Charger_microUSB chargerMicroUSB;		//Charger_microUSB(5핀 충전기) 객체를 포함
	
	public Adapter(String device) {
		chargerMicroUSB = new Charger_microUSB(device);	//Charger_microUSB(5핀 충전기) 객체를 생성
	}
	
	@Override									// 5핀 충전기 --> 어댑터 --> C타입 충전기 --> C타입 충전기를 가진 기기 충전하기
	public void charging_TypeC() {				// C타입 충전기로 충전하는 메소드
		chargerMicroUSB.charging_microUSB();	// 진짜 충전은 5핀 충전기가 함
	}
}
