package de.fisch3r.springdemo.jsf.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class AssetMapping implements Serializable {
	
	@NotNull
	private String dataProviderName;

	@NotNull
	private String decorativeName;


	private AssetMapping() {
		super();
	}

	public AssetMapping(String dataProviderName, String decorativeName) {
		this.dataProviderName = dataProviderName;
		this.decorativeName = decorativeName;
	}

	public String getDecorativeName() {
		return decorativeName;
	}

	public void setDecorativeName(String decorativeName) {
		this.decorativeName = decorativeName;
	}

	public String getDataProviderName() {
		return dataProviderName;
	}

	public void setDataProviderName(String dataProviderName) {
		this.dataProviderName = dataProviderName;
	}
}
