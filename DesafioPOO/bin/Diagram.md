classDiagram
    class AparelhoTelefonico {
      +atender()
      +iniciarCorreioVoz()
      +ligar(String numero)
    }
    class NavegadorInternet {
      +adicionarNovaAba()
      +atualizarPagina()
      +exibirPagina(String url)
    }
    class ReprodutorMusical {
      +pausar()
      +selecionarMusica(String musica)
      +tocar()
    }
    class IPhone {
        +atender()
        +iniciarCorreioVoz()
        +ligar(int numero)
        +adicionarNovaAba()
        +atualizarPagina()
        +exibirPagina(String url)
        +pausar()
        +selecionarMusica(String musica)
        +tocar()
    }
    IPhone <|-- AparelhoTelefonico
    IPhone <|-- NavegadorInternet
    IPhone <|-- ReprodutorMusical