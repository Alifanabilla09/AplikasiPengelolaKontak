
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class FrameAplikasiPengelolaKontak extends javax.swing.JFrame {

    // Add this as an instance variable
    private final Connection connection;

    private String simpan;
    private int selectedKontakId;

    public void createTableIfNotExists() {
        // SQL query untuk membuat tabel jika belum ada
        String sql = "CREATE TABLE IF NOT EXISTS kontak ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "nama TEXT NOT NULL, "
                + "nomor_telepon TEXT NOT NULL, "
                + "kategori TEXT NOT NULL)";

        try (PreparedStatement pst = connection.prepareStatement(sql)) {
            // Menjalankan perintah untuk membuat tabel jika belum ada
            pst.executeUpdate();
            System.out.println("Tabel 'kontak' sudah ada atau berhasil dibuat.");
        } catch (SQLException e) {
            // Menampilkan pesan error jika terjadi kesalahan saat membuat tabel
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat membuat tabel: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Creates new form FrameAplikasiPengelolaKontak
     */
    public FrameAplikasiPengelolaKontak() {
        initComponents();
        connection = DatabaseUtil.connectToDatabase(); // Initialize database connection
        createTableIfNotExists();
        tampilkanKontak();
        ulang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        cbbKategori = new javax.swing.JComboBox<>();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUlang = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cbbPilihKategori = new javax.swing.JComboBox<>();
        txtCariNamaNomor = new javax.swing.JTextField();
        btnCariKontak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Nama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("No. Telepon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Kategori Kontak");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jLabel3, gridBagConstraints);

        txtNama.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(txtNama, gridBagConstraints);

        txtTelepon.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(txtTelepon, gridBagConstraints);

        cbbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keluarga", "Teman", "Kerja" }));
        cbbKategori.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(cbbKategori, gridBagConstraints);

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(btnTambah, gridBagConstraints);

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(btnUbah, gridBagConstraints);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(btnHapus, gridBagConstraints);

        btnSimpan.setText("Simpan");
        btnSimpan.setEnabled(false);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(btnSimpan, gridBagConstraints);

        btnUlang.setText("Ulang");
        btnUlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUlangActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(btnUlang, gridBagConstraints);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 150));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Nomor", "Kategori"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel4.setText("Pilih Kategori");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jLabel4, gridBagConstraints);

        cbbPilihKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keluarga", "Teman", "Kerja" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(cbbPilihKategori, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(txtCariNamaNomor, gridBagConstraints);

        btnCariKontak.setText("Cari Kontak");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(btnCariKontak, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUlangActionPerformed
        ulang();
    }//GEN-LAST:event_btnUlangActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // Reset form dan aktifkan inputan
        txtNama.setEnabled(true);
        txtTelepon.setEnabled(true);
        cbbKategori.setEnabled(true);
        txtNama.setText(""); // Clear input
        txtTelepon.setText(""); // Clear input
        cbbKategori.setSelectedIndex(0); // Set default kategori

        // Disable tombol lain yang tidak diperlukan saat menambah
        btnTambah.setEnabled(false);
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
        btnSimpan.setEnabled(true);  // Enable tombol Simpan untuk menyimpan data

        simpan = "insert";
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed

        // Ambil nilai dari inputan
        String nama = txtNama.getText().trim();
        String nomorTelepon = txtTelepon.getText().trim();
        String kategori = (String) cbbKategori.getSelectedItem();

        // Validasi data
        if (nama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;  // Batalkan proses simpan jika nama kosong
        }

        if (nomorTelepon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nomor telepon tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;  // Batalkan proses simpan jika nomor telepon kosong
        }

        // Validasi format nomor telepon (misalnya, hanya angka dan panjang 10-13 karakter)
        if (!nomorTelepon.matches("\\d{10,13}")) {
            JOptionPane.showMessageDialog(this, "Nomor telepon tidak valid. Harus terdiri dari 10-13 angka.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;  // Batalkan proses simpan jika format nomor telepon salah
        }

        if (kategori == null || kategori.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kategori kontak harus dipilih!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;  // Batalkan proses simpan jika kategori kosong
        }

        // Jika validasi berhasil, lanjutkan dengan menyimpan data
        String sql = "";

        if (simpan.equals("insert")) {
            // SQL untuk menambahkan data kontak baru
            sql = "INSERT INTO kontak (nama, nomor_telepon, kategori) VALUES (?, ?, ?)";
        } else if (simpan.equals("update")) {
            // SQL untuk memperbarui data kontak yang sudah ada
            sql = "UPDATE kontak SET nama = ?, nomor_telepon = ?, kategori = ? WHERE id = ?";
        }

        try (PreparedStatement pst = connection.prepareStatement(sql)) {
            pst.setString(1, nama);
            pst.setString(2, nomorTelepon);
            pst.setString(3, kategori);

            // Jika update, tambahkan ID kontak yang akan diubah
            if (simpan.equals("update")) {
                pst.setInt(4, selectedKontakId);  // ID kontak yang dipilih
            }

            // Eksekusi query
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            tampilkanKontak();
            ulang();  // Reset form setelah simpan
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        txtNama.setEnabled(true);
        txtTelepon.setEnabled(true);
        cbbKategori.setEnabled(true);

        // Disable tombol lain yang tidak diperlukan saat edit
        btnTambah.setEnabled(false);
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
        btnSimpan.setEnabled(true);  // Enable tombol Simpan untuk menyimpan perubahan

        simpan = "update";  // Menetapkan mode sebagai update

    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Apakah Anda yakin ingin menghapus kontak ini?",
                "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM kontak WHERE id = ?";

            try (PreparedStatement pst = connection.prepareStatement(sql)) {
                // Menetapkan parameter ID yang ingin dihapus
                pst.setInt(1, selectedKontakId);

                // Eksekusi query untuk menghapus data
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Kontak berhasil dihapus.");
                } else {
                    JOptionPane.showMessageDialog(this, "Kontak tidak ditemukan.");
                }

                // Menampilkan data terbaru setelah penghapusan
                tampilkanKontak();
                ulang();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menghapus kontak: " + e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnHapusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
        selectedKontakId = (int) jTable1.getValueAt(selectedRow, 0);  // Ambil ID dari kolom pertama
        txtNama.setText((String) jTable1.getValueAt(selectedRow, 1));
        txtTelepon.setText((String) jTable1.getValueAt(selectedRow, 2));
        cbbKategori.setSelectedItem(jTable1.getValueAt(selectedRow, 3));

        // Enable inputan dan tombol untuk edit/hapus
        txtNama.setEnabled(true);
        txtTelepon.setEnabled(true);
        cbbKategori.setEnabled(true);
        btnUbah.setEnabled(true);
        btnHapus.setEnabled(true);
        btnSimpan.setEnabled(false);  // Disable tombol Simpan saat edit
    }//GEN-LAST:event_jTable1MouseClicked

    private void ulang() {
        // Reset form dan nonaktifkan inputan
        txtNama.setEnabled(false);
        txtTelepon.setEnabled(false);
        cbbKategori.setEnabled(false);
        txtNama.setText("");
        txtTelepon.setText("");
        cbbKategori.setSelectedIndex(0);  // Set default kategori

        // Enable tombol lain untuk operasi berikutnya
        btnTambah.setEnabled(true);
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
        btnSimpan.setEnabled(false);  // Disable tombol Simpan
    }

    public void tampilkanKontak() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);  // Menghapus semua baris di tabel

        String sql = "SELECT * FROM kontak";
        try (PreparedStatement pst = connection.prepareStatement(sql);
                ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("nomor_telepon"),
                    rs.getString("kategori")
                };
                model.addRow(row);  // Menambahkan baris baru ke tabel
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menampilkan kontak: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(FrameAplikasiPengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAplikasiPengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAplikasiPengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAplikasiPengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAplikasiPengelolaKontak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariKontak;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JButton btnUlang;
    private javax.swing.JComboBox<String> cbbKategori;
    private javax.swing.JComboBox<String> cbbPilihKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCariNamaNomor;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables
}
