import javax.swing.*;
import java.awt.*;

public class abc {
    private JPanel panel;
    private JButton 计算Button;

    public static void main(String[] args) {
        new Frame();
        JFrame frame=new JFrame("我的窗体");
        frame.setContentPane(new abc().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
