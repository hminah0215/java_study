import java.io.FileWriter;
import java.io.IOException;
class FileWriterTest02
{
	public static void main(String[] args) 
	{
		try{
		FileWriter fw = new FileWriter("c:/javastudy/day1224/hello.txt");
		fw.write("메리크리스마스!!");
		fw.close();
		System.out.println("파일을 생성하였습니다.");
		}catch(IOException i){
			System.out.println("파일처리중에 문제가 발생하였습니다.");
		}
	}
}
