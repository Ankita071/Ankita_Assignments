package assignment1.Assignment1;

public class Customer {
	int customerId;
	String customerName;
	long customerContact;

	Address address;

	public Customer() {
		
	}

	public Customer(int customerId, String customerName, long customerContact, Address address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	void customerDetails() {
		System.out.println("Customer Id: " + getCustomerId());
		System.out.println("Customer Name: " + getCustomerName());
		System.out.println("Customer Contact: " + getCustomerContact());
		System.out.println("Customer Address: " + getAddress());
	}
}
