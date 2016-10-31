package exercise2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteBuffer extends Remote {
    void put(Integer i) throws RemoteException;

    Integer get() throws RemoteException;
}