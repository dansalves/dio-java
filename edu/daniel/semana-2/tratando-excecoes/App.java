import java.security.cert.CertPathBuilderException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        /* Exceções
         * erros de codificaçoes ou de entrada imprevistos e inesperados. Possivel contornar para manter a aplicação ativa
         * Normalmente com erros java para e gera uma mesnagem de erro (exceção)
         * Possível utilizar exceções com tratavis para que o programa continue funcionando mesmo que acontecam problemas que nao se espera
         */ 
        
        try {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobre nome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, meu nome é "+ nome +
        " "+ sobrenome +"e eu tenho "+ idade +
        " anos. Minha altura é de "+ altura +"metros.");
        scanner.close();
        }catch (InputMismatchException e){
            System.out.println("O campo de idade precisa ser numérico! Separador de casa decimais deve ser um '.' !");
        }

        /* O código acima tenta executar o bloco dentro da função "try".
         * Caso capture um erro do tipo "InputMismatchException" (erro de entrada de tipos de dados), então executa o bloco de codigo dentro do "catch" e volta para o bloco try.
         * Controle de fluxo!!
         */

        /* Hieraquia de exceções
         * exceções podem ser chefadas e não checadas.
         */
        
        /* Exceções customizada
         * possivel criar excecoes customizadas de acordo com as regras de negocio desejadas.
         */

        String cepFormatado = formatarCep ("23954827");
    
    }

    static String formatarCep (String cep) throws CepInvalidoException{
        if(cep.length() != 8)
        throw new CertPathBuilderException();

        return "239.548.27";

    }
}
