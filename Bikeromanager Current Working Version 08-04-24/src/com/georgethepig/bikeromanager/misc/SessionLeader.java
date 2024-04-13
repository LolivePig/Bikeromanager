package com.georgethepig.bikeromanager.misc;

import java.util.Objects;

public class SessionLeader {

    public SessionLeader(String name, int trainerLevel, boolean trainerCertificateRenewed, char gender) {
        this.name = name;
        this.trainerLevel = trainerLevel;
        this.trainerCertificateRenewed = trainerCertificateRenewed;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SessionLeader that = (SessionLeader) o;
        return trainerLevel == that.trainerLevel && trainerCertificateRenewed == that.trainerCertificateRenewed && gender == that.gender && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, trainerLevel, trainerCertificateRenewed, gender);
    }

    @Override
    public String toString() {
        return "SessionLeader{" +
                "name='" + name + '\'' +
                ", trainerLevel=" + trainerLevel +
                ", trainerCertificateRenewed=" + trainerCertificateRenewed +
                ", gender=" + gender +
                '}';
    }

    private String name; // e.g. Silvia
    private int trainerLevel; //e.g. 1-5 or something
    private boolean trainerCertificateRenewed; // true/false
    private char gender; // Female/Male/Other

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getTrainerLevel() {return trainerLevel;}
    public void setTrainerLevel(int trainerLevel) {this.trainerLevel = trainerLevel;}

    public boolean isTrainerCertificateRenewed() {return trainerCertificateRenewed;}
    public void setTrainerCertificateRenewed(boolean trainerCertificateRenewed) {this.trainerCertificateRenewed = trainerCertificateRenewed;}

    public char getGender() {return gender;}
    public void setGender(char gender) {this.gender = gender;}
}