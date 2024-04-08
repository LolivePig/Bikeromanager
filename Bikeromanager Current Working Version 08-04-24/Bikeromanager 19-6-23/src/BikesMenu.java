import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class BikesMenu {

    private JPanel BikesMainPanel;
    private JPanel BikesTitlePanel;
    private JTextField BikesTextField;
    private JTextField BikesSubtitleTextField;
    private JButton BikesAddRow;
    private JScrollPane BikesScrollPane;
    private JTable BikesTable;
    private JComboBox BikesRowNumberComboBox;
    private JTextField BikesNumberPlateTextField;
    private JComboBox BikesSizeComboBox;
    private JTextField BikesBrandTextField;
    private JTextField BikesMakeTextField;
    private JComboBox BikesWashedComboBox;
    private JTextField BikesColourTextField;
    private JComboBox BikesOperationalComboBox;
    private JTextField BikesExtraInfoTextField;

    public BikesMenu() {
        System.out.println("Bikes Menu running");

        DefaultTableModel model = (DefaultTableModel)BikesTable.getModel();
        model.addColumn("Number Plate");
        model.addColumn("Size");
        model.addColumn("Brand");
        model.addColumn("Make");
        model.addColumn("Washed");
        model.addColumn("Colour");
        model.addColumn("Operational");
        model.addColumn("Extra Info");
        model.addRow(new Object[]{"704","Expert","Haro","Expert","Yes","Black and Red","Yes","Custom pedals and handlebars"});

        BikesTable.setModel(model);
        final int[] BikesNumberOfRows = {1};
        BikesAddRow.addActionListener(e -> {
            System.out.println(e.getID() == ActionEvent.ACTION_PERFORMED ? "Bike row added" : e.getID());
            model.addRow(new Object[]{"","","","","","","",""});
            BikesRowNumberComboBox.addItem(BikesNumberOfRows[0]);
            BikesNumberOfRows[0] = BikesNumberOfRows[0] + 1;
            BikesTable.setModel(model);
        });

        BikesRowNumberComboBox.addActionListener(e -> {
            BikesSubtitleTextField.setText("Further information about the table is displayed here. ");
            BikesNumberPlateTextField.setText(model.getValueAt(BikesRowNumberComboBox.getSelectedIndex(), 0).toString());
            BikesSizeComboBox.setSelectedItem(model.getValueAt(BikesRowNumberComboBox.getSelectedIndex(), 1).toString());
            BikesBrandTextField.setText(model.getValueAt(BikesRowNumberComboBox.getSelectedIndex(), 2).toString());
            BikesMakeTextField.setText(model.getValueAt(BikesRowNumberComboBox.getSelectedIndex(), 3).toString());
            BikesWashedComboBox.setSelectedItem(model.getValueAt(BikesRowNumberComboBox.getSelectedIndex(), 4).toString());
            BikesColourTextField.setText(model.getValueAt(BikesRowNumberComboBox.getSelectedIndex(), 5).toString());
            if (Objects.equals(model.getValueAt(BikesRowNumberComboBox.getSelectedIndex(), 6).toString(), "")) {BikesOperationalComboBox.setSelectedItem("Yes");
            } else {BikesOperationalComboBox.setSelectedItem(model.getValueAt(BikesOperationalComboBox.getSelectedIndex(), 6).toString());}
            BikesExtraInfoTextField.setText(model.getValueAt(BikesRowNumberComboBox.getSelectedIndex(), 7).toString());
        });

        BikesNumberPlateTextField.addActionListener(e -> model.setValueAt(BikesNumberPlateTextField.getText(),BikesRowNumberComboBox.getSelectedIndex(),0));
        BikesSizeComboBox.addActionListener(e -> model.setValueAt(BikesSizeComboBox.getSelectedItem(),BikesRowNumberComboBox.getSelectedIndex(),1));
        BikesBrandTextField.addActionListener(e -> model.setValueAt(BikesBrandTextField.getText(),BikesRowNumberComboBox.getSelectedIndex(),2));
        BikesMakeTextField.addActionListener(e -> model.setValueAt(BikesMakeTextField.getText(),BikesRowNumberComboBox.getSelectedIndex(),3));
        BikesWashedComboBox.addActionListener(e -> model.setValueAt(BikesWashedComboBox.getSelectedItem(),BikesRowNumberComboBox.getSelectedIndex(),4));
        BikesColourTextField.addActionListener(e -> model.setValueAt(BikesColourTextField.getText(),BikesRowNumberComboBox.getSelectedIndex(),5));
        BikesOperationalComboBox.addActionListener(e -> model.setValueAt(BikesOperationalComboBox.getSelectedItem(),BikesRowNumberComboBox.getSelectedIndex(),6));
        BikesExtraInfoTextField.addActionListener(e -> {
            model.setValueAt(BikesExtraInfoTextField.getText(),BikesRowNumberComboBox.getSelectedIndex(),7);
            BikesSubtitleTextField.setText(BikesExtraInfoTextField.getText());
        });
    }

    public static void main() {
        JFrame BikesFrame = new JFrame("Bikes");
        BikesFrame.setContentPane(new BikesMenu().BikesMainPanel);
        BikesFrame.pack();
        BikesFrame.setSize(1200, 600);
        BikesFrame.setLocationRelativeTo(null);
        BikesFrame.setVisible(true);

        BikesFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.out.println("Bikes Menu closed");
            }
        });
    }
}