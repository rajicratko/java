/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klase;

/**
 *
 * @author rajic
 */
public class proizvodi {
    
        int productId;
	String productName;
	float productPrice;
	
	String productType;
	public proizvodi(int productId, String productName, float productPrice){
            super();
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
		
		this.productType=productType;
	 }

    proizvodi(int aInt, String string, int aInt0, float aFloat) {
        throw new UnsupportedOperationException("Not supported yet."); 
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
	
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
        @Override
	 public String toString(){
		 return "proizvodi[productId="+productId+",productName="+productName+",productStock="+","
		 		+ "productPrice="+productPrice+",productType="+productType+"]";
	 }
	 
	

}

