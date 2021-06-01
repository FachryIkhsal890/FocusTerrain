package com.fachryikhsal.navdrawfromscratch;

public class HistoryData {
//    public HistoryData(long id, long timestamp, int duration) {
//        this.id = id;
//        this.timestamp = timestamp;
//        this.duration = duration;
//    }

    private long id;
    private long timestamp;
    private long duration;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
