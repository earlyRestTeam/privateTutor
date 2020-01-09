package com.czb.privatetutor.pojo;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {
    private Integer userid;

    private String username;

    private String userpwd;

    private String nickname;

    private String email;

    private String phone;

    private String avatar;

    private Integer isteacher;

    private Date createtime;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getIsteacher() {
        return isteacher;
    }

    public void setIsteacher(Integer isteacher) {
        this.isteacher = isteacher;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", userpwd=").append(userpwd);
        sb.append(", nickname=").append(nickname);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", avatar=").append(avatar);
        sb.append(", isteacher=").append(isteacher);
        sb.append(", createtime=").append(createtime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}