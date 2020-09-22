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
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * PostTellersTellerIdCashiersCashierIdSettleRequest
 */

public class PostTellersTellerIdCashiersCashierIdSettleRequest {
    @SerializedName("currencyCode")
    private String currencyCode = null;

    @SerializedName("txnAmount")
    private BigDecimal txnAmount = null;

    @SerializedName("txnNote")
    private String txnNote = null;

    @SerializedName("locale")
    private String locale = null;

    @SerializedName("dateFormat")
    private String dateFormat = null;

    @SerializedName("txnDate")
    private DateTime txnDate = null;

    public PostTellersTellerIdCashiersCashierIdSettleRequest currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Get currencyCode
     *
     * @return currencyCode
     **/
    @ApiModelProperty(example = "USD", value = "")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public PostTellersTellerIdCashiersCashierIdSettleRequest txnAmount(BigDecimal txnAmount) {
        this.txnAmount = txnAmount;
        return this;
    }

    /**
     * Get txnAmount
     *
     * @return txnAmount
     **/
    @ApiModelProperty(example = "2000.0", value = "")
    public BigDecimal getTxnAmount() {
        return txnAmount;
    }

    public void setTxnAmount(BigDecimal txnAmount) {
        this.txnAmount = txnAmount;
    }

    public PostTellersTellerIdCashiersCashierIdSettleRequest txnNote(String txnNote) {
        this.txnNote = txnNote;
        return this;
    }

    /**
     * Get txnNote
     *
     * @return txnNote
     **/
    @ApiModelProperty(example = "cash settlement", value = "")
    public String getTxnNote() {
        return txnNote;
    }

    public void setTxnNote(String txnNote) {
        this.txnNote = txnNote;
    }

    public PostTellersTellerIdCashiersCashierIdSettleRequest locale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get locale
     *
     * @return locale
     **/
    @ApiModelProperty(example = "en", value = "")
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public PostTellersTellerIdCashiersCashierIdSettleRequest dateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * Get dateFormat
     *
     * @return dateFormat
     **/
    @ApiModelProperty(example = "dd-MM-yyyy", value = "")
    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public PostTellersTellerIdCashiersCashierIdSettleRequest txnDate(DateTime txnDate) {
        this.txnDate = txnDate;
        return this;
    }

    /**
     * Get txnDate
     *
     * @return txnDate
     **/
    @ApiModelProperty(example = "20 February 2015", value = "")
    public DateTime getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(DateTime txnDate) {
        this.txnDate = txnDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostTellersTellerIdCashiersCashierIdSettleRequest postTellersTellerIdCashiersCashierIdSettleRequest = (PostTellersTellerIdCashiersCashierIdSettleRequest) o;
        return Objects.equals(this.currencyCode, postTellersTellerIdCashiersCashierIdSettleRequest.currencyCode) &&
                Objects.equals(this.txnAmount, postTellersTellerIdCashiersCashierIdSettleRequest.txnAmount) &&
                Objects.equals(this.txnNote, postTellersTellerIdCashiersCashierIdSettleRequest.txnNote) &&
                Objects.equals(this.locale, postTellersTellerIdCashiersCashierIdSettleRequest.locale) &&
                Objects.equals(this.dateFormat, postTellersTellerIdCashiersCashierIdSettleRequest.dateFormat) &&
                Objects.equals(this.txnDate, postTellersTellerIdCashiersCashierIdSettleRequest.txnDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, txnAmount, txnNote, locale, dateFormat, txnDate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostTellersTellerIdCashiersCashierIdSettleRequest {\n");

        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    txnAmount: ").append(toIndentedString(txnAmount)).append("\n");
        sb.append("    txnNote: ").append(toIndentedString(txnNote)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
        sb.append("    txnDate: ").append(toIndentedString(txnDate)).append("\n");
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

