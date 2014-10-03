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
	
	@Id
	@GeneratedValue
	@Column(name="AANMELDER_ID", unique = true, nullable = false)
	private long id;
	
	@OneToMany
	private List<InterneOvereenkomst> overeenkomsten = new ArrayList<InterneOvereenkomst>();
	
	@Column(name="CV")
	private CV cV;
	
	/**
	 * @return the id
	 */
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
	public List<InterneOvereenkomst> getOvereenkomsten() {
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
