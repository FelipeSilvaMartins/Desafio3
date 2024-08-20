classDiagram
    Iphone --|> ReprodutorMusical
    Iphone --|> AparelhoTelefonico
    Iphone --|> NavegorInternet
    class ReprodutorMusical{
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }
    class AparelhoTelefonico{
      -ligar(String numero)
      -atender()
      -iniciarCorreioVoz()
    }
    class NavegorInternet{
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()

    }
    class Iphone{

    }
