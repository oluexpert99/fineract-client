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
 * PostSelfAuthenticationResponse
 */

public class PostSelfAuthenticationResponse {
    @SerializedName("username")
    private String username = null;

    @SerializedName("userId")
    private Integer userId = null;

    @SerializedName("base64EncodedAuthenticationKey")
    private String base64EncodedAuthenticationKey = null;

    @SerializedName("authenticated")
    private Boolean authenticated = null;

    @SerializedName("officeId")
    private Integer officeId = null;

    @SerializedName("officeName")
    private String officeName = null;

    @SerializedName("staffId")
    private Integer staffId = null;

    @SerializedName("staffDisplayName")
    private String staffDisplayName = null;

    @SerializedName("organisationalRole")
    private GetSelfUserDetailsOrganisationalRole organisationalRole = null;

    @SerializedName("roles")
    private List<GetSelfUserDetailsRoles> roles = null;

    @SerializedName("permissions")
    private List<String> permissions = null;

    @SerializedName("isSelfServiceUser")
    private Boolean isSelfServiceUser = null;

    @SerializedName("clients")
    private List<Integer> clients = null;

    public PostSelfAuthenticationResponse username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get username
     *
     * @return username
     **/
    @ApiModelProperty(example = "mifos", value = "")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public PostSelfAuthenticationResponse userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     *
     * @return userId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public PostSelfAuthenticationResponse base64EncodedAuthenticationKey(String base64EncodedAuthenticationKey) {
        this.base64EncodedAuthenticationKey = base64EncodedAuthenticationKey;
        return this;
    }

    /**
     * Get base64EncodedAuthenticationKey
     *
     * @return base64EncodedAuthenticationKey
     **/
    @ApiModelProperty(example = "bWlmb3M6cGFzc3dvcmQ=", value = "")
    public String getBase64EncodedAuthenticationKey() {
        return base64EncodedAuthenticationKey;
    }

    public void setBase64EncodedAuthenticationKey(String base64EncodedAuthenticationKey) {
        this.base64EncodedAuthenticationKey = base64EncodedAuthenticationKey;
    }

    public PostSelfAuthenticationResponse authenticated(Boolean authenticated) {
        this.authenticated = authenticated;
        return this;
    }

