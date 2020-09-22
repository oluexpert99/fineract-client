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
 * GetAccountTransfersPageItemsCurrency
 */

public class GetAccountTransfersPageItemsCurrency {
    @SerializedName("code")
    private String code = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("decimalPlaces")
    private Integer decimalPlaces = null;

    @SerializedName("displaySymbol")
    private String displaySymbol = null;

    @SerializedName("nameCode")
    private String nameCode = null;

    @SerializedName("displayLabel")
    private String displayLabel = null;

    public GetAccountTransfersPageItemsCurrency code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     **/
    @ApiModelProperty(example = "USD", value = "")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public GetAccountTransfersPageItemsCurrency name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(example = "US Dollar", value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetAccountTransfersPageItemsCurrency decimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
        return this;
    }

    /**
     * Get decimalPlaces
     *
     * @return decimalPlaces
     **/
    @ApiModelProperty(example = "2", value = "")
    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public GetAccountTransfersPageItemsCurrency displaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
        return this;
    }

    /**
     * Get displaySymbol
     *
     * @return displaySymbol
     **/
    @ApiModelProperty(example = "$", value = "")
    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public GetAccountTransfersPageItemsCurrency nameCode(String nameCode) {
        this.nameCode = nameCode;
        return this;
    }

    /**
     * Get nameCode
     *
     * @return nameCode
     **/
    @ApiModelProperty(example = "currency.USD", value = "")
    public String getNameCode() {
        return nameCode;
    }

    public void setNameCode(String nameCode) {
        this.nameCode = nameCode;
    }

    public GetAccountTransfersPageItemsCurrency displayLabel(String displayLabel) {
        this.displayLabel = displayLabel;
        return this;
    }

    /**
     * Get displayLabel
     *
     * @return displayLabel
     **/
    @ApiModelProperty(example = "US Dollar ($)", value = "")
    public String getDisplayLabel() {
        return displayLabel;
    }

    public void setDisplayLabel(String displayLabel) {
        this.displayLabel = displayLabel;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAccountTransfersPageItemsCurrency getAccountTransfersPageItemsCurrency = (GetAccountTransfersPageItemsCurrency) o;
        return Objects.equals(this.code, getAccountTransfersPageItemsCurrency.code) &&
                Objects.equals(this.name, getAccountTransfersPageItemsCurrency.name) &&
                Objects.equals(this.decimalPlaces, getAccountTransfersPageItemsCurrency.decimalPlaces) &&
                Objects.equals(this.displaySymbol, getAccountTransfersPageItemsCurrency.displaySymbol) &&
                Objects.equals(this.nameCode, getAccountTransfersPageItemsCurrency.nameCode) &&
                Objects.equals(this.displayLabel, getAccountTransfersPageItemsCurrency.displayLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, decimalPlaces, displaySymbol, nameCode, displayLabel);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAccountTransfersPageItemsCurrency {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    decimalPlaces: ").append(toIndentedString(decimalPlaces)).append("\n");
        sb.append("    displaySymbol: ").append(toIndentedString(displaySymbol)).append("\n");
        sb.append("    nameCode: ").append(toIndentedString(nameCode)).append("\n");
        sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
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

