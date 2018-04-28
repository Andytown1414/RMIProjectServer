package rmiserver;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// WHEN LEFT FRIDAY MOST RECENT - DEBUG MODE ONCE SERVER RUNNING THERE IS NO OBJECTS? BUT 
// USE A BREAKPOINT AND THERE IS. IS THAT NORMAL MAYBE?
/**
 *
 * @author Andrew
 */
public class ServerSide {
    public static void main(String[] args)
    {
        if(System.getSecurityManager() == null) 
        {
               System.setSecurityManager(new 
               RMISecurityManager());
        }
        
        try
        {
             ServerImplementation addObjIsItSkel = new ServerImplementation();
            ServerRemoteInterface stub = (ServerRemoteInterface) UnicastRemoteObject.exportObject(addObjIsItSkel, 0);
            
            
             Registry sRegistry = LocateRegistry.createRegistry(1099);
            
            sRegistry.rebind("aCalculation", stub);
            
            //Registry sRegistry = LocateRegistry.createRegistry(1099);
            //ServerImplementation addObjIsItSkel = new ServerImplementation();
            //sRegistry.rebind("aCalculation", addObjIsItSkel);
        }
        
        // random comment line just to test git 
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        System.out.println("Server Running..");
    }
            
            
            
        
}
