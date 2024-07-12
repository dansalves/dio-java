public class App {

  public static void main(String[] args) {
    // exemplo fluxos em for
    for (int i=0;i<10;i++){
      System.out.println("Eu sou a repetição de número: "+i);
    }

    // for em Arrays
  String nomes[] = {"Maria", "João", "Daniel"};

    for (int i=0; i<nomes.length; i++ ) {
      System.out.println("Aluno "+i+": "+nomes[i]);
    }

    for (String nome : nomes){
      System.out.println("Aluno: "+nome);
    }

    //break e conntinue
    for (int i=1;i<5;i++)
      if(i == 3)
        break; //poderia ser um continue
  
    //while
    int num=0;
    while (num!=10) {
      System.out.println("Iteração de numero: "+num);
      num++;
    }
    
    //do while
    int x=0;

    do{
      System.out.println("Iteração de número: "+x);
      x++;
    }while(x<=10);

   }

}