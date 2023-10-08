public class TestRectangle {
    public static void main(String[] args) {

        // Test Rectangle avec une largeur de 4 et une longueur de 3
        Rectangle testRectangle = new Rectangle(4.0f, 3.0f);

        float perimetre = testRectangle.perimetre();
        System.out.println("Périmètre du rectangle : " + perimetre);

        double diagonale = testRectangle.diagonale();
        System.out.println("Diagonale du rectangle : " + diagonale);

        float doubler = testRectangle.doubler();
        System.out.println("longueur doublé : " + doubler);
    }
}