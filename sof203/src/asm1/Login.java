/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm1;

import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Login {

    private JFrame frm;
    private JPanel pnl;

    public Login() {
        prepareContainer();
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.GUI();
    }

    private void prepareContainer() {
        frm = new JFrame("");
        frm.setSize(400, 400);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(frm);
        frm.setVisible(true);

        TitledBorder border = BorderFactory.createTitledBorder("Login");
        pnl = new JPanel();
        pnl.setBorder(border);
    }

    private void GUI() {
        var lblName = new JLabel("Username:");
        var lblPass = new JLabel("Password:");

        var txtName = new JTextField(15);
        var txtPass = new JPasswordField(15);
        var pnlBtn = new JPanel();
        var btnLogin = new JButton("Login");
        var btnCancel = new JButton("Cancel");
        
        pnlBtn.add(btnLogin);
        pnlBtn.add(btnCancel);

        GroupLayout layout = new GroupLayout(pnl);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(lblName)
                        .addComponent(lblPass))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(txtName)
                        .addComponent(txtPass)
                        .addComponent(pnlBtn))
        );
        

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(txtName))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPass)
                        .addComponent(txtPass))
                .addComponent(pnlBtn)
        );
        pnl.setLayout(layout);
        
        frm.add(pnl);
        frm.pack();
        frm.setVisible(true);

    }
}
