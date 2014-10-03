package model;

import java.util.Date;

/**
 * 
 * @author Koen, Jelle
 *
 */
public abstract class Overeenkomst {

public long id;	
public boolean isGetekend = false;
public boolean isStandaardOvereenkomst = false;
public Date startDatum;
public Date eindDatum;
public Persoon ondergetekende = null;
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
 * @return the isGetekend
 */
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
