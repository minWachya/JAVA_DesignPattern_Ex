package AdapterPattern2;

// 클라이언트 = 나
public class Main {
	public static void main(String[] args) {
		Charger_TypeC chargerTypeC = new Adapter("이북리더기");		// C타입 충전기에 어댑터 끼우기
		chargerTypeC.charging_TypeC();	// 충전하기
	}
}
