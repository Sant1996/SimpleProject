package test1;

public class RepeatedCharacters {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="santhosh";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
				}
			}
		}

	}

}
