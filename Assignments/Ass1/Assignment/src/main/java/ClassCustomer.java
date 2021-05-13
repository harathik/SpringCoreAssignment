public class ClassCustomer {
	
	int custId;
	String custname;
	long custCont;
	ClassAddress custAddr;
	public int getCustomerId() {
		return custId;
	}
	public void setCustomerId(int custId) {
		this.custId = custId;
	}
	public String getCustomerName() {
		return custname;
	}
	public void setCustomerName(String custname) {
		this.custname = custname;
	}
	public long getCustomerContact() {
		return custCont;
	}
	public void setCustomerContact(long custCont) {
		this.custCont = custCont;
	}
	public ClassAddress getCustomerAddress() {
		return custAddr;
	}
	
	public void setCustomerAddress(ClassAddress custAddr) {
		this.custAddr = custAddr;
	}
	
	public void printDetails() {
		System.out.println("Customer ID = "+this.custId);
		System.out.println("Customer Name = "+this.custname);
		System.out.println("Customer Contact = "+this.custCont);
		System.out.println("Customer Address is = ");
		System.out.println("Street :" +getCustomerAddress().getStreet());
		System.out.println("City :" +getCustomerAddress().getCity());
		System.out.println("Zip :" +getCustomerAddress().getZip());
		System.out.println("Country :" +getCustomerAddress().getCountry());
	}

}
