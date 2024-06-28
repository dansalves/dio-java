public class AboutMe {

  public static void main(String[] args) {
    
    String nome = args[0];
    String sobrenome = args[1];
    int idade = Integer.valueOf(args[2]);
    double altura = Float.valueOf(args[3]);

    System.out.println("Ola, meu nome é " + nome + " " + sobrenome + " e tenho " + idade + " anos. Minha altura é "
        + String.format("%.2f", altura) + " metros.");
  }
}