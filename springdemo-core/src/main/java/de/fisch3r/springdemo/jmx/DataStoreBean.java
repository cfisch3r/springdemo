package de.fisch3r.springdemo.jmx;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

/**
 * Default implementation of MBean.
 */
@ManagedResource(objectName = "bean:name=DataStore", description = "My Managed Bean")
public final class DataStoreBean {

	 @ManagedAttribute(description = "Book Count, cool")
	public Integer getBookCount() {
		final Integer count = 7;
		return count;
	}

}
