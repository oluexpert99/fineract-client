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
 * ScorecardData
 */

public class ScorecardData {
    @SerializedName("id")
    private Long id = null;

    @SerializedName("userId")
    private Long userId = null;

    @SerializedName("username")
    private String username = null;

    @SerializedName("clientId")
    private Long clientId = null;

    @SerializedName("surveyId")
    private Long surveyId = null;

    @SerializedName("surveyName")
    private String surveyName = null;

    @SerializedName("scorecardValues")
    private List<ScorecardValue> scorecardValues = null;

    public ScorecardData id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(value = "")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ScorecardData userId(Long userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     *
     * @return userId
     **/
    @ApiModelProperty(value = "")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public ScorecardData username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get username
     *
     * @return username
     **/
    @ApiModelProperty(value = "")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ScorecardData clientId(Long clientId) {
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

    public ScorecardData surveyId(Long surveyId) {
        this.surveyId = surveyId;
        return this;
    }

    /**
     * Get surveyId
     *
     * @return surveyId
     **/
    @ApiModelProperty(value = "")
    public Long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }

    public ScorecardData surveyName(String surveyName) {
        this.surveyName = surveyName;
        return this;
    }

    /**
     * Get surveyName
     *
     * @return surveyName
     **/
    @ApiModelProperty(value = "")
    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public ScorecardData scorecardValues(List<ScorecardValue> scorecardValues) {
        this.scorecardValues = scorecardValues;
        return this;
    }

    public ScorecardData addScorecardValuesItem(ScorecardValue scorecardValuesItem) {
        if (this.scorecardValues == null) {
            this.scorecardValues = new ArrayList<ScorecardValue>();
        }
        this.scorecardValues.add(scorecardValuesItem);
        return this;
    }

    /**
     * Get scorecardValues
     *
     * @return scorecardValues
     **/
    @ApiModelProperty(value = "")
    public List<ScorecardValue> getScorecardValues() {
        return scorecardValues;
    }

    public void setScorecardValues(List<ScorecardValue> scorecardValues) {
        this.scorecardValues = scorecardValues;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScorecardData scorecardData = (ScorecardData) o;
        return Objects.equals(this.id, scorecardData.id) &&
                Objects.equals(this.userId, scorecardData.userId) &&
                Objects.equals(this.username, scorecardData.username) &&
                Objects.equals(this.clientId, scorecardData.clientId) &&
                Objects.equals(this.surveyId, scorecardData.surveyId) &&
                Objects.equals(this.surveyName, scorecardData.surveyName) &&
                Objects.equals(this.scorecardValues, scorecardData.scorecardValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, username, clientId, surveyId, surveyName, scorecardValues);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScorecardData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    surveyId: ").append(toIndentedString(surveyId)).append("\n");
        sb.append("    surveyName: ").append(toIndentedString(surveyName)).append("\n");
        sb.append("    scorecardValues: ").append(toIndentedString(scorecardValues)).append("\n");
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

