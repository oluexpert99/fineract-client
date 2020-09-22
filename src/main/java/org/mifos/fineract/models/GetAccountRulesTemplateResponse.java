/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br/>              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.fineract.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetAccountRulesTemplateResponse
 */

public class GetAccountRulesTemplateResponse {
    @SerializedName("systemDefined")
    private Boolean systemDefined = null;

    @SerializedName("allowedOffices")
    private List<OfficeData> allowedOffices = null;

    @SerializedName("allowedAccounts")
    private List<GLAccountData> allowedAccounts = null;

    public GetAccountRulesTemplateResponse systemDefined(Boolean systemDefined) {
        this.systemDefined = systemDefined;
        return this;
    }

    /**
     * Get systemDefined
     *
     * @return systemDefined
     **/
    @ApiModelProperty(example = "false", value = "")
    public Boolean isSystemDefined() {
        return systemDefined;
    }

    public void setSystemDefined(Boolean systemDefined) {
        this.systemDefined = systemDefined;
    }

    public GetAccountRulesTemplateResponse allowedOffices(List<OfficeData> allowedOffices) {
        this.allowedOffices = allowedOffices;
        return this;
    }

    public GetAccountRulesTemplateResponse addAllowedOfficesItem(OfficeData allowedOfficesItem) {
        if (this.allowedOffices == null) {
            this.allowedOffices = new ArrayList<OfficeData>();
        }
        this.allowedOffices.add(allowedOfficesItem);
        return this;
    }

    /**
     * Get allowedOffices
     *
     * @return allowedOffices
     **/
    @ApiModelProperty(value = "")
    public List<OfficeData> getAllowedOffices() {
        return allowedOffices;
    }

    public void setAllowedOffices(List<OfficeData> allowedOffices) {
        this.allowedOffices = allowedOffices;
    }

    public GetAccountRulesTemplateResponse allowedAccounts(List<GLAccountData> allowedAccounts) {
        this.allowedAccounts = allowedAccounts;
        return this;
    }

    public GetAccountRulesTemplateResponse addAllowedAccountsItem(GLAccountData allowedAccountsItem) {
        if (this.allowedAccounts == null) {
            this.allowedAccounts = new ArrayList<GLAccountData>();
        }
        this.allowedAccounts.add(allowedAccountsItem);
        return this;
    }

    /**
     * Get allowedAccounts
     *
     * @return allowedAccounts
     **/
    @ApiModelProperty(value = "")
    public List<GLAccountData> getAllowedAccounts() {
        return allowedAccounts;
    }

    public void setAllowedAccounts(List<GLAccountData> allowedAccounts) {
        this.allowedAccounts = allowedAccounts;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAccountRulesTemplateResponse getAccountRulesTemplateResponse = (GetAccountRulesTemplateResponse) o;
        return Objects.equals(this.systemDefined, getAccountRulesTemplateResponse.systemDefined) &&
                Objects.equals(this.allowedOffices, getAccountRulesTemplateResponse.allowedOffices) &&
                Objects.equals(this.allowedAccounts, getAccountRulesTemplateResponse.allowedAccounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemDefined, allowedOffices, allowedAccounts);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAccountRulesTemplateResponse {\n");

        sb.append("    systemDefined: ").append(toIndentedString(systemDefined)).append("\n");
        sb.append("    allowedOffices: ").append(toIndentedString(allowedOffices)).append("\n");
        sb.append("    allowedAccounts: ").append(toIndentedString(allowedAccounts)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

