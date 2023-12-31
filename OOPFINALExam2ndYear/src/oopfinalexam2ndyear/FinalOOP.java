package oopfinalexam2ndyear;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import static java.awt.SystemColor.text;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 14
 */
public class FinalOOP extends javax.swing.JFrame {

    
    private FinalSalary finalSalary;
    private SSS sss;
    private PagIbig pagIbig;
    private PhilHealth philHealth;
    

    /**
     * Creates new form march27act
     */
    public FinalOOP() {
        initComponents();
        this.sss = new SSS();
        this.pagIbig = new PagIbig();
        this.philHealth = new PhilHealth();
        this.finalSalary = new FinalSalary(sss, pagIbig, philHealth);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmployeeId = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtWork = new javax.swing.JTextField();
        txtHours = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtSave = new javax.swing.JButton();
        txtView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtViewAll = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtFinalSalary = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSSS = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpagIbig = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPhilHealth = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtbaseSalary = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Employee ID :");

        jLabel2.setText("Last Name :");

        jLabel3.setText("Work :");

        jLabel4.setText("Hours :");

        txtEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIdActionPerformed(evt);
            }
        });

        jLabel5.setText("First Name :");

        jLabel6.setText("Salary :");

        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });

        txtSave.setText("Save");
        txtSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaveActionPerformed(evt);
            }
        });

        txtView.setText("View All");
        txtView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewActionPerformed(evt);
            }
        });

        txtViewAll.setEditable(false);
        txtViewAll.setColumns(20);
        txtViewAll.setRows(5);
        jScrollPane1.setViewportView(txtViewAll);

        jLabel7.setText("Final Salary:");

        txtFinalSalary.setEditable(false);
        txtFinalSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalSalaryActionPerformed(evt);
            }
        });

        jLabel8.setText("SSS :");

        txtSSS.setEditable(false);

        jLabel9.setText("Pag-Ibig :");

        txtpagIbig.setEditable(false);

        jLabel10.setText("Phil-Health :");

        txtPhilHealth.setEditable(false);

        jLabel11.setText("Base Salary :");

        txtbaseSalary.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(txtSave, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(txtView, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 128, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHours, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmployeeId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWork, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSSS)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFinalSalary)
                        .addGap(6, 6, 6)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpagIbig)
                            .addComponent(txtFname, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                            .addComponent(txtSalary)
                            .addComponent(txtPhilHealth)
                            .addComponent(txtbaseSalary))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtPhilHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtSSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtpagIbig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFinalSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtbaseSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtView, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIdActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    private void txtViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewActionPerformed
        // TODO add your handling code here:
   /*Scanner scnr;
   
    
            scnr = new Scanner("student.txt");
        
       
            System.out.println("File Not Found. Try Again!");
        */
    
 /*  try{
        FileReader reader = new FileReader("student.txt");
        int data = reader.read();
        while(data != -1){
            System.out.print((char)data);
            data = reader.read();
        
        
        }
        reader.close();
        
        
        
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FinalOOP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FinalOOP.class.getName()).log(Level.SEVERE, null, ex);
     }
     */  
 
   
 
 /*
        txtViewAll.append("ID \t LAST NAME\t COURSE \t YEAR LEVEL \t ADDRESS\n");
       txtViewAll.setText("" + reader);
             
     txtId.setText("\n");        
     txtLname.setText("\n");       
     txtFname.setText("\n");        
     txtCourse.setText("\n");   
     txtYear.setText("\n");   
     txtAdd.setText("\n");        
    */

 try{ 
     File file1 = new File("Employee.txt");
     File file2 = new File("EmployeeSalary.txt");
     File file3 = new File("FinalSalary.txt");
     Scanner scan1 = new Scanner(file1);
     Scanner scan2 = new Scanner(file2);
     Scanner scan3 = new Scanner(file3);

    txtViewAll.setText("");
    txtViewAll.append("============================================================================================================================================================================================================================================\n");
    txtViewAll.append("Employee ID \t\t Last Name \t\t First Name \t\t Work \t\t Salary \t\t Hours \t\t SSS \t\t Pag-ibig \t\t philhealt \t\t final salary\n");
    txtViewAll.append("============================================================================================================================================================================================================================================\n");                  
                      

     while (scan1.hasNextLine()){
        String line = scan1.nextLine();
        String[] arr =line.split(",");
        
                      
     
      
  if(scan2.hasNextLine()){
         String arr2[] = scan2.nextLine().split(",");
 txtViewAll.append(arr2[0] + "\t\t" + arr[1].toUpperCase() +
                "\t\t" + arr[2].toUpperCase() +
                "\t\t" + arr[3].toUpperCase()  +
                "\t\t" + arr2[1] + " \t\t" + arr2[2] + "\t\t " + arr2[3] + "\t\t " + arr2[4] + "\t\t " + arr2[5] + "\t\t " + arr2[6] + "\n" );
      
        
           
             
            }
  else{
             txtViewAll.append(arr[0] + "\t\t" + arr[1].toUpperCase() +
                "\t\t" + arr[2].toUpperCase() +
                "\t\t" + arr[3].toUpperCase()  +
                "\t\t" + arr[4] +  "\n" );
             }
   
  
    }
 
     scan2.close();
 }      catch (FileNotFoundException ex) {
           ex.printStackTrace();
        }
   
    }//GEN-LAST:event_txtViewActionPerformed

    private void txtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaveActionPerformed
        // TODO add your handling code here:
          String textId = txtEmployeeId.getText();
          String lname = txtLname.getText();
          String fname = txtFname.getText();
          String Work = txtWork.getText();
          String Salary = txtSalary.getText();
          String Hours = txtHours.getText();
    
         if (textId.isEmpty() ||  lname.isEmpty() || fname.isEmpty() || Work.isEmpty() || Salary.isEmpty() || Hours.isEmpty() )
      {
         
          JOptionPane.showMessageDialog(null, "SOME FIELDS ARE EMPTY!");
          return;
      }
      else {
         
        
      }
          
       try {
        Scanner scanner0 = new Scanner(new File("students.txt"));
        while (scanner0.hasNextLine()) {
            String line = scanner0.nextLine();
            String[] values = line.split(",");
            if (values[0].equals(textId)) {
                JOptionPane.showMessageDialog(null, "student ID already exists.");
                scanner0.close();
                return;
            } else {
            }
        }
       
        } catch (FileNotFoundException ex) {
        }
        try{
            
           
      FileWriter writer = new FileWriter("Employee.txt", true);      
   
     writer.write( txtEmployeeId.getText() + "," + txtLname.getText() + "," + txtFname.getText()
                             + "," + txtWork.getText()  +"\n");
      
         writer.close();
     
        
        
        double salary = Double.parseDouble(txtSalary.getText());
        double hoursWorked = Double.parseDouble(txtHours.getText());
        double baseSalary = salary * hoursWorked;
        double sssDeduction = sss.calculateSSSDeduction(baseSalary);
        double pagIbigDeduction = pagIbig.calculatePagIbigDeduction(baseSalary);
        double philHealthDeduction = philHealth.calculatePhilHealthDeduction(baseSalary);
        
        double finalSalaryAmount = finalSalary.calculateFinalSalary(baseSalary);

         FileWriter writer2 = new FileWriter("EmployeeSalary.txt", true); 
      
      writer2.write(txtEmployeeId.getText() + "," + txtSalary.getText() + "," + txtHours.getText() + "," 
              + sssDeduction + "," + pagIbigDeduction + "," + philHealthDeduction + "," + finalSalaryAmount + "\n");

      
        writer2.close();
        
        txtSSS.setText(String.valueOf(sssDeduction));
        txtpagIbig.setText(String.valueOf(pagIbigDeduction));
        txtPhilHealth.setText(String.valueOf(philHealthDeduction));
        // Store the final salary amount or display it as needed
        txtFinalSalary.setText(String.valueOf(finalSalaryAmount));
        txtbaseSalary.setText(String.valueOf(baseSalary));
     
      
   
    
      

        
           } catch (IOException e) {
        Logger.getLogger(FinalOOP.class.getName()).log(Level.SEVERE, null, e);
        }
        
        

        
    }//GEN-LAST:event_txtSaveActionPerformed

    private void txtFinalSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalSalaryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FinalOOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalOOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalOOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalOOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalOOP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtFinalSalary;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtHours;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPhilHealth;
    private javax.swing.JTextField txtSSS;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JButton txtSave;
    private javax.swing.JButton txtView;
    private javax.swing.JTextArea txtViewAll;
    private javax.swing.JTextField txtWork;
    private javax.swing.JTextField txtbaseSalary;
    private javax.swing.JTextField txtpagIbig;
    // End of variables declaration//GEN-END:variables

    private Readable file(String studenttxt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
