/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.*;
import java.awt.LayoutManager;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class arch {

    private JFrame frm;
    private JPanel pnl, pnlSearch, pnlInfo, pnlBtn, pnlMove;

    public arch() {
        prepareContainer();
    }

    public static void main(String[] args) {
        arch entry = new arch();
        entry.GUI();
    }

    private void prepareContainer() {
        frm = new JFrame("");
        frm.setSize(400, 400);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(frm);
        frm.setVisible(true);

        frm.setLayout(new BorderLayout());
        pnl = new JPanel(new BorderLayout());
        pnlSearch = new JPanel(new FlowLayout(FlowLayout.CENTER, 16, 8));
        pnlInfo = new JPanel();
        pnlBtn = new JPanel(new GridLayout(4, 1, 8, 4));
        pnlMove = new JPanel(new GridLayout(1, 4));
    }

    private void GUI() {
        //pnlSearch
        pnlSearch.setBorder(BorderFactory.createTitledBorder("Tìm kiếm"));
        var lblId = new JLabel("Mã SV:");
        var txtId = new JTextField(20);
        var icon = new ImageIcon("search.png");
//        Image scaledImage = icon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
//        icon = new ImageIcon(scaledImage, "");
        var btnSearch = new JButton("Search", icon);

        pnlSearch.add(lblId);
        pnlSearch.add(txtId);
        pnlSearch.add(btnSearch);

        //pnlInfo
        var lblName = new JLabel("Họ tên SV:");
        var lblName2 = new JLabel("");
        var lblMasv = new JLabel("Mã SV:");
        var lblEng = new JLabel("Tiếng Anh:");
        var lblTin = new JLabel("Tin học:");
        var lblTc = new JLabel("Giáo dục TC:");
        var lblDtb = new JLabel("Điểm TB:");
        var lblDTB = new JLabel("");

        var txtMasv = new JTextField(14);
        var txtEng = new JTextField(14);
        var txtTin = new JTextField(14);
        var txtTc = new JTextField(14);

        pnlInfo.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        GroupLayout layout1 = new GroupLayout(pnlInfo);
        layout1.setAutoCreateContainerGaps(true);
        layout1.setAutoCreateGaps(true);

        layout1.setHorizontalGroup(layout1.createSequentialGroup()
                .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(lblName)
                        .addComponent(lblMasv)
                        .addComponent(lblEng)
                        .addComponent(lblTin)
                        .addComponent(lblTc))
                .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lblName2)
                        .addComponent(txtMasv)
                        .addComponent(txtEng)
                        .addComponent(txtTin)
                        .addComponent(txtTc))
                .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(lblDtb)
                        .addComponent(lblDTB))
        );

        layout1.setVerticalGroup(layout1.createSequentialGroup()
                .addGroup(layout1.createParallelGroup()
                    .addComponent(lblName)
                    .addComponent(lblName2))
                .addGroup(layout1.createParallelGroup()
                    .addComponent(lblMasv)
                    .addComponent(txtMasv))
                .addGroup(layout1.createParallelGroup()
                    .addComponent(lblEng)
                    .addComponent(txtEng)
                    .addComponent(lblDtb))
                .addGroup(layout1.createParallelGroup()
                    .addComponent(lblTin)
                    .addComponent(txtTin)
                    .addComponent(lblDTB))
                .addGroup(layout1.createParallelGroup()
                    .addComponent(lblTc)
                    .addComponent(txtTc))        
        );        
        pnlInfo.setLayout(layout1);
        
        //pnlBtn
        var btnNew = new JButton("New", new ImageIcon("new.png"));
        var btnSave = new JButton("Save", new ImageIcon("save.png"));
        var btnDel = new JButton("Delete", new ImageIcon("delete.png"));
        var btnUpdate = new JButton("Update", new ImageIcon("new.png"));
        
        btnNew.setPreferredSize(new Dimension(100, 22));
        btnSave.setPreferredSize(new Dimension(50, 22));
        btnDel.setPreferredSize(new Dimension(50, 22));
        btnUpdate.setPreferredSize(new Dimension(50, 22));
        
        pnlBtn.add(btnNew);
        pnlBtn.add(btnSave);
        pnlBtn.add(btnDel);
        pnlBtn.add(btnUpdate);
        
        pnl.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnl.add(pnlSearch, BorderLayout.NORTH);
        pnl.add(pnlInfo, BorderLayout.WEST);
        pnl.add(pnlBtn, BorderLayout.EAST);
        frm.add(pnl, BorderLayout.NORTH);
        frm.pack();
        frm.setVisible(true);
    }
}
