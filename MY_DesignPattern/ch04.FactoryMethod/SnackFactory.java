package FactoryMethodPattern.snack;

import java.util.Iterator;
import java.util.Vector;
import FactoryMethodPattern.framework.Factory;
import FactoryMethodPattern.framework.Product;

// 과자를 생산하는 과자 공장 세우기(기본적인 공장의 큰 틀(Factory)을 상속받고, 구체적인 공장(SnackFactory)을 구현하는 클래스)
public class SnackFactory extends Factory {
	// 제품의 행운번호를 관리하는 벡터
	private Vector<String> v = new Vector<String>();
	
	// 이 공장의 제품인 Sanck을 생성하게 구현하기
	@Override
	protected Product createProduct(String luckyNumber) {
		return new Snack(luckyNumber);
	}
	// 생성된 제품의 행운 번호를 numberVector에 저장
	@Override
	protected void registerProduct(Product product) {
		v.add(((Snack)product).getLuckyNumner());
	}
	// 행운 번호를 관리하는 벡터를 리턴하는 매소드
	public void printAllLuckyNumbers() {
		Iterator it = v.iterator();
		
		while(it.hasNext()) {
			String luckyNumber = (String)it.next();
			System.out.println(luckyNumber);
		}
	}
}
