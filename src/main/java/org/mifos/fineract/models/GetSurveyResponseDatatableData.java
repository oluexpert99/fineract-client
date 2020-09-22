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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetSurveyResponseDatatableData
 */

public class GetSurveyResponseDatatableData {
    @SerializedName("applicationTableName")
    private String applicationTableName = null;

    @SerializedName("registeredTableName")
    private String registeredTableName = null;

    @SerializedName("columnHeaderData")
    private List<ResultsetColumnHeaderData> columnHeaderData = null;

    public GetSurveyResponseDatatableData applicationTableName(String applicationTableName) {
        this.applicationTableName = applicationTableName;
        return this;
    }

    /**
     * Get applicationTableName
     *
     * @return applicationTableName
     **/
    @ApiModelProperty(example = "m_client", value = "")
    public String getApplicationTableName() {
        return applicationTableName;
    }

    public void setApplicationTableName(String applicationTableName) {
        this.applicationTableName = applicationTableName;
    }

    public GetSurveyResponseDatatableData registeredTableName(String registeredTableName) {
        this.registeredTableName = registeredTableName;
        return this;
    }

    /**
     * Get registeredTableName
     *
     * @return registeredTableName
     **/
    @ApiModelProperty(example = "ppi_kenya_2005", value = "")
    public String getRegisteredTableName() {
        return registeredTableName;
    }

    public void setRegisteredTableName(String registeredTableName) {
        this.registeredTableName = registeredTableName;
    }

    public GetSurveyResponseDatatableData columnHeaderData(List<ResultsetColumnHeaderData> columnHeaderData) {
        this.columnHeaderData = columnHeaderData;
        return this;
    }

    public GetSurveyResponseDatatableData addColumnHeaderDataItem(ResultsetColumnHeaderData columnHeaderDataItem) {
        if (this.columnHeaderData == null) {
            this.columnHeaderData = new ArrayList<ResultsetColumnHeaderData>();
        }
        this.columnHeaderData.add(columnHeaderDataItem);
        return this;
    }

    /**
     * Get columnHeaderData
     *
     * @return columnHeaderData
     **/
    @ApiModelProperty(value = "")
    public List<ResultsetColumnHeaderData> getColumnHeaderData() {
        return columnHeaderData;
    }

    public void setColumnHeaderData(List<ResultsetColumnHeaderData> columnHeaderData) {
        this.columnHeaderData = columnHeaderData;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSurveyResponseDatatableData getSurveyResponseDatatableData = (GetSurveyResponseDatatableData) o;
        return Objects.equals(this.applicationTableName, getSurveyResponseDatatableData.applicationTableName) &&
                Objects.equals(this.registeredTableName, getSurveyResponseDatatableData.registeredTableName) &&
                Objects.equals(this.columnHeaderData, getSurveyResponseDatatableData.columnHeaderData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationTableName, registeredTableName, columnHeaderData);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSurveyResponseDatatableData {\n");

        sb.append("    applicationTableName: ").append(toIndentedString(applicationTableName)).append("\n");
        sb.append("    registeredTableName: ").append(toIndentedString(registeredTableName)).append("\n");
        sb.append("    columnHeaderData: ").append(toIndentedString(columnHeaderData)).append("\n");
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

