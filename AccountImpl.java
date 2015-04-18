import SMTS.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;

import java.util.Properties;

class AccountImpl extends AccountPOA {
  private ORB orb;

  public void setORB(ORB orb_val) {
    orb = orb_val; 
  }
    
  // implement sayHello() method
  public double getBalance(String accID) {
    return 100.0;
  }
  
  public void deposit(double amount){
    System.out.println("Calld d");
  }
  
  public void withdraw(double amount){
    System.out.println("Calld w");
  }
    
  // implement shutdown() method
  public void shutdown() {
    orb.shutdown(false);
  }
}
