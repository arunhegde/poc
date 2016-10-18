
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
    "description",
    "recipient",
    "permissions"
})
public class Policy {

    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("recipient")
    private Recipient recipient;
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

    public Policy withName(String name) {
        this.name = name;
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

    public Policy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The recipient
     */
    @JsonProperty("recipient")
    public Recipient getRecipient() {
        return recipient;
    }

    /**
     * 
     * @param recipient
     *     The recipient
     */
    @JsonProperty("recipient")
    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public Policy withRecipient(Recipient recipient) {
        this.recipient = recipient;
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

    public Policy withPermissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(description).append(recipient).append(permissions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Policy) == false) {
            return false;
        }
        Policy rhs = ((Policy) other);
        return new EqualsBuilder().append(name, rhs.name).append(description, rhs.description).append(recipient, rhs.recipient).append(permissions, rhs.permissions).isEquals();
    }

}
