// import java.util.HashMap;
// import java.util.Map; 
// Map<String, Integer> perfs;
// creer: this.perfs = new HashMap<>();
// ajouter: this.perfs.put("DRAME", 50);

public class Auteur {
    private String nom;
    private int perfoTraj;
    private int perfoCom;
    private int perfoDrame;
    private String citTraj;
    private String citCom;
    private String citDrame;

    public Auteur(String nom, int tragedie, int comedie, int drame) {
        this.nom = nom;
        this.perfoTraj = tragedie;
        this.perfoCom = comedie;
        this.perfoDrame = drame;
        this.citTraj = "";
        this.citCom = "";
        this.citDrame = "";
    }

    public Auteur(String nom, int tragedie, String citTraj, int comedie, String citCom, int drame, String citDrame) {
        this.nom = nom;
        this.perfoTraj = tragedie;
        this.perfoCom = comedie;
        this.perfoDrame = drame;
        this.citTraj = citTraj;
        this.citCom = citCom;
        this.citDrame = citDrame;
    }

    public int getQualiteTragedie() {
        return this.perfoTraj;
    }

    public String getCitationTragedie() {
        return this.citTraj;
    }

    public int getQualiteCom() {
        return this.perfoCom;
    }

    public String getCitationCom() {
        return this.citCom;
    }

    public int getQualiteDrame() {
        return this.perfoDrame;
    }

    public String getCitationDrame() {
        return this.citDrame; 
    }


    @Override
    public String toString() {
        return String.format("L'honorable %s ", this.nom);
    }
}