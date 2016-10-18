
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
    "content-type",
    "content-pattern",
    "action-pattern"
})
public class Permission {

    @JsonProperty("content-type")
    private String contentType;
    @JsonProperty("content-pattern")
    private String contentPattern;
    @JsonProperty("action-pattern")
    private List<String> actionPattern = new ArrayList<String>();

    /**
     * 
     * @return
     *     The contentType
     */
    @JsonProperty("content-type")
    public String getContentType() {
        return contentType;
    }

    /**
     * 
     * @param contentType
     *     The content-type
     */
    @JsonProperty("content-type")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Permission withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * 
     * @return
     *     The contentPattern
     */
    @JsonProperty("content-pattern")
    public String getContentPattern() {
        return contentPattern;
    }

    /**
     * 
     * @param contentPattern
     *     The content-pattern
     */
    @JsonProperty("content-pattern")
    public void setContentPattern(String contentPattern) {
        this.contentPattern = contentPattern;
    }

    public Permission withContentPattern(String contentPattern) {
        this.contentPattern = contentPattern;
        return this;
    }

    /**
     * 
     * @return
     *     The actionPattern
     */
    @JsonProperty("action-pattern")
    public List<String> getActionPattern() {
        return actionPattern;
    }

    /**
     * 
     * @param actionPattern
     *     The action-pattern
     */
    @JsonProperty("action-pattern")
    public void setActionPattern(List<String> actionPattern) {
        this.actionPattern = actionPattern;
    }

    public Permission withActionPattern(List<String> actionPattern) {
        this.actionPattern = actionPattern;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(contentType).append(contentPattern).append(actionPattern).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Permission) == false) {
            return false;
        }
        Permission rhs = ((Permission) other);
        return new EqualsBuilder().append(contentType, rhs.contentType).append(contentPattern, rhs.contentPattern).append(actionPattern, rhs.actionPattern).isEquals();
    }

}
