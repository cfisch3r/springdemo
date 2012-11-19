package de.fisch3r.springdemo.jsf.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.fisch3r.springdemo.jsf.domain.AssetMapping;


public class AssetMappingService implements Serializable {
	private List<AssetMapping> assetMappings = new ArrayList<AssetMapping>() {

		private static final long serialVersionUID = -4195072058906938006L;

		{
			add(new AssetMapping("Oil", "Öl"));
		}
	};

	public List<AssetMapping> fetchAssetMappings() {
		return assetMappings;
	}

	public void setAssetMappings(List<AssetMapping> assetMappings) {
		this.assetMappings = assetMappings;
	}

}
