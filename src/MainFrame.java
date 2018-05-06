import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    public JButton jbtnAdd = new JButton("＜－－");
    public JButton jbtnSub = new JButton("－－＞");
    public JButton jbtnExit = new JButton("Exit");
    public JLabel jlb = new JLabel("＞__3__＜");
    public JTextField jtf = new JTextField();
    private int count = 0;
    public MainFrame(){
        this.init();
    }
    public void init(){
        this.setBounds(80,60,800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(jbtnAdd);
        this.add(jbtnSub);
        this.add(jbtnExit);
        this.add(jlb);
        this.add(jtf);
        jbtnAdd.setBounds(80,60,100,100);
        jbtnSub.setBounds(280,60,100,100);
        jbtnExit.setBounds(480,60,100,100);
        jlb.setBounds(count,150,150,150);
        jtf.setBounds(count,300,100,100);
        jbtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count -=Integer.parseInt(jtf.getText());
                jlb.setBounds(count,150,150,150);
            }
        });
        jbtnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count += Integer.parseInt(jtf.getText());
                jlb.setBounds(count,150,150,150);
            }
        });
        jbtnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
