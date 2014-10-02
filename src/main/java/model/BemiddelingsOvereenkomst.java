package model;

import java.util.Date;

public class BemiddelingsOvereenkomst implements InterneOvereenkomst {

	private boolean isGetekend = false;
	private boolean isStandaardOvereenkomst = false;
	private Date startDatum;
	private Date eindDatum;
	private Persoon ondergetekende = null;

	
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
