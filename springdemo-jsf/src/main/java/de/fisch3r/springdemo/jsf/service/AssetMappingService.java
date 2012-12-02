package de.fisch3r.springdemo.jsf.service;

import java.util.List;

import de.fisch3r.springdemo.jsf.domain.AssetMapping;

public interface AssetMappingService {

	public abstract List<AssetMapping> fetchAssetMappings();

	public abstract void setAssetMappings(List<AssetMapping> assetMappings);

}