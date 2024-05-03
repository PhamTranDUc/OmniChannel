package com.hum.chatapp.dto;

import java.util.List;

public class WebHookPayLoad {
    private String object;
    private List<Entry> entry;

    // Getters và setters
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<Entry> getEntry() {
        return entry;
    }

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }

    // Lớp Entry
    public static class Entry {
        private long time;
        private String id;
        private List<Messaging> messaging;

        // Getters và setters
        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<Messaging> getMessaging() {
            return messaging;
        }

        public void setMessaging(List<Messaging> messaging) {
            this.messaging = messaging;
        }
    }

    // Lớp Messaging
    public static class Messaging {
        private Sender sender;
        private Recipient recipient;
        private long timestamp;
        private Message message;

        // Getters và setters
        public Sender getSender() {
            return sender;
        }

        public void setSender(Sender sender) {
            this.sender = sender;
        }

        public Recipient getRecipient() {
            return recipient;
        }

        public void setRecipient(Recipient recipient) {
            this.recipient = recipient;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        public Message getMessage() {
            return message;
        }

        public void setMessage(Message message) {
            this.message = message;
        }
    }

    // Lớp Sender
    public static class Sender {
        private String id;

        // Getters và setters
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    // Lớp Recipient
    public static class Recipient {
        private String id;

        // Getters và setters
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    // Lớp Message
    public static class Message {
        private String mid;
        private String text;

        // Getters và setters
        public String getMid() {
            return mid;
        }

        public void setMid(String mid) {
            this.mid = mid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
