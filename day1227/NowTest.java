import java.awt.Frame;
import java.awt.Label;
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

class MyFrame extends Frame
{
	Label view;
	public MyFrame(){
		view = new Label("���⿡ �ð��� ǥ�õ˴ϴ�.");
		add(view);
		setSize(400,300);
		setVisible(true);
	}
}

class NowTest 
{
	public static void main(String[] args) 
	{
		MyFrame f = new MyFrame();
		while(true){
			String now = (new MyDate() ).toString();
			f.view.setText(now);
			
			try{
				Thread.sleep(1000); 
			}catch(Exception e){
				
			}
		}
	}
}
