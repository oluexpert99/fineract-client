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
 * InteropAccountData
 */

public class InteropAccountData {
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

    public InteropAccountData officeId(Long officeId) {
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

    public InteropAccountData groupId(Long groupId) {
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

    public InteropAccountData clientId(Long clientId) {
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

    public InteropAccountData loanId(Long loanId) {
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

    public InteropAccountData savingsId(Long savingsId) {
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

    public InteropAccountData subResourceId(Long subResourceId) {
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

    public InteropAccountData transactionId(String transactionId) {
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

    public InteropAccountData changes(Map<String, Object> changes) {
        this.changes = changes;
        return this;
    }

    public InteropAccountData putChangesItem(String key, Object changesItem) {
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

    public InteropAccountData productId(Long productId) {
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

    public InteropAccountData rollbackTransaction(Boolean rollbackTransaction) {
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
        InteropAccountData interopAccountData = (InteropAccountData) o;
        return Objects.equals(this.officeId, interopAccountData.officeId) &&
                Objects.equals(this.groupId, interopAccountData.groupId) &&
                Objects.equals(this.clientId, interopAccountData.clientId) &&
                Objects.equals(this.loanId, interopAccountData.loanId) &&
                Objects.equals(this.savingsId, interopAccountData.savingsId) &&
                Objects.equals(this.subResourceId, interopAccountData.subResourceId) &&
                Objects.equals(this.transactionId, interopAccountData.transactionId) &&
                Objects.equals(this.changes, interopAccountData.changes) &&
                Objects.equals(this.productId, interopAccountData.productId) &&
                Objects.equals(this.rollbackTransaction, interopAccountData.rollbackTransaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(officeId, groupId, clientId, loanId, savingsId, subResourceId, transactionId, changes, productId, rollbackTransaction);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteropAccountData {\n");

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

