//12�� 24�� �ֹι�ȣ ���α׷� ���� Ǯ�� 
import java.util.Scanner;




class  CorrectJuminTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String jumin;
		System.out.print("�ֹι�ȣ��(������ - �� �����Ͽ�) �Է��ϼ���==>");
		jumin = sc.next();
		System.out.println("�Է��� �ֹι�ȣ�� " + jumin + " �Դϴ�.");

		//	920404-2345678
		//	�� = 11-{(2���� + 3���� + 4���� + 5���� + 6���� + 7���� + 8���� + 9���� + 2���� + 3���� + 4���� + 5����) mod 11}
		// 11-(37+35+16+11+28
		int []arr = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//0�� - �������ڸ�. �ǳʶٵ���
		
		if(jumin.charAt(6) != '-'){ //�������� �ƴѰ���? 
				System.out.println("������ - �� �Է����ּ���.");
				return;
			}
					
		if(jumin.length()  !=  14){ // �Է¹��� �ֹι�ȣ�� 14�ڸ��� �ƴ϶��	
			System.out.println("�ùٸ� �ֹε�Ϲ�ȣ�� �ƴմϴ�. Ȯ�����ּ���.");
			return;
		}
		
		int tot =0 ;
		for(int i =0; i < jumin.length()-1; i++){ //jumin.length()-1 or arr.length����
			if( i == 6){
				continue;
			}
			tot = tot + Integer.parseInt(jumin.charAt(i)+"") * arr[i]; 
			//�Է¹��� �ֹι�ȣ�� charAt���� �����ͼ� integer�� ������ȯ 	
 		}
		tot = tot % 11;
		tot = 11 - tot;
		
		if( tot == 10){
			tot = 0;
		}
		if(tot == 11){
			tot = 1;
		}

		int check = Integer.parseInt(jumin.charAt(13)+"");
		if( tot == check ){
			System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�.");
		}else{
			System.out.println("�ùٸ� �ֹι�ȣ�� �ƴմϴ�.");
		}
	}
}