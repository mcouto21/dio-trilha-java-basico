public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public static void main(String[] args) {
        IPhone celular = new IPhone();
        // Interface AparelhoTelefonico
        celular.atender();
        celular.ligar("99123456789");
        celular.iniciarCorreioVoz();
        System.out.println();
        // Interface NavegadorInternet
        celular.adicionarNovaAba();
        celular.atualizarPagina();
        celular.exibirPagina("https://www.google.com.com.com.com");
        System.out.println();
        // Interface ReprodutorMusical
        celular.pausar();
        celular.selecionarMusica("Mamonas Assassinas - Brasília Amarela");
        celular.tocar();
        System.out.println();
    }
    // Interface AparelhoTelefonico
    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação...");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo as mensagens no Correio de Voz...");
    }
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + "...");
    }
    // Interface NavegadorInternet
    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba ...");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página ...");
    }
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url + " ...");
    }
    // Interface ReprodutorMusical
    @Override
    public void pausar() {
        System.out.println("Pausando a música ...");
    }
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música "  + musica + " ...");
    }
    @Override
    public void tocar() {
        System.out.println("Tocar uma música ...");
    }
}