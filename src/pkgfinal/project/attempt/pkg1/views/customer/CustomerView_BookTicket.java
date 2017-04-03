/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project.attempt.pkg1.views.customer;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author Yosua
 */
public class CustomerView_BookTicket extends javax.swing.JFrame {

    /**
     * Creates new form CustomerView_Interface_V2
     */
    public CustomerView_BookTicket() {
        initComponents();
        String index = null;
        
        
      
            
            
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        poster1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMovies = new javax.swing.JButton();
        btnTickets = new javax.swing.JButton();
        btnCinemas = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnSignOut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        locationBox = new javax.swing.JComboBox<>();
        lblTime1 = new javax.swing.JLabel();
        lblMovie = new javax.swing.JLabel();
        movieBox = new javax.swing.JComboBox<>();
        timeBox = new javax.swing.JComboBox<>();
        lblTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxTheater = new javax.swing.JComboBox<>();
        btnChooseSeat = new javax.swing.JButton();
        lblSeat = new javax.swing.JLabel();
        lblPoster = new javax.swing.JLabel();
        lblMovieName = new javax.swing.JLabel();
        lblDirector = new javax.swing.JLabel();
        lblGenre = new javax.swing.JLabel();
        lblRating = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        btnViewTrailer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblLocationName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        btnBookTicket = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnMyAccount = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        poster1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton7.setText("My Account");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 720));

        jLabel1.setText("Welcome to the Yosua - Enrico Cinema");

        btnMovies.setText("Movies");

        btnTickets.setText("Tickets");

        btnCinemas.setText("Cinemas");

        txtSearch.setText("Search by Movie");
        txtSearch.setToolTipText("Search by Movie");

        jLabel2.setText("Book Ticket");

        btnSignOut.setText("Sign Out");

        jLabel3.setText("Welcome, Yosua");

        locationBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        locationBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locationBoxMouseClicked(evt);
            }
        });
        locationBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationBoxActionPerformed(evt);
            }
        });

        lblTime1.setText("Location");

        lblMovie.setText("Movie");

        movieBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        timeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        lblTime.setText("Time");

        jLabel4.setText("Theater");

        cbxTheater.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        btnChooseSeat.setText("Choose Seat");
        btnChooseSeat.setEnabled(false);
        btnChooseSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseSeatActionPerformed(evt);
            }
        });

        lblSeat.setText("Seat");

        lblPoster.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMovieName.setFont(new java.awt.Font("Yuppy SC", 0, 18)); // NOI18N
        lblMovieName.setText("[Movie Title]");

        lblDirector.setText("[Director]");

        lblGenre.setText("[Genre1, Genre 2, Genre 3]");

        lblRating.setText("[Rating]");

        lblDuration.setText("[Duration]");

        btnViewTrailer.setText("View Trailer");
        btnViewTrailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTrailerActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yuppy SC", 0, 18)); // NOI18N
        jLabel7.setText("Location info");

        lblLocationName.setText("[Location name]");

        lblAddress.setText("[Address]");

        btnBookTicket.setText("Book ticket");

        jLabel9.setText("Balance: 100000");

        btnMyAccount.setText("My Account");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMovies)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTickets)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCinemas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(456, 456, 456)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMyAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(266, 266, 266)
                        .addComponent(btnSignOut)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMovieName)
                                    .addComponent(lblDirector)
                                    .addComponent(lblGenre)
                                    .addComponent(lblRating)
                                    .addComponent(lblDuration)
                                    .addComponent(btnViewTrailer))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblTime)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(timeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblMovie)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(movieBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblTime1)
                                        .addGap(18, 18, 18)
                                        .addComponent(locationBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(lblSeat))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnChooseSeat)
                                            .addComponent(cbxTheater, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnBookTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblAddress)
                                                .addComponent(lblLocationName))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3))
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnSignOut)
                    .addComponent(btnMyAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMovies)
                    .addComponent(btnTickets)
                    .addComponent(btnCinemas)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMovieName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGenre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDirector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRating)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDuration)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewTrailer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLocationName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddress))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTime1)
                                .addComponent(locationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMovie)
                                .addComponent(movieBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTime)
                                .addComponent(timeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(cbxTheater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSeat)
                                .addComponent(btnChooseSeat))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBookTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void locationBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locationBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_locationBoxMouseClicked

    private void locationBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationBoxActionPerformed

    private void btnChooseSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChooseSeatActionPerformed

    private void btnViewTrailerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTrailerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewTrailerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(CustomerView_BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerView_BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerView_BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerView_BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try{
         UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }   
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerView_BookTicket().setVisible(true);
            }
        });
    }
    // top menu listeners
    public void addMoviesListener(ActionListener a){
        btnMovies.addActionListener(a);
    }
    
    public void addCinemasListener(ActionListener a){
        btnCinemas.addActionListener(a);
    }
    
    public void addAccountListener(ActionListener a){
        btnMyAccount.addActionListener(a);
    }
    
    public void addSignOutListener(ActionListener a){
        btnSignOut.addActionListener(a);
    }
    
    public void addTicketsListener(ActionListener a){
        btnTickets.addActionListener(a);
    }
    
    public void addBookTicketListener(ActionListener a){
        btnBookTicket.addActionListener(a);
    }
    
    // combo box functions
    
    public void setLocationComboBoxModel(DefaultComboBoxModel<String> defaultComboBoxModel) {
        this.locationBox.setModel(defaultComboBoxModel);
    }
    public void setMovieComboBoxModel(DefaultComboBoxModel<String> defaultComboBoxModel) {
        this.movieBox.setModel(defaultComboBoxModel);
    }
    public void setTimeComboBoxModel(DefaultComboBoxModel<String> defaultComboBoxModel) {
        this.timeBox.setModel(defaultComboBoxModel);
    }
    public void setTheaterComboBoxModel(DefaultComboBoxModel<String> defaultComboBoxModel) {
        this.cbxTheater.setModel(defaultComboBoxModel);
    }

    public void enableChooseSeat(boolean b) {
        this.btnChooseSeat.setEnabled(b);
    }
    public boolean isChooseSeatEnabled(){
        return this.btnChooseSeat.isEnabled();
    }
    public int getSelectedTheater() {
        return Integer.parseInt(cbxTheater.getSelectedItem().toString());
    }
    
    public void addChooseSeatListener(ActionListener a){
        btnChooseSeat.addActionListener(a);
    }
    
    public void addLocationListener(ActionListener a){
        locationBox.addActionListener (a);
    }
    public void addMovieListener(ActionListener  a){
        movieBox.addActionListener(a);
    }
    public void addTimeListener(ActionListener  a){
        timeBox.addActionListener(a);
    }
    public void addTheaterListener(ActionListener a){
        cbxTheater.addActionListener(a);
    }
    
    
    public int getSelectedLocation(){
        return locationBox.getSelectedIndex();
    }
    public int getSelectedMovie(){
        return movieBox.getSelectedIndex();
    }
    public String getSelectedTime(){
        return timeBox.getSelectedItem().toString();
    }
    
    private ArrayList<Integer> currentLocationID;
    private ArrayList<Integer> currentMovieID;

    public ArrayList<Integer> getCurrentLocationID() {
        return currentLocationID;
    }

    public void setCurrentLocationID(ArrayList<Integer> currentLocationID) {
        this.currentLocationID = currentLocationID;
    }

    public ArrayList<Integer> getCurrentMovieID() {
        return currentMovieID;
    }

    public void setCurrentMovieID(ArrayList<Integer> currentMovieID) {
        this.currentMovieID = currentMovieID;
    }

    public void setPoster(int index) {
        String path = "/pkgfinal/project/attempt/pkg1/resources/buffer" + index+".jpg";
        File someFile = new File("/Users/User/NetBeansProjects/Final Project - Attempt 1/src/pkgfinal/project/attempt/pkg1/resources/buffer"+index+ ".jpg");
        if ((someFile.exists() && !someFile.isDirectory())){
            System.out.println("file found");
            lblPoster.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(270, 400, Image.SCALE_DEFAULT)));
        }else{
            System.out.println("File not found");
        }
    }
    public void setlblMovieNameText(String text){
        lblMovieName.setText(text);
    }
    public void setlblRatingNameText(String text){
        lblRating.setText(text);
    }
    public void setlblGenreNameText(String text){
        lblGenre.setText(text);
    }
    public void setlblDurationNameText(String text){
        lblDuration.setText(text);
    }
     public void setlblDirectorNameText(String text){
        lblDirector.setText(text);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookTicket;
    public javax.swing.JButton btnChooseSeat;
    private javax.swing.JButton btnCinemas;
    private javax.swing.JButton btnMovies;
    private javax.swing.JButton btnMyAccount;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JButton btnTickets;
    private javax.swing.JButton btnViewTrailer;
    private javax.swing.JComboBox<String> cbxTheater;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDirector;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblGenre;
    private javax.swing.JLabel lblLocationName;
    private javax.swing.JLabel lblMovie;
    private javax.swing.JLabel lblMovieName;
    private javax.swing.JLabel lblPoster;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblSeat;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JComboBox<String> locationBox;
    private javax.swing.JComboBox<String> movieBox;
    private javax.swing.JLabel poster1;
    private javax.swing.JComboBox<String> timeBox;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public int getSelectedMovieIndex() {
        return movieBox.getSelectedIndex();
    }
    public void addViewTrailerListener(ActionListener a){
        btnViewTrailer.addActionListener(a);
    }
    public void setlblLocationNameText(String text){
        lblLocationName.setText(text);
    }
    public void setlblAddressText(String text){
        lblAddress.setText(text);
    }
}