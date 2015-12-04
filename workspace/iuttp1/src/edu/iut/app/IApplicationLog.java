package edu.iut.app;

import java.util.ArrayList;

public interface IApplicationLog {
	/** TP1 : Créérr les méthodes :
	 - setMessage
	  - getMessage
	  - addListener
	  - getApplicationLogListeners();
	*/
	public void setMessage(String message);
	public String getMessage();
	public void addListener(IApplicationLogListener e);
	public ArrayList<IApplicationLogListener> getpplicationLogListener();
}