    /**
     * Get authenticated
     *
     * @return authenticated
     **/
    @ApiModelProperty(example = "true", value = "")
    public Boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }

    public PostSelfAuthenticationResponse officeId(Integer officeId) {
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

    public PostSelfAuthenticationResponse officeName(String officeName) {
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

    public PostSelfAuthenticationResponse staffId(Integer staffId) {
        this.staffId = staffId;
        return this;
    }

    /**
     * Get staffId
     *
     * @return staffId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public PostSelfAuthenticationResponse staffDisplayName(String staffDisplayName) {
        this.staffDisplayName = staffDisplayName;
        return this;
    }

    /**
     * Get staffDisplayName
     *
     * @return staffDisplayName
     **/
    @ApiModelProperty(example = "Director, Program", value = "")
    public String getStaffDisplayName() {
        return staffDisplayName;
    }

    public void setStaffDisplayName(String staffDisplayName) {
        this.staffDisplayName = staffDisplayName;
    }

    public PostSelfAuthenticationResponse organisationalRole(GetSelfUserDetailsOrganisationalRole organisationalRole) {
        this.organisationalRole = organisationalRole;
        return this;
    }

    /**
     * Get organisationalRole
     *
     * @return organisationalRole
     **/
    @ApiModelProperty(value = "")
    public GetSelfUserDetailsOrganisationalRole getOrganisationalRole() {
        return organisationalRole;
    }

    public void setOrganisationalRole(GetSelfUserDetailsOrganisationalRole organisationalRole) {
        this.organisationalRole = organisationalRole;
    }

    public PostSelfAuthenticationResponse roles(List<GetSelfUserDetailsRoles> roles) {
        this.roles = roles;
        return this;
    }

    public PostSelfAuthenticationResponse addRolesItem(GetSelfUserDetailsRoles rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<GetSelfUserDetailsRoles>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    /**
     * Get roles
     *
     * @return roles
     **/
    @ApiModelProperty(value = "")
    public List<GetSelfUserDetailsRoles> getRoles() {
        return roles;
    }

    public void setRoles(List<GetSelfUserDetailsRoles> roles) {
        this.roles = roles;
    }

    public PostSelfAuthenticationResponse permissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    public PostSelfAuthenticationResponse addPermissionsItem(String permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<String>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Get permissions
     *
     * @return permissions
     **/
    @ApiModelProperty(example = "\"ALL_FUNCTIONS\"", value = "")
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public PostSelfAuthenticationResponse isSelfServiceUser(Boolean isSelfServiceUser) {
        this.isSelfServiceUser = isSelfServiceUser;
        return this;
    }

    /**
     * Get isSelfServiceUser
     *
     * @return isSelfServiceUser
     **/
    @ApiModelProperty(example = "true", value = "")
    public Boolean isIsSelfServiceUser() {
        return isSelfServiceUser;
    }

    public void setIsSelfServiceUser(Boolean isSelfServiceUser) {
        this.isSelfServiceUser = isSelfServiceUser;
    }

    public PostSelfAuthenticationResponse clients(List<Integer> clients) {
        this.clients = clients;
        return this;
    }

    public PostSelfAuthenticationResponse addClientsItem(Integer clientsItem) {
        if (this.clients == null) {
            this.clients = new ArrayList<Integer>();
        }
        this.clients.add(clientsItem);
        return this;
    }

    /**
     * Get clients
     *
     * @return clients
     **/
    @ApiModelProperty(example = "\"1, 2, 3\"", value = "")
    public List<Integer> getClients() {
        return clients;
    }

    public void setClients(List<Integer> clients) {
        this.clients = clients;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostSelfAuthenticationResponse postSelfAuthenticationResponse = (PostSelfAuthenticationResponse) o;
        return Objects.equals(this.username, postSelfAuthenticationResponse.username) &&
                Objects.equals(this.userId, postSelfAuthenticationResponse.userId) &&
                Objects.equals(this.base64EncodedAuthenticationKey, postSelfAuthenticationResponse.base64EncodedAuthenticationKey) &&
                Objects.equals(this.authenticated, postSelfAuthenticationResponse.authenticated) &&
                Objects.equals(this.officeId, postSelfAuthenticationResponse.officeId) &&
                Objects.equals(this.officeName, postSelfAuthenticationResponse.officeName) &&
                Objects.equals(this.staffId, postSelfAuthenticationResponse.staffId) &&
                Objects.equals(this.staffDisplayName, postSelfAuthenticationResponse.staffDisplayName) &&
                Objects.equals(this.organisationalRole, postSelfAuthenticationResponse.organisationalRole) &&
                Objects.equals(this.roles, postSelfAuthenticationResponse.roles) &&
                Objects.equals(this.permissions, postSelfAuthenticationResponse.permissions) &&
                Objects.equals(this.isSelfServiceUser, postSelfAuthenticationResponse.isSelfServiceUser) &&
                Objects.equals(this.clients, postSelfAuthenticationResponse.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, userId, base64EncodedAuthenticationKey, authenticated, officeId, officeName, staffId, staffDisplayName, organisationalRole, roles, permissions, isSelfServiceUser, clients);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostSelfAuthenticationResponse {\n");

        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    base64EncodedAuthenticationKey: ").append(toIndentedString(base64EncodedAuthenticationKey)).append("\n");
        sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
        sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
        sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
        sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
        sb.append("    staffDisplayName: ").append(toIndentedString(staffDisplayName)).append("\n");
        sb.append("    organisationalRole: ").append(toIndentedString(organisationalRole)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    isSelfServiceUser: ").append(toIndentedString(isSelfServiceUser)).append("\n");
        sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
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

