package com.czb.privatetutor.pojo;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer userId2;

    private Integer orderNo;

    private String username;

    private Integer userPhone;

    private String reciverName;

    private Integer reciverPhone;

    private Date createtime;

    private Date endtime;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId2() {
        return userId2;
    }

    public void setUserId2(Integer userId2) {
        this.userId2 = userId2;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public String getReciverName() {
        return reciverName;
    }

    public void setReciverName(String reciverName) {
        this.reciverName = reciverName;
    }

    public Integer getReciverPhone() {
        return reciverPhone;
    }

    public void setReciverPhone(Integer reciverPhone) {
        this.reciverPhone = reciverPhone;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userId2=").append(userId2);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", username=").append(username);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", reciverName=").append(reciverName);
        sb.append(", reciverPhone=").append(reciverPhone);
        sb.append(", createtime=").append(createtime);
        sb.append(", endtime=").append(endtime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}