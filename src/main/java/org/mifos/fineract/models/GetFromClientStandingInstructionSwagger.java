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
 * GetFromClientStandingInstructionSwagger
 */

public class GetFromClientStandingInstructionSwagger {
    @SerializedName("id")
    private Long id = null;

    @SerializedName("displayName")
    private String displayName = null;

    @SerializedName("officeId")
    private Long officeId = null;

    @SerializedName("officeName")
    private String officeName = null;

    public GetFromClientStandingInstructionSwagger id(Long id) {
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

    public GetFromClientStandingInstructionSwagger displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get displayName
     *
     * @return displayName
     **/
    @ApiModelProperty(example = "Test test", value = "")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public GetFromClientStandingInstructionSwagger officeId(Long officeId) {
        this.officeId = officeId;
        return this;
    }

    /**
     * Get officeId
     *
     * @return officeId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    public GetFromClientStandingInstructionSwagger officeName(String officeName) {
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


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetFromClientStandingInstructionSwagger getFromClientStandingInstructionSwagger = (GetFromClientStandingInstructionSwagger) o;
        return Objects.equals(this.id, getFromClientStandingInstructionSwagger.id) &&
                Objects.equals(this.displayName, getFromClientStandingInstructionSwagger.displayName) &&
                Objects.equals(this.officeId, getFromClientStandingInstructionSwagger.officeId) &&
                Objects.equals(this.officeName, getFromClientStandingInstructionSwagger.officeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, displayName, officeId, officeName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFromClientStandingInstructionSwagger {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
        sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
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

