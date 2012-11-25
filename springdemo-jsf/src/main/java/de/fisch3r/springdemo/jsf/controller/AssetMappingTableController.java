package de.fisch3r.springdemo.jsf.controller;

import java.io.Serializable;
import java.util.List;

import de.fisch3r.springdemo.jsf.domain.AssetMapping;

public class AssetMappingTableController implements Serializable {
	
	private AssetMapping selectedAssetMapping;
	
	private List<AssetMapping> assetMappings;

	public AssetMapping getSelectedAssetMapping() {
		return selectedAssetMapping;
	}

	public void setSelectedAssetMapping(AssetMapping selectedAssetMapping) {
		this.selectedAssetMapping = selectedAssetMapping;
	}

	public List<AssetMapping> getAssetMappings() {
		return assetMappings;
	}

	public void setAssetMappings(List<AssetMapping> assetMappings) {
		this.assetMappings = assetMappings;
	}
	

}
