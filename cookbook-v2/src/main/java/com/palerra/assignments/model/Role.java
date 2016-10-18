
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
    "description",
    "permissions"
})
public class Role {

    @JsonProperty("name")
    private String name;
    @JsonProperty("displayname")
    private String displayname;
    @JsonProperty("description")
    private String description;
    @JsonProperty("permissions")
    private List<Permission> permissions = new ArrayList<Permission>();

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

    public Role withName(String name) {
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

    public Role withDisplayname(String displayname) {
        this.displayname = displayname;
        return this;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Role withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The permissions
     */
    @JsonProperty("permissions")
    public List<Permission> getPermissions() {
        return permissions;
    }

    /**
     * 
     * @param permissions
     *     The permissions
     */
    @JsonProperty("permissions")
    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public Role withPermissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(displayname).append(description).append(permissions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Role) == false) {
            return false;
        }
        Role rhs = ((Role) other);
        return new EqualsBuilder().append(name, rhs.name).append(displayname, rhs.displayname).append(description, rhs.description).append(permissions, rhs.permissions).isEquals();
    }

}
