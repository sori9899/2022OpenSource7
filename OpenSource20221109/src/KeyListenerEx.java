import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListenerEx extends JFrame {
    private JLabel [] KeyMessage;

    public KeyListenerEx(){
        setTitle("keyListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.addKeyListener(new MyKeyListener());

        KeyMessage = new JLabel[3];
        KeyMessage[0] = new JLabel(" getKeyCode() ");
        KeyMessage[1] = new JLabel(" getKeyChar() ");
        KeyMessage[2] = new JLabel(" getKeyText() ");

        for(int i=0; i< KeyMessage.length; i++){
            c.add(KeyMessage[i]);
            KeyMessage[i].setOpaque(true);
            KeyMessage[i].setBackground(Color.YELLOW);
        }

        setSize(300, 150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();

            KeyMessage[0].setText(Integer.toString(keyCode));
            KeyMessage[1].setText(Character.toString(keyCode));
            KeyMessage[2].setText(e.getKeyText(keyCode));
        }
    }

    public static void main(String[] args) {
        new KeyListenerEx();
    }
}
