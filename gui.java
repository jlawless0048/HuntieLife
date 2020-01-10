
import javax.swing.*;
import java.awt.*;
class gui {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);


        JPanel panel = new JPanel();
        JButton testUno = new JButton("test uno");
        JButton testTwo = new JButton("test two");
        panel.add(testUno);
        panel.add(testTwo);

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.setVisible(true);
    }
}

