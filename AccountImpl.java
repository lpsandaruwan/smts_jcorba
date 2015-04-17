/*** SMTS - Account servant implementation ***/

import SMTS.*;
import SMTS.AccountPackage.*;
import org.omg.CORBA.*;
import org.omg.CORBA.PortableServer.*;
import java.io.*;

public class AccountImpl extends AccountPOA
{
    public AccountImpl(String accountID, AccountDB accountDB)
    {
        mAccountDB = accountDB;
        mAccountID = accountID;
        mBalance = mAccount.checkAccount(mAccountID);
    }
    
    protected void finalize()
    {
        mAccountDB.writeAccount(mAccountID, mBalance);
    }
    
    protected void saveAll()
    {
        mAcccountDB.writeAccount(mAccountID, mBalance);
    }
    
    public void withdraw(double value) throws InsufficientBalance
    {
        if(value > mBalance)
            throw new InsufficientBalance();
    }
    mBalance -= amount;
}