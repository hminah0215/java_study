/* �޼ҵ� �ߺ�!!! ��ȯ�ϴ� !!!! 
���� ) ������ ����� ������ �޼ҵ带 �ߺ��ϼ���.
-�����ΰ��߿� ū���� ���Ͽ� ��ȯ�ϴ� �޼ҵ�
-���� �����߿� ū ���� ���Ͽ� ��ȯ�ϴ� �޼ҵ�
- �Ǽ� �ΰ��߿� ū���� ��ȯ�ϴ� �޼ҵ�
-�����迭�߿� ū���� ���Ͽ� ��ȯ�ϴ� �޼ҵ� 
-�Ǽ� �迭�߿� ū���� ���Ͽ� ��ȯ�ϴ� �޼ҵ� 
*/

class Test01
{
	//�����ΰ��� ū��
	public void max(int a, int b){  
		int c = a;
			if(a > b){
				c = a;
	    	}
			System.out.println("���� ū����: "+c);	
		}

	//���������� ū��	
	public void max(int a, int b, int c){ 
		int m = a;
		if(b > a){
			if(b > c){
				m=b;
			}else {
				m=c;
				}
			}else if( a> c){
				m =a;
			}else{
				m=c;
			}
			System.out.println("���� ū����: "+m);
		}

	//�Ǽ� �ΰ� �� ū�� 
	public void max(double a, double b){ 
		double c = a;
			if( a < b){
				c = b;
			}
			System.out.println("���� ū����: "+c);
	}
	//�����迭 �� ū��
	public void max(int a[])	{ 
		int b = a[0];
		for(int i = 1 ; i < a.length ; i++){
			if( b <a[i] ){
				b = a[i];
			}
		} 
		System.out.println("���� ū����: "+b);
}
	//�Ǽ��迭 �� ū�� 
	public void max(double a[]){ 
		double b = a[0];
		for(int i = 1 ; i < a.length ; i++){
			if( b <a[i] ){
				b = a[i];
			}
		} 
		System.out.println("���� ū����: "+b);
	}
}



class  Test
{
	public static void main(String[] args) 
	{
		Test01 t = new Test01();
		t.max(9,2);  //�����ΰ�
		t.max(8,1,7);	//��������
		t.max(3.2 , 6.8);	//�Ǽ��ΰ� 
		int []a = {1, 5, 3, 8,2 };
		t.max(a);
		double []z = {10.2, 5.6, 7.9, 2.7};
		t.max(z);
	
		

	}
}
