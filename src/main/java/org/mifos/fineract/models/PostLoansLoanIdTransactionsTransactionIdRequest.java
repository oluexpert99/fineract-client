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
 * PostLoansLoanIdTransactionsTransactionIdRequest
 */

public class PostLoansLoanIdTransactionsTransactionIdRequest {
    @SerializedName("locale")
    private String locale = null;

    @SerializedName("dateFormat")
    private String dateFormat = null;

    @SerializedName("transactionDate")
    private String transactionDate = null;

    @SerializedName("transactionAmount")
    private Double transactionAmount = null;

    @SerializedName("note")
    private String note = null;

    public PostLoansLoanIdTransactionsTransactionIdRequest locale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get locale
     *
     * @return locale
     **/
    @ApiModelProperty(example = "en_GB", value = "")
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public PostLoansLoanIdTransactionsTransactionIdRequest dateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * Get dateFormat
     *
     * @return dateFormat
     **/
    @ApiModelProperty(example = "dd MMMM yyyy", value = "")
    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public PostLoansLoanIdTransactionsTransactionIdRequest transactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }

    /**
     * Get transactionDate
     *
     * @return transactionDate
     **/
    @ApiModelProperty(example = "25 May 2012", value = "")
    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public PostLoansLoanIdTransactionsTransactionIdRequest transactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
        return this;
    }

    /**
     * Get transactionAmount
     *
     * @return transactionAmount
     **/
    @ApiModelProperty(example = "50,000.00", value = "")
    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public PostLoansLoanIdTransactionsTransactionIdRequest note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Get note
     *
     * @return note
     **/
    @ApiModelProperty(example = "An optional note about why your adjusting or changing the transaction.", value = "")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostLoansLoanIdTransactionsTransactionIdRequest postLoansLoanIdTransactionsTransactionIdRequest = (PostLoansLoanIdTransactionsTransactionIdRequest) o;
        return Objects.equals(this.locale, postLoansLoanIdTransactionsTransactionIdRequest.locale) &&
                Objects.equals(this.dateFormat, postLoansLoanIdTransactionsTransactionIdRequest.dateFormat) &&
                Objects.equals(this.transactionDate, postLoansLoanIdTransactionsTransactionIdRequest.transactionDate) &&
                Objects.equals(this.transactionAmount, postLoansLoanIdTransactionsTransactionIdRequest.transactionAmount) &&
                Objects.equals(this.note, postLoansLoanIdTransactionsTransactionIdRequest.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale, dateFormat, transactionDate, transactionAmount, note);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostLoansLoanIdTransactionsTransactionIdRequest {\n");

        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
        sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
        sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

