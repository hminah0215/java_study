class ArraysTest02
{
	public static void main(String[] args) 
	{
		int []a = {100,200,300,400};
		int []b = {100,200,300};

		boolean flag = true;
		if( a.length != b.length){
			flag = false;
		}else{
			for(int i =0; i< a.length; i++  ){
				if(a[i] != b[i]){
					flag = false;
					break;
				}
			}
		}
		if(flag == true){
			System.out.println("�� �迭�� ���ƿ�");
		}else{
			System.out.println("�� �迭�� �޶��");	
		}
	}
}