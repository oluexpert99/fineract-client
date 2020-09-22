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

import java.util.Objects;

/**
 * GetPocketSavingAccounts
 */

public class GetPocketSavingAccounts {
    @SerializedName("pocketId")
    private Integer pocketId = null;

    @SerializedName("accountId")
    private Integer accountId = null;

    @SerializedName("accountType")
    private Integer accountType = null;

    @SerializedName("accountNumber")
    private Integer accountNumber = null;

    @SerializedName("id")
    private Integer id = null;

    public GetPocketSavingAccounts pocketId(Integer pocketId) {
        this.pocketId = pocketId;
        return this;
    }

    /**
     * Get pocketId
     *
     * @return pocketId
     **/
    @ApiModelProperty(example = "6", value = "")
    public Integer getPocketId() {
        return pocketId;
    }

    public void setPocketId(Integer pocketId) {
        this.pocketId = pocketId;
    }

    public GetPocketSavingAccounts accountId(Integer accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     *
     * @return accountId
     **/
    @ApiModelProperty(example = "2", value = "")
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public GetPocketSavingAccounts accountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Get accountType
     *
     * @return accountType
     **/
    @ApiModelProperty(example = "3", value = "")
    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public GetPocketSavingAccounts accountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * Get accountNumber
     *
     * @return accountNumber
     **/
    @ApiModelProperty(example = "2", value = "")
    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public GetPocketSavingAccounts id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(example = "11", value = "")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetPocketSavingAccounts getPocketSavingAccounts = (GetPocketSavingAccounts) o;
        return Objects.equals(this.pocketId, getPocketSavingAccounts.pocketId) &&
                Objects.equals(this.accountId, getPocketSavingAccounts.accountId) &&
                Objects.equals(this.accountType, getPocketSavingAccounts.accountType) &&
                Objects.equals(this.accountNumber, getPocketSavingAccounts.accountNumber) &&
                Objects.equals(this.id, getPocketSavingAccounts.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pocketId, accountId, accountType, accountNumber, id);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPocketSavingAccounts {\n");

        sb.append("    pocketId: ").append(toIndentedString(pocketId)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

