/*
	���� �ð��� 2019�� 12�� 27�� �ݿ��� 14�� 51�� 30�� 
*/

import java.util.Date;

class MyDate
{
	public String toString(){
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
			String str = year+"�� "+month+"�� "+date+"�� "+yoil[day]+"���� "+hours+"�� "+min+"�� "+sec+"�� ";
			return str;
	}
}



class  DateTest03
{
	public static void main(String[] args) 
	{
		while(true){
			System.out.println(new MyDate());

			try{
				Thread.sleep(1000); //������ Ŭ������ ����. 1�ʵ��� ����� 
			}catch(Exception e){
				
			}
		}
	}
}