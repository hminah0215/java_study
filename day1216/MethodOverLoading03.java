/* �޼ҵ� �ߺ�!!! ��ȯ�ϴ� !!!! 
���� ) ������ ����� ������ �޼ҵ带 �ߺ��ϼ���.
-�����ΰ��߿� ū���� ���Ͽ� ��ȯ�ϴ� �޼ҵ�
-���� �����߿� ū ���� ���Ͽ� ��ȯ�ϴ� �޼ҵ�
- �Ǽ� �ΰ��߿� ū���� ��ȯ�ϴ� �޼ҵ�
-�����迭�߿� ū���� ���Ͽ� ��ȯ�ϴ� �޼ҵ� 
-�Ǽ� �迭�߿� ū���� ���Ͽ� ��ȯ�ϴ� �޼ҵ� 
*/
class MaxUtil
{
	//�����ΰ��߿� ū���� ���Ͽ� ��ȯ�ϴ� �޼ҵ�
	public int max(int a, int b){
		int r = a;
		if( b > r){
			r = b;
		}
		return r;
	}

	//���� �����߿� ū ���� ���Ͽ� ��ȯ�ϴ� �޼ҵ�
	public int max(int a, int b, int c){
		int r;
		r = max(max( a,b ),c);  //�ƽ� ��Ʈ 2��¥���� �־ �� �� ����. 
		return r;
	}

	//�Ǽ� �ΰ��߿� ū���� ��ȯ�ϴ� �޼ҵ�
	public double max(double a, double b){
		double r = a;
		if( b > r ){
			r = b;
		}
		return r;
		/*
		 if( a> b)
			return a;
		else
			return b; 
			*/
		/*
		if( b > a)
			a=b;
		return a;
		*/
	}

	//�����迭�߿� ū���� ���Ͽ� ��ȯ�ϴ� �޼ҵ� 
	public int max(int a[]){
		int v = a[0];
		for( int i = 1 ; i < a.length ; i++){
			if(v < a[i]){
				v = a[i];
			}
		}
		return v;
	}

	//�Ǽ� �迭�߿� ū���� ���Ͽ� ��ȯ�ϴ� �޼ҵ� 
	public double max(double a[]){
		double v = a[0];
		for( int i = 1 ; i < a.length ; i++){
			if(v < a[i]){
				v = a[i];
			}
		}
		return v;
	}

}


class MethodOverLoading03

{
	public static void main(String[] args) 
	{
		MaxUtil mu = new MaxUtil();

		System.out.println( mu.max(2,3));
		System.out.println( mu.max(2,7,3));
		System.out.println( mu.max(9.1, 2.8));
		int []arr = {1, 5, 3, 8, 2 };
		System.out.println( mu.max(arr));
		double []z = {10.2, 5.6, 7.9, 2.7};
		System.out.println( mu.max(z));
	}
}