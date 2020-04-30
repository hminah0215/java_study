/*
	현재 시각은 2019년 12월 27일 금요일 14시 51분 30초 
*/

import java.util.Date;
class  DateTest02
{
	public static void main(String[] args) 
	{
		while(true){
			Date today = new Date();
			//System.out.println(today);
			
			int year = today.getYear() + 1900;
			int month = today.getMonth()+1;
			int date = today.getDate();
			int day = today.getDay();
			int hours = today.getHours();
			int min = today.getMinutes();
			int sec = today.getSeconds();

			String []yoil = {"일","월","화","수","목","금","토"};
			System.out.println(year+"년 "+month+"월 "+date+"일 "+yoil[day]+"요일 "+hours+"시 "+min+"분 "+sec+"초 ");

			try{
				Thread.sleep(1000); //쓰레드 클래스의 슬립. 1초동안 멈춰라 
			}catch(Exception e){
				
			}
		}
	}
}
