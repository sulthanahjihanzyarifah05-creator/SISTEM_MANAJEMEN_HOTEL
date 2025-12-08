package gui;

import javax.swing.*;
import java.awt.*;
import service.EmployeeService;
import service.BookingService;
import model.Employee;
import model.StandardRoom;
import model.DeluxeRoom;

public class LoginFrame extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private EmployeeService service = new EmployeeService();

    public LoginFrame() {
        setTitle("Login Pegawai");
        setSize(350, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel titleLabel = new JLabel("LOGIN PEGAWAI");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setBounds(80, 40, 200, 40);
        add(titleLabel);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(40, 120, 100, 25);
        add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(140, 120, 150, 25);
        add(usernameField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(40, 170, 100, 25);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(140, 170, 150, 25);
        add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 250, 140, 35);
        add(loginButton);

        loginButton.addActionListener(e -> handleLogin());
    }

    private void handleLogin() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        Employee emp = service.login(username, password);

        if (emp != null) {
            JOptionPane.showMessageDialog(this,
                "Login berhasil! Selamat datang, " + emp.getName());

    
            BookingService bs = new BookingService();
            bs.setEmployeeName(emp.getName());

            for (int i = 0; i < 10; i++) {
                bs.addRoom(new StandardRoom(i + 1), i);
            }

            for (int i = 10; i < 20; i++) {
                bs.addRoom(new DeluxeRoom(i + 1), i);
            }

            new MainMenuFrame(emp, bs).setVisible(true);
            dispose();

        } else {
            JOptionPane.showMessageDialog(this,
                "Username atau password salah!");
        }
    }

    public static void main(String[] args) {
        new LoginFrame().setVisible(true);
    }
}




