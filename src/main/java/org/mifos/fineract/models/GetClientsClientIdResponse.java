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
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetClientsClientIdResponse
 */

public class GetClientsClientIdResponse {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("accountNo")
    private Long accountNo = null;

    @SerializedName("status")
    private GetClientsClientIdStatus status = null;

    @SerializedName("active")
    private Boolean active = null;

    @SerializedName("activationDate")
    private LocalDate activationDate = null;

    @SerializedName("firstname")
    private String firstname = null;

    @SerializedName("lastname")
    private String lastname = null;

    @SerializedName("displayName")
    private String displayName = null;

    @SerializedName("officeId")
    private Integer officeId = null;

    @SerializedName("officeName")
    private String officeName = null;

    @SerializedName("timeline")
    private GetClientsTimeline timeline = null;

    @SerializedName("savingsProductId")
    private Integer savingsProductId = null;

    @SerializedName("savingsProductName")
    private String savingsProductName = null;

    @SerializedName("groups")
    private List<String> groups = null;

    public GetClientsClientIdResponse id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(example = "27", value = "")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GetClientsClientIdResponse accountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }

    /**
     * Get accountNo
     *
     * @return accountNo
     **/
    @ApiModelProperty(example = "27", value = "")
    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public GetClientsClientIdResponse status(GetClientsClientIdStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @ApiModelProperty(value = "")
    public GetClientsClientIdStatus getStatus() {
        return status;
    }

    public void setStatus(GetClientsClientIdStatus status) {
        this.status = status;
    }

    public GetClientsClientIdResponse active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get active
     *
     * @return active
     **/
    @ApiModelProperty(example = "true", value = "")
    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public GetClientsClientIdResponse activationDate(LocalDate activationDate) {
        this.activationDate = activationDate;
        return this;
    }

    /**
     * Get activationDate
     *
     * @return activationDate
     **/
    @ApiModelProperty(example = "[2013, 1, 1]", value = "")
    public LocalDate getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(LocalDate activationDate) {
        this.activationDate = activationDate;
    }

    public GetClientsClientIdResponse firstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    /**
     * Get firstname
     *
     * @return firstname
     **/
    @ApiModelProperty(example = "savings", value = "")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public GetClientsClientIdResponse lastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    /**
     * Get lastname
     *
     * @return lastname
     **/
    @ApiModelProperty(example = "test", value = "")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public GetClientsClientIdResponse displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get displayName
     *
     * @return displayName
     **/
    @ApiModelProperty(example = "savings test", value = "")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public GetClientsClientIdResponse officeId(Integer officeId) {
        this.officeId = officeId;
        return this;
    }

    /**
     * Get officeId
     *
     * @return officeId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public GetClientsClientIdResponse officeName(String officeName) {
        this.officeName = officeName;
        return this;
    }

    /**
     * Get officeName
     *
     * @return officeName
     **/
    @ApiModelProperty(example = "Head Office", value = "")
    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public GetClientsClientIdResponse timeline(GetClientsTimeline timeline) {
        this.timeline = timeline;
        return this;
    }

    /**
     * Get timeline
     *
     * @return timeline
     **/
    @ApiModelProperty(value = "")
    public GetClientsTimeline getTimeline() {
        return timeline;
    }

    public void setTimeline(GetClientsTimeline timeline) {
        this.timeline = timeline;
    }

    public GetClientsClientIdResponse savingsProductId(Integer savingsProductId) {
        this.savingsProductId = savingsProductId;
        return this;
    }

    /**
     * Get savingsProductId
     *
     * @return savingsProductId
     **/
    @ApiModelProperty(example = "4", value = "")
    public Integer getSavingsProductId() {
        return savingsProductId;
    }

    public void setSavingsProductId(Integer savingsProductId) {
        this.savingsProductId = savingsProductId;
    }

    public GetClientsClientIdResponse savingsProductName(String savingsProductName) {
        this.savingsProductName = savingsProductName;
        return this;
    }

    /**
     * Get savingsProductName
     *
     * @return savingsProductName
     **/
    @ApiModelProperty(example = "account overdraft", value = "")
    public String getSavingsProductName() {
        return savingsProductName;
    }

    public void setSavingsProductName(String savingsProductName) {
        this.savingsProductName = savingsProductName;
    }

    public GetClientsClientIdResponse groups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    public GetClientsClientIdResponse addGroupsItem(String groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<String>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    /**
     * Get groups
     *
     * @return groups
     **/
    @ApiModelProperty(example = "\"[]\"", value = "")
    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetClientsClientIdResponse getClientsClientIdResponse = (GetClientsClientIdResponse) o;
        return Objects.equals(this.id, getClientsClientIdResponse.id) &&
                Objects.equals(this.accountNo, getClientsClientIdResponse.accountNo) &&
                Objects.equals(this.status, getClientsClientIdResponse.status) &&
                Objects.equals(this.active, getClientsClientIdResponse.active) &&
                Objects.equals(this.activationDate, getClientsClientIdResponse.activationDate) &&
                Objects.equals(this.firstname, getClientsClientIdResponse.firstname) &&
                Objects.equals(this.lastname, getClientsClientIdResponse.lastname) &&
                Objects.equals(this.displayName, getClientsClientIdResponse.displayName) &&
                Objects.equals(this.officeId, getClientsClientIdResponse.officeId) &&
                Objects.equals(this.officeName, getClientsClientIdResponse.officeName) &&
                Objects.equals(this.timeline, getClientsClientIdResponse.timeline) &&
                Objects.equals(this.savingsProductId, getClientsClientIdResponse.savingsProductId) &&
                Objects.equals(this.savingsProductName, getClientsClientIdResponse.savingsProductName) &&
                Objects.equals(this.groups, getClientsClientIdResponse.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNo, status, active, activationDate, firstname, lastname, displayName, officeId, officeName, timeline, savingsProductId, savingsProductName, groups);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetClientsClientIdResponse {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
        sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
        sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
        sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
        sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
        sb.append("    savingsProductId: ").append(toIndentedString(savingsProductId)).append("\n");
        sb.append("    savingsProductName: ").append(toIndentedString(savingsProductName)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

