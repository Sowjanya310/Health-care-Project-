
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HELLO";
		int size=s.length();
		String rev="";
		
		StringBuffer sf=new StringBuffer(s);//METHOD-1
		System.out.println(sf.reverse());
		
		for(int i=size-1;i>=0;i--)//METHOD-2
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
		
	}
	
}
		
	
	