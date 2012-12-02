package de.fisch3r.springdemo.jsf.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
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
	public void setValidAssetMappingThrowsNoException() {
		sut.setAssetMappings(new ArrayList<AssetMapping>());		
	}
	
	@Test(expectedExceptions=org.hibernate.validator.method.MethodConstraintViolationException.class)
	public void settingNullAsAssetMappingsShouldThrowException() {
		sut.setAssetMappings(null);
	}
	
	
	@Test(expectedExceptions=org.hibernate.validator.method.MethodConstraintViolationException.class)
	public void setInvalidAssetMappingsShouldThrowException() {
		List<AssetMapping> assetMappings = new ArrayList<AssetMapping>();
		assetMappings.add(new AssetMapping("", ""));
		sut.setAssetMappings(assetMappings);
	}
	
}
