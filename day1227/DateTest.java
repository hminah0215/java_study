/*
	���� �ð��� 2019�� 12�� 27�� �ݿ��� 14�� 51�� 30�� 
*/

import java.util.Date;
class  DateTest
{
	public static void main(String[] args) 
	{
		Date today = new Date();
		//System.out.println(today);
		
		int year = today.getYear() + 1900;
		int month = today.getMonth()+1;
		int date = today.getDate();
		int day = today.getDay();
		int hours = today.getHours();
		int min = today.getMinutes();
		int sec = today.getSeconds();

		String []yoil = {"��","��","ȭ","��","��","��","��"};
		System.out.println(year+"�� "+month+"�� "+date+"�� "+yoil[day]+"���� "+hours+"�� "+min+"�� "+sec+"�� ");
	}
}