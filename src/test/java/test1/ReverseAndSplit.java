package test1;

public class ReverseAndSplit {

	public static void main(String[] args) {
		
		String s="I love programming";
		String[] s1 = s.split(" ");
		
		String revStr="";
		for(String st:s1)
		{
			String revWrd="";
			for(int i=st.length()-1;i>=0;i--)
			{
				revWrd=revWrd+st.charAt(i);
			}
			revStr=revStr+revWrd+" ";
		}
		System.out.print(revStr);

	}

}
