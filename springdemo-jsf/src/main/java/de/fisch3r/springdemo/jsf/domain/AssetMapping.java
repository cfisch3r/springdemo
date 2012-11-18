package de.fisch3r.springdemo.jsf.domain;

public class AssetMapping {
	private String dataProviderName;

	private String decorativeName;


	public AssetMapping(String dataProviderName, String decorativeName) {
		super();
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
