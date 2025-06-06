/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugbes_pbo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DashboardMasyarakat extends JFrame {
    public DashboardMasyarakat() {
        setTitle("Dashboard");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel label = new JLabel("Selamat datang di Dashboard Masyarakat!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);
    }
}

