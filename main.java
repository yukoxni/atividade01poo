public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10, 5);

        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtracao: " + calc.subtrair());
        System.out.println("Multiplicacao: " + calc.multiplicar());
        System.out.println("Divisao: " + calc.dividir());

        int num = 17;
        if (calc.verificarNumeroPrimo(num)) {
            System.out.println(num + " e um numero primo.");
        } else {
            System.out.println(num + " nao e um numero primo.");
        }
    }
}
