public class livre {
    private String titre;
    private String auteur;
    private float prix;
    private int ID;
    static int Nb;
    public livre(String t, String a, float p, int id){
        this.titre = t;
        this.auteur = a;
        this.prix = p;
        this.ID = id;
        Nb++;
    }
/*    public class LivreTest {
        public static void main(String[] args){
            livre L1 = new livre("java","Ali", 500, 9);
            System.out.println("le titre est : " + L1.titre);
        }
    }*/
    public void affiche() {
        System.out.println("le titre est : " + this.titre);
    }

    public void settitre(String t) {
        this.titre = t;
    }
    public String gettitre() {
        return this.titre;
    }
    public void setAuteur(String a) {
        this.auteur = a;
    }
    public String getAuteur() {
        return this.auteur;
    }
    public void setprix(float p) {
        this.prix = p;
    }
    public float getprix() {
        return this.prix;
    }
    public void setID(int id) {
        this.ID = id;
    }
    public int getID() {
        return this.ID;
    }
    public String toSting(){
        return ("le livre est : " + this.titre);
    }
}
