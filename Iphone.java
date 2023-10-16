package desafio_poo;

import java.time.LocalTime;
import java.util.Calendar;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private int capacidade;
    private String cor;
    private String numeroTelefone;

    public Iphone(String modelo, int capacidade, String cor) {
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.cor = cor;
    }

    // Getters e Setters
    // modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    // capacidadee
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    // cor
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // numero telefone
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    //  Reprodutor Musical ========================================
    
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }


    // Navegador Internet ========================================
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova página: " + url);
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }


    // Aparelho Telefone ========================================
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }
    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz...");
    }


    public static void main(String[] args) {
        Iphone iphone = new Iphone("iPhone X", 64, "Preto");
        int minutos = minutosRelevantes();

        //  métodos da interface ReprodutorMusical
        if(minutos >= 15 && minutos <= 55){
            iphone.tocar();
            iphone.pausar();
            iphone.selecionarMusica("Nome da música");
        }
        

        // métodos da interface NavegadorInternet
        if(minutos >= 15 && minutos <= 55) {
            iphone.exibirPagina("https://www.youtube.com/watch?v=9ou608QQRq8&ab_channel=TuchilaRino");
            iphone.adicionarNovaAba("https://www.youtube.com/watch?v=9ou608QQRq8&ab_channel=TuchilaRino");
            iphone.atualizarPagina();
        }
        

        // métodos da interface AparelhoTelefonico
        if(minutos >= 15 && minutos <= 55) {
            iphone.ligar("123456789");
            iphone.atender();
            iphone.iniciarCorrerioVoz();
        }
        
    }


    private static int minutosRelevantes() {
        Calendar calendar = Calendar.getInstance();
        int minute = calendar.get(Calendar.MINUTE);
        
        return minute;
    }

}
