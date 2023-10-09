public class livre {
    private String titre;
    private String auteur;
    private float prix;
    private int ID;
    public livre(String t, String a, float p, int id){
        this.titre = t;
        this.auteur = a;
        this.prix = p;
        this.ID = id;
    }
    public class LivreTest {
        public static void main(String[] args){
            livre L1 = new livre("java","Ali", 500, 9);
            System.out.println("le titre est : " + L1.titre);
        }
    }

}
