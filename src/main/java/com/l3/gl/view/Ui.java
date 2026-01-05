
package com.l3.gl.view;
import javax.swing.*;
import java.awt.*;

public class Ui extends JFrame {
    public Ui() {
        // Set window properties
        setTitle("Inventory Management System - MyGitApp");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Add a simple welcome label
        JLabel label = new JLabel("Welcome to Java & Git Project", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        add(label);
    }

    public static void main(String[] args) {
        // Run the GUI
        SwingUtilities.invokeLater(() -> {
            new Ui().setVisible(true);
        });
    }
}

