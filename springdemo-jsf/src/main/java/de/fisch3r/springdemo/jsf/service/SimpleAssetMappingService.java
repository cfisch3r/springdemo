package de.fisch3r.springdemo.jsf.service;

import java.util.HashSet;
import java.util.Set;

import de.fisch3r.springdemo.jsf.domain.AssetMapping;

public class SimpleAssetMappingService implements AssetMappingService {
	private Set<AssetMapping> assetMappings = new HashSet<AssetMapping>();

	/* (non-Javadoc)
	 * @see de.fisch3r.springdemo.jsf.service.IAssetMappingService#fetchAssetMappings()
	 */
	@Override
	public Set<AssetMapping> fetchAssetMappings() {
		return assetMappings;
	}

	/* (non-Javadoc)
	 * @see de.fisch3r.springdemo.jsf.service.IAssetMappingService#setAssetMappings(java.util.List)
	 */
	@Override
	public void setAssetMappings(Set<AssetMapping> assetMappings) {
		this.assetMappings = assetMappings;
	}

}
