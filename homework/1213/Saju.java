// 12�� 13�� �ݿ��� ����.
// ���ξ� 
//4) �������� �������� ���α׷��� �ϼ��Ͽ� �����մϴ�.(*)
//rola70@nate.com

import java.util.Scanner;
class Saju 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String name;
		int zodiac, mon, day,  time;
//�¾   ��      , ��    , ��  ,   �� 

		String lucky[] = {"õ��","õ��","õ��", "õ��", "õ��", "õ��" , "õ��", "õ��", "õ��", "õ��","õ��", "õ��"};
		
		String puli[] ={"õ�� : ��� ������ ���δ����� ����." , 
			 				  "õ�� : ���� �����ִ� ����.",
		 					  "õ�� : �������� �ִ� ����. ",
							  "õ�� : � �ĵ��� ����.",
							  "õ�� : �ΰ����� ����.",
							  "õ�� : �Ӹ��� ����.",
						      "õ�� : �ϴ÷κ��� ���� ������ �¾.",
						      "õ�� : �ܷο��� ����Ÿ�� ����.",
							  "õ�� : �������� �ִ�.",
							  "õ�� : �̼����� �ŷ�������. ������,�ٶ���.",
							  "õ�� : �����ְ� ����.",
							  "õ�� : ���̱�� �������."};

	
	//�̸�, �� , �¾ ��,��,�� �Է¹ޱ�
	 System.out.println("**��̷κ��� �������� Ȯ�� ���α׷��Դϴ�**");
     System.out.print("�̸��� �Է����ּ���===>");
     name = sc.next();
	 System.out.println();

	 System.out.println("����� �츦 �Ʒ� ���⿡�� �������ּ���.");
     System.out.println("1.��(��)   2.��(��)   3.ȣ����(��)   4.�䳢(��)   5.��(��)   6.��(��) ");
	 System.out.println("7.��(��)   8.��(��)   9.������(��)   10.��(��)   11.��(��)   12.����(��)");
     zodiac = sc.nextInt();
	 System.out.println();

	 System.out.print("���� ź�� ���� �Է����ּ���===>");
     mon = sc.nextInt();
     System.out.print("���� ź�� ���� �Է����ּ���===>");
     day = sc.nextInt();
	 System.out.println();

	 System.out.println("�¾ �ð��� �Ʒ� ���⿡�� �������ּ���.");
     System.out.println("1.[23��~01��]   2.[01��~03��]   3.[03��~05��]  4.[05��~07��]  ");
     System.out.println("5.[07��~09��]   6.[09��~11��]   7.[11��~13��]  8.[13��~15��]   ");
     System.out.println("9.[15��~17��]  10.[17��~19��] 11.[19��~21��] 12.[21��~23��] ");
     time = sc.nextInt();
	 System.out.println();	
	
		zodiac = zodiac-1;
			System.out.println("\n**����Ǯ�� ����� Ǯ���մϴ�**\n");
			System.out.println("����� �̸���  "+name+ "�Դϴ�.");
			System.out.println("����� "+mon+"�� "+day+"�� �� �¾���ϴ�.");
			System.out.println();
			
			System.out.println("����� ù��° ����  " + lucky[zodiac]+ "�Դϴ�.");
		    System.out.println(puli[zodiac]);
			System.out.println();

		zodiac = (zodiac + mon - 1)%12; //ù��°�� �����ڸ� �ѹ� ��� (-1) ����ŭ ������� �̵�
			System.out.println("����� �ι�° ����  " + lucky[zodiac] + "�Դϴ�.");
			System.out.println(puli[zodiac]);
			System.out.println();
      
       zodiac = (zodiac + day -1)%12;  
			System.out.println("����� ����° ����  " + lucky[zodiac] + "�Դϴ�.");
			 System.out.println(puli[zodiac]);
			System.out.println();
      
       zodiac = (zodiac + time -1)%12;
			 System.out.println("����� �׹�° ����  " + lucky[zodiac] + "�Դϴ�.");
			 System.out.println(puli[zodiac]);

			 System.out.println();
			 System.out.println("��̷� ���� ����Ǯ�̴� ����� �����ٰ� ��������������! ");
			 
	}
}