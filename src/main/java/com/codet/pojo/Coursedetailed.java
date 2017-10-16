package com.codet.pojo;

public class Coursedetailed {
    private Integer coursedetailedid;

    private Integer courseid;

    private String title;

    private String info;

    private String link;

    public Integer getCoursedetailedid() {
        return coursedetailedid;
    }

    public void setCoursedetailedid(Integer coursedetailedid) {
        this.coursedetailedid = coursedetailedid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }
}