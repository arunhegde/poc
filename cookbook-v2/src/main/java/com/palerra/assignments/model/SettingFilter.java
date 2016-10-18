
package com.palerra.assignments.model;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayname",
    "type",
    "filter-values",
    "setting-validations"
})
public class SettingFilter {

    @JsonProperty("name")
    private String name;
    @JsonProperty("displayname")
    private String displayname;
    @JsonProperty("type")
    private String type;
    @JsonProperty("filter-values")
    private List<FilterValue> filterValues = new ArrayList<FilterValue>();
    @JsonProperty("setting-validations")
    private List<SettingValidation> settingValidations = new ArrayList<SettingValidation>();

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public SettingFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The displayname
     */
    @JsonProperty("displayname")
    public String getDisplayname() {
        return displayname;
    }

    /**
     * 
     * @param displayname
     *     The displayname
     */
    @JsonProperty("displayname")
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public SettingFilter withDisplayname(String displayname) {
        this.displayname = displayname;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public SettingFilter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The filterValues
     */
    @JsonProperty("filter-values")
    public List<FilterValue> getFilterValues() {
        return filterValues;
    }

    /**
     * 
     * @param filterValues
     *     The filter-values
     */
    @JsonProperty("filter-values")
    public void setFilterValues(List<FilterValue> filterValues) {
        this.filterValues = filterValues;
    }

    public SettingFilter withFilterValues(List<FilterValue> filterValues) {
        this.filterValues = filterValues;
        return this;
    }

    /**
     * 
     * @return
     *     The settingValidations
     */
    @JsonProperty("setting-validations")
    public List<SettingValidation> getSettingValidations() {
        return settingValidations;
    }

    /**
     * 
     * @param settingValidations
     *     The setting-validations
     */
    @JsonProperty("setting-validations")
    public void setSettingValidations(List<SettingValidation> settingValidations) {
        this.settingValidations = settingValidations;
    }

    public SettingFilter withSettingValidations(List<SettingValidation> settingValidations) {
        this.settingValidations = settingValidations;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(displayname).append(type).append(filterValues).append(settingValidations).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SettingFilter) == false) {
            return false;
        }
        SettingFilter rhs = ((SettingFilter) other);
        return new EqualsBuilder().append(name, rhs.name).append(displayname, rhs.displayname).append(type, rhs.type).append(filterValues, rhs.filterValues).append(settingValidations, rhs.settingValidations).isEquals();
    }

}
