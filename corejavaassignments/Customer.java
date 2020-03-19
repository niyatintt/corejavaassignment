package corejavaassignments;

public class Customer {
	int custID;
	String custName;
	static int custcount=0;
	
	private int custid1;
	private String name;
	public int custid2;
	

	
	
	public void increamentcustcount() {
		 
		for (int i=0;i<10;i++) {
			Customer.custcount++;
			
		}
		System.out.println("the total count of customer is: "+ custcount);
	}
	
	
	public int getCustid1() {
		return custid1;
	}


	public void setCustid1(int custid1) {
		this.custid1 = custid1;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void print() {
		System.out.println("This is print method");
	}
	
	
    public static void main(String[] args) {
    	//trying to call contact class method 
    	Customer.Contact contactclassobject= new Customer().new Contact();
    	contactclassobject.contactinnermethod();
        System.out.println(contactclassobject.str1);
    	
    	Customer obj =new Customer();
    	obj.print();
    }
    
    private class Address{
    	private int str;
    
    	public void main(String[] args) {
    		Customer objineer = new Customer();
    		objineer.print();
    		System.out.println("this is address method");
			
		}
    }
    

    protected class Contact{
    	private int str1;
    	
    	protected void contactinnermethod() {
    		System.out.println("this is contact class method ");
    	}
    	
    	
    }
    
		
	
      
}
