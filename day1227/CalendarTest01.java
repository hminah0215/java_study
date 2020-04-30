
import java.util.Calendar;
class CalendarTest01 
{
	public static void main(String[] args) 
	{
		Calendar today = Calendar.getInstance();
		int year = today.get( Calendar.YEAR );
		int mon =  today.get( Calendar.MONTH )+1;
		int day = today.get( Calendar.DATE );
		int week = today.get( Calendar.DAY_OF_WEEK )-1;
		int hours = today.get( Calendar.HOUR_OF_DAY );
		int min = today.get( Calendar.MINUTE );
		int sec = today.get( Calendar.SECOND );
		
		String []yoil = {"일","월","화","수","목","금","토"};

		StringBuffer sb = new StringBuffer();
		sb.append(year+"년 ");
		sb.append(mon+"월 ");
		sb.append(day+"일 ");
		sb.append(yoil[week]+"요일 ");
		sb.append(hours+"시 ");
		sb.append(min+"분 ");
		sb.append(sec+"초 ");

		System.out.println(sb);
		//String []yoil = {"일","월","화","수","목","금","토"};
		//String str =year+"년 "+mon+"월 "+day+"일 "+yoil[week]+"요일 "+hours+"시 "+min+"분 "+sec+"초 ";
		//System.out.println(str);
	}
}
