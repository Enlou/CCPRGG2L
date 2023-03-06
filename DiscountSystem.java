import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DiscountSystem extends JFrame implements ActionListener {
    // GUI components
    private JLabel ID, Name, Course, Tuition, Miscellaneous, Discount;
    private JTextField idField, nameField;
    private JComboBox<String> courseComboBox, discountComboBox;
    private JButton enrollButton;
    private JTextArea outputArea;
    
    // Course data
    private static final String[] COURSES = {"Nursing", "Computer Science", "Engineer", "Tourism", "Architecture"};
    private static final int[] TUITION_FEES = {15000, 20000, 30000, 10000, 25000};
    private static final int[] MISC_FEES = {15000, 11000, 25000, 22500, 23000};
    
    // Discount data
    private static final String[] DISCOUNTS = {"Walk-in", "Gold", "Blue", "White", "Continuing"};
    private static final double[] MISC_DISCOUNTS = {0.0, 0.005, 0.007, 0.009, 0.1};
    private static final double TUITION_DISCOUNT = 1;

    public DiscountSystem() {
        super("Enrollment System");

        // Create GUI components
        ID = new JLabel("ID Number:");
        Name = new JLabel("Name:");
        Course = new JLabel("Course:");
        Tuition = new JLabel("Tuition Fee:");
        Miscellaneous = new JLabel("Miscellaneous Fee:");
        Discount = new JLabel("Discount:");
        idField = new JTextField(10);
        nameField = new JTextField(20);
        courseComboBox = new JComboBox<>(COURSES);
        discountComboBox = new JComboBox<>(DISCOUNTS);
        enrollButton = new JButton("Enroll");
        outputArea = new JTextArea(10, 40);

        // Set layout
        setLayout(new GridBagLayout());
        GridBagConstraints GBC = new GridBagConstraints();
        GBC.gridx = 0;
        GBC.gridy = 0;
        GBC.anchor = GridBagConstraints.WEST;
        add(ID, GBC);
        GBC.gridx = 1;
        add(idField, GBC);
        GBC.gridx = 0;
        GBC.gridy = 1;
        add(Name, GBC);
        GBC.gridx = 1;
        add(nameField, GBC);
        GBC.gridx = 0;
        GBC.gridy = 2;
        add(Course, GBC);
        GBC.gridx = 1;
        add(courseComboBox, GBC);
        GBC.gridx = 0;
        GBC.gridy = 3;
        add(Tuition, GBC);
        GBC.gridx = 1;
        add(new JLabel(), GBC);
        GBC.gridx = 2;
        add(Miscellaneous, GBC);
        GBC.gridx = 3;
        add(new JLabel(), GBC);
        GBC.gridx = 0;
        GBC.gridy = 4;
        add(new JLabel(), GBC);
        GBC.gridx = 1;
        add(new JLabel(), GBC);
        GBC.gridx = 2;
        add(Discount, GBC);
        GBC.gridx = 3;
        add(discountComboBox, GBC);
        GBC.gridx = 0;
        GBC.gridy = 5;
        add(new JLabel(), GBC);
        GBC.gridx = 1;
        add(new JLabel(), GBC);
        GBC.gridx = 2;
        add(new JLabel(), GBC);
        GBC.gridx = 3;
        add(enrollButton, GBC);
        GBC.gridx = 0;    GBC.gridy = 6;
        GBC.gridwidth = 4;
        GBC.fill = GridBagConstraints.HORIZONTAL;
        add(outputArea, GBC);

        // Add action listeners
        enrollButton.addActionListener(this);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get input values
        String id = idField.getText();
        String name = nameField.getText();
        String course = (String) courseComboBox.getSelectedItem();
        double tuitionFee = TUITION_FEES[courseComboBox.getSelectedIndex()] * (discountComboBox.getSelectedIndex() == 4 ? TUITION_DISCOUNT : 1);
        double miscFee = MISC_FEES[courseComboBox.getSelectedIndex()] * (1 - MISC_DISCOUNTS[discountComboBox.getSelectedIndex()]);

        // Compute total fee
        double totalFee = tuitionFee + miscFee;

        // Build output string
        StringBuilder output = new StringBuilder();
        output.append("ID Number: ").append(id).append("\n");
        output.append("Name: ").append(name).append("\n");
        output.append("Course: ").append(course).append("\n");
        output.append("Tuition Fee: ").append(String.format("%.2f", tuitionFee)).append("\n");
        output.append("Miscellaneous Fee: ").append(String.format("%.2f", miscFee)).append("\n");
        output.append("Total Fee: ").append(String.format("%.2f", totalFee)).append("\n");

        // Display output
        outputArea.setText(output.toString());
    }

    public static void main(String[] args) {
        new DiscountSystem();
    }
}
