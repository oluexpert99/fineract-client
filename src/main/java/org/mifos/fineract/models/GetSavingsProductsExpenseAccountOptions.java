/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________
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
 * GetSavingsProductsExpenseAccountOptions
 */

public class GetSavingsProductsExpenseAccountOptions {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("glCode")
  private Integer glCode = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("manualEntriesAllowed")
  private Boolean manualEntriesAllowed = null;

  @SerializedName("type")
  private GetSavingsProductsExpenseType type = null;

  @SerializedName("usage")
  private GetSavingsProductsLiabilityUsage usage = null;

  @SerializedName("tagId")
  private GetSavingsAssetTagId tagId = null;

  public GetSavingsProductsExpenseAccountOptions id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   **/
  @ApiModelProperty(example = "6", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetSavingsProductsExpenseAccountOptions name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   **/
  @ApiModelProperty(example = "Write Off Expenses", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetSavingsProductsExpenseAccountOptions glCode(Integer glCode) {
    this.glCode = glCode;
    return this;
  }

  /**
   * Get glCode
   *
   * @return glCode
   **/
  @ApiModelProperty(example = "60001", value = "")
  public Integer getGlCode() {
    return glCode;
  }

  public void setGlCode(Integer glCode) {
    this.glCode = glCode;
  }

  public GetSavingsProductsExpenseAccountOptions disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Get disabled
   *
   * @return disabled
   **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public GetSavingsProductsExpenseAccountOptions manualEntriesAllowed(Boolean manualEntriesAllowed) {
    this.manualEntriesAllowed = manualEntriesAllowed;
    return this;
  }

  /**
   * Get manualEntriesAllowed
   *
   * @return manualEntriesAllowed
   **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isManualEntriesAllowed() {
    return manualEntriesAllowed;
  }

  public void setManualEntriesAllowed(Boolean manualEntriesAllowed) {
    this.manualEntriesAllowed = manualEntriesAllowed;
  }

  public GetSavingsProductsExpenseAccountOptions type(GetSavingsProductsExpenseType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   **/
  @ApiModelProperty(value = "")
  public GetSavingsProductsExpenseType getType() {
    return type;
  }

  public void setType(GetSavingsProductsExpenseType type) {
    this.type = type;
  }

  public GetSavingsProductsExpenseAccountOptions usage(GetSavingsProductsLiabilityUsage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   *
   * @return usage
   **/
  @ApiModelProperty(value = "")
  public GetSavingsProductsLiabilityUsage getUsage() {
    return usage;
  }

  public void setUsage(GetSavingsProductsLiabilityUsage usage) {
    this.usage = usage;
  }

  public GetSavingsProductsExpenseAccountOptions tagId(GetSavingsAssetTagId tagId) {
    this.tagId = tagId;
    return this;
  }

  /**
   * Get tagId
   *
   * @return tagId
   **/
  @ApiModelProperty(value = "")
  public GetSavingsAssetTagId getTagId() {
    return tagId;
  }

  public void setTagId(GetSavingsAssetTagId tagId) {
    this.tagId = tagId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsProductsExpenseAccountOptions getSavingsProductsExpenseAccountOptions = (GetSavingsProductsExpenseAccountOptions) o;
    return Objects.equals(this.id, getSavingsProductsExpenseAccountOptions.id) &&
            Objects.equals(this.name, getSavingsProductsExpenseAccountOptions.name) &&
            Objects.equals(this.glCode, getSavingsProductsExpenseAccountOptions.glCode) &&
            Objects.equals(this.disabled, getSavingsProductsExpenseAccountOptions.disabled) &&
            Objects.equals(this.manualEntriesAllowed, getSavingsProductsExpenseAccountOptions.manualEntriesAllowed) &&
            Objects.equals(this.type, getSavingsProductsExpenseAccountOptions.type) &&
            Objects.equals(this.usage, getSavingsProductsExpenseAccountOptions.usage) &&
            Objects.equals(this.tagId, getSavingsProductsExpenseAccountOptions.tagId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, glCode, disabled, manualEntriesAllowed, type, usage, tagId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsProductsExpenseAccountOptions {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    manualEntriesAllowed: ").append(toIndentedString(manualEntriesAllowed)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
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

