package model;

import java.util.Date;

/**
 * 
 * @author Koen, Jelle
 *
 */
public interface Overeenkomst {
public boolean isGetekend = false;
public boolean isStandaardOvereenkomst = false;

//TODO uit het commentaar halen als de betreffende classes zijn aangemaakt. Zowel de attributen als getters en setters. Ook de hibernate annotaties moeten nog worden toegevoegd.
//Er is nog geen Date class
public Date startDatum;
public Date eindDatum;

//Er is nog geen Persoon class
public Persoon ondergetekende = null;

/**
 * @return the isGetekend
 */
public boolean isGetekend();

/**
 * @param isGetekend the isGetekend to set
 */
public void setGetekend(boolean isGetekend);

/**
 * @return the isStandaardOvereenkomst
 */
public boolean isStandaardOvereenkomst();

/**
 * @param isStandaardOvereenkomst the isStandaardOvereenkomst to set
 */
public void setStandaardOvereenkomst(boolean isStandaardOvereenkomst);

/**
 * @return the startDatum
 */
public Date getStartDatum();

/**
 * @param startDatum the startDatum to set
 */
public void setStartDatum(Date startDatum);

/**
 * @return the eindDatum
 */
public Date getEindDatum();

/**
 * @param eindDatum the eindDatum to set
 */
public void setEindDatum(Date eindDatum);

/**
 * @return the ondergetekende
 */
public Persoon getOndergetekende();

/**
 * @param ondergetekende the ondergetekende to set
 */
public void setOndergetekende(Persoon ondergetekende);

	
}
