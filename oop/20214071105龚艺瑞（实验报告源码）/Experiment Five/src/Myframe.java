import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe  {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame();
        frame1.setLayout(null);
        //frame1是指圆形这个窗口，矩形、三角形的窗口就不能再用同样的名字，可以改成frame2,frame3之类的
        frame1.setSize(500, 300);
        frame1.setTitle("计算三角形的面积和周长");
        frame1.setBounds(500,400,500,600);

        //设置面板
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        //设置面板的尺寸和位置
        panel1.setSize(400, 200);
        panel2.setSize(400, 200);
        panel3.setSize(400, 200);
        panel4.setSize(400,200);
        panel5.setSize(400,200);

        panel1.setLocation(55,30);
        panel2.setLocation(55,130);
        panel3.setLocation(55,230);
        panel4.setLocation(55,350);
        panel5.setLocation(55,450);

        //设置标签的字体、大小、位置
        JLabel labName1 = new JLabel("第一条边：",SwingConstants.LEFT);
        Font font = new Font("宋体",Font.PLAIN, 15);
        labName1.setFont(font);
        JLabel labName2 = new JLabel("第二条边：",SwingConstants.LEFT);
        labName2.setFont(font);
        JLabel labName3 = new JLabel("第三条边：",SwingConstants.LEFT);
        labName3.setFont(font);
        JLabel labName4 = new JLabel("周长：",SwingConstants.LEFT);
        labName4.setFont(font);
        JLabel labName5 = new JLabel("面积：",SwingConstants.LEFT);
        labName5.setFont(font);

        labName1.setBounds(10,30,150,50);
        panel.add(labName1);
        labName2.setBounds(10,130,150,50);
        panel.add(labName2);
        labName3.setBounds(10,230,150,50);
        panel.add(labName3);
        labName4.setBounds(20,350,150,50);
        panel.add(labName4);
        labName5.setBounds(20,450,150,50);
        panel.add(labName5);

        //创建文本框
        JTextField textField1 = new JTextField(15);
        JTextField textField2 = new JTextField(15);
        JTextField textField3 = new JTextField(15);
        JTextField textField4 = new JTextField(15);
        JTextField textField5 = new JTextField(15);

        textField1.setFont(new Font(null,Font.PLAIN, 20));
        textField2.setFont(new Font(null,Font.PLAIN, 20));
        textField3.setFont(new Font(null,Font.PLAIN, 20));
        textField4.setFont(new Font(null,Font.PLAIN, 20));
        textField5.setFont(new Font(null,Font.PLAIN, 20));

        panel1.add(textField1);
        panel.add(panel1);
        panel2.add(textField2);
        panel.add(panel2);
        panel3.add(textField3);
        panel.add(panel3);
        panel4.add(textField4);
        panel.add(panel4);
        panel5.add(textField5);
        panel.add(panel5);
        //panel.add(panel1);
        panel.setVisible(true);

        //创建按钮
        JButton btn21 = new JButton("计算");
        JButton btn23 = new JButton("清空");
        btn21.setBounds(140, 280, 80, 30);
        btn23.setBounds(290, 280, 80, 30);
        panel.add(btn21);
        panel.add(btn23);

        panel.setLayout(null);
        panel.setOpaque(false);

        frame1.setContentPane(panel);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);

        //按钮btn21鼠标单击事件
        btn21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {;
                double a = Double.parseDouble(textField1.getText());
                double b = Double.parseDouble(textField2.getText());
                double c = Double.parseDouble(textField3.getText());
                Triangle triangleobject = new Triangle(a,b,c);
                textField4.setText(String.format("%.2f",triangleobject.perimeterCalculation()));
                textField5.setText(String.format("%.2f",triangleobject.areaCalculation()));
            }
        });
        //按钮btn23鼠标单击事件
        btn23.addActionListener(ee -> {
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
        });

    }
}
