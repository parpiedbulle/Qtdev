public class Auteur {
    private String nom;
    private int perfoTraj;
    private int perfoCom;
    private int perfoDrame;

    public Auteur(String nom, int tragedie, int comedie, int drame) {
        this.nom = nom;
        this.perfoTraj = tragedie;
        this.perfoCom = comedie;
        this.perfoDrame = drame;
    }

    public Auteur(String nom, int tragedie, String citationtraj, int comedie, String citationCom, int drame, String citationDrame) {
        this.nom = nom;
        this.perfoTraj = tragedie;
        this.perfoCom = comedie;
        this.perfoDrame = drame;
    }

    public int getQualiteTragedie() {
        return this.perfoTraj;
    }

}