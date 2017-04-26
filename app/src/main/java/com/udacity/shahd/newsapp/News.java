package com.udacity.shahd.newsapp;

/**
 * Created by shahd on 4/26/17.
 */

public class News {
    private String webTitle;
    private String trailText;
    private String sectionName;
    private String webPublicationDate;

    public News(String webTitle, String trailText, String sectionName, String webPublicationDate) {
        this.webTitle = webTitle;
        this.trailText = trailText;
        this.sectionName = sectionName;
        this.webPublicationDate = webPublicationDate;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public String getTrailText() {
        return trailText;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }
}
