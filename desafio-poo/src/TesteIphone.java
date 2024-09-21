public class TesteIphone {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        System.out.println("### Testando Reprodutor Musical ###");
        iphone.selecionarMusica("We Will Rock You");
        iphone.tocar();
        iphone.pausar();

        System.out.println("\n### Testando Aparelho Telefônico ###");
        iphone.ligar("991234567");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\n### Testando Navegador de Internet ###");
        iphone.exibirPagina("https://www.exemplo.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
