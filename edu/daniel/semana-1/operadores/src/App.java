public class App {
    public static void main(String[] args) throws Exception {
        // operadores

        double soma = 10.5 + 15.4;
        int subtracao = 113-25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 14 % 2;
        String concat = "LINGUAGEM" + "JAVA";

        // operadores unarios

        int num = 10;
        num ++; // agora num tem valor 11
        num --; // voltou a ser 10
        num = - num; // num = -10
        num = + num; // num = 10
        boolean variavel = true;
        variavel = !variavel; // variavel agora é false

        // operador ternario

        boolean a = true;
        boolean b = false;
        String resultado = a==b ? "verdadeiro":"falso"; // se a igual a b entao resultado recebe "verdadeiro", se nao entao recebe "falso"

        // operadores relacionais

        int num1 = 1;
        int num2 = 2;
        boolean teste = num1 == num2; // teste = false
        teste = num1 != num2; // teste = true
        teste = num1 < num2; // teste = true

        // operadores logicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) 
            System.out.println("as duas condições são verdadeiras");
        if (condicao1 || ocndicao2)
            System.out.println("uma das condições é verdadeira");
    }
}
