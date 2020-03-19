package corejavaassignments;


public class Employee {
		   
		int id;
		String name;
		int a;
		int b;
		
		Employee(int id,String empName){
			this.id=id;
			this.name=empName;}
		
			public static void display() {
			System.out.println("this is display method ");
			//System.out.println(id + name);
			
		}
		public Employee() {
			//System.out.println("this is private default constructor");
		}
		
		
		
		
		
		
		
		
		
		public static void main(String[] args) {
		Employee empobj=new Employee();
		Employee empobj1=new Employee(111," john");
		Employee empobj2=new Employee("stringparameter");
			
			
			System.out.println("this is overloading constructor");
			empobj.display();
			empobj1.display();
			empobj2.display();
			
		}
		 Employee(String name) {
				this.name=name;
				System.out.println("this is proteded with string paramenterconstructor");
				}
		public boolean equal(String name) {
			 boolean samename;
			 if(this.name.equalsIgnoreCase(name)) {
				 System.out.println("this is having equal name"); 
				 samename=true;
			 }else {System.out.println("this is not in equal method");
			   samename=false;}
			// if(name==empname) {
				// System.out.println("the parameter of equal method and istance of employee is same");
			// }
			//System.out.println("this is equal method");
			
			return samename;
			
		}
		//inner class 
		public class ContractEmp{
			public  void main(String[] args) {
				Employee innerobj=new Employee();
				innerobj.display();
			}
			
			
		}
	
}
