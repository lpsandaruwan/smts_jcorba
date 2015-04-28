import SMTS.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;

import java.util.Properties;

class AccountImpl extends AccountPOA {
  private ORB orb;
  public String id;
  public double balance;
  
  public void setORB(ORB orb_val) {
    orb = orb_val; 
  }

  // implement sayHello() method
  public double getBalance(String accID) {
    return this.balance;
  }
  
  public void deposit(double amount){
    this.balance += amount;
  }
  
  public void withdraw(double amount){
    this.balance -= amount;
  }
    
  // implement shutdown() method
  public void shutdown() {
    orb.shutdown(false);
  }
}
