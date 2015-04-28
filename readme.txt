### compile

idlj -fall SMTS.idlj
javac SMTS/*.java Server.java AccountImpl.java Client.java


### start and run the server
orbd -ORBInitialPort 1050 -ORBInitialHost localhost&
start java Server -ORBInitialPort 1050 -ORBInitialHost localhost

### run the client
in another terminal window,

**get balance /// '1111' is the user id
 java Client -ORBInitialPort 1050 -ORBInitialHost localhost balance 1111

**deposit
 java Client -ORBInitialPort 1050 -ORBInitialHost localhost deposit 100
 
**withdraw
 java Client -ORBInitialPort 1050 -ORBInitialHost localhost withdraw 400
 
*** check the balance again
java Client -ORBInitialPort 1050 -ORBInitialHost localhost balance 1111