package com.georgethepig.bikeromanager.session;

import java.util.Date;
import java.util.Objects;

public class Session {

    public Session (String name, Date date, String startTime, String endTime, char skillLevel,
                    char genders, char sessionType, String sessionLeader, String extraInfo) {
        this.name = name;
        this.date = date; //flook suggestion: use date class to calculate days between now and session
        this.startTime = startTime;
        this.endTime = endTime;
        this.skillLevel = skillLevel;
        this.genders = genders;
        this.sessionType = sessionType;
        this.sessionLeader = sessionLeader;
        this.extraInfo = extraInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Session session = (Session) o;
        return skillLevel == session.skillLevel && genders == session.genders && sessionType == session.sessionType && Objects.equals(name, session.name) && Objects.equals(date, session.date) && Objects.equals(startTime, session.startTime) && Objects.equals(endTime, session.endTime) && Objects.equals(sessionLeader, session.sessionLeader) && Objects.equals(extraInfo, session.extraInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, startTime, endTime, skillLevel, genders, sessionType, sessionLeader, extraInfo);
    }

    @Override
    public String toString() {
        return "Session{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", skillLevel=" + skillLevel +
                ", genders=" + genders +
                ", sessionType=" + sessionType +
                ", sessionLeader='" + sessionLeader + '\'' +
                ", extraInfo='" + extraInfo + '\'' +
                '}';
    }

    private String name; // e.g. Saturday Skills Session
    private Date date; // e.g. 28/10/23 (Combobox up to 31/12/9999)
    private String startTime; // e.g. 11:00 (Combobox 00: to 23: and every :15)
    private String endTime; // e.g. 13:00 (Combobox 00: to 23: and every :15)
    private char skillLevel; // Novice, Intermediate, Expert (Combobox)
    private char genders; // All, Female only, Male only (Combobox)
    private char sessionType; // General, Race, Skill (Combobox)
    private String sessionLeader; // e.g. Silvia
    private String extraInfo; // extra information about session

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Date getDate() {return date;}
    public void setDate(Date date) {this.date = date;}

    public String getStartTime() {return startTime;}
    public void setStartTime(String startTime) {this.startTime = startTime;}

    public String getEndTime() {return endTime;}
    public void setEndTime(String endTime) {this.endTime = endTime;}

    public char getSkillLevel() {return skillLevel;}
    public void setSkillLevel(char skillLevel) {this.skillLevel = skillLevel;}

    public char getGenders() {return genders;}
    public void setGenders(char genders) {this.genders = genders;}

    public char getSessionType() {return sessionType;}
    public void setSessionType(char sessionType) {this.sessionType = sessionType;}

    public String getSessionLeader() {return sessionLeader;}
    public void setSessionLeader(String sessionLeader) {this.sessionLeader = sessionLeader;}

    public String getExtraInfo() {return extraInfo;}
    public void setExtraInfo(String extraInfo) {this.extraInfo = extraInfo;}
}