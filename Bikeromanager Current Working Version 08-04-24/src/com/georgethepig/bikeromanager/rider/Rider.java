package com.georgethepig.bikeromanager.rider;

import java.util.Objects;

public class Rider {

    public Rider (String name, boolean member, int skillLevel, int bikeSize, int age, int gender, int numberOfSessionsPaid,
                  boolean ownKit, String extraInfo) {
        this.name = name;
        this.member = member;
        this.skillLevel = skillLevel;
        this.bikeSize = bikeSize;
        this.age = age;
        this.gender = gender;
        this.numberOfSessionsPaid = numberOfSessionsPaid;
        this.ownKit = ownKit;
        this.extraInfo = extraInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rider rider = (Rider) o;
        return member == rider.member && skillLevel == rider.skillLevel && bikeSize == rider.bikeSize && age == rider.age && gender == rider.gender && numberOfSessionsPaid == rider.numberOfSessionsPaid && ownKit == rider.ownKit && Objects.equals(name, rider.name) && Objects.equals(extraInfo, rider.extraInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, member, skillLevel, bikeSize, age, gender, numberOfSessionsPaid, ownKit, extraInfo);
    }

    @Override
    public String toString() {
        return "Rider{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", skillLevel=" + skillLevel +
                ", bikeSize=" + bikeSize +
                ", age=" + age +
                ", gender=" + gender +
                ", numberOfSessionsPaid=" + numberOfSessionsPaid +
                ", ownKit=" + ownKit +
                ", extraInfo='" + extraInfo + '\'' +
                '}';
    }

    private String name; // e.g. Ben McXavier
    private boolean member; // member - true, non-member - false
    private int skillLevel; // novice - 1, intermediate - 2, expert - 3
    private int bikeSize; // micro mini to pro XXL - 1 to approx 10
    private int age; // 4 to 99
    private int gender; // male - 1, female - 2, other - 3
    private int numberOfSessionsPaid; // not per session, too complicated
    private boolean ownKit; // has own bike and kit - true, lacking anything - false
    private String extraInfo; // extra information about rider

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public boolean isMember() {return member;}
    public void setMember(boolean member) {this.member = member;}

    public int getSkillLevel() {return skillLevel;}
    public void setSkillLevel(int skillLevel) {this.skillLevel = skillLevel;}

    public int getBikeSize() {return bikeSize;}
    public void setBikeSize(int bikeSize) {this.bikeSize = bikeSize;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public int getGender() {return gender;}
    public void setGender(int gender) {this.gender = gender;}

    public int getNumberOfSessionsPaid() {return numberOfSessionsPaid;}
    public void setNumberOfSessionsPaid(int numberOfSessionsPaid) {this.numberOfSessionsPaid = numberOfSessionsPaid;}

    public boolean isOwnKit() {return ownKit;}
    public void setOwnKit(boolean ownKit) {this.ownKit = ownKit;}

    public String getExtraInfo() {return extraInfo;}
    public void setExtraInfo(String extraInfo) {this.extraInfo = extraInfo;}
}