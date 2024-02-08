public enum Journee {
    MATIN ("matin"),
    APRESMIDI ("apresmidi"),
    SOIR ("soir");

    private String matin;
    private String apresmidi;
    private String soir;

    private Journee(String matin, String apresmidi, String soir) {
        this.matin = matin;
        this.apresmidi = apresmidi;
        this.soir = soir;
    }
}
