
package com.palerra.assignments.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "displayname",
    "weight",
    "val"
})
public class Value {

    @JsonProperty("displayname")
    private String displayname;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("val")
    private String val;

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

    public Value withDisplayname(String displayname) {
        this.displayname = displayname;
        return this;
    }

    /**
     * 
     * @return
     *     The weight
     */
    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Value withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 
     * @return
     *     The val
     */
    @JsonProperty("val")
    public String getVal() {
        return val;
    }

    /**
     * 
     * @param val
     *     The val
     */
    @JsonProperty("val")
    public void setVal(String val) {
        this.val = val;
    }

    public Value withVal(String val) {
        this.val = val;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(displayname).append(weight).append(val).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Value) == false) {
            return false;
        }
        Value rhs = ((Value) other);
        return new EqualsBuilder().append(displayname, rhs.displayname).append(weight, rhs.weight).append(val, rhs.val).isEquals();
    }

}
