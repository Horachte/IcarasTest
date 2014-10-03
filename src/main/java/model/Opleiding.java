package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Opleiding {
	
	@Id
	@GeneratedValue
	@Column(name="OPLEIDING_ID", unique = true, nullable = false)
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
	
	

}
