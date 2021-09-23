class BankDisplay{
	public static void main(String args[]){  
	Bank b;  
	b=new SCB();  
	System.out.println("SCB Rate of Interest: "+b.getRateOfInterest());  
	b=new Siddhartha();  
	System.out.println("SiddharthaBank Rate of Interest: "+b.getRateOfInterest());  
	b=new Nabil();  
	System.out.println("Nabil Rate of Interest: "+b.getRateOfInterest());  
	} 

}