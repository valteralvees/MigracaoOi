package migracaooi;
import java.util.Scanner;
/* IMPLEMENTAÇÕES A SEREM FEITAS
1- 
*/
public class MigracaoOi {

    public static void main(String[] args) {
        // TODO code application logic here
        int menu1; int ddd; double numeroTelefone; boolean migrado = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo ao processo eletrônico de migração de operadora - OI");
        System.out.println("Por favor, digite o número do seu DDD:");
        ddd = teclado.nextInt();
        System.out.println("Agora, digite os 9 dígitos do seu Oi:");
        numeroTelefone = teclado.nextDouble();
        if (migrado == true){
            System.out.println("Vimos que o seu processo de migração /*para a [operadora]*/ foi iniciado. O que deseja fazer?");
            System.out.println("==========================================");
            System.out.println("1- VERIFICAR SITUAÇÃO DE MIGRAÇÃO");
            System.out.println("2- CANCELAR PROCESSO DE MIGRAÇÃO");
            System.out.println("==========================================");
        } else {
            
        }
        System.out.println("O que você deseja?");
        System.out.println("==========================================");
        System.out.println("1- VERIFICAR SITUAÇÃO DE MIGRAÇÃO");
        System.out.println("2- INICIAR PROCESSO DE MIGRAÇÃO");
        System.out.println("==========================================");
        menu1 = teclado.nextInt();
        switch (menu1) {
            case 1:
                System.out.println("");
        }
        

    }
    
}
