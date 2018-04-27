/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Andrew
 */
public interface ServerRemoteInterface extends Remote {
    // i think no constructor in interface
   // public AddNumbers() throws Exception;
    
    public int addUp(int x, int y) throws RemoteException;
    
}
