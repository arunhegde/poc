
package com.palerra.assignments.model;

import java.util.HashMap;
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
    "type",
    "value",
    "effect"
})
public class Recipient {

    @JsonProperty("type")
    private Recipient.Type type;
    @JsonProperty("value")
    private String value;
    @JsonProperty("effect")
    private Recipient.Effect effect;

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Recipient.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Recipient.Type type) {
        this.type = type;
    }

    public Recipient withType(Recipient.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Recipient withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 
     * @return
     *     The effect
     */
    @JsonProperty("effect")
    public Recipient.Effect getEffect() {
        return effect;
    }

    /**
     * 
     * @param effect
     *     The effect
     */
    @JsonProperty("effect")
    public void setEffect(Recipient.Effect effect) {
        this.effect = effect;
    }

    public Recipient withEffect(Recipient.Effect effect) {
        this.effect = effect;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(value).append(effect).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Recipient) == false) {
            return false;
        }
        Recipient rhs = ((Recipient) other);
        return new EqualsBuilder().append(type, rhs.type).append(value, rhs.value).append(effect, rhs.effect).isEquals();
    }

    public enum Effect {

        ALLOW("allow"),
        DENY("deny");
        private final String value;
        private final static Map<String, Recipient.Effect> CONSTANTS = new HashMap<String, Recipient.Effect>();

        static {
            for (Recipient.Effect c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Effect(String value) {
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
        public static Recipient.Effect fromValue(String value) {
            Recipient.Effect constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Type {

        USER("User"),
        GROUP("Group");
        private final String value;
        private final static Map<String, Recipient.Type> CONSTANTS = new HashMap<String, Recipient.Type>();

        static {
            for (Recipient.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
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
        public static Recipient.Type fromValue(String value) {
            Recipient.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
