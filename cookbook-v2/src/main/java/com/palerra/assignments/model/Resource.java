
package com.palerra.assignments.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "id",
    "displayname",
    "description",
    "isTaggable",
    "ishierarchical",
    "delimiter",
    "match-rule-type",
    "actions"
})
public class Resource {

    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;
    @JsonProperty("displayname")
    private String displayname;
    @JsonProperty("description")
    private String description;
    @JsonProperty("isTaggable")
    private Boolean isTaggable;
    @JsonProperty("ishierarchical")
    private Boolean ishierarchical;
    @JsonProperty("delimiter")
    private String delimiter;
    @JsonProperty("match-rule-type")
    private Resource.MatchRuleType matchRuleType;
    @JsonProperty("actions")
    private List<Action> actions = new ArrayList<Action>();

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

    public Resource withName(String name) {
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

    public Resource withId(String id) {
        this.id = id;
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

    public Resource withDisplayname(String displayname) {
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

    public Resource withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The isTaggable
     */
    @JsonProperty("isTaggable")
    public Boolean getIsTaggable() {
        return isTaggable;
    }

    /**
     * 
     * @param isTaggable
     *     The isTaggable
     */
    @JsonProperty("isTaggable")
    public void setIsTaggable(Boolean isTaggable) {
        this.isTaggable = isTaggable;
    }

    public Resource withIsTaggable(Boolean isTaggable) {
        this.isTaggable = isTaggable;
        return this;
    }

    /**
     * 
     * @return
     *     The ishierarchical
     */
    @JsonProperty("ishierarchical")
    public Boolean getIshierarchical() {
        return ishierarchical;
    }

    /**
     * 
     * @param ishierarchical
     *     The ishierarchical
     */
    @JsonProperty("ishierarchical")
    public void setIshierarchical(Boolean ishierarchical) {
        this.ishierarchical = ishierarchical;
    }

    public Resource withIshierarchical(Boolean ishierarchical) {
        this.ishierarchical = ishierarchical;
        return this;
    }

    /**
     * 
     * @return
     *     The delimiter
     */
    @JsonProperty("delimiter")
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * 
     * @param delimiter
     *     The delimiter
     */
    @JsonProperty("delimiter")
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public Resource withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * 
     * @return
     *     The matchRuleType
     */
    @JsonProperty("match-rule-type")
    public Resource.MatchRuleType getMatchRuleType() {
        return matchRuleType;
    }

    /**
     * 
     * @param matchRuleType
     *     The match-rule-type
     */
    @JsonProperty("match-rule-type")
    public void setMatchRuleType(Resource.MatchRuleType matchRuleType) {
        this.matchRuleType = matchRuleType;
    }

    public Resource withMatchRuleType(Resource.MatchRuleType matchRuleType) {
        this.matchRuleType = matchRuleType;
        return this;
    }

    /**
     * 
     * @return
     *     The actions
     */
    @JsonProperty("actions")
    public List<Action> getActions() {
        return actions;
    }

    /**
     * 
     * @param actions
     *     The actions
     */
    @JsonProperty("actions")
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public Resource withActions(List<Action> actions) {
        this.actions = actions;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(id).append(displayname).append(description).append(isTaggable).append(ishierarchical).append(delimiter).append(matchRuleType).append(actions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resource) == false) {
            return false;
        }
        Resource rhs = ((Resource) other);
        return new EqualsBuilder().append(name, rhs.name).append(id, rhs.id).append(displayname, rhs.displayname).append(description, rhs.description).append(isTaggable, rhs.isTaggable).append(ishierarchical, rhs.ishierarchical).append(delimiter, rhs.delimiter).append(matchRuleType, rhs.matchRuleType).append(actions, rhs.actions).isEquals();
    }

    public enum MatchRuleType {

        CASE_SENSITIVE("case-sensitive"),
        CASE_INSENSITIVE("case-insensitive");
        private final String value;
        private final static Map<String, Resource.MatchRuleType> CONSTANTS = new HashMap<String, Resource.MatchRuleType>();

        static {
            for (Resource.MatchRuleType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private MatchRuleType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Resource.MatchRuleType fromValue(String value) {
            Resource.MatchRuleType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
