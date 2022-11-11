package com.example.oauthd.NetWork;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class user {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("client_id")
    @Expose
    private String clientId;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("real_name")
    @Expose
    private String realName;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("sex")
    @Expose
    private String sex;
    @SerializedName("default_avatar_id")
    @Expose
    private String defaultAvatarId;
    @SerializedName("is_avatar_empty")
    @Expose
    private Boolean isAvatarEmpty;
    @SerializedName("psuid")
    @Expose
    private String psuid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDefaultAvatarId() {
        return defaultAvatarId;
    }

    public void setDefaultAvatarId(String defaultAvatarId) {
        this.defaultAvatarId = defaultAvatarId;
    }

    public Boolean getIsAvatarEmpty() {
        return isAvatarEmpty;
    }

    public void setIsAvatarEmpty(Boolean isAvatarEmpty) {
        this.isAvatarEmpty = isAvatarEmpty;
    }

    public String getPsuid() {
        return psuid;
    }

    public void setPsuid(String psuid) {
        this.psuid = psuid;
    }

}
