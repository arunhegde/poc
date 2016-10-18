
package com.palerra.assignments.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "app-control-catalog"
})
public class Configuration {

    @JsonProperty("app-control-catalog")
    private AppControlCatalog appControlCatalog;

    /**
     * 
     * @return
     *     The appControlCatalog
     */
    @JsonProperty("app-control-catalog")
    public AppControlCatalog getAppControlCatalog() {
        return appControlCatalog;
    }

    /**
     * 
     * @param appControlCatalog
     *     The app-control-catalog
     */
    @JsonProperty("app-control-catalog")
    public void setAppControlCatalog(AppControlCatalog appControlCatalog) {
        this.appControlCatalog = appControlCatalog;
    }

    public Configuration withAppControlCatalog(AppControlCatalog appControlCatalog) {
        this.appControlCatalog = appControlCatalog;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(appControlCatalog).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Configuration) == false) {
            return false;
        }
        Configuration rhs = ((Configuration) other);
        return new EqualsBuilder().append(appControlCatalog, rhs.appControlCatalog).isEquals();
    }

}
