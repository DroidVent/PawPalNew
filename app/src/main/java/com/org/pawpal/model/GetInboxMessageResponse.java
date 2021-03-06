package com.org.pawpal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hp-pc on 16-01-2017.
 */
public class GetInboxMessageResponse {
    private String code;
    private String message;
    @SerializedName("data")
    private InboxMessageResponse inboxResponse;
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public InboxMessageResponse getInboxResponse() {
        return inboxResponse;
    }

    public void setInboxResponse(InboxMessageResponse inboxResponse) {
        this.inboxResponse = inboxResponse;
    }
}
