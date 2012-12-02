package de.fisch3r.springdemo.jsf.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import de.fisch3r.springdemo.jsf.domain.AssetMapping;

@Validated
public interface AssetMappingService {

	public abstract List<AssetMapping> fetchAssetMappings();

	public abstract void setAssetMappings(@NotNull @Valid List<AssetMapping> assetMappings);

}