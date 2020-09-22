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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.*;

/**
 * InteropQuoteResponseData
 */

public class InteropQuoteResponseData {
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

    @SerializedName("transactionCode")
    private String transactionCode = null;
    @SerializedName("state")
    private StateEnum state = null;
    @SerializedName("expiration")
    private String expiration = null;
    @SerializedName("extensionList")
    private List<ExtensionData> extensionList = null;
    @SerializedName("quoteCode")
    private String quoteCode = null;
    @SerializedName("fspFee")
    private MoneyData fspFee = null;
    @SerializedName("fspCommission")
    private MoneyData fspCommission = null;

    public InteropQuoteResponseData officeId(Long officeId) {
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

    public InteropQuoteResponseData groupId(Long groupId) {
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

    public InteropQuoteResponseData clientId(Long clientId) {
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

    public InteropQuoteResponseData loanId(Long loanId) {
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

    public InteropQuoteResponseData savingsId(Long savingsId) {
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

    public InteropQuoteResponseData subResourceId(Long subResourceId) {
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

    public InteropQuoteResponseData transactionId(String transactionId) {
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

    public InteropQuoteResponseData changes(Map<String, Object> changes) {
        this.changes = changes;
        return this;
    }

    public InteropQuoteResponseData putChangesItem(String key, Object changesItem) {
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

    public InteropQuoteResponseData productId(Long productId) {
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

    public InteropQuoteResponseData rollbackTransaction(Boolean rollbackTransaction) {
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

    public InteropQuoteResponseData transactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
        return this;
    }

    /**
     * Get transactionCode
     *
     * @return transactionCode
     **/
    @ApiModelProperty(required = true, value = "")
    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public InteropQuoteResponseData state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     **/
    @ApiModelProperty(required = true, value = "")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public InteropQuoteResponseData expiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * Get expiration
     *
     * @return expiration
     **/
    @ApiModelProperty(value = "")
    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public InteropQuoteResponseData extensionList(List<ExtensionData> extensionList) {
        this.extensionList = extensionList;
        return this;
    }

    public InteropQuoteResponseData addExtensionListItem(ExtensionData extensionListItem) {
        if (this.extensionList == null) {
            this.extensionList = new ArrayList<ExtensionData>();
        }
        this.extensionList.add(extensionListItem);
        return this;
    }

    /**
     * Get extensionList
     *
     * @return extensionList
     **/
    @ApiModelProperty(value = "")
    public List<ExtensionData> getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(List<ExtensionData> extensionList) {
        this.extensionList = extensionList;
    }

    public InteropQuoteResponseData quoteCode(String quoteCode) {
        this.quoteCode = quoteCode;
        return this;
    }

    /**
     * Get quoteCode
     *
     * @return quoteCode
     **/
    @ApiModelProperty(required = true, value = "")
    public String getQuoteCode() {
        return quoteCode;
    }

    public void setQuoteCode(String quoteCode) {
        this.quoteCode = quoteCode;
    }

    public InteropQuoteResponseData fspFee(MoneyData fspFee) {
        this.fspFee = fspFee;
        return this;
    }

    /**
     * Get fspFee
     *
     * @return fspFee
     **/
    @ApiModelProperty(value = "")
    public MoneyData getFspFee() {
        return fspFee;
    }

    public void setFspFee(MoneyData fspFee) {
        this.fspFee = fspFee;
    }

    public InteropQuoteResponseData fspCommission(MoneyData fspCommission) {
        this.fspCommission = fspCommission;
        return this;
    }

    /**
     * Get fspCommission
     *
     * @return fspCommission
     **/
    @ApiModelProperty(value = "")
    public MoneyData getFspCommission() {
        return fspCommission;
    }

    public void setFspCommission(MoneyData fspCommission) {
        this.fspCommission = fspCommission;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InteropQuoteResponseData interopQuoteResponseData = (InteropQuoteResponseData) o;
        return Objects.equals(this.officeId, interopQuoteResponseData.officeId) &&
                Objects.equals(this.groupId, interopQuoteResponseData.groupId) &&
                Objects.equals(this.clientId, interopQuoteResponseData.clientId) &&
                Objects.equals(this.loanId, interopQuoteResponseData.loanId) &&
                Objects.equals(this.savingsId, interopQuoteResponseData.savingsId) &&
                Objects.equals(this.subResourceId, interopQuoteResponseData.subResourceId) &&
                Objects.equals(this.transactionId, interopQuoteResponseData.transactionId) &&
                Objects.equals(this.changes, interopQuoteResponseData.changes) &&
                Objects.equals(this.productId, interopQuoteResponseData.productId) &&
                Objects.equals(this.rollbackTransaction, interopQuoteResponseData.rollbackTransaction) &&
                Objects.equals(this.transactionCode, interopQuoteResponseData.transactionCode) &&
                Objects.equals(this.state, interopQuoteResponseData.state) &&
                Objects.equals(this.expiration, interopQuoteResponseData.expiration) &&
                Objects.equals(this.extensionList, interopQuoteResponseData.extensionList) &&
                Objects.equals(this.quoteCode, interopQuoteResponseData.quoteCode) &&
                Objects.equals(this.fspFee, interopQuoteResponseData.fspFee) &&
                Objects.equals(this.fspCommission, interopQuoteResponseData.fspCommission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(officeId, groupId, clientId, loanId, savingsId, subResourceId, transactionId, changes, productId, rollbackTransaction, transactionCode, state, expiration, extensionList, quoteCode, fspFee, fspCommission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteropQuoteResponseData {\n");

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
        sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
        sb.append("    extensionList: ").append(toIndentedString(extensionList)).append("\n");
        sb.append("    quoteCode: ").append(toIndentedString(quoteCode)).append("\n");
        sb.append("    fspFee: ").append(toIndentedString(fspFee)).append("\n");
        sb.append("    fspCommission: ").append(toIndentedString(fspCommission)).append("\n");
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

    /**
     * Gets or Sets state
     */
    @JsonAdapter(StateEnum.Adapter.class)
    public enum StateEnum {
        ACCEPTED("ACCEPTED"),

        REJECTED("REJECTED");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        public static StateEnum fromValue(String text) {
            for (StateEnum b : StateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<StateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StateEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

