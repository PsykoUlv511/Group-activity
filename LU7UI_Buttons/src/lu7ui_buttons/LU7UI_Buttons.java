/*
 * This program sets up a simple login UI with username and password fields
 * and an OK button. Upon clicking the button, the current frame is closed 
 * and a new frame (Secon_JFrame) is opened.
 *
 * Author: P5YC40_K7113R
 */
package lu7ui_buttons;  // Package declaration

import javax.swing.*;  // Import the Swing package for GUI components
import java.awt.event.*;  // Import the AWT event package for action events

public class LU7UI_Buttons implements ActionListener {

    private JFrame frame1;  // Private to follow encapsulation principles
    private JLabel label1, label2;
    private JTextField t1, t2;
    private JButton b1;

    // Constructor to set up the GUI
    public LU7UI_Buttons() {
        frame1 = new JFrame("Log In");  // Initialize the JFrame here

        label1 = new JLabel("User Name");
        label2 = new JLabel("Password");
        t1 = new JTextField(20);  // Fixed width to better fit the UI
        t2 = new JTextField(20);
        b1 = new JButton("OK");

        frame1.setSize(400, 200);  // Adjusted size to be more suitable
        frame1.setVisible(true);
        frame1.setLayout(null);  // Using absolute positioning (not recommended but used here)
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Changed to EXIT_ON_CLOSE to close the application

        // Added components to the frame
        frame1.add(label1);
        frame1.add(t1);
        frame1.add(label2);
        frame1.add(t2);
        frame1.add(b1);

        // Set bounds for each component
        label1.setBounds(20, 20, 100, 30);  // Adjusted x and y to create space on the left
        t1.setBounds(130, 20, 200, 30);  // Adjusted width to fit the label and more spacious layout
        label2.setBounds(20, 60, 100, 30);
        t2.setBounds(130, 60, 200, 30);
        b1.setBounds(20, 100, 100, 30);

        // Registering the action listener
        b1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame1.dispose();  // Close the current frame
        // Ensure Secon_JFrame class exists and is properly implemented
        new Secon_JFrame();  // Create an instance to show the new frame
    }

    public static void main(String[] args) {
        new LU7UI_Buttons();  // Create an instance to show the frame
    }
}
