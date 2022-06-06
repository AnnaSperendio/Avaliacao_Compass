import java.util.Scanner;
public class CadastroDeFuncionarios {
    public static void main(String[] args) {
            int quantidadeDeFuncionarios;

            //Recebendo a quantidade de funcionários que serão cadastrados.
            Scanner dado = new Scanner(System.in);
            System.out.println("Quantos funcionários serão cadastrados?");
            quantidadeDeFuncionarios = dado.nextInt();

            //Declarando Arrays.
            Double[] porcentagem = new Double[quantidadeDeFuncionarios];
            String[] nome = new String[quantidadeDeFuncionarios];
            Double[] salario = new Double[quantidadeDeFuncionarios];
            Double[] salarioLiquido = new Double[quantidadeDeFuncionarios];
            for (int i = 0; i < nome.length; i++) {
                System.out.println("Adicione seu funcionário: ");
                nome[0] = dado.next();
                System.out.println("Adicione seu salário: ");
                salario[0] = dado.nextDouble();


                if (salario[0] <= 1000) {
                    porcentagem[0] = salario[0] * 20 / 100;
                    salarioLiquido[0] = salario[0] + porcentagem[0];
                    System.out.println("Funcionário: " + nome[0] + "\n Salário: " + salario[0] + "\n Bonus: " + porcentagem[0] + "\n Salário Líquido: " + salarioLiquido[0]);
                } else if (salario[0] > 1000 && salario[0] < 2000) {
                    porcentagem[0] = salario[0] * 10 / 100;
                    salarioLiquido[0] = salario[0] + porcentagem[0];
                    System.out.println("Funcionário: " + nome[0] + "\n Salário: " + salario[0] + "\n Bonus: " + porcentagem[0] + "\n Salário Líquido: " + salarioLiquido[0]);
                } else if (salario[0] > 2000) {
                    porcentagem[0] = salario[0] * 10 / 100;
                    salarioLiquido[0] = salario[0] - porcentagem[0];
                    System.out.println("Funcionário: " + nome[0] + "\n Salário: " + salario[0] + "\n Bonus: " + porcentagem[0] + "\n Salário Líquido: " + salarioLiquido[0]);
                }

            }
            

    }
}
