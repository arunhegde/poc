
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
    "connection-info",
    "resources",
    "roles",
    "setting-groups",
    "policies",
    "securitycontrol",
    "version"
})
public class AppControlCatalog {

    @JsonProperty("name")
    private String name;
    @JsonProperty("displayname")
    private String displayname;
    @JsonProperty("description")
    private String description;
    @JsonProperty("connection-info")
    private ConnectionInfo connectionInfo;
    @JsonProperty("resources")
    private List<Resource> resources = new ArrayList<Resource>();
    @JsonProperty("roles")
    private List<Role> roles = new ArrayList<Role>();
    @JsonProperty("setting-groups")
    private List<SettingGroup> settingGroups = new ArrayList<SettingGroup>();
    @JsonProperty("policies")
    private List<Policy> policies = new ArrayList<Policy>();
    @JsonProperty("securitycontrol")
    private Integer securitycontrol;
    @JsonProperty("version")
    private String version;

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

    public AppControlCatalog withName(String name) {
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

    public AppControlCatalog withDisplayname(String displayname) {
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

    public AppControlCatalog withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The connectionInfo
     */
    @JsonProperty("connection-info")
    public ConnectionInfo getConnectionInfo() {
        return connectionInfo;
    }

    /**
     * 
     * @param connectionInfo
     *     The connection-info
     */
    @JsonProperty("connection-info")
    public void setConnectionInfo(ConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    public AppControlCatalog withConnectionInfo(ConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    /**
     * 
     * @return
     *     The resources
     */
    @JsonProperty("resources")
    public List<Resource> getResources() {
        return resources;
    }

    /**
     * 
     * @param resources
     *     The resources
     */
    @JsonProperty("resources")
    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public AppControlCatalog withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * 
     * @return
     *     The roles
     */
    @JsonProperty("roles")
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * 
     * @param roles
     *     The roles
     */
    @JsonProperty("roles")
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public AppControlCatalog withRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * 
     * @return
     *     The settingGroups
     */
    @JsonProperty("setting-groups")
    public List<SettingGroup> getSettingGroups() {
        return settingGroups;
    }

    /**
     * 
     * @param settingGroups
     *     The setting-groups
     */
    @JsonProperty("setting-groups")
    public void setSettingGroups(List<SettingGroup> settingGroups) {
        this.settingGroups = settingGroups;
    }

    public AppControlCatalog withSettingGroups(List<SettingGroup> settingGroups) {
        this.settingGroups = settingGroups;
        return this;
    }

    /**
     * 
     * @return
     *     The policies
     */
    @JsonProperty("policies")
    public List<Policy> getPolicies() {
        return policies;
    }

    /**
     * 
     * @param policies
     *     The policies
     */
    @JsonProperty("policies")
    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public AppControlCatalog withPolicies(List<Policy> policies) {
        this.policies = policies;
        return this;
    }

    /**
     * 
     * @return
     *     The securitycontrol
     */
    @JsonProperty("securitycontrol")
    public Integer getSecuritycontrol() {
        return securitycontrol;
    }

    /**
     * 
     * @param securitycontrol
     *     The securitycontrol
     */
    @JsonProperty("securitycontrol")
    public void setSecuritycontrol(Integer securitycontrol) {
        this.securitycontrol = securitycontrol;
    }

    public AppControlCatalog withSecuritycontrol(Integer securitycontrol) {
        this.securitycontrol = securitycontrol;
        return this;
    }

    /**
     * 
     * @return
     *     The version
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public AppControlCatalog withVersion(String version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(displayname).append(description).append(connectionInfo).append(resources).append(roles).append(settingGroups).append(policies).append(securitycontrol).append(version).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppControlCatalog) == false) {
            return false;
        }
        AppControlCatalog rhs = ((AppControlCatalog) other);
        return new EqualsBuilder().append(name, rhs.name).append(displayname, rhs.displayname).append(description, rhs.description).append(connectionInfo, rhs.connectionInfo).append(resources, rhs.resources).append(roles, rhs.roles).append(settingGroups, rhs.settingGroups).append(policies, rhs.policies).append(securitycontrol, rhs.securitycontrol).append(version, rhs.version).isEquals();
    }

}
