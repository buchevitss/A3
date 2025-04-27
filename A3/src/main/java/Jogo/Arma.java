package Jogo;

public class Arma {
    String nome;
    Integer bonusAtaque;
    Integer bonusAtaqueForte;
    Integer bonusDefesa;


    public Arma(String nome, Integer bonusAtaque, Integer bonusAtaqueForte, Integer bonusDefesa) {
        this.nome = nome;
        this.bonusAtaque = bonusAtaque;
        this.bonusAtaqueForte = bonusAtaqueForte;
        this.bonusDefesa = bonusDefesa;
    }
}
