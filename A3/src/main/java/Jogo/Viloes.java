package Jogo;

public class Viloes {

    String nome;
    Integer vida;
    Integer ataque;
    Integer ataqueForte;
    Integer danoSofrido;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void atacar(){
        this.ataque += ataque;
    }

    public void atacarForte(){
        this.ataqueForte += ataqueForte;
    }

    public void sofrerDano(){
        if(vida > 0) {
            this.vida = (vida - danoSofrido);
        }
    }
}
