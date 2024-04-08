public class SessionLeader {

    private String name; // e.g. Silvia
    private int trainerLevel; //e.g. 1-5 or something
    private boolean trainerCertificateRenewed; // true/false
    private char gender; // Female/Male/Other

    public SessionLeader(String name, int trainerLevel, boolean trainerCertificateRenewed, char gender) {
        this.name = name;
        this.trainerLevel = trainerLevel;
        this.trainerCertificateRenewed = trainerCertificateRenewed;
        this.gender = gender;
    }
}
