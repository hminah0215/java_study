/*
substring
public String substring(int beginIndex,int endIndex)

examples:
 "hamburger".substring(4, 8) returns "urge"
 "smiles".substring(1, 5) returns "mile"
*/



class StringTest04 
{
	public static void main(String[] args) 
	{
		String data ="hello java hello korea";
		//Ư�� �ܾ �߶���� �ʹ�.
		
		String r  = data.substring(6,10); //java�� �߶������ 
		System.out.println(r); //java ���

		String r2 = data.substring(17); //17��° �ε������� ������ �߶������
		System.out.println(r2);	// korea ��µ�.
	}
}
