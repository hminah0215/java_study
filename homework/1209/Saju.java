//��������. �̸�/�����»���/����/ ���ø� �Է¹޾� ����Ǯ��.

import java.util.Scanner;
class  Saju
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		int  zodiac, mon,day, time;
		int abc= 0; //�̵��ϴ� ��
		int def= 0;
		int ghi= 0;
		int jkl= 0;
		
		System.out.println("***�������� Ȯ�� ���α׷��Դϴ�***");
		System.out.print("�̸��� �Է��ϼ���===>");
		name=sc.nextLine();
		System.out.print("�츦 �Է��ϼ���===>");
		zodiac=sc.nextInt();
		//1.�� 2.�� 3.�� 4.�� 5.�� 6.�� 7.�� 8.�� 9.�� 10.�� 11.�� 12.��
		System.out.print("�¾ ���� �Է��ϼ���===>");
		mon=sc.nextInt();
		System.out.print("�¾ ���� �Է��ϼ���===>");
		day=sc.nextInt();
		System.out.print("�¾ �ð��� �Է��ϼ���===>");
		time=sc.nextInt();

		for( int a=0; a <= zodiac ; a++ ){ //��
		
			a = zodiac;
				
				
				for(int b=0; b  <= mon  ; b++){ //�¾ ��
			
						abc = a-2;
						
							//if( mon ==1 )
							//	mon = abc;
									abc++;
					
					for( int c=0; c <=day ; c++){ //�¾ ��
						def = b-3;
							//if( day ==1 )
							//	day = def;
									def++;
						
						
						
					
					for( int d=0 ; d <= time  ; d++){ //�¾ �ð�
						ghi = c-4;
						//	if( time ==1 )
								//time = ghi;
									ghi++;

					}
					
					
					}
				
				}
		
		}
				System.out.println(zodiac);
				System.out.println(abc);
				System.out.println(def);
				System.out.println(ghi);
				


	}
}
