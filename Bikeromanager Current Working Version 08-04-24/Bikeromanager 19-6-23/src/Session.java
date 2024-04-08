import java.util.Date;

public class Session {

    private String name; // e.g. Saturday Skills Session
    private Date date; // e.g. 28/10/23 (Combobox up to 31/12/9999)
    private String startTime; // e.g. 11:00 (Combobox 00: to 23: and every :15)
    private String endTime; // e.g. 13:00 (Combobox 00: to 23: and every :15)
    private char skillLevel; // Novice, Intermediate, Expert (Combobox)
    private char genders; // All, Female only, Male only (Combobox)
    private char sessionType; // General, Race, Skill (Combobox)
    private String sessionLeader; // e.g. Silvia
    private String extraInfo; // extra information about session

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

    public String getName() {
        return name;
    }

    //public void setName(String name) {
    //    this.name = name;
    //}

    public Date getDate() {return date;}

    //public void setDate(int date) {
    //    this.date = date;
    //}

    public String getStartTime() {
        return startTime;
    }

    //public void setStartTime(int startTime) {
    //    this.startTime = startTime;
    //}

    public String getEndTime() {
        return endTime;
    }

    //public void setEndTime(int endTime) {
    //    this.endTime = endTime;
    //}

    public char getSkillLevel() {
        return skillLevel;
    }

    //public void setSkillLevel(char skillLevel) {
    //   this.skillLevel = skillLevel;
    //}

    public char getGenders() {
        return genders;
    }

    //public void setGenders(char genders) {
    //    this.genders = genders;
    //}

    public char getSessionType() {
        return sessionType;
    }

    //public void setSessionType(char sessionType) {
    //    this.sessionType = sessionType;
    //}

    public String getSessionLeader() { return sessionLeader; }

    //public void setSessionLeader(String sessionLeader) {
    //    this.sessionLeader = sessionLeader;
    //}

    public String getExtraInfo() {
        return extraInfo;
    }

    //public void setExtraInfo(String extraInfo) {
    //    this.extraInfo = extraInfo;
    //}
}

