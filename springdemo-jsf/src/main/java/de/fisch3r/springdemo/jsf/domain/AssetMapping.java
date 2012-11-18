package de.fisch3r.springdemo.jsf.domain;

import java.io.Serializable;

public class AssetMapping implements Serializable {
	private String dataProviderName;

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
