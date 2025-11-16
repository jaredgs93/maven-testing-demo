package iso2;

public class Triangulo {

    private int i;
    private int j;
    private int k;

    public Triangulo() {}

    public void setI(int x) { this.i = x; }
    public void setJ(int y) { this.j = y; }
    public void setK(int z) { this.k = z; }

    public int getTipo() {

        // No triángulo: desigualdad triangular o valores inválidos
        if (i <= 0 || j <= 0 || k <= 0) {
            return 3; // NT
        }
        if (i + j <= k || i + k <= j || j + k <= i) {
            return 3; // NT
        }

        // Equilátero
        if (i == j && j == k) {
            return 0; // EQ
        }

        // Isósceles
        if (i == j || i == k || j == k) {
            return 1; // IS
        }

        // Escaleno
        return 2; // ES
    }
}
