package com.fachryikhsal.navdrawfromscratch;


public class Profile {
    public Profile(String name
            , int durationWork
            , int durationBreak
            , int durationLongBreak
            , int sessionsBeforeLongBreak) {
        this.name = name;
        this.durationWork = durationWork;
        this.durationBreak = durationBreak;
        this.enableLongBreak = true;
        this.durationLongBreak = durationLongBreak;
        this.sessionsBeforeLongBreak = sessionsBeforeLongBreak;
    }

    public String name;

    public int durationWork;
    public int durationBreak;

    public boolean enableLongBreak;
    public int durationLongBreak;
    public int sessionsBeforeLongBreak;
}
