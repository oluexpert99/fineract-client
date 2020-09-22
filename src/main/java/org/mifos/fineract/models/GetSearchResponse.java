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
 * GetSearchResponse
 */

public class GetSearchResponse {
    @SerializedName("entityId")
    private Long entityId = null;

    @SerializedName("entityAccountNo")
    private Long entityAccountNo = null;

    @SerializedName("entityExternalId")
    private String entityExternalId = null;

    @SerializedName("entityName")
    private String entityName = null;

    @SerializedName("entityType")
    private String entityType = null;

    @SerializedName("parentId")
    private Long parentId = null;

    @SerializedName("parentName")
    private String parentName = null;

    @SerializedName("entityStatus")
    private EnumOptionData entityStatus = null;

    public GetSearchResponse entityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Get entityId
     *
     * @return entityId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public GetSearchResponse entityAccountNo(Long entityAccountNo) {
        this.entityAccountNo = entityAccountNo;
        return this;
    }

    /**
     * Get entityAccountNo
     *
     * @return entityAccountNo
     **/
    @ApiModelProperty(example = "1", value = "")
    public Long getEntityAccountNo() {
        return entityAccountNo;
    }

    public void setEntityAccountNo(Long entityAccountNo) {
        this.entityAccountNo = entityAccountNo;
    }

    public GetSearchResponse entityExternalId(String entityExternalId) {
        this.entityExternalId = entityExternalId;
        return this;
    }

    /**
     * Get entityExternalId
     *
     * @return entityExternalId
     **/
    @ApiModelProperty(example = "ID_JKZGEXF", value = "")
    public String getEntityExternalId() {
        return entityExternalId;
    }

    public void setEntityExternalId(String entityExternalId) {
        this.entityExternalId = entityExternalId;
    }

    public GetSearchResponse entityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    /**
     * Get entityName
     *
     * @return entityName
     **/
    @ApiModelProperty(example = "Group_Name_HVCU5", value = "")
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public GetSearchResponse entityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Get entityType
     *
     * @return entityType
     **/
    @ApiModelProperty(example = "GROUP", value = "")
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public GetSearchResponse parentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Get parentId
     *
     * @return parentId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public GetSearchResponse parentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * Get parentName
     *
     * @return parentName
     **/
    @ApiModelProperty(example = "Head Office", value = "")
    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public GetSearchResponse entityStatus(EnumOptionData entityStatus) {
        this.entityStatus = entityStatus;
        return this;
    }

    /**
     * Get entityStatus
     *
     * @return entityStatus
     **/
    @ApiModelProperty(value = "")
    public EnumOptionData getEntityStatus() {
        return entityStatus;
    }

    public void setEntityStatus(EnumOptionData entityStatus) {
        this.entityStatus = entityStatus;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSearchResponse getSearchResponse = (GetSearchResponse) o;
        return Objects.equals(this.entityId, getSearchResponse.entityId) &&
                Objects.equals(this.entityAccountNo, getSearchResponse.entityAccountNo) &&
                Objects.equals(this.entityExternalId, getSearchResponse.entityExternalId) &&
                Objects.equals(this.entityName, getSearchResponse.entityName) &&
                Objects.equals(this.entityType, getSearchResponse.entityType) &&
                Objects.equals(this.parentId, getSearchResponse.parentId) &&
                Objects.equals(this.parentName, getSearchResponse.parentName) &&
                Objects.equals(this.entityStatus, getSearchResponse.entityStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityId, entityAccountNo, entityExternalId, entityName, entityType, parentId, parentName, entityStatus);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSearchResponse {\n");

        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    entityAccountNo: ").append(toIndentedString(entityAccountNo)).append("\n");
        sb.append("    entityExternalId: ").append(toIndentedString(entityExternalId)).append("\n");
        sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
        sb.append("    entityStatus: ").append(toIndentedString(entityStatus)).append("\n");
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

