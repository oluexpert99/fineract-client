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
 * PostLoansLoanIdChargesChargeIdRequest
 */

public class PostLoansLoanIdChargesChargeIdRequest {
    @SerializedName("dateFormat")
    private String dateFormat = null;

    @SerializedName("locale")
    private String locale = null;

    @SerializedName("transactionDate")
    private String transactionDate = null;

    public PostLoansLoanIdChargesChargeIdRequest dateFormat(String dateFormat) {
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

    public PostLoansLoanIdChargesChargeIdRequest locale(String locale) {
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

    public PostLoansLoanIdChargesChargeIdRequest transactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }

    /**
     * Get transactionDate
     *
     * @return transactionDate
     **/
    @ApiModelProperty(example = "19 September 2013", value = "")
    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostLoansLoanIdChargesChargeIdRequest postLoansLoanIdChargesChargeIdRequest = (PostLoansLoanIdChargesChargeIdRequest) o;
        return Objects.equals(this.dateFormat, postLoansLoanIdChargesChargeIdRequest.dateFormat) &&
                Objects.equals(this.locale, postLoansLoanIdChargesChargeIdRequest.locale) &&
                Objects.equals(this.transactionDate, postLoansLoanIdChargesChargeIdRequest.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateFormat, locale, transactionDate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostLoansLoanIdChargesChargeIdRequest {\n");

        sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
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

