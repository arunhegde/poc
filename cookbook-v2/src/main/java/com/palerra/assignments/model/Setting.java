
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
    "displayname",
    "cardinality",
    "type",
    "unit",
    "values",
    "setting-filters"
})
public class Setting {

    @JsonProperty("name")
    private String name;
    @JsonProperty("displayname")
    private String displayname;
    @JsonProperty("cardinality")
    private Setting.Cardinality cardinality;
    @JsonProperty("type")
    private String type;
    @JsonProperty("unit")
    private Setting.Unit unit;
    @JsonProperty("values")
    private List<Value> values = new ArrayList<Value>();
    @JsonProperty("setting-filters")
    private List<SettingFilter> settingFilters = new ArrayList<SettingFilter>();

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

    public Setting withName(String name) {
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

    public Setting withDisplayname(String displayname) {
        this.displayname = displayname;
        return this;
    }

    /**
     * 
     * @return
     *     The cardinality
     */
    @JsonProperty("cardinality")
    public Setting.Cardinality getCardinality() {
        return cardinality;
    }

    /**
     * 
     * @param cardinality
     *     The cardinality
     */
    @JsonProperty("cardinality")
    public void setCardinality(Setting.Cardinality cardinality) {
        this.cardinality = cardinality;
    }

    public Setting withCardinality(Setting.Cardinality cardinality) {
        this.cardinality = cardinality;
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

    public Setting withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The unit
     */
    @JsonProperty("unit")
    public Setting.Unit getUnit() {
        return unit;
    }

    /**
     * 
     * @param unit
     *     The unit
     */
    @JsonProperty("unit")
    public void setUnit(Setting.Unit unit) {
        this.unit = unit;
    }

    public Setting withUnit(Setting.Unit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 
     * @return
     *     The values
     */
    @JsonProperty("values")
    public List<Value> getValues() {
        return values;
    }

    /**
     * 
     * @param values
     *     The values
     */
    @JsonProperty("values")
    public void setValues(List<Value> values) {
        this.values = values;
    }

    public Setting withValues(List<Value> values) {
        this.values = values;
        return this;
    }

    /**
     * 
     * @return
     *     The settingFilters
     */
    @JsonProperty("setting-filters")
    public List<SettingFilter> getSettingFilters() {
        return settingFilters;
    }

    /**
     * 
     * @param settingFilters
     *     The setting-filters
     */
    @JsonProperty("setting-filters")
    public void setSettingFilters(List<SettingFilter> settingFilters) {
        this.settingFilters = settingFilters;
    }

    public Setting withSettingFilters(List<SettingFilter> settingFilters) {
        this.settingFilters = settingFilters;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(displayname).append(cardinality).append(type).append(unit).append(values).append(settingFilters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Setting) == false) {
            return false;
        }
        Setting rhs = ((Setting) other);
        return new EqualsBuilder().append(name, rhs.name).append(displayname, rhs.displayname).append(cardinality, rhs.cardinality).append(type, rhs.type).append(unit, rhs.unit).append(values, rhs.values).append(settingFilters, rhs.settingFilters).isEquals();
    }

    public enum Cardinality {

        SINGLE_VALUED("single-valued"),
        MULTI_VALUED("multi-valued");
        private final String value;
        private final static Map<String, Setting.Cardinality> CONSTANTS = new HashMap<String, Setting.Cardinality>();

        static {
            for (Setting.Cardinality c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Cardinality(String value) {
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
        public static Setting.Cardinality fromValue(String value) {
            Setting.Cardinality constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Unit {

        DAYS("days"),
        HOURS("hours"),
        MINUTES("minutes"),
        SECONDS("seconds"),
        CHARACTERS("characters");
        private final String value;
        private final static Map<String, Setting.Unit> CONSTANTS = new HashMap<String, Setting.Unit>();

        static {
            for (Setting.Unit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Unit(String value) {
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
        public static Setting.Unit fromValue(String value) {
            Setting.Unit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
