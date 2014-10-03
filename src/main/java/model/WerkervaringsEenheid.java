package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 * @author Koen, Jelle
 *
 */
@Entity
public class WerkervaringsEenheid {
	
	@Id
	@GeneratedValue
	@Column(name="WERKERVARINGSEENHEID_ID", unique = true, nullable = false)
	private long id;
	
	@ManyToOne
	private CV cv;

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
	 * @return the cv
	 */
	public CV getCv() {
		return cv;
	}

	/**
	 * @param cv the cv to set
	 */
	public void setCv(CV cv) {
		this.cv = cv;
	}
	
	
	

}
