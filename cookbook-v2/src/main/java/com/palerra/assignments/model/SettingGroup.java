
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
    "id",
    "settings"
})
public class SettingGroup {

    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;
    @JsonProperty("settings")
    private List<Setting> settings = new ArrayList<Setting>();

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

    public SettingGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public SettingGroup withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The settings
     */
    @JsonProperty("settings")
    public List<Setting> getSettings() {
        return settings;
    }

    /**
     * 
     * @param settings
     *     The settings
     */
    @JsonProperty("settings")
    public void setSettings(List<Setting> settings) {
        this.settings = settings;
    }

    public SettingGroup withSettings(List<Setting> settings) {
        this.settings = settings;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(id).append(settings).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SettingGroup) == false) {
            return false;
        }
        SettingGroup rhs = ((SettingGroup) other);
        return new EqualsBuilder().append(name, rhs.name).append(id, rhs.id).append(settings, rhs.settings).isEquals();
    }

}
