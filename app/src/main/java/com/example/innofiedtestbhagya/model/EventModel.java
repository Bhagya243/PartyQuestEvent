package com.example.innofiedtestbhagya.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventModel {
    @SerializedName("post_event_id")
    @Expose
    private String postEventId;
    @SerializedName("event_name")
    @Expose
    private String eventName;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("end_time")
    @Expose
    private String endTime;
    @SerializedName("from_age")
    @Expose
    private String fromAge;
    @SerializedName("to_age")
    @Expose
    private String toAge;
    @SerializedName("event_venue")
    @Expose
    private String eventVenue;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("event_flyer")
    @Expose
    private String eventFlyer;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("long1")
    @Expose
    private String long1;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("color")
    @Expose
    private String color;

    public String getPostEventId() {
        return postEventId;
    }

    public void setPostEventId(String postEventId) {
        this.postEventId = postEventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getFromAge() {
        return fromAge;
    }

    public void setFromAge(String fromAge) {
        this.fromAge = fromAge;
    }

    public String getToAge() {
        return toAge;
    }

    public void setToAge(String toAge) {
        this.toAge = toAge;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEventFlyer() {
        return eventFlyer;
    }

    public void setEventFlyer(String eventFlyer) {
        this.eventFlyer = eventFlyer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLong1() {
        return long1;
    }

    public void setLong1(String long1) {
        this.long1 = long1;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
