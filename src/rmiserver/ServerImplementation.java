package rmiserver;

import java.rmi.RemoteException;
import java.rmi.server.*;



/**
 *
 * @author Andrew
 */


// extends remoteunicast taken out for now for test
public class ServerImplementation implements ServerRemoteInterface 
{
    // should this be remote exception?? or is it needed at all? is super implied by default?
    /*
    public ServerImplementation() throws RemoteException
    {
        super();
    }
*/
    public int addUp(int x, int y) throws RemoteException
    {
        return x + y;
    }
}
