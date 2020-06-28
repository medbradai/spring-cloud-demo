package com.neoxia.springaws.sns;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SnsNotification {

    private final String subject;

    private final String message;

    @JsonCreator
    public SnsNotification(@JsonProperty("subject") String subject, @JsonProperty("message") String message) {
        this.subject = subject;
        this.message = message;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "SnsNotification{" + "subject='" + this.subject + '\'' + ", message='" + this.message + '\'' + '}';
    }
}
