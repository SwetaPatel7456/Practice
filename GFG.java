import java.io.*;
interface Vehicle{
	void changegear(int newgear);
	void speedup(int newspeed);
	void applybrake(int newbreak);
	
}

class Bicycle implements Vehicle{
	int gear;
	int speed;
	public  void changegear(int newgear)
	     gear = newgear;
    public void speedup(int increment)
       speed = speed+ increment;
    public void applybrake(int decrement);
       speed = speed-decrement;
    public void printstatus()
        System.out.println("speed :" + spped + "gear :"+ gear);
}
class GFG { 
    
    public static void main (String args[]) { 
      
        // creating an inatance of Bicycle  
        // doing some operations  
        Bicycle bicycle = new Bicycle(); 
        bicycle.changegear(2); 
        bicycle.speedup(3); 
        bicycle.applybrake(1); 
          
        System.out.println("Bicycle present state :"); 
        bicycle.printstatus(); }
}