class StudentTest 
{
	public static void main(String[] args) 
	{
		String []name = {"���ξ�","�ֿ���","���ַ�","�ֺ���","������","�̿���","�̼���" };
		int age[] = { 29,28,32,29,25,31,28 };
		

		for(	int i=0	; i < name.length	; i++	){
			System.out.println( name[i] + "\t" + age[i] ); //\t �� �����ȸ�ŭ ��ĭ���
		}

			//���̰� ���������� �����մϴ�. 

			for( int i=0 ; i < age.length ; i++ ){
			for (int j = i+1 ; j < age.length ; j++ ){
				if( age[j] < age[i] ){  
					int temp ;  
					temp = age[i];
				     age[i] = age[j];
					 age[j] = temp;
			
					String temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
			
			}
		} 
	}		System.out.println();
			System.out.println("***���̼�����***");
			for(	int i=0	; i < name.length	; i++	){
			System.out.println( name[i] + "\t" + age[i] ); //\t �� �����ȸ�ŭ ��ĭ���
			
		}
	}
}
