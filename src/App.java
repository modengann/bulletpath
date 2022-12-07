import javadraw.*;
import java.util.*;
public class App extends Window{
    Oval hero;
    ArrayList<Bullet> bullets = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Window.open();
    }

    public void start(){
        hero = new Oval(screen, 400, 500, 10, 10);

        while(true){
             for(Bullet b : bullets){
                b.move();
             }
            
            screen.update();
            screen.sleep(1/30.0);
        }

    }
    public void mouseDown(int button, Location loc){
        bullets.add(new Bullet(screen, hero.location(), loc));
    }


}
