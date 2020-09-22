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
 * GetLoanProductsPrincipalVariationsForBorrowerCycle
 */

public class GetLoanProductsPrincipalVariationsForBorrowerCycle {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("borrowerCycleNumber")
    private Integer borrowerCycleNumber = null;

    @SerializedName("paramType")
    private GetLoanProductsParamType paramType = null;

    @SerializedName("valueConditionType")
    private GetLoanProductsValueConditionType valueConditionType = null;

    @SerializedName("minValue")
    private Float minValue = null;

    @SerializedName("maxValue")
    private Float maxValue = null;

    @SerializedName("defaultValue")
    private Float defaultValue = null;

    public GetLoanProductsPrincipalVariationsForBorrowerCycle id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(example = "21", value = "")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GetLoanProductsPrincipalVariationsForBorrowerCycle borrowerCycleNumber(Integer borrowerCycleNumber) {
        this.borrowerCycleNumber = borrowerCycleNumber;
        return this;
    }

    /**
     * Get borrowerCycleNumber
     *
     * @return borrowerCycleNumber
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getBorrowerCycleNumber() {
        return borrowerCycleNumber;
    }

    public void setBorrowerCycleNumber(Integer borrowerCycleNumber) {
        this.borrowerCycleNumber = borrowerCycleNumber;
    }

    public GetLoanProductsPrincipalVariationsForBorrowerCycle paramType(GetLoanProductsParamType paramType) {
        this.paramType = paramType;
        return this;
    }

    /**
     * Get paramType
     *
     * @return paramType
     **/
    @ApiModelProperty(value = "")
    public GetLoanProductsParamType getParamType() {
        return paramType;
    }

    public void setParamType(GetLoanProductsParamType paramType) {
        this.paramType = paramType;
    }

    public GetLoanProductsPrincipalVariationsForBorrowerCycle valueConditionType(GetLoanProductsValueConditionType valueConditionType) {
        this.valueConditionType = valueConditionType;
        return this;
    }

    /**
     * Get valueConditionType
     *
     * @return valueConditionType
     **/
    @ApiModelProperty(value = "")
    public GetLoanProductsValueConditionType getValueConditionType() {
        return valueConditionType;
    }

    public void setValueConditionType(GetLoanProductsValueConditionType valueConditionType) {
        this.valueConditionType = valueConditionType;
    }

    public GetLoanProductsPrincipalVariationsForBorrowerCycle minValue(Float minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * Get minValue
     *
     * @return minValue
     **/
    @ApiModelProperty(example = "2000.0", value = "")
    public Float getMinValue() {
        return minValue;
    }

    public void setMinValue(Float minValue) {
        this.minValue = minValue;
    }

    public GetLoanProductsPrincipalVariationsForBorrowerCycle maxValue(Float maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * Get maxValue
     *
     * @return maxValue
     **/
    @ApiModelProperty(example = "20000.0", value = "")
    public Float getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Float maxValue) {
        this.maxValue = maxValue;
    }

    public GetLoanProductsPrincipalVariationsForBorrowerCycle defaultValue(Float defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Get defaultValue
     *
     * @return defaultValue
     **/
    @ApiModelProperty(example = "15000.0", value = "")
    public Float getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Float defaultValue) {
        this.defaultValue = defaultValue;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetLoanProductsPrincipalVariationsForBorrowerCycle getLoanProductsPrincipalVariationsForBorrowerCycle = (GetLoanProductsPrincipalVariationsForBorrowerCycle) o;
        return Objects.equals(this.id, getLoanProductsPrincipalVariationsForBorrowerCycle.id) &&
                Objects.equals(this.borrowerCycleNumber, getLoanProductsPrincipalVariationsForBorrowerCycle.borrowerCycleNumber) &&
                Objects.equals(this.paramType, getLoanProductsPrincipalVariationsForBorrowerCycle.paramType) &&
                Objects.equals(this.valueConditionType, getLoanProductsPrincipalVariationsForBorrowerCycle.valueConditionType) &&
                Objects.equals(this.minValue, getLoanProductsPrincipalVariationsForBorrowerCycle.minValue) &&
                Objects.equals(this.maxValue, getLoanProductsPrincipalVariationsForBorrowerCycle.maxValue) &&
                Objects.equals(this.defaultValue, getLoanProductsPrincipalVariationsForBorrowerCycle.defaultValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, borrowerCycleNumber, paramType, valueConditionType, minValue, maxValue, defaultValue);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetLoanProductsPrincipalVariationsForBorrowerCycle {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    borrowerCycleNumber: ").append(toIndentedString(borrowerCycleNumber)).append("\n");
        sb.append("    paramType: ").append(toIndentedString(paramType)).append("\n");
        sb.append("    valueConditionType: ").append(toIndentedString(valueConditionType)).append("\n");
        sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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

