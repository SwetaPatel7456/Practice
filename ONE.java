package wrapperclass;
import java.io.*; 


class Employee{
	Employee(){
int eid=10;
String name = "RAM";
}
}
class PROGRAM4 {
	public static void main(String args[]) {
		Employee e = new Employee();
		System.out.println(e.eid + " " + e.name);
		Employee b = e;
		b.eid = 20;
		System.out.println(e.eid + " " + e.name);
}
}
