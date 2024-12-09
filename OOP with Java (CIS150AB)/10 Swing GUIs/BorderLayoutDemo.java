import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {

    // Fields (widgets)
    private JPanel pnlPageStart, pnlPageEnd, pnlLineStart, pnlCenter, pnlLineEnd;
    private JLabel lblPageStart, lblPageEnd, lblLineStart, lblCenter, lblLineEnd;

    public BorderLayoutDemo() {
        super("BorderLayout Demo");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        this.pnlPageStart = new JPanel();
        this.pnlPageStart.setBackground(Color.LIGHT_GRAY);
        this.pnlPageEnd = new JPanel();
        this.pnlPageEnd.setBackground(Color.LIGHT_GRAY);

        this.pnlLineStart = new JPanel();
        this.pnlLineStart.setBackground(Color.ORANGE);

        this.pnlCenter = new JPanel();
        this.pnlCenter.setBackground(Color.GREEN);

        this.pnlLineEnd = new JPanel();
        this.pnlLineEnd.setBackground(Color.ORANGE);

        this.lblPageStart = new JLabel("Page Start");
        this.lblPageEnd = new JLabel("Page End");
        this.lblLineStart = new JLabel("Line Start");
        this.lblCenter = new JLabel("Center");
        this.lblLineEnd = new JLabel("Line End");

        this.pnlPageStart.add(lblPageStart);
        this.pnlPageEnd.add(lblPageEnd);
        this.pnlLineStart.add(lblLineStart);
        this.pnlCenter.add(lblCenter);
        this.pnlLineEnd.add(lblLineEnd);

        this.add(pnlPageStart, BorderLayout.PAGE_START);
        this.add(pnlPageEnd, BorderLayout.PAGE_END);
        this.add(pnlLineStart, BorderLayout.LINE_START);
        this.add(pnlCenter, BorderLayout.CENTER);
        this.add(pnlLineEnd, BorderLayout.LINE_END);

    }

    public static void main(String[] args) {
        BorderLayoutDemo frame = new BorderLayoutDemo();
        frame.setVisible(true);
    }

}
