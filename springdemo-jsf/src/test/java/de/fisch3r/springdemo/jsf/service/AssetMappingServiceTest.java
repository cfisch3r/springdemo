package de.fisch3r.springdemo.jsf.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import de.fisch3r.springdemo.jsf.domain.AssetMapping;

public class AssetMappingServiceTest {

	private AssetMappingService sut;

	private List<AssetMapping> testAssetMappings = new ArrayList<AssetMapping>() {

		private static final long serialVersionUID = -4195072058906938006L;

		{
			add(new AssetMapping("Oil", "Öl"));
		}
	};
	
	@BeforeTest
	public void setUp() {
		sut = new AssetMappingService();
	}

	
	@Test
	public void fetchAssetMappingsShouldReturnList() {
		sut.setAssetMappings(testAssetMappings);
		List<AssetMapping> assetMappings = sut.fetchAssetMappings();
		assertThat(assetMappings, notNullValue());
		assertThat(assetMappings.size(), equalTo(testAssetMappings.size()));
	}
		
}
