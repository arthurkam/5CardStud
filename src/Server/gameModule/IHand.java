package Server.gameModule;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface IHand  extends Remote  {
	public ArrayList<ICard>  getCards() throws RemoteException;
}
