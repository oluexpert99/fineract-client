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
 * GetAccountsCharges
 */

public class GetAccountsCharges {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("chargeId")
    private Integer chargeId = null;

    @SerializedName("accountId")
    private Integer accountId = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("chargeTimeType")
    private GetAccountsChargeTimeType chargeTimeType = null;

    @SerializedName("chargeCalculationType")
    private GetAccountsChargeCalculationType chargeCalculationType = null;

    @SerializedName("percentage")
    private Double percentage = null;

    @SerializedName("amountPercentageAppliedTo")
    private Double amountPercentageAppliedTo = null;

    @SerializedName("currency")
    private GetAccountsChargesCurrency currency = null;

    @SerializedName("amount")
    private Float amount = null;

    @SerializedName("amountPaid")
    private Float amountPaid = null;

    @SerializedName("amountWaived")
    private Float amountWaived = null;

    @SerializedName("amountWrittenOff")
    private Float amountWrittenOff = null;

    @SerializedName("amountOutstanding")
    private Float amountOutstanding = null;

    @SerializedName("amountOrPercentage")
    private Float amountOrPercentage = null;

    @SerializedName("isActive")
    private Boolean isActive = null;

    public GetAccountsCharges id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(example = "9", value = "")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GetAccountsCharges chargeId(Integer chargeId) {
        this.chargeId = chargeId;
        return this;
    }

    /**
     * Get chargeId
     *
     * @return chargeId
     **/
    @ApiModelProperty(example = "20", value = "")
    public Integer getChargeId() {
        return chargeId;
    }

    public void setChargeId(Integer chargeId) {
        this.chargeId = chargeId;
    }

