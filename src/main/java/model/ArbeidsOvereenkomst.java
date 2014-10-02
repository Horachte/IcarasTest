package model;

import java.util.Date;

/**
 * 
 * @author Koen, Jelle
 *
 */
public class ArbeidsOvereenkomst implements Overeenkomst {

	private boolean isGetekend = false;
	private boolean isStandaardOvereenkomst = false;
	private Bedrijf werkgever;
	private Persoon werknemer;
	public Date startDatum;
	public Date eindDatum;
	public Persoon ondergetekende = null;
	
	public boolean isGetekend() {
		return isGetekend;
	}

	public void setGetekend(boolean isGetekend) {
		this.isGetekend = isGetekend;
		
	}

	public boolean isStandaardOvereenkomst() {		
		return isStandaardOvereenkomst;
	}

	public void setStandaardOvereenkomst(boolean isStandaardOvereenkomst) {
		this.isStandaardOvereenkomst = isStandaardOvereenkomst;
		
	}

	/**
	 * @return the werkgever
	 */
	public Bedrijf getWerkgever() {
		return werkgever;
	}

	/**
	 * @param werkgever the werkgever to set
	 */
	public void setWerkgever(Bedrijf werkgever) {
		this.werkgever = werkgever;
	}

	/**
	 * @return the werknemer
	 */
	public Persoon getWerknemer() {
		return werknemer;
	}

	/**
	 * @param werknemer the werknemer to set
	 */
	public void setWerknemer(Persoon werknemer) {
		this.werknemer = werknemer;
	}
	public Date getStartDatum() {
		return startDatum;
	}

	public void setStartDatum(Date startDatum) {
		this.startDatum = startDatum;
		
	}

	public Date getEindDatum() {
		return eindDatum;
	}

	public void setEindDatum(Date eindDatum) {
		this.eindDatum = eindDatum;
		
	}

	public Persoon getOndergetekende() {
		return ondergetekende;
	}

	public void setOndergetekende(Persoon ondergetekende) {
		this.ondergetekende = ondergetekende;
		
	}
	
	
}
