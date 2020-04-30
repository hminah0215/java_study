import java.awt.Frame;
import java.awt.Label;
import java.util.Calendar;

class MyFrame extends Frame
{
	Label view;
	public MyFrame(){
		view = new Label("여기에 현재시간 표시");
		add(view);
		setSize(400,300);
		setVisible(true);
	}
}


class CalendarTest02 
{
	public static void main(String[] args) 
	{
		
		
		MyFrame f = new MyFrame();
		String []yoil = {"일","월","화","수","목","금","토"};

	while(true){
		Calendar today = Calendar.getInstance();
			int year = today.get( Calendar.YEAR );
			int mon =  today.get( Calendar.MONTH )+1;
			int day = today.get( Calendar.DATE );
			int week = today.get( Calendar.DAY_OF_WEEK )-1;
			int hours = today.get( Calendar.HOUR_OF_DAY );
			int min = today.get( Calendar.MINUTE );
			int sec = today.get( Calendar.SECOND );
		StringBuffer sb = new StringBuffer();
			sb.append(year+"년 ");
			sb.append(mon+"월 ");
			sb.append(day+"일 ");
			sb.append(yoil[week]+"요일 ");
			sb.append(hours+"시 ");
			sb.append(min+"분 ");
			sb.append(sec+"초 ");

			f.view.setText(sb.toString());

			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
		}
		
		
		//이렇게 해도 되지만 스트링버퍼 배운김에.
		//String []yoil = {"일","월","화","수","목","금","토"};
		//String str =year+"년 "+mon+"월 "+day+"일 "+yoil[week]+"요일 "+hours+"시 "+min+"분 "+sec+"초 ";
		//System.out.println(str);
	}
}
