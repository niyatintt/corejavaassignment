package corejavaassignments;

public class Inheritancemain {

 public static void main(String[] args) {
		Employee cust =new Employee();
	  cust=new Contractor(89);
	Employee cust1=new Employee("niy");
	Employee cust2=new Employee("kie");
	
   cust1.equal(cust2.name);
  System.out.println(cust1.name + cust2.name);
	 
	// System.out.println("invoiking contructor"+cust.id);
  
  // calling discount method 
  
         customer1 custt=new customer1();
         custt.discount();
     SilverCustomer custt1= new SilverCustomer();
         custt1.discount(100);
         custt= new GoldCustomer();
        custt.discount();
        
}
}
