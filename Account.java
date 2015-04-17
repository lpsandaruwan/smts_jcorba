/*** Account class definition-SMTS-CORBA-JAVA*/

import SMTS.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.*;


public class Account extends AccountPOA
{
    private ORB orb;
    private String accountID;
    private double balance;
    
    public void setORB(ORB orb_val)
    {
        orb = orb_val;
    }
    
    public void setAccountID(String accid)
    {
        this.accountID = accid;
    }
    
  /*  public void setBalance(double value)
    {
        this.balance = value;
    }
    */
}