public class LivreTest {
    public static void main(String[] args){
        livre L1 = new livre("java","Ali", 50, 9);
        L1.affiche();
        L1.settitre("Python");
        L1.gettitre();
        L1.affiche();
        livre L2 = new livre("PHP","Imed", 40, 8);
        System.out.println("nombre de livre : " + livre.Nb);
        System.out.println(L1);
    }
}