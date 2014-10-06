package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * 
 * @author Koen, Jelle
 *
 */
@Entity
public class Bemiddelingsovereenkomst extends Interneovereenkomst {

	private long id;
	private boolean isGetekend = false;
	private boolean isStandaardOvereenkomst = false;
	private Date startDatum;
	private Date eindDatum;
	private Persoon ondergetekende = null;
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	@Column(name="BEMIDDELINGSOVEREENKOMST_ID", unique = true, nullable = false)
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
	 * @return the isGetekend
	 */
	@Column(name="getekend")
	public boolean isGetekend() {
		return isGetekend;
	}
	/**
	 * @param isGetekend the isGetekend to set
	 */
	public void setGetekend(boolean isGetekend) {
		this.isGetekend = isGetekend;
	}
	/**
	 * @return the isStandaardOvereenkomst
	 */
	@Column(name="standaardovereenkomst")
	public boolean isStandaardOvereenkomst() {
		return isStandaardOvereenkomst;
	}
	/**
	 * @param isStandaardOvereenkomst the isStandaardOvereenkomst to set
	 */
	public void setStandaardOvereenkomst(boolean isStandaardOvereenkomst) {
		this.isStandaardOvereenkomst = isStandaardOvereenkomst;
	}
	/**
	 * @return the startDatum
	 */
	@Column(name="startdatum")
	public Date getStartDatum() {
		return startDatum;
	}
	/**
	 * @param startDatum the startDatum to set
	 */
	public void setStartDatum(Date startDatum) {
		this.startDatum = startDatum;
	}
	/**
	 * @return the eindDatum
	 */
	@Column(name="einddatum")
	public Date getEindDatum() {
		return eindDatum;
	}
	/**
	 * @param eindDatum the eindDatum to set
	 */
	public void setEindDatum(Date eindDatum) {
		this.eindDatum = eindDatum;
	}
	/**
	 * @return the ondergetekende
	 */
	//TODO implementeren voor hibernate als er een persoonsklasse is.
	//@OneToOne
	public Persoon getOndergetekende() {
		return ondergetekende;
	}
	/**
	 * @param ondergetekende the ondergetekende to set
	 */
	public void setOndergetekende(Persoon ondergetekende) {
		this.ondergetekende = ondergetekende;
	}
	
	


}
