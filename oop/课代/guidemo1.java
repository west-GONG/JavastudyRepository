import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class guidemo1{
    public static void main(String[] args) {
        //创建一个窗体（Jframe)对象
        JFrame frame=new JFrame();
        frame.setBounds(200,200,400,300);//设置大小
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//设置窗体关闭模式
        frame.setTitle("我的窗体");//设置窗体标题
        frame.setLayout(new FlowLayout());//设置布局方式 FlowLayout:流式布局
        //向窗体中添加一个文本框组件对象JTextField
        JTextField txtdisp=new JTextField();
        txtdisp.setColumns(20);
        txtdisp.setText("欢迎来到面向对象世界！");
        frame.add(txtdisp);
        //添加一个按钮对象（JButton)
        JButton btn=new JButton("欢迎");
        frame.add(btn);
        JLabel label=new JLabel();
        frame.add(label);

        //第一步：定义事件监听器类
        class actionhandler implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {//事件处理方法
                String title=txtdisp.getText();//获取文本框中的文本
                frame.setTitle(title);
            }
        }
        //第二步：事件注册
        btn.addActionListener(new actionhandler());//事件注册

        //第一步：定义事件监听器类
        class mousemotionHandler implements MouseMotionListener{

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                int x=e.getX();
                int y=e.getY();
                label.setText("("+x+","+y+")");//(20,30)
            }
        }
        //事件注册
        frame.addMouseMotionListener(new mousemotionHandler());
        frame.setVisible(true);//显示窗体
    }
}
