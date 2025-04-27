package Jogo;

public class GameLoop implements Runnable {

    private Game game;
    private boolean runing;
    private final double updateRate =1.0d/60.0d;
    private long nextStartTime;
    private int fps, ups;

    public GameLoop(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
      runing = true;
      double accumulator = 0;
      long currentTime, lastUpdate = System.currentTimeMillis();
      nextStartTime = System.currentTimeMillis() + 1000;
      while (runing){
          currentTime = System.currentTimeMillis();
          double lastRenderTimeInSeconds = (currentTime - lastUpdate)/1000d;
            accumulator +=lastRenderTimeInSeconds;
            lastUpdate = currentTime;

            while (accumulator > updateRate){
                update();
                accumulator -= updateRate;
            }
            render();
            printStats();
      }
    }

    private void printStats() {
        if(System.currentTimeMillis() > nextStartTime){
            System.out.println(String.format("FPS: %d, ups: %d", fps,ups));
            fps = 0;
            ups = 0;
            nextStartTime = System.currentTimeMillis() + 1000;
        }
    }

    private void render() {
        game.render();
        fps++;
    }

    private void update() {
        game.update();
        ups++;
    }
}
