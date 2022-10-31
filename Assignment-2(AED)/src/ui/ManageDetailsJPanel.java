/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author riteesh
 */
public class ManageDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDetailsJPanel
     */
    public ManageDetailsJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txtSystolicBp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientDetails = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtPatientId = new javax.swing.JTextField();
        txtAbnormal = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAddCsv = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        btnAbnormal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        txtHouse = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setText("ZIP Code:");

        tblPatientDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "DOB", "House", "Community", "City", "Zip Code", "Systolic BP", "Last Updated", "Abnormal"
            }
        ));
        jScrollPane1.setViewportView(tblPatientDetails);

        jLabel2.setText("Patient ID:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        btnAddCsv.setText("Add CSV");
        btnAddCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCsvActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAbnormal.setText("View Abnormal Cases");
        btnAbnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbnormalActionPerformed(evt);
            }
        });

        jLabel4.setText("DOB:");

        jLabel5.setText("House:");

        jLabel6.setText("Community:");

        btnUpdate.setText("Update!");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel7.setText("City:");

        jLabel9.setText("Systolic BP:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSystolicBp, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAbnormal, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbnormal))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnView))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAddCsv)
                                    .addComponent(btnDelete))))
                        .addGap(104, 104, 104))))
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(btnUpdate)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnView))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbnormal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddCsv)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSystolicBp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAbnormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        txtAbnormal.setText("");
        boolean patientExists = false;
        for(Patient p:Patient.getEncounterHistory().keySet()){
            if(Integer.parseInt(txtPatientId.getText())==p.getPatientId()){
                patientExists = true;
                txtPatientId.setText(p.getPatientId()+"");
                txtName.setText(p.getName());
                txtDob.setText(p.getDob());
                txtHouse.setText(p.getCommunity().getHouse());
                txtCommunity.setText(p.getCommunity().getCommunity());
                txtCity.setText(p.getCommunity().getCity());
                txtZip.setText(p.getCommunity().getZipCode()+"");
                if(Patient.getEncounterHistory().get(p).size()>0){
                    txtSystolicBp.setText(Patient.getEncounterHistory().get(p).get(Patient.getEncounterHistory().get(p).size()-1).getSysBP()+"");
                }else{
                    txtSystolicBp.setText("NA");
                }
                Map<Patient,ArrayList<Encounter>> map = new HashMap<>();
                map.put(p, Patient.getEncounterHistory().get(p));
                populatePatientTable(map);
                break;
            }
        }
        if(!patientExists){
            JOptionPane.showMessageDialog(btnSearch, "Patient Id does not exists");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        txtAbnormal.setText("");
        int selectedRow = tblPatientDetails.getSelectedRow();

        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please Select a row");
        }else{
            Patient p = (Patient) tblPatientDetails.getValueAt(selectedRow, 0);
            txtPatientId.setText(p.getPatientId()+"");
            txtName.setText(p.getName());
            txtDob.setText(p.getDob());
            txtHouse.setText(p.getCommunity().getHouse());
            txtCommunity.setText(p.getCommunity().getCommunity());
            txtCity.setText(p.getCommunity().getCity());
            txtZip.setText(p.getCommunity().getZipCode()+"");
            if(Patient.getEncounterHistory().get(p).size()>0){
                txtSystolicBp.setText(Patient.getEncounterHistory().get(p).get(Patient.getEncounterHistory().get(p).size()-1).getSysBP()+"");
            }else{
                txtSystolicBp.setText("NA");
            }

        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnAddCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCsvActionPerformed
        // TODO add your handling code here:
        JFileChooser browse = new JFileChooser();
        FileNameExtensionFilter fname = new FileNameExtensionFilter("CSV","csv");
        browse.addChoosableFileFilter(fname);
        int showOpenDialogue = browse.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browse.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);
            Path pathToFile = Paths.get(selectedImagePath);
            try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
            {
                String line = br.readLine();
                while (line != null)
                {
                    String[] attributes = line.split(",");
                    Patient p = CreatePatient(attributes);
                    Patient.addPatient(p);
                    line = br.readLine();
                }
            } catch (IOException ex) {
                Logger.getLogger(ManageDetailsJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(ManageDetailsJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Enter Correct Data and try again");
            return;
        }
    }//GEN-LAST:event_btnAddCsvActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        txtAbnormal.setText("");
        int selectedRow = tblPatientDetails.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please Select a row to delete");
        }else{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the patient entry ? ", "Warning", dialogButton);

            if(dialogResult == JOptionPane.YES_OPTION){

                Patient p = (Patient) tblPatientDetails.getValueAt(selectedRow, 0);
                Patient.getEncounterHistory().remove(p);
                populatePatientTable(Patient.getEncounterHistory());

                JOptionPane.showMessageDialog(this, "Patient entry deleted");
            }

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAbnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbnormalActionPerformed
        // TODO add your handling code here:
        boolean zipCodeExists = false;
        boolean patientExists = false;
        boolean vitalSignsExists = true;
        int count = 0;
        Patient pa = new Patient();
        Map<Patient,ArrayList<Encounter>> map = new HashMap<>();
        for(Patient p:Patient.getEncounterHistory().keySet()){

            if(Integer.parseInt(txtZip.getText())==p.getCommunity().getZipCode()){
                zipCodeExists = true;
                if(Patient.getEncounterHistory().get(p).size()==0){
                    vitalSignsExists = false;
                    pa=p;
                    break;
                }
                if(p.isAbnormal()){
                    patientExists = true;
                    count++;
                    map.put(p, Patient.getEncounterHistory().get(p));
                }

            }
        }

        if(vitalSignsExists){
            if(!zipCodeExists){
                JOptionPane.showMessageDialog(btnAbnormal, "Zip Code does not exists");
            }else if(zipCodeExists && !patientExists){
                populatePatientTable(map);
                txtAbnormal.setText("No Abnormal cases in this community");
            }else{
                populatePatientTable(map);
                txtAbnormal.setText("Total "+count+" people has abnormal BP in this community");
            }
        }else{
            JOptionPane.showMessageDialog(btnAbnormal, "Vital Sign History does not exists for patientId="+pa.getPatientId()+" in this community");
        }

    }//GEN-LAST:event_btnAbnormalActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtAbnormal.setText("");
        Encounter vs;
        Patient p;
        boolean patientExists;
        Community comm;

        int age=0;
        p = new Patient();
        ArrayList<Encounter> existedArray = new ArrayList<>();
        Map<Patient, ArrayList<Encounter>> map = Patient.getEncounterHistory();
        patientExists = false;
        for (Patient patient : map.keySet()) {
            if (Integer.parseInt(txtPatientId.getText()) == patient.getPatientId()) {
                patientExists = true;
                existedArray = map.get(patient);
                p = patient;
            }
        }
        JTextField[] VARIABLE_CONSTANTS = {txtPatientId,txtName,txtDob,txtHouse,txtCommunity,txtCity,txtZip};
        boolean validated = false;
        for (JTextField field : VARIABLE_CONSTANTS) {
            if (!validateData(field)) {
                validated = false;
                break;
            } else {
                validated = true;
            }
        }
        if (patientExists) {
            if (validated){
                comm = new Community();
                comm.setHouse(txtHouse.getText());
                comm.setCommunity(txtCommunity.getText());
                comm.setCity(txtCity.getText());
                comm.setZipCode(Integer.parseInt(txtZip.getText()));

                String dob = txtDob.getText();
                try {
                    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
                    LocalDate ld = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    Period period = Period.between(ld, LocalDate.now());
                    age = (period.getYears() * 12) + period.getMonths();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(btnUpdate, "Enter date in the requried format");
                }
                p.setPatientId(Integer.parseInt(txtPatientId.getText()));
                p.setName(txtName.getText());
                p.setAge(age);
                p.setDob(dob);
                p.setCommunity(comm);

                vs = new Encounter();
                vs.setSysBP(Double.parseDouble(txtSystolicBp.getText()));
                vs.setEntryDateTime(LocalDateTime.now());
                if(isVitalSignAbnormal(p,vs)){
                    p.setAbnormal(true);
                }else{
                    p.setAbnormal(false);
                }
                existedArray.add(vs);
                map.put(p, existedArray);
                populatePatientTable(map);
                JOptionPane.showMessageDialog(btnUpdate, "Updated Patient details successfully");}
        } else {
            JOptionPane.showMessageDialog(btnUpdate, "Patient does not exists");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbnormal;
    private javax.swing.JButton btnAddCsv;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPatientDetails;
    private javax.swing.JTextField txtAbnormal;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtSystolicBp;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
