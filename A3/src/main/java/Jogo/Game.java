package Jogo;

import java.awt.*;

public class Game {
    private TelaPrincipal telaPrincipal;
    private Rectangle rectangle;


    public Game(int width, int height){
        telaPrincipal = new TelaPrincipal(width, height);
        rectangle = new Rectangle(0,0,50,50);
    }

    void render() {
        telaPrincipal.render(this);
    }

    void update() {
        rectangle.setLocation((int)rectangle.getX() + 1, (int)rectangle.getY());
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}
