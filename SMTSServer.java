/*** Server-SMTS-CORBA-JAVA ***/

import SMTS.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.*;

public class SMTSServer
{
    public static void main(String[] args)
    {
        try
        {
            ORB orb = ORB.init(args, null);
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();
            
            Account[] accArray = new Account[10];
            
            System.out.println("Input ? ");
            
            int controller = -1;
            String id = "";
            Scanner input = new Scanner(System.in);
            Scanner sInput = new Scanner(System.in);
            controller = input.nextInt();
            
            while(controller != 0)
            {
                switch(controller)
                {
                    case 1:
                        System.out.println("id ? ");
                        id = sInput.nextLine();
                        accArray[0] = new Account();
                        accArray[0].setORB(orb);
                        accArray[0].setAccountID(id);
                }
            }
        }
        
        catch(Exception error)
        {
            System.out.println("Server error : " + error);
        }
    }
}