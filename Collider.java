/*
    Name: 18
    + Nguyễn Phúc Hào - ITITUN21023
    + Nguyễn Mai Phương - ITDSIU20105
    + Trần Thế Phong - ITCSIU21215
    - Purpose: This class encapsulates a JPanel with mouse interaction capabilities.
    It allows the association of a Plant object, provides methods to set and remove the Plant,
    and enables the registration of an ActionListener to respond to mouse events within the Collider panel.
*/
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Collider extends JPanel implements MouseListener {

    ActionListener al;

    public Collider(){
        //setBorder(new LineBorder(Color.RED));
        setOpaque(false);
        addMouseListener(this);
        //setBackground(Color.green);
        setSize(100,120);
    }

    public Plant assignedPlant;

    public void setPlant(Plant p){
        assignedPlant = p;
    }

    public void removePlant(){
        assignedPlant.stop();
        assignedPlant = null;
    }

    public boolean isInsideCollider(int tx){
        return (tx > getLocation().x) && (tx < getLocation().x + 100);
    }

    public void setAction(ActionListener al){
        this.al = al;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(al != null){
            al.actionPerformed(new ActionEvent(this,ActionEvent.RESERVED_ID_MAX+1,""));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
