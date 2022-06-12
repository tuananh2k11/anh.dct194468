package hust.soict.hedspi.gui.awt;

import java.awt.*;        // Using AWT container and component classesimport java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// An AWT program inherits from the top-level container java.awt.Frame
public class AWTCounter extends Frame implements ActionListener {
    private Label lblCount;    // Declare a Label component
    private TextField tfCount; // Declare a TextField component
    private Button btnCount;   // Declare a Button component
    private int count = 0;     // Counter's value

    // Constructor to setup GUI components and event handlers
    public AWTCounter() {
        setLayout(new FlowLayout());
        // "super" Frame, which is a Container, sets its layout to FlowLayout to arrange
        // the components from left-to-right, and flow to next row from top-to-bottom.

        lblCount = new Label("Counter");  // construct the Label component
        add(lblCount);                    // "super" Frame container adds Label component

        tfCount = new TextField(count + "", 10); // construct the TextField component with initial text
        tfCount.setEditable(false);       // set to read-only
        add(tfCount);                     // "super" Frame container adds TextField component

        btnCount = new Button("Count");   // construct the Button component
        add(btnCount);                    // "super" Frame container adds Button component

        btnCount.addActionListener(this);
        setTitle("AWT Counter");  // "super" Frame sets its title
        setSize(250, 100);        // "super" Frame sets its initial window size
        setVisible(true);         // "super" Frame shows
    }

    // The entry main() method
    public static void main(String[] args) {
        AWTCounter app = new AWTCounter();
    }

    // ActionEvent handler - Called back upon button-click.
    @Override
    public void actionPerformed(ActionEvent evt) {
        ++count; // Increase the counter value
        tfCount.setText(count + ""); // Convert int to String
    }
}
