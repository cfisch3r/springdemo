package de.fisch3r.springdemo.jsf.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import de.fisch3r.springdemo.jsf.domain.AssetMapping;


@ContextConfiguration(locations="classpath:/spring/services.xml")
public class AssetMappingServiceIT extends AbstractTestNGSpringContextTests {
	
	@Autowired
	private AssetMappingService sut;
	
	@Test
	public void fetchAssetMappingsShouldReturnList() {
		List<AssetMapping> assetMappings = sut.fetchAssetMappings();
		assertThat(assetMappings, notNullValue());
	}
	
}