import javax.swing.*;
import java.awt.*;

public class Space {
    public JFrame jframe;

    //    private Space(Atom atom1, Atom atom2, int distance, int velocity, int a){
    public Space() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jframe = new JFrame("space");
        jframe.setVisible(true);
        jframe.setSize(800, 800);
        jframe.setLocation(dim.width / 2 - jframe.getWidth() / 2, dim.height / 2 - jframe.getHeight() / 2);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
