package corejavaassignments;

public class SilverCustomer extends customer1 {


	
	SilverCustomer(){
		
		this.discount= 100;
	}
public int discount (int a) { 
	  
		System.out.println("this is overload method in silver customer class" +a);
		return this.discount ;
	}
	
}
