
package klase;

/**
 *
 * @author rajic
 */
public class korpa {
        int productId;
	String productName;
	float productPrice;
        int custId;
        String lastName;
        String firstName;
	
	
	public korpa(int productId, String productName, float productPrice, String lastName, String firstName, int custId){
            super();
            this.productId=productId;
            this.productName=productName;
            this.productPrice=productPrice;
            this.custId=custId;
            this.lastName=lastName;
            this.firstName=firstName;
		
		
	 }
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public int getCust_ID() {
	return custId;
        }


        public void setCustId(int custId) {
            this.custId = custId;
        }
        public String getLastName() {
            return lastName;
        }


        public void setLastName(String lastName) {
            this.lastName = lastName;
        }   
        public String getFirstName() {
            return firstName;
        }


        public void setFirsttName(String firstName) {
            this.firstName =firstName;
        }
	
        @Override
	 public String toString(){
		 return "proizvodi[productId="+productId+",productName="+productName+","
		 		+ "productPrice="+productPrice+"custId="+custId+",lastName="+lastName+"firtsName"+firstName+"]";
	 }
	 
}
    

