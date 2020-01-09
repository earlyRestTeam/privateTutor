package com.czb.privatetutor.pojo;

import java.io.Serializable;
import java.util.Date;

public class JobInformation implements Serializable {
    private Integer id;

    private Integer publisherId;

    private String title;

    private String content;

    private Date teachtime;

    private String address;

    private String teachexperience;

    private String publisherName;

    private Date createtime;

    private String teachsubject;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTeachtime() {
        return teachtime;
    }

    public void setTeachtime(Date teachtime) {
        this.teachtime = teachtime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTeachexperience() {
        return teachexperience;
    }

    public void setTeachexperience(String teachexperience) {
        this.teachexperience = teachexperience;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTeachsubject() {
        return teachsubject;
    }

    public void setTeachsubject(String teachsubject) {
        this.teachsubject = teachsubject;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", publisherId=").append(publisherId);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", teachtime=").append(teachtime);
        sb.append(", address=").append(address);
        sb.append(", teachexperience=").append(teachexperience);
        sb.append(", publisherName=").append(publisherName);
        sb.append(", createtime=").append(createtime);
        sb.append(", teachsubject=").append(teachsubject);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}