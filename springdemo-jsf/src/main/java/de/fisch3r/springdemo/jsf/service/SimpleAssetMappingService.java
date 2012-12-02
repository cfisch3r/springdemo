package de.fisch3r.springdemo.jsf.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import de.fisch3r.springdemo.jsf.domain.AssetMapping;

public class SimpleAssetMappingService implements AssetMappingService {
	private List<AssetMapping> assetMappings = new ArrayList<AssetMapping>();

	/* (non-Javadoc)
	 * @see de.fisch3r.springdemo.jsf.service.IAssetMappingService#fetchAssetMappings()
	 */
	@Override
	public List<AssetMapping> fetchAssetMappings() {
		return assetMappings;
	}

	/* (non-Javadoc)
	 * @see de.fisch3r.springdemo.jsf.service.IAssetMappingService#setAssetMappings(java.util.List)
	 */
	@Override
	public void setAssetMappings(List<AssetMapping> assetMappings) {
		this.assetMappings = assetMappings;
	}

}
