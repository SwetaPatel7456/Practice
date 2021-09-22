import java.io.*;
interface playable{
	void play();
}
class Venna implements playable{
public void play()
{
System.out.println("venna play");
}	
}

class Saxophone implements playable{
	public void play(){
	System.out.println("Saxophone play");}
	
}
class TestClass {
	public static void main(String args[]){
		playable v = new Venna();
		v.play();
		playable s = new Saxophone();
		s.play();
	}
}
 