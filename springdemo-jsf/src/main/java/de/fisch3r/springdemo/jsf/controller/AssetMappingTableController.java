package de.fisch3r.springdemo.jsf.controller;

import java.io.Serializable;

import de.fisch3r.springdemo.jsf.domain.AssetMapping;

public class AssetMappingTableController implements Serializable {
	
	private AssetMapping selectedAssetMapping;

	public AssetMapping getSelectedAssetMapping() {
		return selectedAssetMapping;
	}

	public void setSelectedAssetMapping(AssetMapping selectedAssetMapping) {
		this.selectedAssetMapping = selectedAssetMapping;
	}
	

}
