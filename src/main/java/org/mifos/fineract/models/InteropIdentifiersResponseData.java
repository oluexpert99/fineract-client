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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * InteropIdentifiersResponseData
 */

public class InteropIdentifiersResponseData {
    @SerializedName("officeId")
    private Long officeId = null;

    @SerializedName("groupId")
    private Long groupId = null;

    @SerializedName("clientId")
    private Long clientId = null;

    @SerializedName("loanId")
    private Long loanId = null;

    @SerializedName("savingsId")
    private Long savingsId = null;

    @SerializedName("subResourceId")
    private Long subResourceId = null;

    @SerializedName("transactionId")
    private String transactionId = null;

    @SerializedName("changes")
    private Map<String, Object> changes = null;

    @SerializedName("productId")
    private Long productId = null;

    @SerializedName("rollbackTransaction")
    private Boolean rollbackTransaction = null;

    public InteropIdentifiersResponseData officeId(Long officeId) {
        this.officeId = officeId;
        return this;
    }

    /**
     * Get officeId
     *
     * @return officeId
     **/
    @ApiModelProperty(value = "")
    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    public InteropIdentifiersResponseData groupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get groupId
     *
     * @return groupId
     **/
    @ApiModelProperty(value = "")
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public InteropIdentifiersResponseData clientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get clientId
     *
     * @return clientId
     **/
    @ApiModelProperty(value = "")
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public InteropIdentifiersResponseData loanId(Long loanId) {
        this.loanId = loanId;
        return this;
    }

    /**
     * Get loanId
     *
     * @return loanId
     **/
    @ApiModelProperty(value = "")
    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public InteropIdentifiersResponseData savingsId(Long savingsId) {
        this.savingsId = savingsId;
        return this;
    }

    /**
     * Get savingsId
     *
     * @return savingsId
     **/
    @ApiModelProperty(value = "")
    public Long getSavingsId() {
        return savingsId;
    }

    public void setSavingsId(Long savingsId) {
        this.savingsId = savingsId;
    }

    public InteropIdentifiersResponseData subResourceId(Long subResourceId) {
        this.subResourceId = subResourceId;
        return this;
    }

    /**
     * Get subResourceId
     *
     * @return subResourceId
     **/
    @ApiModelProperty(value = "")
    public Long getSubResourceId() {
        return subResourceId;
    }

    public void setSubResourceId(Long subResourceId) {
        this.subResourceId = subResourceId;
    }

    public InteropIdentifiersResponseData transactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Get transactionId
     *
     * @return transactionId
     **/
    @ApiModelProperty(value = "")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public InteropIdentifiersResponseData changes(Map<String, Object> changes) {
        this.changes = changes;
        return this;
    }

    public InteropIdentifiersResponseData putChangesItem(String key, Object changesItem) {
        if (this.changes == null) {
            this.changes = new HashMap<String, Object>();
        }
        this.changes.put(key, changesItem);
        return this;
    }

    /**
     * Get changes
     *
     * @return changes
     **/
    @ApiModelProperty(value = "")
    public Map<String, Object> getChanges() {
        return changes;
    }

    public void setChanges(Map<String, Object> changes) {
        this.changes = changes;
    }

    public InteropIdentifiersResponseData productId(Long productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Get productId
     *
     * @return productId
     **/
    @ApiModelProperty(value = "")
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public InteropIdentifiersResponseData rollbackTransaction(Boolean rollbackTransaction) {
        this.rollbackTransaction = rollbackTransaction;
        return this;
    }

    /**
     * Get rollbackTransaction
     *
     * @return rollbackTransaction
     **/
    @ApiModelProperty(value = "")
    public Boolean isRollbackTransaction() {
        return rollbackTransaction;
    }

    public void setRollbackTransaction(Boolean rollbackTransaction) {
        this.rollbackTransaction = rollbackTransaction;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InteropIdentifiersResponseData interopIdentifiersResponseData = (InteropIdentifiersResponseData) o;
        return Objects.equals(this.officeId, interopIdentifiersResponseData.officeId) &&
                Objects.equals(this.groupId, interopIdentifiersResponseData.groupId) &&
                Objects.equals(this.clientId, interopIdentifiersResponseData.clientId) &&
                Objects.equals(this.loanId, interopIdentifiersResponseData.loanId) &&
                Objects.equals(this.savingsId, interopIdentifiersResponseData.savingsId) &&
                Objects.equals(this.subResourceId, interopIdentifiersResponseData.subResourceId) &&
                Objects.equals(this.transactionId, interopIdentifiersResponseData.transactionId) &&
                Objects.equals(this.changes, interopIdentifiersResponseData.changes) &&
                Objects.equals(this.productId, interopIdentifiersResponseData.productId) &&
                Objects.equals(this.rollbackTransaction, interopIdentifiersResponseData.rollbackTransaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(officeId, groupId, clientId, loanId, savingsId, subResourceId, transactionId, changes, productId, rollbackTransaction);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteropIdentifiersResponseData {\n");

        sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
        sb.append("    savingsId: ").append(toIndentedString(savingsId)).append("\n");
        sb.append("    subResourceId: ").append(toIndentedString(subResourceId)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    rollbackTransaction: ").append(toIndentedString(rollbackTransaction)).append("\n");
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

