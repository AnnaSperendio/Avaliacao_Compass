import java.time.LocalTime;
import java.util.Scanner;

public class PaginaInicial {
    public static void main(String[] args) {
        // Array com os recados para serem passados para o usuário.
        String[] recado = new String[5];
        recado[0] = "Bom dia, você se logou ao nosso sistema.";
        recado[1] = "Boa tarde, você se logou ao nosso sistema.";
        recado[2] = "Boa noite, você se logou ao nosso sistema.";
        recado[3] = "Boa madrugada, você se logou ao nosso sistema.";
        recado[4] = "Usuário e/ou senha incorretos";

        //Usuário Cadastrado.
        String loginCadastrado = "Anna";
        String senhaCadastrada = "123";
        String loginInformado, senhaInformada;

        Scanner dado = new Scanner (System.in);

        //Para realizar Login.
        System.out.print("Informe seu login: ");
        loginInformado = dado.nextLine();
        System.out.print("Informe sua senha: ");
        senhaInformada = dado.nextLine();

        //Verificando se usuário e senha estão corretos.
        if (loginCadastrado.equals(loginInformado)  && senhaCadastrada.equals(senhaInformada)){
            System.out.println("Você está Logado" + loginInformado);
        }else{
               System.out.println(" " + recado[4]);
           }
        //Condição para que o usuário receba a saudação ao realizar login.
        LocalTime agora = LocalTime.now();
      if (!LocalTime.of(6, 0).isAfter(agora) && agora.isBefore(LocalTime.of(11,59))){
            System.out.println(" " + recado[0]);
        } else if (!LocalTime.of(12,0).isAfter(agora) && agora.isBefore(LocalTime.of(17,59))) {
            System.out.println(" " + recado[1]);
        } else if (!LocalTime.of(18,0).isAfter(agora) && agora.isBefore(LocalTime.of(23,59))) {
            System.out.println(" " + recado[2]);
        } else if (!LocalTime.of(0,0).isAfter(agora) && agora.isBefore(LocalTime.of(5,59))) {
            System.out.println(" " + recado[3]);
        }
    }
}





