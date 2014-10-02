package model;

import java.util.ArrayList;
/**
 * 
 * @author Koen, Jelle
 *
 */
public class Aanmelder {
	private ArrayList<InterneOvereenkomst> overeenkomsten;
	private CV cV;
	
	/**
	 * @return the overeenkomsten
	 */
	public ArrayList<InterneOvereenkomst> getOvereenkomsten() {
		return overeenkomsten;
	}
	/**
	 * @param overeenkomsten the overeenkomsten to set
	 */
	public void setOvereenkomsten(ArrayList<InterneOvereenkomst> overeenkomsten) {
		this.overeenkomsten = overeenkomsten;
	}
	/**
	 * @return the cV
	 */
	public CV getcV() {
		return cV;
	}
	/**
	 * @param cV the cV to set
	 */
	public void setcV(CV cV) {
		this.cV = cV;
	}
	
	


}
