
public class abc {
	String abc(String i1,int i2) {
		int i,j;
		int sum =0;
		String s =" ";
		if(i2==0) {
			for(i=0;i<i1.length();i++) {
				char c = i1.charAt(i);
				if(Character.isDigit(c)) {
					sum= sum+ c;
				}
			}
		String d = String.valueOf(sum);	
		return (d);
		}
		
		else {
			for(j=0;j<i1.length();j++) {
				char c = i1.charAt(j);
				if(!(Character.isDigit(c))) {
					s = s + c;
				}
			}
			return (s);	
		}
		
	}

} 
