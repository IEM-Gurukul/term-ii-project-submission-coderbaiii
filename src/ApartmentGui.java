import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ApartmentGui {

    static DefaultTableModel model;
    static JLabel totalLabel;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Apartment Management System");
        frame.setSize(900,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.getContentPane().setBackground(new Color(230,240,255));

        JLabel title = new JLabel("Apartment Management System");
        title.setFont(new Font("Arial",Font.BOLD,24));
        title.setBounds(280,10,400,30);
        frame.add(title);

        // Sidebar
        JPanel sidebar = new JPanel();
        sidebar.setLayout(null);
        sidebar.setBounds(0,60,200,400);
        sidebar.setBackground(new Color(100,149,237));
        frame.add(sidebar);

        JButton addBtn = new JButton("Add Resident");
        addBtn.setBounds(25,40,150,35);
        addBtn.setBackground(new Color(144,238,144));
        addBtn.setFocusPainted(false);
        sidebar.add(addBtn);

        JButton removeBtn = new JButton("Remove Resident");
        removeBtn.setBounds(25,90,150,35);
        removeBtn.setBackground(new Color(255,160,160));
        removeBtn.setFocusPainted(false);
        sidebar.add(removeBtn);

        JButton searchBtn = new JButton("Search Resident");
        searchBtn.setBounds(25,140,150,35);
        searchBtn.setBackground(new Color(255,255,153));
        searchBtn.setFocusPainted(false);
        sidebar.add(searchBtn);

        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(25,190,150,35);
        exitBtn.setBackground(new Color(220,220,220));
        exitBtn.setFocusPainted(false);
        sidebar.add(exitBtn);

        // Table
        String[] columns = {"ID","Name","Contact","Apartment"};
        model = new DefaultTableModel(columns,0);

        JTable table = new JTable(model);
        table.setBackground(new Color(245,250,255));
        table.setRowHeight(25);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(220,80,640,300);
        frame.add(scrollPane);

        // Stats panel
        JPanel statsPanel = new JPanel();
        statsPanel.setBounds(220,400,640,40);
        statsPanel.setBackground(new Color(200,220,255));
        frame.add(statsPanel);

        totalLabel = new JLabel("Total Residents: 0");
        totalLabel.setFont(new Font("Arial",Font.BOLD,14));
        statsPanel.add(totalLabel);

        loadData();
        updateTotal();

        // Add Resident
        addBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String id = JOptionPane.showInputDialog("Enter ID");
                String name = JOptionPane.showInputDialog("Enter Name");
                String contact = JOptionPane.showInputDialog("Enter Contact");
                String apartment = JOptionPane.showInputDialog("Enter Apartment Number");

                model.addRow(new Object[]{id,name,contact,apartment});
                updateTotal();
                saveData();
            }
        });

        // Remove Resident
        removeBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                int row = table.getSelectedRow();

                if(row >= 0){
                    model.removeRow(row);
                    updateTotal();
                    saveData();
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Select a row first");
                }
            }
        });

        // Search Resident
        searchBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String id = JOptionPane.showInputDialog("Enter ID to search");

                for(int i=0;i<table.getRowCount();i++){

                    if(table.getValueAt(i,0).toString().equals(id)){
                        table.setRowSelectionInterval(i,i);
                        JOptionPane.showMessageDialog(frame,"Resident Found");
                        return;
                    }

                }

                JOptionPane.showMessageDialog(frame,"Resident not found");
            }
        });

        // Exit
        exitBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    static void updateTotal(){
        totalLabel.setText("Total Residents: " + model.getRowCount());
    }

    static void saveData(){

        try{
            PrintWriter pw = new PrintWriter(new FileWriter("residents.txt"));

            for(int i=0;i<model.getRowCount();i++){

                pw.println(
                        model.getValueAt(i,0)+","+
                        model.getValueAt(i,1)+","+
                        model.getValueAt(i,2)+","+
                        model.getValueAt(i,3)
                );
            }

            pw.close();
        }
        catch(Exception e){
            System.out.println("Error saving data");
        }
    }

    static void loadData(){

        try{
            BufferedReader br = new BufferedReader(new FileReader("residents.txt"));
            String line;

            while((line = br.readLine()) != null){

                String[] data = line.split(",");
                model.addRow(data);

            }

            br.close();
        }
        catch(Exception e){
        }
    }
}