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

			String []yoil = {"일","월","화","수","목","금","토"};
			String str = year+"년 "+month+"월 "+date+"일 "+yoil[day]+"요일 "+hours+"시 "+min+"분 "+sec+"초 ";
			return str;
	}
}

class MyFrame extends Frame
{
	Label view;
	public MyFrame(){
		view = new Label("여기에 시간이 표시됩니다.");
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
