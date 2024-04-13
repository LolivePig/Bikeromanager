package com.georgethepig.bikeromanager;

import com.georgethepig.bikeromanager.session.*;
import com.georgethepig.bikeromanager.rider.*;
import com.georgethepig.bikeromanager.bike.*;
import com.georgethepig.bikeromanager.misc.*;

import javax.swing.*;
import java.awt.Color;

public class MainMenu {
    private JPanel MainPanel;
    private JTextField bikeromanagerTextField;

    public JPanel SessionsMainPanel;
    private JButton sessionsButton;

    public JPanel RidersMainPanel;
    private JButton ridersButton;

    public JPanel BikesMainPanel;
    private JButton bikesButton;

    public JPanel MiscellaneousMainPanel;
    private JButton miscellaneousButton;

    public static int[] a = new int[]{0, 0, 0, 0};

    public MainMenu() {

        System.out.println("running");

        sessionsButton.addActionListener(e -> {
            if (a[0] == 0) {
                SessionsMenu mainMenu = new SessionsMenu();
                mainMenu.main(a);
                a[0] = a[0] + 1;
            }
        });

        ridersButton.addActionListener(e -> {
            if (a[1] == 0) {
                RidersMenu mainMenu = new RidersMenu();
                mainMenu.main(a);
                a[1] = a[1] + 1;
            }
        });

        bikesButton.addActionListener(e -> {
            if (a[2] == 0) {
                BikesMenu mainMenu = new BikesMenu();
                BikesMenu.main();
                a[2] = a[2] + 1;
            }
        });

        miscellaneousButton.addActionListener(e -> {
            if (a[3] == 0) {
                MiscMenu mainMenu = new MiscMenu();
                MiscMenu.main();
                a[3] = a[3] + 1;
            }
        });
    }

    public static void main() {
        JFrame Frame1 = new JFrame("Main Menu");
        Frame1.setContentPane(new MainMenu().MainPanel);
        Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame1.pack();
        Frame1.setSize(500,500);
        Frame1.setVisible(true);
        Frame1.getContentPane().setBackground(new Color(0xFF00B2));
    }
}