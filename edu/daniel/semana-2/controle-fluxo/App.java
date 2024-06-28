public class App {

  public static void main(String[] args) {

    int idade = 18;

    // condicional simples/composta/ecadeada
    if (idade >= 18)
      System.out.println("Maior de idade");
    else
      System.out.println("Menor de idade");

    boolean menorAprendiz = false;
    boolean clt = false;

    // condicional switch-case
    switch (idade) {
      case idade >= 15:
        menorAprendiz = true;
      case idade < 15:
        menorAprendiz = false;
      case idade >= 18:
        clt = true;
      case idade < 18:
        clt = false;

        // condicional ternario
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

    }
  }
}
