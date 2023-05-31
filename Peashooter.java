/*
    Name: 18
    + Nguyễn Phúc Hào - ITITUN21023
    + Nguyễn Mai Phương - ITDSIU20105
    + Trần Thế Phong - ITCSIU21215
    - Purpose:   The Peashooter class extends the Plant class and represents a 
    specific type of plant in the game. It has a shootTimer object of type Timer 
    that controls the shooting behavior of the peashooter.
*/
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Peashooter extends Plant {

    public Timer shootTimer;


    public Peashooter(GamePanel parent,int x,int y) {
        super(parent,x,y);
        shootTimer = new Timer(2000,(ActionEvent e) -> {
            if(gp.laneZombies.get(y).size() > 0) {
                gp.lanePeas.get(y).add(new Pea(gp, y, 103 + this.x * 100));
            }
        });
        shootTimer.start();
    }

    @Override
    public void stop(){
        shootTimer.stop();
    }

}
