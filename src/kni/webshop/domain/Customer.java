package kni.webshop.domain;

public class Customer {

	private String customerId;
	private String name;
	private String adress;
	private boolean noOfOrdersMade; //Brak zlozonych zamowien
	
	public Customer() {
		super();
	}
	
	public Customer(String customerId, String name, String adress) {
		this.customerId = customerId;
		this.name = name;
		this.adress = adress;
		noOfOrdersMade = true;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", adress=" + adress + ", brak zamowien="
				+ noOfOrdersMade + "]";
	}

	@Override
	public boolean equals(Object other) {
		if(this == other) return true;
		if(other == null) return false;
		if(getClass() != other.getClass()) return false;
		
		Customer ziomek = (Customer) other; //Jeœli kod doszed³ tutaj:
//		Nie maja identycznej referencji
//		parametr nie rowna sie null
//		sa tej samej klasy
//		wiec rzutowanie jest mozliwe !
		
		//Porownywanie po id
		if(customerId == null) {
			if(ziomek.getCustomerId() != null) return false;
		} else if(customerId.equals(ziomek.getCustomerId())) {
			return false;
		}
		
		return true;
	}
	
	@Override   
	public int hashCode() { 
		final int prime = 31;    
		int result = 1;     
		result = prime * result + ( (customerId == null) ? 0 : customerId.hashCode() );     
		return result;   
	}
	
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public boolean isNoOfOrdersMade() {
		return noOfOrdersMade;
	}

	public void setNoOfOrdersMade(boolean noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}
	
	
	
}
