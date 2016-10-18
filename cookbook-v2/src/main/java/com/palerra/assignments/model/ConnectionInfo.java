
package com.palerra.assignments.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "oauth2-client-id",
    "oauth2-client-secret",
    "oauth2-url",
    "return-url-page",
    "webauth-url"
})
public class ConnectionInfo {

    @JsonProperty("oauth2-client-id")
    private String oauth2ClientId;
    @JsonProperty("oauth2-client-secret")
    private String oauth2ClientSecret;
    @JsonProperty("oauth2-url")
    private String oauth2Url;
    @JsonProperty("return-url-page")
    private String returnUrlPage;
    @JsonProperty("webauth-url")
    private String webauthUrl;

    /**
     * 
     * @return
     *     The oauth2ClientId
     */
    @JsonProperty("oauth2-client-id")
    public String getOauth2ClientId() {
        return oauth2ClientId;
    }

    /**
     * 
     * @param oauth2ClientId
     *     The oauth2-client-id
     */
    @JsonProperty("oauth2-client-id")
    public void setOauth2ClientId(String oauth2ClientId) {
        this.oauth2ClientId = oauth2ClientId;
    }

    public ConnectionInfo withOauth2ClientId(String oauth2ClientId) {
        this.oauth2ClientId = oauth2ClientId;
        return this;
    }

    /**
     * 
     * @return
     *     The oauth2ClientSecret
     */
    @JsonProperty("oauth2-client-secret")
    public String getOauth2ClientSecret() {
        return oauth2ClientSecret;
    }

    /**
     * 
     * @param oauth2ClientSecret
     *     The oauth2-client-secret
     */
    @JsonProperty("oauth2-client-secret")
    public void setOauth2ClientSecret(String oauth2ClientSecret) {
        this.oauth2ClientSecret = oauth2ClientSecret;
    }

    public ConnectionInfo withOauth2ClientSecret(String oauth2ClientSecret) {
        this.oauth2ClientSecret = oauth2ClientSecret;
        return this;
    }

    /**
     * 
     * @return
     *     The oauth2Url
     */
    @JsonProperty("oauth2-url")
    public String getOauth2Url() {
        return oauth2Url;
    }

    /**
     * 
     * @param oauth2Url
     *     The oauth2-url
     */
    @JsonProperty("oauth2-url")
    public void setOauth2Url(String oauth2Url) {
        this.oauth2Url = oauth2Url;
    }

    public ConnectionInfo withOauth2Url(String oauth2Url) {
        this.oauth2Url = oauth2Url;
        return this;
    }

    /**
     * 
     * @return
     *     The returnUrlPage
     */
    @JsonProperty("return-url-page")
    public String getReturnUrlPage() {
        return returnUrlPage;
    }

    /**
     * 
     * @param returnUrlPage
     *     The return-url-page
     */
    @JsonProperty("return-url-page")
    public void setReturnUrlPage(String returnUrlPage) {
        this.returnUrlPage = returnUrlPage;
    }

    public ConnectionInfo withReturnUrlPage(String returnUrlPage) {
        this.returnUrlPage = returnUrlPage;
        return this;
    }

    /**
     * 
     * @return
     *     The webauthUrl
     */
    @JsonProperty("webauth-url")
    public String getWebauthUrl() {
        return webauthUrl;
    }

    /**
     * 
     * @param webauthUrl
     *     The webauth-url
     */
    @JsonProperty("webauth-url")
    public void setWebauthUrl(String webauthUrl) {
        this.webauthUrl = webauthUrl;
    }

    public ConnectionInfo withWebauthUrl(String webauthUrl) {
        this.webauthUrl = webauthUrl;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(oauth2ClientId).append(oauth2ClientSecret).append(oauth2Url).append(returnUrlPage).append(webauthUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectionInfo) == false) {
            return false;
        }
        ConnectionInfo rhs = ((ConnectionInfo) other);
        return new EqualsBuilder().append(oauth2ClientId, rhs.oauth2ClientId).append(oauth2ClientSecret, rhs.oauth2ClientSecret).append(oauth2Url, rhs.oauth2Url).append(returnUrlPage, rhs.returnUrlPage).append(webauthUrl, rhs.webauthUrl).isEquals();
    }

}
