package model;

import java.io.File;
import java.util.ArrayList;

/**
 * 
 * @author Koen, Jelle
 *
 */
public class CV {
	private File cvDocument;
	private ArrayList<WerkervaringsEenheid> werkervaringsEenheden;
	private ArrayList<Opleiding> opleidingen;
	private ArrayList<Expertise> expertises;
	
	/**
	 * @return the cvDocument
	 */
	public File getCvDocument() {
		return cvDocument;
	}
	/**
	 * @param cvDocument the cvDocument to set
	 */
	public void setCvDocument(File cvDocument) {
		this.cvDocument = cvDocument;
	}
	/**
	 * @return the werkervaringsEenheden
	 */
	public ArrayList<WerkervaringsEenheid> getWerkervaringsEenheden() {
		return werkervaringsEenheden;
	}
	/**
	 * @param werkervaringsEenheden the werkervaringsEenheden to set
	 */
	public void setWerkervaringsEenheden(
			ArrayList<WerkervaringsEenheid> werkervaringsEenheden) {
		this.werkervaringsEenheden = werkervaringsEenheden;
	}
	/**
	 * @return the opleidingen
	 */
	public ArrayList<Opleiding> getOpleidingen() {
		return opleidingen;
	}
	/**
	 * @param opleidingen the opleidingen to set
	 */
	public void setOpleidingen(ArrayList<Opleiding> opleidingen) {
		this.opleidingen = opleidingen;
	}
	/**
	 * @return the expertises
	 */
	public ArrayList<Expertise> getExpertises() {
		return expertises;
	}
	/**
	 * @param expertises the expertises to set
	 */
	public void setExpertises(ArrayList<Expertise> expertises) {
		this.expertises = expertises;
	}
	
	

}
