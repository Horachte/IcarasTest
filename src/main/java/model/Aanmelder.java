package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 * 
 * @author Koen, Jelle
 *
 */
//TODO Moet persoonsRol nog implementeren.
@Entity
public class Aanmelder {
	
	private long id;
	
	private List<Interneovereenkomst> overeenkomsten = new ArrayList<Interneovereenkomst>();
	
	private CV cV;
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	@Column(name="AANMELDER_ID", unique = true, nullable = false)
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the overeenkomsten
	 */
	@OneToMany
	public List<Interneovereenkomst> getOvereenkomsten() {
		return overeenkomsten;
	}
	/**
	 * @param overeenkomsten the overeenkomsten to set
	 */
	public void setOvereenkomsten(ArrayList<Interneovereenkomst> overeenkomsten) {
		this.overeenkomsten = overeenkomsten;
	}
	/**
	 * @return the cV
	 */
	@Column(name="CV")
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
