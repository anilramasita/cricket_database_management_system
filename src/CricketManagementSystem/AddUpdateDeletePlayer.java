package CricketManagementSystem;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddUpdateDeletePlayer extends javax.swing.JFrame {

    /**
     * Creates new form AddNewPlayer
     */
    public AddUpdateDeletePlayer() {
	initComponents();
	userLoad();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        player_name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        player_id = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        joining_date = new com.toedter.calendar.JDateChooser();
        role = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        team_id = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        close = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPlayer = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel1.setText("ADD/UPDATE/DELETE PLAYER");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("Player Name");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Player ID");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel14.setText("Phone Number");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel15.setText("Address");

        player_name.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        phone.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        address.setColumns(15);
        address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        player_id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel16.setText("Role/Type Of Player");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel17.setText("Joining Date");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel18.setText("Date Of Birth");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel19.setText("Team ID Of Player");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel20.setText("Salary Of Player");

        joining_date.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        role.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        dob.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        team_id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        salary.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        save.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/save.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        close.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit application.png"))); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reset.png"))); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        tblPlayer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblPlayer.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tblPlayer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLAYER ID", "PLAYER NAME", "ADDRESS", "PHONE No", "D.O.B", "ROLE", "JOINING DATE", "SALARY", "TEAM ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlayerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPlayer);

        update.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Update details.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14)
                        .addGap(28, 28, 28)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(team_id, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(player_id, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(player_name, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel16)
                                .addGap(33, 33, 33)
                                .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(joining_date, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(save)
                        .addGap(52, 52, 52)
                        .addComponent(update)
                        .addGap(69, 69, 69)
                        .addComponent(delete)
                        .addGap(67, 67, 67)
                        .addComponent(reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(close)
                        .addGap(35, 35, 35)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12))
                    .addComponent(player_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11))
                    .addComponent(player_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel17)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(joining_date, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(team_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel19))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(update)
                    .addComponent(delete)
                    .addComponent(reset)
                    .addComponent(close))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel d;

    public void userLoad() {
	int count;
	try {
	    Connection con = ConnectionProvider.getConnection();
	    pst = con.prepareStatement("select * from player");
	    rs = pst.executeQuery();

	    ResultSetMetaData rsd = rs.getMetaData();
	    count = rsd.getColumnCount();
	    d = (DefaultTableModel) tblPlayer.getModel();
	    d.setRowCount(0);
	    while (rs.next()) {
		Vector v2 = new Vector();
		for (int i = 1; i <= count; i++) {
		    v2.add(rs.getString("player_id"));
		    v2.add(rs.getString("name"));
		    v2.add(rs.getString("address"));
		    v2.add(rs.getString("phone_no"));
		    v2.add(rs.getString("dob"));
		    v2.add(rs.getString("role"));
		    v2.add(rs.getString("since"));
		    v2.add(rs.getString("salary"));
		    v2.add(rs.getString("team_id"));
		}
		d.addRow(v2);
	    }
	} catch (SQLException ex) {
	    Logger.getLogger(AddUpdateDeletePlayer.class.getName()).log(Level.SEVERE, null, ex);
	}
    }

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
	this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
	player_id.setText("");
	player_name.setText("");
	address.setText("");
	phone.setText("");
	dob.setCalendar(null);
	role.setText("");
	joining_date.setCalendar(null);
	salary.setText("");
	team_id.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
	int playerid = Integer.parseInt(player_id.getText());
	String playerName = player_name.getText();
	String addr = address.getText();
	BigInteger phon = new BigInteger(phone.getText());
	SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
	String birthDate = dFormat.format(dob.getDate());
	String rol = role.getText();
	String joiningDate = dFormat.format(joining_date.getDate());
	String sal = salary.getText();
	String teamid = team_id.getText();

	try {
	    Connection con = ConnectionProvider.getConnection();
	    Statement st = con.createStatement();
	    st.executeUpdate("insert into player values('" + playerid + "', '" + playerName + "', '" + addr + "', '" + phon + "', '" + birthDate + "', '" + rol + "', '" + joiningDate + "', '" + sal + "', '" + teamid + "')");

	    JOptionPane.showMessageDialog(this, "Successfully Saved");

	    setVisible(false);
	    new AddUpdateDeletePlayer().setVisible(true);
	} catch (SQLException ex) {
	    Logger.getLogger(AddUpdateDeletePlayer.class.getName()).log(Level.SEVERE, null, ex);
	}

    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
	int playerid = Integer.parseInt(player_id.getText());
	String playerName = player_name.getText();
	String addr = address.getText();
	BigInteger phon = new BigInteger(phone.getText());
	SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
	String birthDate = dFormat.format(dob.getDate());
	String rol = role.getText();
	String joiningDate = dFormat.format(joining_date.getDate());
	String sal = salary.getText();
	String teamid = team_id.getText();
	try {
	    Connection con = ConnectionProvider.getConnection();
	    //Query to insert data to student table
	    pst = con.prepareStatement("update player set name = ?, address = ? , phone_no = ?, dob = ?, role = ?, since = ?, salary= ?, team_id = ? where player_id = ?");
	    pst.setString(1, playerName);
	    pst.setString(2, addr);
	    pst.setBigDecimal(3, new BigDecimal(phon));
	    pst.setString(4, birthDate);
	    pst.setString(5, rol);
	    pst.setString(6, joiningDate);
	    pst.setString(7, sal);
	    pst.setString(8, teamid);
	    pst.setInt(9, playerid);

	    pst.executeUpdate();

	    JOptionPane.showMessageDialog(this, "Succesfully Updated");

	    this.dispose();
	    new AddUpdateDeletePlayer().setVisible(true);
	} catch (SQLException ex) {
	    Logger.getLogger(AddUpdateDeletePlayer.class.getName()).log(Level.SEVERE, null, ex);
	}
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
	int playerid = Integer.parseInt(player_id.getText());
	try {
	    Connection con = ConnectionProvider.getConnection();
	    PreparedStatement pst = con.prepareStatement("delete from player where player_id = ?");
	    pst.setInt(1, playerid);

	    pst.executeUpdate();

	    JOptionPane.showMessageDialog(this, "Succesfully Deleted");

	    this.dispose();
	    new AddUpdateDeletePlayer().setVisible(true);
	} catch (SQLException ex) {
	    Logger.getLogger(AddUpdateDeletePlayer.class.getName()).log(Level.SEVERE, null, ex);
	}
    }//GEN-LAST:event_deleteActionPerformed

    private void tblPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlayerMouseClicked
	d = (DefaultTableModel) tblPlayer.getModel();
	int selectIndex = tblPlayer.getSelectedRow();
	//get the data from table to input fields
	player_id.setText(d.getValueAt(selectIndex, 0).toString());
	player_name.setText(d.getValueAt(selectIndex, 1).toString());
	address.setText(d.getValueAt(selectIndex, 2).toString());
	phone.setText(d.getValueAt(selectIndex, 3).toString());
	try {
	    java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) d.getValueAt(selectIndex, 4).toString());
	    dob.setDate(date);
	} catch (ParseException ex) {
	    Logger.getLogger(AddUpdateDeletePlayer.class.getName()).log(Level.SEVERE, null, ex);
	}
	role.setText(d.getValueAt(selectIndex, 5).toString());
	try {
	    java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) d.getValueAt(selectIndex, 6).toString());
	    joining_date.setDate(date);
	} catch (ParseException ex) {
	    Logger.getLogger(AddUpdateDeletePlayer.class.getName()).log(Level.SEVERE, null, ex);
	}
	salary.setText(d.getValueAt(selectIndex, 7).toString());
	team_id.setText(d.getValueAt(selectIndex, 8).toString());
    }//GEN-LAST:event_tblPlayerMouseClicked

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
	    java.util.logging.Logger.getLogger(AddUpdateDeletePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(AddUpdateDeletePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(AddUpdateDeletePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(AddUpdateDeletePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new AddUpdateDeletePlayer().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JButton close;
    private javax.swing.JButton delete;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private com.toedter.calendar.JDateChooser joining_date;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField player_id;
    private javax.swing.JTextField player_name;
    private javax.swing.JButton reset;
    private javax.swing.JTextField role;
    private javax.swing.JTextField salary;
    private javax.swing.JButton save;
    private javax.swing.JTable tblPlayer;
    private javax.swing.JTextField team_id;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
