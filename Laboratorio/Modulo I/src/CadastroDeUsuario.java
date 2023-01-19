
import java.util.Scanner;
public class CadastroDeUsuario{
    public static void main(String args[]){
        System.out.println("Cadastro de Usuário - Digite as informaçõess nos campos abaixo para completar o seu cadastro");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome completo:");
        String nome = sc.nextLine();

        System.out.println("Qual é a sua idade?");
        int idade = sc.nextInt();

        System.out.println("CPF:");
        int CPF = sc.nextInt();

        System.out.println("RG:");
        int RG = sc.nextInt();

        System.out.println("Renda mensal:R$");
        double rendaMensal = sc.nextDouble();

        System.out.println("Profissão: ");
        String profissao = sc.next();

        System.out.println("Telefone: ");
        int telefone = sc.nextInt();

        System.out.println("E-mail: ");
        String email = sc.next();

        System.out.println("Logradouro: ");
        String logradouro = sc.next();

        System.out.println("Número: ");
        int numero = sc.nextInt();

        System.out.println("Complemento: ");
        String complemento= sc.next();

        System.out.println("Bairro: ");
        String bairro = sc.next();

        System.out.println("Cidade: ");
        String cidade = sc.next();

        System.out.println("CEP: ");
        int CEP = sc.nextInt();

        System.out.println("Estado: ");
        String estado = sc.next();


        System.out.println(nome);
        System.out.println("Qual é a sua idade?" + idade);
        System.out.println("Digite o seu CPF:" + CPF);
        System.out.println("Digite o seu RG:" + RG);
        System.out.println("Renda mensal: R$" + rendaMensal);
        System.out.println("Profissão:" + profissao);
        System.out.println("Telefone com DDD:" + telefone);
        System.out.println("E-mail:" + email);
        System.out.println(logradouro);
        System.out.println("Digite o número:" + numero);
        System.out.println(complemento);
        System.out.println(bairro);
        System.out.println(cidade);
        System.out.println("Digite o CEP:" + CEP);
        System.out.println("Estado:" + estado);
        System.out.println();
        System.out.println ("Resumo do cadastro");
        System.out.println();
        System.out.println("Informações pessoais:"+ nome + "," + idade + "anos");
        System.out.println("Documentos: CPF" + "-" + CPF + ";" + "RG" + "-" + RG);
        System.out.println("Renda mensal e profissão:"+ "R$" + rendaMensal + "," + profissao);
        System.out.println("Contatos:" + telefone + "," + email);
        System.out.println("Endereço :" + logradouro + "," + numero + "," + complemento + "-" + "," + bairro + "," + "CEP-" + CEP + "," + cidade + "," + estado);

    }

}