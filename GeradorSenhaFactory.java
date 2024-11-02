import java.util.Random;

class SenhaNumerica implements GeradorSenha {
    public String gerarSenha(int tamanho) {
        StringBuilder senha = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            senha.append(random.nextInt(10));
        }
        return senha.toString();
    }
}

class SenhaLetrasMinusculas implements GeradorSenha {
    public String gerarSenha(int tamanho) {
        StringBuilder senha = new StringBuilder();
        Random random = new Random();
        String letras = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < tamanho; i++) {
            senha.append(letras.charAt(random.nextInt(letras.length())));
        }
        return senha.toString();
    }
}

class SenhaLetrasMinusculasNumeros implements GeradorSenha {
    public String gerarSenha(int tamanho) {
        StringBuilder senha = new StringBuilder();
        Random random = new Random();
        String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < tamanho; i++) {
            senha.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return senha.toString();
    }
}

class SenhaLetrasMaiusculasMinusculasNumeros implements GeradorSenha {
    public String gerarSenha(int tamanho) {
        StringBuilder senha = new StringBuilder();
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < tamanho; i++) {
            senha.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return senha.toString();
    }
}

class SenhaCompleta implements GeradorSenha {
    public String gerarSenha(int tamanho) {
        StringBuilder senha = new StringBuilder();
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789$&#@_";
        for (int i = 0; i < tamanho; i++) {
            senha.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return senha.toString();
    }
}

class GeradorSenhaFactory {
    public static GeradorSenha criarGerador(int opcao) {
        switch (opcao) {
            case 1: return new SenhaNumerica();
            case 2: return new SenhaLetrasMinusculas();
            case 3: return new SenhaLetrasMinusculasNumeros();
            case 4: return new SenhaLetrasMaiusculasMinusculasNumeros();
            case 5: return new SenhaCompleta();
            default: throw new IllegalArgumentException("Opção inválida!");
        }
    }
}