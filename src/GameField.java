import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image apple;
    private int appleX, appleY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left = false, right = true, up = false, down = false, inGame = true;

    public GameField(){
        setBackground(Color.black);
        loadImages();
    }

    public void loadImages(){
        ImageIcon iia = new ImageIcon("apple.png");
        apple = iia.getImage();
        ImageIcon iid = new ImageIcon("dot.png");
        dot = iid.getImage();
    }
}
