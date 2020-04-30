import java.io.FileReader;
import java.io.IOException;

class FileReaderTest 
{
	public static void main(String[] args) 
	{
		try{
		FileReader fr = new FileReader("c:/javastudy/day1224/hello.txt");
		int ch;
		while( (ch = fr.read())  !=  -1   ){ //파일의 끝이 아닐때까지 파일리더 메뉴얼 체크.
			System.out.print( (char)ch );
		}
		fr.close();
		}catch(IOException e){
			System.out.print("파일처리중 문제가 발생하였습니다.");
		}
	}
}
