package com.ipartek.formacion.sergio.bd;

import java.util.ArrayList;
import java.util.List;


//public abstract class Database implements IDBEvents {
public class Database implements IDBEvents {

	/**
	 * Array de listeners
	 *
	 * @version 30.09.2013
	 */
	private List<IDBEvents> onDatabaseIListener=new ArrayList<IDBEvents>();

	/**
	 * Funci�n para a�adir el listener   
	 *   
	 * @param listener listener a a�adir
	 */
	public void addIDBEventListener(IDBEvents listener){
		onDatabaseIListener.add(listener);
	}
	/**
	 * Funci�n para remover el l�stener
	 *  
	 * @param listener listener a remover
	 */
	public void RemoveIDBEventListener(IDBEvents listener){
		onDatabaseIListener.remove(listener);
	}    


	@Override
	public void onConnected() {
		for(IDBEvents listener: onDatabaseIListener)
			listener.onConnected();;

	}
	@Override
	public void onExit() {
		// TODO Auto-generated method stub

	}	
	//////FIN LOGICA DE LOS EVENTOS  




	public Database() {
		// TODO Auto-generated constructor stub

	}




	public void lanzarEvento(){
		onConnected();
	}




}
