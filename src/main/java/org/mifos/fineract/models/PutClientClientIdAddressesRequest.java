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
 * PutClientClientIdAddressesRequest
 */

public class PutClientClientIdAddressesRequest {
    @SerializedName("addressId")
    private Integer addressId = null;

    @SerializedName("street")
    private String street = null;

    public PutClientClientIdAddressesRequest addressId(Integer addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * Get addressId
     *
     * @return addressId
     **/
    @ApiModelProperty(example = "67", value = "")
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public PutClientClientIdAddressesRequest street(String street) {
        this.street = street;
        return this;
    }

    /**
     * Get street
     *
     * @return street
     **/
    @ApiModelProperty(example = "goldensource", value = "")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutClientClientIdAddressesRequest putClientClientIdAddressesRequest = (PutClientClientIdAddressesRequest) o;
        return Objects.equals(this.addressId, putClientClientIdAddressesRequest.addressId) &&
                Objects.equals(this.street, putClientClientIdAddressesRequest.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, street);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutClientClientIdAddressesRequest {\n");

        sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
        sb.append("    street: ").append(toIndentedString(street)).append("\n");
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

