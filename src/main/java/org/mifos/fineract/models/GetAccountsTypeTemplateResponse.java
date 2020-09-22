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
 * GetAccountsTypeTemplateResponse
 */

public class GetAccountsTypeTemplateResponse {
    @SerializedName("clientId")
    private Integer clientId = null;

    @SerializedName("clientName")
    private String clientName = null;

    @SerializedName("productOptions")
    private List<GetAccountsTypeProductOptions> productOptions = null;

    public GetAccountsTypeTemplateResponse clientId(Integer clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get clientId
     *
     * @return clientId
     **/
    @ApiModelProperty(example = "7", value = "")
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public GetAccountsTypeTemplateResponse clientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * Get clientName
     *
     * @return clientName
     **/
    @ApiModelProperty(example = "Client Name", value = "")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public GetAccountsTypeTemplateResponse productOptions(List<GetAccountsTypeProductOptions> productOptions) {
        this.productOptions = productOptions;
        return this;
    }

    public GetAccountsTypeTemplateResponse addProductOptionsItem(GetAccountsTypeProductOptions productOptionsItem) {
        if (this.productOptions == null) {
            this.productOptions = new ArrayList<GetAccountsTypeProductOptions>();
        }
        this.productOptions.add(productOptionsItem);
        return this;
    }

    /**
     * Get productOptions
     *
     * @return productOptions
     **/
    @ApiModelProperty(value = "")
    public List<GetAccountsTypeProductOptions> getProductOptions() {
        return productOptions;
    }

    public void setProductOptions(List<GetAccountsTypeProductOptions> productOptions) {
        this.productOptions = productOptions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAccountsTypeTemplateResponse getAccountsTypeTemplateResponse = (GetAccountsTypeTemplateResponse) o;
        return Objects.equals(this.clientId, getAccountsTypeTemplateResponse.clientId) &&
                Objects.equals(this.clientName, getAccountsTypeTemplateResponse.clientName) &&
                Objects.equals(this.productOptions, getAccountsTypeTemplateResponse.productOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientName, productOptions);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAccountsTypeTemplateResponse {\n");

        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
        sb.append("    productOptions: ").append(toIndentedString(productOptions)).append("\n");
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

