public class Magazzino {
    private String nome;

    private Box[] ListaBox = new Box[4];

    public Magazzino(Box[] ListaBox){
        this.ListaBox=ListaBox;
        this.nome=nome;
    }

    public void setNome(String nome) {
        this.nome = "Magazzino";
    }

    public String getNome() {
        return nome;
    }
}
