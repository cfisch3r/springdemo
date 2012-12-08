package de.fisch3r.springdemo.jsf.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.openpojo.business.BusinessIdentity;
import com.openpojo.business.annotation.BusinessKey;

public class AssetMapping implements Serializable {
	
	@NotNull
	@NotEmpty
	@BusinessKey
	private String dataProviderName;

	@NotNull
	@NotEmpty
	private String decorativeName;


	private AssetMapping() {
		super();
	}

	public AssetMapping(String dataProviderName, String decorativeName) {
		this.dataProviderName = dataProviderName;
		this.decorativeName = decorativeName;
	}

	public String getDecorativeName() {
		return decorativeName;
	}

	public void setDecorativeName(String decorativeName) {
		this.decorativeName = decorativeName;
	}

	public String getDataProviderName() {
		return dataProviderName;
	}

	public void setDataProviderName(String dataProviderName) {
		this.dataProviderName = dataProviderName;
	}
	
    @Override
    public boolean equals(Object obj) {
        return BusinessIdentity.areEqual(this, obj);

    }
    
    @Override
    public int hashCode() {
        return BusinessIdentity.getHashCode(this);
    }
    
    @Override
    public String toString() {
        return BusinessIdentity.toString(this);
    }
}
