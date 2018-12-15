import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class InformationView {
    public static void main(String[] args) {
        JFrame view = new JFrame("Museum");
        view.setLayout(new BorderLayout());
        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();

        JScrollPane guidesPane = new JScrollPane();
        JScrollPane languagesPane = new JScrollPane();

        ArrayList<Guide> guides = Guide.getGuides();

        for (Guide guide : guides) {
            System.out.println(guide.getName());
            JLabel guideName = new JLabel(guide.getName());
            guidesPane.add(guideName);
        }

        leftPanel.add(guidesPane);
        rightPanel.add(languagesPane);

        view.add(leftPanel);
        view.add(rightPanel);
        view.setPreferredSize(new Dimension(500, 500));
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        view.pack();
        view.setVisible(true);
    }
}
