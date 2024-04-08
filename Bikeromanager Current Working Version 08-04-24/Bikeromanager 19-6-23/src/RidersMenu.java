import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RidersMenu {

    private JPanel RidersMainPanel;
    private JPanel RidersTitlePanel;
    private JTextField RidersTextField;
    private JTextField RidersSubtitleTextField;
    private JButton RidersAddRow;
    private JScrollPane RidersScrollPane;
    private JTable RidersTable;
    private JComboBox RidersRowNumberComboBox;
    private JTextField RidersNameTextField;
    private JComboBox RidersMemberComboBox;
    private JComboBox RidersSkillComboBox;
    private JComboBox RidersBikeSizeComboBox;
    private JComboBox RidersAgeComboBox;
    private JComboBox RidersGenderComboBox;
    private JTextField RidersSessionsPaidTextField;
    private JComboBox RidersOwnKitComboBox;
    private JTextField RidersExtraInfoTextField;

    public RidersMenu() {
        System.out.println("Riders Menu running");

        DefaultTableModel model = (DefaultTableModel)RidersTable.getModel();
        model.addColumn("Name - Numberplate");
        model.addColumn("Membership");
        model.addColumn("Skill Level");
        model.addColumn("Bike Size");
        model.addColumn("Age");
        model.addColumn("Gender");
        model.addColumn("Sessions paid for");
        model.addColumn("Has own kit?");
        model.addColumn("Extra Info");
        model.addRow(new Object[]{"Ben McXavier - 747","Yes","Intermediate","Junior","14","Male","42","Yes","Close to expert"});

        RidersTable.setModel(model);
        final int[] RidersNumberOfRows = {1};
        RidersAddRow.addActionListener(e -> {
            System.out.println(e.getID() == ActionEvent.ACTION_PERFORMED ? "Rider row added" : e.getID());
            model.addRow(new Object[]{"","","","","","","",""});
            RidersRowNumberComboBox.addItem(RidersNumberOfRows[0]);
            RidersNumberOfRows[0] = RidersNumberOfRows[0] + 1;
            RidersTable.setModel(model);
        });

        RidersRowNumberComboBox.addActionListener(e -> {
            RidersSubtitleTextField.setText("Further information about the table is displayed here. ");
            RidersNameTextField.setText(model.getValueAt(RidersRowNumberComboBox.getSelectedIndex(), 0).toString());
            if (Objects.equals(model.getValueAt(RidersRowNumberComboBox.getSelectedIndex(), 1).toString(), "")) {RidersMemberComboBox.setSelectedItem("Yes");
            } else {RidersMemberComboBox.setSelectedItem(model.getValueAt(RidersMemberComboBox.getSelectedIndex(), 1).toString());}
            RidersSkillComboBox.setSelectedItem(model.getValueAt(RidersRowNumberComboBox.getSelectedIndex(), 2).toString());
            RidersBikeSizeComboBox.setSelectedItem(model.getValueAt(RidersRowNumberComboBox.getSelectedIndex(), 3).toString());
            RidersAgeComboBox.setSelectedItem(model.getValueAt(RidersRowNumberComboBox.getSelectedIndex(), 4).toString());
            if (Objects.equals(model.getValueAt(RidersRowNumberComboBox.getSelectedIndex(), 5).toString(), "")) {RidersGenderComboBox.setSelectedItem("Male");
            } else {RidersGenderComboBox.setSelectedItem(model.getValueAt(RidersGenderComboBox.getSelectedIndex(), 5).toString());}
            RidersSessionsPaidTextField.setText(model.getValueAt(RidersRowNumberComboBox.getSelectedIndex(),6).toString());
            if (Objects.equals(model.getValueAt(RidersRowNumberComboBox.getSelectedIndex(), 7).toString(), "")) {RidersOwnKitComboBox.setSelectedItem("Yes");
            } else {RidersOwnKitComboBox.setSelectedItem(model.getValueAt(RidersOwnKitComboBox.getSelectedIndex(), 7).toString());}
            if (model.getValueAt(RidersRowNumberComboBox.getSelectedIndex(), 8)==null){
                RidersExtraInfoTextField.setText("");
            } else {RidersExtraInfoTextField.setText(model.getValueAt(RidersRowNumberComboBox.getSelectedIndex(), 8).toString());}
        });

        RidersNameTextField.addActionListener(e -> model.setValueAt(RidersNameTextField.getText(),RidersRowNumberComboBox.getSelectedIndex(),0));
        RidersMemberComboBox.addActionListener(e -> model.setValueAt(RidersMemberComboBox.getSelectedItem(),RidersRowNumberComboBox.getSelectedIndex(),1));
        RidersSkillComboBox.addActionListener(e -> model.setValueAt(RidersSkillComboBox.getSelectedItem(),RidersRowNumberComboBox.getSelectedIndex(),2));
        RidersBikeSizeComboBox.addActionListener(e -> model.setValueAt(RidersBikeSizeComboBox.getSelectedItem(),RidersRowNumberComboBox.getSelectedIndex(),3));
        RidersAgeComboBox.addActionListener(e -> model.setValueAt(RidersAgeComboBox.getSelectedItem(),RidersRowNumberComboBox.getSelectedIndex(),4));
        RidersGenderComboBox.addActionListener(e -> model.setValueAt(RidersGenderComboBox.getSelectedItem(),RidersRowNumberComboBox.getSelectedIndex(),5));
        RidersSessionsPaidTextField.addActionListener(e -> model.setValueAt(RidersSessionsPaidTextField.getText(),RidersRowNumberComboBox.getSelectedIndex(),6));
        RidersOwnKitComboBox.addActionListener(e -> model.setValueAt(RidersOwnKitComboBox.getSelectedItem(),RidersRowNumberComboBox.getSelectedIndex(),7));
        RidersExtraInfoTextField.addActionListener(e -> {
            model.setValueAt(RidersExtraInfoTextField.getText(),RidersRowNumberComboBox.getSelectedIndex(),8);
            RidersSubtitleTextField.setText(RidersExtraInfoTextField.getText());
        });
    }

    public static void main(int[] a) {
        JFrame RidersFrame = new JFrame("Riders");
        RidersFrame.setContentPane(new RidersMenu().RidersMainPanel);
        RidersFrame.pack();
        RidersFrame.setSize(1200, 600);
        RidersFrame.setLocationRelativeTo(null);
        RidersFrame.setVisible(true);

        RidersFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.out.println("Riders Menu closed");
                a[1] = 0;
            }
        });
    }
}