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
public class kupci {
    
    int custId;
    String lastName;
    String firstName;
    String emailID;
    String password;
    
    
    public kupci(int custId, String LastName,String FirstName, String Gender, String EmailID , String Password, String PhoneNo){
    	super();
    	this.custId= custId;
    	this.lastName= LastName;
    	this.firstName= FirstName;
    	this.emailID= EmailID;
    	this.password= Password;
    	
    	
    }

    public kupci(int aInt, String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

public String getEmailID() {
	return emailID;
}


public void setEmailID(String EmailID) {
	this.emailID = EmailID;
}
public String getPassword() {
	return password;
}



public void setPassword(String Password) {
	this.password = Password;
}

public String toString() {
	return "Customer [Cust_ID=" + custId + ", LastName=" +lastName + ", FirstName=" + firstName + ", EmailID="+emailID+"+Password +" + password + ", ]";
}

}


    

