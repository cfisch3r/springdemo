package de.fisch3r.springdemo.jsf.service;

import java.util.ArrayList;
import java.util.List;

import de.fisch3r.springdemo.jsf.domain.AssetMapping;


public class AssetMappingService {
	private List<AssetMapping> assetMappings = new ArrayList<AssetMapping>();

	public List<AssetMapping> fetchAssetMappings() {
		return assetMappings;
	}

}
