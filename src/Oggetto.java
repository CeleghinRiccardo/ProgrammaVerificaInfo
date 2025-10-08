public class Oggetto {

    private String tipo, nome;
    private int peso;

    public Oggetto(String tipo, String nome, int peso){
        this.nome=nome;
        this.peso=peso;
        this.tipo=tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
