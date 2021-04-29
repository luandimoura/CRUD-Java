package trabalho_final;

public class Time {
    //Declaracao das variaveis
    int id_time, ano_de_fundacao;
    String nome, apelido, mascote, localizacao;

    //Metodos getters e setters
    public int getId_time() {
        return id_time;
    }

    public void setId_time(int id_time) {
        this.id_time = id_time;
    }

    public int getAno_de_fundacao() {
        return ano_de_fundacao;
    }

    public void setAno_de_fundacao(int ano_de_fundacao) {
        this.ano_de_fundacao = ano_de_fundacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getMascote() {
        return mascote;
    }

    public void setMascote(String mascote) {
        this.mascote = mascote;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    //Metodo construtor vazio
    public Time() {
    }

    //Metodo construtor com todos os atributos
    public Time(int id_time, String nome, String apelido, String mascote, int ano_de_fundacao, 
            String localizacao) {
        this.id_time = id_time;
        this.nome = nome;
        this.apelido = apelido;
        this.mascote = mascote;
        this.ano_de_fundacao = ano_de_fundacao;
        this.localizacao = localizacao;
    }
    
}
