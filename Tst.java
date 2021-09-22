import java.util.*;
class Tst{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		char ch = s.nextChar();
		if (ch >= 'A' && ch <= 'Z')  {
			ch.toLowerCase();
            System.out.println(ch);
		}
      
        else if (ch >= 'a' && ch <= 'z') { 
		    ch.toUpperCase();
            System.out.println(ch);
	}
	
	
}
}