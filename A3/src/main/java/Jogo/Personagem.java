package Jogo;

 public class Personagem {

    String nome;
    Integer vida;
    Integer ataque;
    Integer ataqueForte;
    Integer defesa;
    Integer cura;
    Integer danoSofrido;
    Arma arma;

    public Personagem(String nome, Integer vida, Integer ataque, Integer ataqueForte, Integer defesa, Integer cura, Integer danoSofrido, Arma arma) {
       this.nome = nome;
       this.vida = vida;
       this.ataque = ataque;
       this.ataqueForte = ataqueForte;
       this.defesa = defesa;
       this.cura = cura;
       this.danoSofrido = danoSofrido;
       this.arma = arma;
    }

    public String getNome() {
       return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }

    public void atacar(){
      this.ataque = ataque + arma.bonusAtaque;
    }

    public void atacarForte(){
       this.ataqueForte = ataqueForte + arma.bonusAtaqueForte;
    }

    public void sofrerDano(){
       if(vida > 0) {
          this.vida = vida - (danoSofrido - (defesa + arma.bonusDefesa));
       }
    }

    public void curar(){
       if(vida > 0) {
          this.vida = vida + cura;
       }
    }

}
