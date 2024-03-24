public class Calculadora {
    private int numA;
    private int numB;

    public Calculadora(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int somar() {
        return numA + numB;
    }

    public int subtrair() {
        return numA - numB;
    }

    public int multiplicar() {
        return numA * numB;
    }

    public double dividir() {
        if (numB != 0) {
            return (double) numA / numB;
        } else {
            System.out.println("Erro: Divisao por zero.");
            return Double.NaN;
        }
    }

    public boolean verificarNumeroPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
