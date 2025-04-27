package Jogo;

public class Main {
    public static void main(String[] args) {
       new Thread(new GameLoop(new Game(800,600))).start();

    //TelaPrincipal telaPrincipal = new TelaPrincipal(800,600);
    }

//    private static void render() {
//
//    }
//
//
//    private static void update() {
//    }
}