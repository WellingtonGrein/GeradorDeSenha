import java.util.Scanner;

public class AppGeradorSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de senha que deseja gerar:");
        System.out.println("1 - Apenas números");
        System.out.println("2 - Apenas letras minúsculas");
        System.out.println("3 - Letras minúsculas e números");
        System.out.println("4 - Letras maiúsculas, minúsculas e números");
        System.out.println("5 - Letras maiúsculas, minúsculas, números e símbolos");
        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o tamanho da senha: ");
        int tamanho = scanner.nextInt();

        GeradorSenha gerador = GeradorSenhaFactory.criarGerador(opcao);
        String senha = gerador.gerarSenha(tamanho);

        System.out.println("Senha gerada: " + senha);
        scanner.close();
    }
}