    public GetAccountsCharges accountId(Integer accountId) {
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

    public GetAccountsCharges name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(example = "Share Account Activation Flat", value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetAccountsCharges chargeTimeType(GetAccountsChargeTimeType chargeTimeType) {
        this.chargeTimeType = chargeTimeType;
        return this;
    }

    /**
     * Get chargeTimeType
     *
     * @return chargeTimeType
     **/
    @ApiModelProperty(value = "")
    public GetAccountsChargeTimeType getChargeTimeType() {
        return chargeTimeType;
    }

    public void setChargeTimeType(GetAccountsChargeTimeType chargeTimeType) {
        this.chargeTimeType = chargeTimeType;
    }

    public GetAccountsCharges chargeCalculationType(GetAccountsChargeCalculationType chargeCalculationType) {
        this.chargeCalculationType = chargeCalculationType;
        return this;
    }

    /**
     * Get chargeCalculationType
     *
     * @return chargeCalculationType
     **/
    @ApiModelProperty(value = "")
    public GetAccountsChargeCalculationType getChargeCalculationType() {
        return chargeCalculationType;
    }

    public void setChargeCalculationType(GetAccountsChargeCalculationType chargeCalculationType) {
        this.chargeCalculationType = chargeCalculationType;
    }

    public GetAccountsCharges percentage(Double percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * Get percentage
     *
     * @return percentage
     **/
    @ApiModelProperty(example = "0.0", value = "")
    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public GetAccountsCharges amountPercentageAppliedTo(Double amountPercentageAppliedTo) {
        this.amountPercentageAppliedTo = amountPercentageAppliedTo;
        return this;
    }

    /**
     * Get amountPercentageAppliedTo
     *
     * @return amountPercentageAppliedTo
     **/
    @ApiModelProperty(example = "0.0", value = "")
    public Double getAmountPercentageAppliedTo() {
        return amountPercentageAppliedTo;
    }

    public void setAmountPercentageAppliedTo(Double amountPercentageAppliedTo) {
        this.amountPercentageAppliedTo = amountPercentageAppliedTo;
    }

    public GetAccountsCharges currency(GetAccountsChargesCurrency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/
    @ApiModelProperty(value = "")
    public GetAccountsChargesCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(GetAccountsChargesCurrency currency) {
        this.currency = currency;
    }

    public GetAccountsCharges amount(Float amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @ApiModelProperty(example = "1.0", value = "")
    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public GetAccountsCharges amountPaid(Float amountPaid) {
        this.amountPaid = amountPaid;
        return this;
    }

    /**
     * Get amountPaid
     *
     * @return amountPaid
     **/
    @ApiModelProperty(example = "1.0", value = "")
    public Float getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public GetAccountsCharges amountWaived(Float amountWaived) {
        this.amountWaived = amountWaived;
        return this;
    }

    /**
     * Get amountWaived
     *
     * @return amountWaived
     **/
    @ApiModelProperty(example = "0.0", value = "")
    public Float getAmountWaived() {
        return amountWaived;
    }

    public void setAmountWaived(Float amountWaived) {
        this.amountWaived = amountWaived;
    }

    public GetAccountsCharges amountWrittenOff(Float amountWrittenOff) {
        this.amountWrittenOff = amountWrittenOff;
        return this;
    }

    /**
     * Get amountWrittenOff
     *
     * @return amountWrittenOff
     **/
    @ApiModelProperty(example = "0.0", value = "")
    public Float getAmountWrittenOff() {
        return amountWrittenOff;
    }

    public void setAmountWrittenOff(Float amountWrittenOff) {
        this.amountWrittenOff = amountWrittenOff;
    }

    public GetAccountsCharges amountOutstanding(Float amountOutstanding) {
        this.amountOutstanding = amountOutstanding;
        return this;
    }

    /**
     * Get amountOutstanding
     *
     * @return amountOutstanding
     **/
    @ApiModelProperty(example = "0.0", value = "")
    public Float getAmountOutstanding() {
        return amountOutstanding;
    }

    public void setAmountOutstanding(Float amountOutstanding) {
        this.amountOutstanding = amountOutstanding;
    }

    public GetAccountsCharges amountOrPercentage(Float amountOrPercentage) {
        this.amountOrPercentage = amountOrPercentage;
        return this;
    }

    /**
     * Get amountOrPercentage
     *
     * @return amountOrPercentage
     **/
    @ApiModelProperty(example = "1.0", value = "")
    public Float getAmountOrPercentage() {
        return amountOrPercentage;
    }

    public void setAmountOrPercentage(Float amountOrPercentage) {
        this.amountOrPercentage = amountOrPercentage;
    }

    public GetAccountsCharges isActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * Get isActive
     *
     * @return isActive
     **/
    @ApiModelProperty(example = "true", value = "")
    public Boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAccountsCharges getAccountsCharges = (GetAccountsCharges) o;
        return Objects.equals(this.id, getAccountsCharges.id) &&
                Objects.equals(this.chargeId, getAccountsCharges.chargeId) &&
                Objects.equals(this.accountId, getAccountsCharges.accountId) &&
                Objects.equals(this.name, getAccountsCharges.name) &&
                Objects.equals(this.chargeTimeType, getAccountsCharges.chargeTimeType) &&
                Objects.equals(this.chargeCalculationType, getAccountsCharges.chargeCalculationType) &&
                Objects.equals(this.percentage, getAccountsCharges.percentage) &&
                Objects.equals(this.amountPercentageAppliedTo, getAccountsCharges.amountPercentageAppliedTo) &&
                Objects.equals(this.currency, getAccountsCharges.currency) &&
                Objects.equals(this.amount, getAccountsCharges.amount) &&
                Objects.equals(this.amountPaid, getAccountsCharges.amountPaid) &&
                Objects.equals(this.amountWaived, getAccountsCharges.amountWaived) &&
                Objects.equals(this.amountWrittenOff, getAccountsCharges.amountWrittenOff) &&
                Objects.equals(this.amountOutstanding, getAccountsCharges.amountOutstanding) &&
                Objects.equals(this.amountOrPercentage, getAccountsCharges.amountOrPercentage) &&
                Objects.equals(this.isActive, getAccountsCharges.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chargeId, accountId, name, chargeTimeType, chargeCalculationType, percentage, amountPercentageAppliedTo, currency, amount, amountPaid, amountWaived, amountWrittenOff, amountOutstanding, amountOrPercentage, isActive);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAccountsCharges {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    chargeId: ").append(toIndentedString(chargeId)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
        sb.append("    chargeCalculationType: ").append(toIndentedString(chargeCalculationType)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("    amountPercentageAppliedTo: ").append(toIndentedString(amountPercentageAppliedTo)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
        sb.append("    amountWaived: ").append(toIndentedString(amountWaived)).append("\n");
        sb.append("    amountWrittenOff: ").append(toIndentedString(amountWrittenOff)).append("\n");
        sb.append("    amountOutstanding: ").append(toIndentedString(amountOutstanding)).append("\n");
        sb.append("    amountOrPercentage: ").append(toIndentedString(amountOrPercentage)).append("\n");
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

