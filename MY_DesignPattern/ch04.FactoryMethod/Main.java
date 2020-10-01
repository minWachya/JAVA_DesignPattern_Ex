package FactoryMethodPattern;

import FactoryMethodPattern.framework.*;
import FactoryMethodPattern.snack.*;

public class Main {
	// 행운 번호를 만드는 메소드
	public static String createLuckyNumber() {
		int number = (int)(Math.random() * 100);				// 0~99 숫자 랜덤
		char alphabet = (char)((Math.random() * 26) + 65);	// 대문자 랜덤
		return number + ":" +alphabet;
	}

	public static void main(String[] args) {
		Factory factory = new SnackFactory();	// 과자 공장 세우기
		Product[] snacks = new Product[3];		// 과자 3봉지를 담는 배열
		
		// 제품(과자) 생산하고 제품 번호 확인하기
		for (int i = 0; i < snacks.length; i++) {
			snacks[i] = factory.create(createLuckyNumber());
			snacks[i].printLuckyNumber();
		}
		System.out.println();
		
		//------------------------------------------------
		System.out.println("행운 번호 출력");
		((SnackFactory)factory).printAllLuckyNumbers();
	}

}
