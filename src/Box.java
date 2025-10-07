import java.util.Scanner;

public class Box {
    public Scanner sc = new Scanner(System.in);
    private String tipoCont, nome;
    private int spazio;



    public Box(String nome, String tipoCont, int spazio){
        this.nome=nome;
        this.tipoCont=tipoCont;
        this.spazio=spazio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSpazio() {
        return spazio;
    }

    public void setSpazio(int spazio) {
        this.spazio = spazio;
    }

    public String getTipoCont() {
        return tipoCont;
    }

    public void setTipoCont(String tipoCont) {
        this.tipoCont = tipoCont;
    }

    public void scegliSpazio(){
        System.out.println("quanto vuoi fare grandi i box?");
        this.spazio=sc.nextInt();
    }

}
