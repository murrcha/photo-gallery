package com.kkaysheva.photogallery.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * GalleryItem
 *
 * @author Ksenya Kaysheva (murrcha@me.com)
 * @since 08.11.2018
 */
public class GalleryItem {

    @SerializedName("title")
    public String caption;
    @SerializedName("id")
    public String id;
    @SerializedName("url_s")
    public String url;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return caption;
    }
}
