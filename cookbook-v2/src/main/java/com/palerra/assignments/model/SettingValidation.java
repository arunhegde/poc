
package com.palerra.assignments.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "min",
    "max",
    "errormessage",
    "placeholder"
})
public class SettingValidation {

    @JsonProperty("min")
    private Integer min;
    @JsonProperty("max")
    private Integer max;
    @JsonProperty("errormessage")
    private String errormessage;
    @JsonProperty("placeholder")
    private String placeholder;

    /**
     * 
     * @return
     *     The min
     */
    @JsonProperty("min")
    public Integer getMin() {
        return min;
    }

    /**
     * 
     * @param min
     *     The min
     */
    @JsonProperty("min")
    public void setMin(Integer min) {
        this.min = min;
    }

    public SettingValidation withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 
     * @return
     *     The max
     */
    @JsonProperty("max")
    public Integer getMax() {
        return max;
    }

    /**
     * 
     * @param max
     *     The max
     */
    @JsonProperty("max")
    public void setMax(Integer max) {
        this.max = max;
    }

    public SettingValidation withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 
     * @return
     *     The errormessage
     */
    @JsonProperty("errormessage")
    public String getErrormessage() {
        return errormessage;
    }

    /**
     * 
     * @param errormessage
     *     The errormessage
     */
    @JsonProperty("errormessage")
    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    public SettingValidation withErrormessage(String errormessage) {
        this.errormessage = errormessage;
        return this;
    }

    /**
     * 
     * @return
     *     The placeholder
     */
    @JsonProperty("placeholder")
    public String getPlaceholder() {
        return placeholder;
    }

    /**
     * 
     * @param placeholder
     *     The placeholder
     */
    @JsonProperty("placeholder")
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public SettingValidation withPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(min).append(max).append(errormessage).append(placeholder).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SettingValidation) == false) {
            return false;
        }
        SettingValidation rhs = ((SettingValidation) other);
        return new EqualsBuilder().append(min, rhs.min).append(max, rhs.max).append(errormessage, rhs.errormessage).append(placeholder, rhs.placeholder).isEquals();
    }

}
