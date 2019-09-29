package com.example.nyt.model; // <============= CHANGE ME

import com.google.gson.annotations.SerializedName;

import java.util.List;

/***
 * Model class for news articles. This should be 100% familiar to you.
 *
 * Week 6
 *  This class now matches what an Article is represented as in the New York Times Most Viewed API.
 */
public class Article {

    // We use a long because the number they use for ID is too big for an int
    private long id;
    private String title;
    private String byline;
    @SerializedName("abstract")
    private String _abstract;
    private String url;
    private Media[] media;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getByline() {
        return byline;
    }

    public String get_abstract() {
        return _abstract;
    }

    public String getUrl() {
        return url;
    }

    public Media[] getMedia() {
        return media;
    }

    public class Media {
        private String type;
        private String caption;
        @SerializedName("media-metadata")
        private MediaMeta[] media_metadata;

        public String getType() {
            return type;
        }

        public String getCaption() {
            return caption;
        }

        public MediaMeta[] getMedia_metadata() {
            return media_metadata;
        }

        public class MediaMeta {
            private String url;

            public String getUrl() {
                return url;
            }
        }
    }

}