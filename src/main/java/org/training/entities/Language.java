package org.training.entities;

import java.io.Serializable;

public class Language implements Serializable{

	private static final long serialVersionUID = 1L;

	private String languagesKnown;
	private String read;
	private String write;
	private String speak;
	private String languageLevel;
	private String proficiencyLevel;
	
	public Language() {
	}

	public Language(String languagesKnown, String read, String write, String speak, String languageLevel,
			String proficiencyLevel) {
		this.languagesKnown = languagesKnown;
		this.read = read;
		this.write = write;
		this.speak = speak;
		this.languageLevel = languageLevel;
		this.proficiencyLevel = proficiencyLevel;
	}

	public String getLanguagesKnown() {
		return languagesKnown;
	}

	public void setLanguagesKnown(String languagesKnown) {
		this.languagesKnown = languagesKnown;
	}

	public String getRead() {
		return read;
	}

	public void setRead(String read) {
		this.read = read;
	}

	public String getWrite() {
		return write;
	}

	public void setWrite(String write) {
		this.write = write;
	}

	public String getSpeak() {
		return speak;
	}

	public void setSpeak(String speak) {
		this.speak = speak;
	}

	public String getLanguageLevel() {
		return languageLevel;
	}

	public void setLanguageLevel(String languageLevel) {
		this.languageLevel = languageLevel;
	}

	public String getProficiencyLevel() {
		return proficiencyLevel;
	}

	public void setProficiencyLevel(String proficiencyLevel) {
		this.proficiencyLevel = proficiencyLevel;
	}

	@Override
	public String toString() {
		return "Language [languagesKnown=" + languagesKnown + ", read=" + read + ", write=" + write + ", speak=" + speak
				+ ", languageLevel=" + languageLevel + ", proficiencyLevel=" + proficiencyLevel + "]";
	}
}