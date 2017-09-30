package com.machinser.portfolio.models;

import com.google.firebase.database.ServerValue;
import com.machinser.portfolio.utils.FeedTypes;

import java.util.Date;
import java.util.Map;

/**
 * Created by asnim on 11/06/17.
 */

public class Feed {


    public String event_title;
    public String event_body;
    public int event_category;
    public Object date_created;



    public String getEvent_image() {
        return event_image;
    }

    public void setEvent_image(String event_image) {
        this.event_image = event_image;
    }
    public String event_image;


    public String getEvent_title() {
        return event_title;
    }

    public void setEvent_title(String event_title) {
        this.event_title = event_title;
    }

    public String getEvent_body() {
        return event_body;
    }

    public void setEvent_body(String event_body) {
        this.event_body = event_body;
    }
    public Feed(String event_title,String event_body){
        this.event_body = event_body;
        this.event_category = FeedTypes.NEWS;
        this.event_title =  event_title;
        this.date_created = ServerValue.TIMESTAMP;
        this.event_image = null;

    }public Feed(String event_title,String event_body,int event_category){
        this.event_body = event_body;
        this.event_category = event_category;
        this.event_title =  event_title;
        this.date_created = ServerValue.TIMESTAMP;
        this.event_image = null;
    }
    public Feed(){

    }

}
