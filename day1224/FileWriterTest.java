import java.io.FileWriter;
class FileWriterTest 
{
	public static void main(String[] args) 
	{
		
		FileWriter fw = new FileWriter("c:/javastudy/day1224/hello.txt");
		fw.write("�޸�ũ��������!!");
		fw.close();
		
	}
}
/*

(((((�����Ͻ� ����)))))

FileWriterTest.java:7: error: unreported exception IOException; must be caught o
r declared to be thrown
                FileWriter fw = new FileWriter("c:/javastudy/day1224/hello.txt")
;
                                ^
FileWriterTest.java:8: error: unreported exception IOException; must be caught o
r declared to be thrown
                fw.write("�޸�ũ��������!!");
                        ^
FileWriterTest.java:9: error: unreported exception IOException; must be caught o
r declared to be thrown
                fw.close();
                        ^
3 errors


==> File Writer�� �����ڴ� ���ܸ� �����ϰ� �־��! 
public FileWriter(STRING filename)�� ��Ÿ���ͼ����� �ļդ� �ƴϱ� ������ �ݵ�� ����ó��! 




*/