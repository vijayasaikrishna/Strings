
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String a="abcde";
		String b=reverseString(a);
		System.out.println(a + " : " + b);
	}
	
	public static String reverseString(String a) {
		int length = a.length();
		int halflength=length/2;
	if (a.length()==1)
	{
		return a;
	}
	else if(length==2)
	{
		String front =a.substring(0, 1);
		String back  =a.substring(1,2);
		String ret= back + front;	
		return ret;
		
	}
	else if(a.length()>2)
		
	{
		String front =a.substring(0,1);
		String back  =a.substring(length-1,length);
		String ret	 =back+reverseString(a.substring(1,length-1))+front;
		return ret;
	}
	
		return "";
		
	}
}
