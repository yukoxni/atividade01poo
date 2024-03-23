package atividade01;

public class Calculadora {

     int numA;
     int numB;

    public int somar() {
        return numA + numB;
    }

    public int subtrair() {
        return numA - numB;
    }

    public int multiplicar() {
        return numA * numB;
    }

    public int dividir() {    
        return numA / numB;
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