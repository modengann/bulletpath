import javadraw.*;

public class Bullet {
    private Oval bullet;
    private double moveX = 1;
    private double moveY;
    private double speed;

    public Bullet(Screen s, Location begin, Location clickPoint){
        bullet = new Oval(s, begin, 5, 5);
        speed = 1;
        moveX = 1;
         double diffX = clickPoint.x() - begin.x();
         double diffY = clickPoint.y() - begin.y();

         
         double slope = diffY/diffX;

         moveX = Math.sqrt((speed*speed)/(1 + slope*slope));
         moveY = slope*moveX;

        if(diffX < 0 ){
            moveX *= -1;
            moveY *= -1;
        }

         


    }

    public void move(){
        bullet.move(moveX, moveY);
    }


}
