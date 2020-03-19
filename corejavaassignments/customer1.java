package corejavaassignments;

public class customer1 {
	int discount;
	
	
	
	public int discount() {
	
		System.out.println("this return "+discount+ "% discount");
	 return discount;
	}
	
	public customer1(){
		this.discount=10;
	}
	
	
	
	
	public static void main(String[] args) {
		Customer obj=new Customer();
       obj.setCustid1(101);
       System.out.println("this is private int for custid" + obj.getCustid1());
		obj.increamentcustcount();
	}

}