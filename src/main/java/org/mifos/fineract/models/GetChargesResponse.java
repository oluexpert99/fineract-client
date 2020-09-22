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
 * GetChargesResponse
 */

public class GetChargesResponse {
    @SerializedName("id")
    private Long id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("active")
    private String active = null;

    @SerializedName("penalty")
    private String penalty = null;

    @SerializedName("currency")
    private GetChargesCurrencyResponse currency = null;

    @SerializedName("amount")
    private Float amount = null;

    @SerializedName("chargeTimeType")
    private GetChargesTimeTypeResponse chargeTimeType = null;

    @SerializedName("chargeAppliesTo")
    private GetChargesAppliesToResponse chargeAppliesTo = null;

    @SerializedName("chargeCalculationType")
    private GetChargesCalculationTypeResponse chargeCalculationType = null;

    @SerializedName("chargePaymentMode")
    private GetChargesPaymentModeResponse chargePaymentMode = null;

    public GetChargesResponse id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(example = "1", value = "")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GetChargesResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(example = "Loan Service fee", value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetChargesResponse active(String active) {
        this.active = active;
        return this;
    }

    /**
     * Get active
     *
     * @return active
     **/
    @ApiModelProperty(example = "true", value = "")
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public GetChargesResponse penalty(String penalty) {
        this.penalty = penalty;
        return this;
    }

    /**
     * Get penalty
     *
     * @return penalty
     **/
    @ApiModelProperty(example = "false", value = "")
    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    public GetChargesResponse currency(GetChargesCurrencyResponse currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/
    @ApiModelProperty(value = "")
    public GetChargesCurrencyResponse getCurrency() {
        return currency;
    }

    public void setCurrency(GetChargesCurrencyResponse currency) {
        this.currency = currency;
    }

    public GetChargesResponse amount(Float amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @ApiModelProperty(example = "230.56", value = "")
    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public GetChargesResponse chargeTimeType(GetChargesTimeTypeResponse chargeTimeType) {
        this.chargeTimeType = chargeTimeType;
        return this;
    }

    /**
     * Get chargeTimeType
     *
     * @return chargeTimeType
     **/
    @ApiModelProperty(value = "")
    public GetChargesTimeTypeResponse getChargeTimeType() {
        return chargeTimeType;
    }

    public void setChargeTimeType(GetChargesTimeTypeResponse chargeTimeType) {
        this.chargeTimeType = chargeTimeType;
    }

    public GetChargesResponse chargeAppliesTo(GetChargesAppliesToResponse chargeAppliesTo) {
        this.chargeAppliesTo = chargeAppliesTo;
        return this;
    }

    /**
     * Get chargeAppliesTo
     *
     * @return chargeAppliesTo
     **/
    @ApiModelProperty(value = "")
    public GetChargesAppliesToResponse getChargeAppliesTo() {
        return chargeAppliesTo;
    }

    public void setChargeAppliesTo(GetChargesAppliesToResponse chargeAppliesTo) {
        this.chargeAppliesTo = chargeAppliesTo;
    }

    public GetChargesResponse chargeCalculationType(GetChargesCalculationTypeResponse chargeCalculationType) {
        this.chargeCalculationType = chargeCalculationType;
        return this;
    }

    /**
     * Get chargeCalculationType
     *
     * @return chargeCalculationType
     **/
    @ApiModelProperty(value = "")
    public GetChargesCalculationTypeResponse getChargeCalculationType() {
        return chargeCalculationType;
    }

    public void setChargeCalculationType(GetChargesCalculationTypeResponse chargeCalculationType) {
        this.chargeCalculationType = chargeCalculationType;
    }

    public GetChargesResponse chargePaymentMode(GetChargesPaymentModeResponse chargePaymentMode) {
        this.chargePaymentMode = chargePaymentMode;
        return this;
    }

    /**
     * Get chargePaymentMode
     *
     * @return chargePaymentMode
     **/
    @ApiModelProperty(value = "")
    public GetChargesPaymentModeResponse getChargePaymentMode() {
        return chargePaymentMode;
    }

    public void setChargePaymentMode(GetChargesPaymentModeResponse chargePaymentMode) {
        this.chargePaymentMode = chargePaymentMode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetChargesResponse getChargesResponse = (GetChargesResponse) o;
        return Objects.equals(this.id, getChargesResponse.id) &&
                Objects.equals(this.name, getChargesResponse.name) &&
                Objects.equals(this.active, getChargesResponse.active) &&
                Objects.equals(this.penalty, getChargesResponse.penalty) &&
                Objects.equals(this.currency, getChargesResponse.currency) &&
                Objects.equals(this.amount, getChargesResponse.amount) &&
                Objects.equals(this.chargeTimeType, getChargesResponse.chargeTimeType) &&
                Objects.equals(this.chargeAppliesTo, getChargesResponse.chargeAppliesTo) &&
                Objects.equals(this.chargeCalculationType, getChargesResponse.chargeCalculationType) &&
                Objects.equals(this.chargePaymentMode, getChargesResponse.chargePaymentMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, active, penalty, currency, amount, chargeTimeType, chargeAppliesTo, chargeCalculationType, chargePaymentMode);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetChargesResponse {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
        sb.append("    chargeAppliesTo: ").append(toIndentedString(chargeAppliesTo)).append("\n");
        sb.append("    chargeCalculationType: ").append(toIndentedString(chargeCalculationType)).append("\n");
        sb.append("    chargePaymentMode: ").append(toIndentedString(chargePaymentMode)).append("\n");
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

