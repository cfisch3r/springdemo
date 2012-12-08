package de.fisch3r.springdemo.jsf.domain;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class AssetMappingTest {

	@Test
	public void shouldGetFalseIfAddingDuplicatedAssetMappingsToHashSet() {
		Set<AssetMapping> mappingSet = new HashSet<AssetMapping>();
		mappingSet.add(new AssetMapping("test","test"));
		assertThat(mappingSet.add(new AssetMapping("test","test2")), is(false));
	}

	@Test
	public void shouldGetFalseIfAddingDuplicatedAssetMappingsWithDifferentCaseToHashSet() {
		Set<AssetMapping> mappingSet = new HashSet<AssetMapping>();
		mappingSet.add(new AssetMapping("test","test"));
		assertThat(mappingSet.add(new AssetMapping("tEst","test2")), is(false));
	}
}
