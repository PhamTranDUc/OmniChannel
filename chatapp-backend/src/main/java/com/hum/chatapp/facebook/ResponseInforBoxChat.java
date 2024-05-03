package com.hum.chatapp.facebook;
import java.util.List;
public class ResponseInforBoxChat {

    private Messages messages;
    private String id;

    public Messages getMessages() {
        return messages;
    }

    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static class Messages {
        private List<DataEntry> data;
        private Paging paging;

        public List<DataEntry> getData() {
            return data;
        }

        public DataEntry getDataInfor(){
            return data.get(0);
        }

        public void setData(List<DataEntry> data) {
            this.data = data;
        }

        public Paging getPaging() {
            return paging;
        }

        public void setPaging(Paging paging) {
            this.paging = paging;
        }
    }

    public static class DataEntry {
        private String message;
        private From from;
        private To to;
        private String id;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public From getFrom() {
            return from;
        }

        public void setFrom(From from) {
            this.from = from;
        }

        public To getTo() {
            return to;
        }

        public void setTo(To to) {
            this.to = to;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class From {
        private String name;
        private String email;
        private String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class To {
        private List<ToData> data;

        public List<ToData> getData() {
            return data;
        }

        public void setData(List<ToData> data) {
            this.data = data;
        }
    }

    public static class ToData {
        private String name;
        private String email;
        private String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class Paging {
        private Cursors cursors;

        public Cursors getCursors() {
            return cursors;
        }

        public void setCursors(Cursors cursors) {
            this.cursors = cursors;
        }
    }

    public static class Cursors {
        private String before;
        private String after;

        public String getBefore() {
            return before;
        }

        public void setBefore(String before) {
            this.before = before;
        }

        public String getAfter() {
            return after;
        }

        public void setAfter(String after) {
            this.after = after;
        }
    }




}
