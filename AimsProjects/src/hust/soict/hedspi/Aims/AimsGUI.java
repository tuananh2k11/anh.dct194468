package hust.soict.hedspi.Aims;

import javax.swing.*;
import java.awt.*;

public class AimsGUI extends JFrame {
    private JPanel MainPanel;
    private JTextArea menuTxa;
    private JButton choiceBtn;
    private JTextField choiceTxt;

    public AimsGUI() {
        createUIComponents();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
    }

    private void createUIComponents() {
        setLayout(new FlowLayout());
        MainPanel = new JPanel();
        createPanelComponents();
        add(MainPanel);
    }

    private void createPanelComponents() {
        String menuContent = "Order Management Application:\n" +
                "        --------------------------------\n" +
                "        1. Create new order\n" +
                "        2. Add item to the order\n" +
                "        3. Delete item by id\n" +
                "        4. Display the items list of order\n" +
                "        0. Exit\n" +
                "        --------------------------------\n" +
                "        Please choose a number: 0-1-2-3-4";
        menuTxa = new JTextArea(menuContent);
        choiceBtn = new JButton("Submit");
        choiceTxt = new JTextField();
        MainPanel.add(menuTxa);
        MainPanel.add(choiceTxt);
        MainPanel.add(choiceBtn);

    }

    public static void main(String[] args) {
        new AimsGUI();
    }
}