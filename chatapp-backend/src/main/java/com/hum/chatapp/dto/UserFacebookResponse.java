package com.hum.chatapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
public class UserFacebookResponse {
    private String name;
    private Picture picture;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static class Picture {
        private PictureData data;

        public PictureData getData() {
            return data;
        }

        public void setData(PictureData data) {
            this.data = data;
        }
    }

    public static class PictureData {
        private int height;
        private boolean is_silhouette;
        private String url;
        private int width;

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public boolean isIs_silhouette() {
            return is_silhouette;
        }

        public void setIs_silhouette(boolean is_silhouette) {
            this.is_silhouette = is_silhouette;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }
}
