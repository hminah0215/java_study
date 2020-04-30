package com.bit.exam01;

public class StirngToIntTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data1 = "100";
		String data2 = "200";
		
		//data1과 data2를 정수형으로 변환한다음 더하기 결과를 출력해보세요. 
		
		int r = Integer.parseInt(data1) + Integer.parseInt(data2);
		//Integer.parseInt()스트링형을 정수형으로.정수형으로변환이 가능한 문자열이어야가능.
		System.out.println(r);
	
	


	}

}
