public enum MomentJournee {
    MATIN ("matin"),
    APRESMIDI ("apresmidi"),
    SOIR ("soir");

    private String matin;
    private String apresmidi;
    private String soir;

    private MomentJournee(String matin, String apresmidi, String soir) {
        this.matin = matin;
        this.apresmidi = apresmidi;
        this.soir = soir;
    }
}
