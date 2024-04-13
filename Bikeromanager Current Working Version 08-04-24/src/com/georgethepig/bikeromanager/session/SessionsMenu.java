package com.georgethepig.bikeromanager.session;

import java.awt.event.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.TableUI;
import javax.swing.table.DefaultTableModel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SessionsMenu {

    private JPanel SessionsMainPanel;
    private JPanel SessionsTitlePanel;
    private JTextField SessionsTitleTextField;
    private JTextField SessionsSubtitleTextField;
    private JButton SessionsAddRow;
    private JScrollPane SessionsScrollPane;
    private JTable SessionsTable;
    private JComboBox SessionsRowNumberComboBox;
    private JTextField SessionsNameTextField;
    private JTextField SessionsDateTextField;
    private JComboBox SessionsStartComboBox;
    private JComboBox SessionsEndComboBox;
    private JComboBox SessionsSkillComboBox;
    private JComboBox SessionsGenderComboBox;
    private JComboBox SessionsTypeComboBox;
    private JTextField SessionsLeaderTextField;
    private JTextField SessionsExtraInfoTextField;
    private static final int[] SessionsNumberOfRows = {1};
    public DefaultTableModel model;

    public SessionsMenu() {

        model = (DefaultTableModel)SessionsTable.getModel();

        System.out.println("Sessions Menu running");

        model.addColumn("Session Name");
        model.addColumn("Date");
        model.addColumn("Start Time");
        model.addColumn("End Time");
        model.addColumn("Skill Level");
        model.addColumn("Genders Allowed");
        model.addColumn("Session Type");
        model.addColumn("Session Leader");
        model.addColumn("Extra Info");
        model.addRow(new Object[]{"Saturday Skills Session","28/10/2023","11:00","13:00","Intermediate","All","Skills","Silvia","Alan as helper"});

//        for(int h = 0; h < 99; h++) {
//            model.addRow(new Object[]{"","","","","","","","",""});
//            SessionsNumberOfRows[0] = SessionsNumberOfRows[0] + 1;
//        }

        SessionsTable.setModel(model);
        SessionsAddRow.addActionListener(e -> {
            System.out.println(e.getID() == ActionEvent.ACTION_PERFORMED ? "Session row added" : e.getID());
            model.addRow(new Object[]{"","","","","","","","",""});
            SessionsRowNumberComboBox.addItem(SessionsNumberOfRows[0]);
            SessionsNumberOfRows[0] = SessionsNumberOfRows[0] + 1;
            SessionsTable.setModel(model);
        });

        SessionsRowNumberComboBox.addActionListener(e -> {
            SessionsSubtitleTextField.setText("Further information about the table is displayed here. ");
            SessionsNameTextField.setText(model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 0).toString());
            SessionsDateTextField.setText(model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 1).toString());
            if (Objects.equals(model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 2).toString(), "")) {SessionsStartComboBox.setSelectedItem("00:00");
            } else {SessionsStartComboBox.setSelectedItem(model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 2).toString());}
            if (Objects.equals(model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 3).toString(), "")) {SessionsEndComboBox.setSelectedItem("00:00");
            } else {SessionsEndComboBox.setSelectedItem(model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 3).toString());}
            if (Objects.equals(model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 4).toString(), "")) {SessionsSkillComboBox.setSelectedItem("All");
            } else {SessionsSkillComboBox.setSelectedItem(model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 4).toString());}
            if (Objects.equals(model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 5).toString(), "")) {SessionsGenderComboBox.setSelectedItem("All");
            } else {SessionsGenderComboBox.setSelectedItem(model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 5).toString());}
            if (Objects.equals(model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 6).toString(), "")) {SessionsTypeComboBox.setSelectedItem("Other");
            } else {SessionsTypeComboBox.setSelectedItem(model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 6).toString());}
            SessionsLeaderTextField.setText(model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 7).toString());
            SessionsExtraInfoTextField.setText(model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 8).toString());
        });

        SessionsNameTextField.addActionListener(e -> {
            model.setValueAt(SessionsNameTextField.getText(),SessionsRowNumberComboBox.getSelectedIndex(),0);
            SessionsSubtitleTextField.setText("Further information about the table is displayed here. ");

            if (SessionsNameTextField.getText().toLowerCase().contains("novice") || SessionsNameTextField.getText().toLowerCase().contains("beginner")){
                SessionsSkillComboBox.setSelectedItem("Novice");
                SessionsSubtitleTextField.setText(SessionsSubtitleTextField.getText() + "The skill level allowed has been automatically assigned as 'Novice'. ");
            } else if (SessionsNameTextField.getText().toLowerCase().contains("intermediate")){
                SessionsSkillComboBox.setSelectedItem("Intermediate");
                SessionsSubtitleTextField.setText(SessionsSubtitleTextField.getText() + "The skill level allowed has been automatically assigned as 'Intermediate'. ");
            } else if (SessionsNameTextField.getText().toLowerCase().contains("expert")){
                SessionsSkillComboBox.setSelectedItem("Expert");
                SessionsSubtitleTextField.setText(SessionsSubtitleTextField.getText() + "The skill level allowed has been automatically assigned as 'Expert'. ");
            }
            if (SessionsNameTextField.getText().toLowerCase().contains("women")){
                SessionsGenderComboBox.setSelectedItem("Female only");
                SessionsSubtitleTextField.setText(SessionsSubtitleTextField.getText() + "The genders allowed has been automatically assigned as 'Female only'. ");
            }
            if (SessionsNameTextField.getText().toLowerCase().contains("skill")){
                SessionsTypeComboBox.setSelectedItem("Skills");
                SessionsSubtitleTextField.setText(SessionsSubtitleTextField.getText() + "The session type has been automatically assigned as 'Skills'. ");
            } else if (SessionsNameTextField.getText().toLowerCase().contains("race")){
                SessionsTypeComboBox.setSelectedItem("Race");
                SessionsSubtitleTextField.setText(SessionsSubtitleTextField.getText() + "The session type has been automatically assigned as 'Race'. ");
            } else if (SessionsNameTextField.getText().toLowerCase().contains("gate")){
                SessionsTypeComboBox.setSelectedItem("Gate Practice");
                SessionsSubtitleTextField.setText(SessionsSubtitleTextField.getText() + "The session type has been automatically assigned as 'Gate Practice'. ");
            }
        });

        SessionsDateTextField.addActionListener(e -> {
            model.setValueAt(SessionsDateTextField.getText(),SessionsRowNumberComboBox.getSelectedIndex(),1);

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String inputDate = model.getValueAt(SessionsRowNumberComboBox.getSelectedIndex(), 1).toString();
            try {
                LocalDate sessionsDate = LocalDate.parse(inputDate, dateFormatter);
                System.out.println(inputDate + " is a valid date: " + sessionsDate );
                LocalDate currentDate = LocalDate.now();
                Period period = Period.between(sessionsDate, currentDate);
                String years = Math.abs(period.getYears()) + " years ";
                if (years.equals("0 years ")) years = "";
                String months = Math.abs(period.getMonths()) + " months and ";
                if (months.equals("0 months and ")) months = "";
                int days = Math.abs(period.getDays());
                SessionsSubtitleTextField.setText("There are " + years + months + days + " days between " + currentDate + " and " + sessionsDate);
            } catch (DateTimeParseException dtpe) {
                SessionsSubtitleTextField.setText(inputDate + " is an invalid date: Please use the dd/MM/yyyy format");
            }
        });

        SessionsStartComboBox.addActionListener(e -> model.setValueAt(SessionsStartComboBox.getSelectedItem(),SessionsRowNumberComboBox.getSelectedIndex(),2));
        SessionsEndComboBox.addActionListener(e -> model.setValueAt(SessionsEndComboBox.getSelectedItem(),SessionsRowNumberComboBox.getSelectedIndex(),3));
        SessionsSkillComboBox.addActionListener(e -> model.setValueAt(SessionsSkillComboBox.getSelectedItem(),SessionsRowNumberComboBox.getSelectedIndex(),4));
        SessionsGenderComboBox.addActionListener(e -> model.setValueAt(SessionsGenderComboBox.getSelectedItem(),SessionsRowNumberComboBox.getSelectedIndex(),5));
        SessionsTypeComboBox.addActionListener(e -> model.setValueAt(SessionsTypeComboBox.getSelectedItem(),SessionsRowNumberComboBox.getSelectedIndex(),6));
        SessionsLeaderTextField.addActionListener(e -> model.setValueAt(SessionsLeaderTextField.getText(),SessionsRowNumberComboBox.getSelectedIndex(),7));
        SessionsExtraInfoTextField.addActionListener(e -> {
            model.setValueAt(SessionsExtraInfoTextField.getText(),SessionsRowNumberComboBox.getSelectedIndex(),8);
            SessionsSubtitleTextField.setText(SessionsExtraInfoTextField.getText());
        });
    }

    public void main(int[] a) {
        JFrame SessionsFrame = new JFrame("Sessions");
        SessionsFrame.setContentPane(new SessionsMenu().SessionsMainPanel);
        SessionsFrame.pack();
        SessionsFrame.setSize(1200, 600);
        SessionsFrame.setLocationRelativeTo(null);
        SessionsFrame.setVisible(true);

        try {
            File SessionsFile = new File("SessionsFile.txt");
            if (SessionsFile.createNewFile()) {
                System.out.println("New sessions file has been created: " + SessionsFile.getName());
            } else {
                System.out.println("Sessions file has already been created: " + SessionsFile.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        SessionsFrame.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent event) {
                FileWriter sessionsWriter;
                a[0] = 0;

                System.out.println("Table rows: " + model.getRowCount());
                System.out.println("Row Counter: " + SessionsNumberOfRows[0]);

                try {
                    sessionsWriter = new FileWriter("SessionsFile.txt");
                    for (int i = 0; i < model.getRowCount(); i++)
                    //for (int i = 0; i < 1; i++)
                    {
                        for (int j = 0; j < 9; j++) {
                            String input = SessionsTable.getValueAt(i,j).toString();
                            System.out.println(i + " " + j + " " + input);
                            sessionsWriter.write(input + "\n");
                            //unable to progress any further; unsure how to read from table to text file because java
                            //won't allow "model" to be static, tried fixing this for 2 hours before giving up
                        }
                    }
                    System.out.println("Successfully wrote to the file.");
                    sessionsWriter.close();
                } catch (IOException e) {throw new RuntimeException(e);}
                System.out.println("Sessions Menu closed");
            }
        });
    }
}

//SessionsFrame.setResizable(false); // makes frame unresizable

//ImageIcon image = new ImageIcon("George von Flüffenheimer.jpg");
//sets image as top left icon of the frame, need file path OR file name if part of project folder e.g. "logo.png")
// 2/2/24 unfortunately this isnt working
//SessionsFrame.setIconImage(image.getImage());
//changes the icon of the frame
// 2/2/24 this isnt working either

//java.awt.color
//SessionsFrame.getContentPane().setBackground(new Color(0xFF00B2));
//(123,50,250) for lovely purple