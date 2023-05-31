/*
    Name: 18
    + Nguyễn Phúc Hào - ITITUN21023
    + Nguyễn Mai Phương - ITDSIU20105
    + Trần Thế Phong - ITCSIU21215
    - Purpose:  This class represents a plant in the game that shoots freeze peas at zombies.
    It extends the Plant class, initializes the parent GamePanel and the plant's position in the constructor, 
    and sets up a Timer to schedule the shooting of freeze peas. The stop() method is overridden to stop the shootTimer when needed.
*/
import java.awt.event.ActionEvent;
import javax.swing.*;

public class FreezePeashooter extends Plant {

    public Timer shootTimer;


    public FreezePeashooter(GamePanel parent,int x,int y) {
        super(parent,x,y);
        shootTimer = new Timer(2000,(ActionEvent e) -> {
            if(gp.laneZombies.get(y).size() > 0) {
                gp.lanePeas.get(y).add(new FreezePea(gp, y, 103 + this.x * 100));
            }
        });
        shootTimer.start();
    }

    @Override
    public void stop(){
        shootTimer.stop();
    }

}