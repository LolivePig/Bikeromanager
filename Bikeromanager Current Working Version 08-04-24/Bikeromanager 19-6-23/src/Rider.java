public class Rider {
    private String name; // e.g. Ben McXavier
    private boolean member; // member - true, non-member - false
    private int skillLevel; // novice - 1, intermediate - 2, expert - 3
    private int bikeSize; // micro mini to pro XXL - 1 to approx 10
    private int age; // 4 to 99
    private int gender; // male - 1, female - 2, other - 3
    private int numberOfSessionsPaid; // not per session, too complicated
    private boolean ownKit; // has own bike and kit - true, lacking anything - false
    private String extraInfo; // extra information about rider

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
}