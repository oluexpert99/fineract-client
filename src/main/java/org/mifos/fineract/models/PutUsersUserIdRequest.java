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
 * PutUsersUserIdRequest
 */

public class PutUsersUserIdRequest {
    @SerializedName("firstname")
    private String firstname = null;

    @SerializedName("password")
    private String password = null;

    @SerializedName("repeatPassword")
    private String repeatPassword = null;

    public PutUsersUserIdRequest firstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    /**
     * Get firstname
     *
     * @return firstname
     **/
    @ApiModelProperty(example = "Test", value = "")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public PutUsersUserIdRequest password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get password
     *
     * @return password
     **/
    @ApiModelProperty(example = "window75", value = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PutUsersUserIdRequest repeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
        return this;
    }

    /**
     * Get repeatPassword
     *
     * @return repeatPassword
     **/
    @ApiModelProperty(example = "window75", value = "")
    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutUsersUserIdRequest putUsersUserIdRequest = (PutUsersUserIdRequest) o;
        return Objects.equals(this.firstname, putUsersUserIdRequest.firstname) &&
                Objects.equals(this.password, putUsersUserIdRequest.password) &&
                Objects.equals(this.repeatPassword, putUsersUserIdRequest.repeatPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, password, repeatPassword);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutUsersUserIdRequest {\n");

        sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    repeatPassword: ").append(toIndentedString(repeatPassword)).append("\n");
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

