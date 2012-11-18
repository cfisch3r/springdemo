package de.fisch3r.springdemo.jsf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import de.fisch3r.springdemo.jsf.domain.AssetMapping;
import de.fisch3r.springdemo.jsf.service.AssetMappingService;

public class AssetMappingController {
	
	@Autowired
	private AssetMappingService assetMappingService;

	public List<AssetMapping> getAssetMappings() {
		return assetMappingService.fetchAssetMappings();
	}

}
