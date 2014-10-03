package model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

/**
 * 
 * @author Koen, Jelle
 *
 */
@Entity
public class CV {
	
	@Id
	@GeneratedValue
	@Column(name="CV_ID", unique = true, nullable = false)
	private long id;
	
	@Lob
	private File cvDocument;
	
	@OneToMany
	private List<WerkervaringsEenheid> werkervaringsEenheden = new ArrayList<WerkervaringsEenheid>();
	@OneToMany
	private List<Opleiding> opleidingen = new ArrayList<Opleiding>();
	@OneToMany
	private List<Expertise> expertises = new ArrayList<Expertise>();
	
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
	public List<WerkervaringsEenheid> getWerkervaringsEenheden() {
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
	public List<Opleiding> getOpleidingen() {
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
	public List<Expertise> getExpertises() {
		return expertises;
	}
	/**
	 * @param expertises the expertises to set
	 */
	public void setExpertises(ArrayList<Expertise> expertises) {
		this.expertises = expertises;
	}
	
	
	
	

}
