public class Rectangle {
    private float largeur;
    private float longueur;

    public Rectangle(float largeur, float longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public float perimetre() {
        return 2 * (largeur + longueur);
    }

    public double diagonale() {
        return Math.sqrt(largeur * largeur + longueur * longueur);
    }

    public float doubler() {
        return 2 * longueur;
    }
}
