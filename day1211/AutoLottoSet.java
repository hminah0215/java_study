//HashSet �ߺ��� ������� ����. java.util =>set���� ã�� �� ����.
//TreeSet ������� �������� 
import java.util.TreeSet;

import java.util.Random;
class AutoLottoSet 
{
	public static void main(String[] args) 
	{
		TreeSet hs = new TreeSet();		//���� �����͸� �ִ¸�ŭ Ŀ���� �۾����� �׷�. 	
		Random r = new Random();
		
		while (hs.size() < 6){
			hs.add(	r.nextInt(45)+1 );
		}
		/*while(true){   //��ӵ���
				hs.add(	r.nextInt(45)+1 );
				if(hs.size() == 6 ){		//hs ����� 6�����ɶ� Ż����.
				break;
			}
		} ������ �̰�ó�� �Ѵ� ����*/

		System.out.println("*** �̹��� �ζ� ��õ��ȣ ***");
		System.out.println( 	hs	);
		//����� note �����°� ����
	}
}
