class StringTest04 
{
	public static void main(String[] args) 
	{
		String data ="�ȳ�, ȫ�浿";
		String r  =data.replace("�ȳ�","hello");
		System.out.println(r);	//hello,ȫ�浿	���
		System.out.println(data);	//�ȳ�,ȫ�浿 ���==��������. ��Ʈ���� �Һ�!

	}
}
