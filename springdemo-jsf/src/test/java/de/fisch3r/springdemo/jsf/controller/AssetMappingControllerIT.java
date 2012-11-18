package de.fisch3r.springdemo.jsf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import de.fisch3r.springdemo.jsf.domain.AssetMapping;

@ContextConfiguration(locations="classpath:/spring/services.xml")
public class AssetMappingControllerIT extends AbstractTestNGSpringContextTests {
	
	@Autowired
	private AssetMappingController sut;
	
	@Test
	public void getAssetMappingsShouldReturnList() {
		List<AssetMapping> assetMappings = sut.getAssetMappings();
		assertThat(assetMappings, notNullValue());
	}

}
