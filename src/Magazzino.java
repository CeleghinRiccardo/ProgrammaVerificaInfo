public class Magazzino {
    private String nome;
    private Box[] ListaBox = new Box[4];

    private int s1=ListaBox[0].scegliSpazio();
    private int s2=ListaBox[1].scegliSpazio();
    private int s3=ListaBox[2].scegliSpazio();
    private int s4=ListaBox[3].scegliSpazio();

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

    public boolean aggiungiOggetto(Oggetto oggetto){
        for(int i = 0 ; i<ListaBox.length; i++){
            if(ListaBox[i]==null){
                ListaBox[i]=;

                return true;
            }
        }
        return false;
    }

    /*public boolean togliOggetto(int pos){
        Oggetto o;
        if(ListaBox[pos]!=null){

            return true;
        }
        return false;
    }*/
}
