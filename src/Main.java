
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screen.width,screen.height);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        tampil_tb_mahasiswa();
        tampil_tb_buku();
        tampil_tb_peminjaman();
        Tanggal_sekarang();
        jamDigital();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_jam = new javax.swing.JLabel();
        lbl_tanggal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Peminjaman = new javax.swing.JPanel();
        txt_cari_peminjaman = new javax.swing.JTextField();
        btn_cari_peminjaman = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_peminjaman = new javax.swing.JTable();
        btn_edit_peminjaman = new javax.swing.JButton();
        btn_edit_peminjaman1 = new javax.swing.JButton();
        data_buku = new javax.swing.JPanel();
        txt_cari_buku = new javax.swing.JTextField();
        btn_cari_buku = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_buku = new javax.swing.JTable();
        btn_edit_buku = new javax.swing.JButton();
        btn_edit_buku1 = new javax.swing.JButton();
        data_mahasiswa = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txt_cari_mahasiswa = new javax.swing.JTextField();
        btn_cari_mahasiswa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_mahasiswa = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        data_karyawan = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_karyawan = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        data = new javax.swing.JMenu();
        Pengaturan = new javax.swing.JMenuItem();
        keluar = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/perpustakaan sdf.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/perpustakaan sdfsad.png"))); // NOI18N

        lbl_jam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_jam.setForeground(new java.awt.Color(255, 255, 255));
        lbl_jam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_jam.setText("JAM");

        lbl_tanggal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_tanggal.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tanggal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_tanggal.setText("TANGGAL");

        jLabel11.setFont(new java.awt.Font("PhrasticMedium", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("APLIKASI PERPUSTAKAAN");

        jLabel12.setFont(new java.awt.Font("Yu Mincho", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Egi Hermawan, Ricky Iqbal, Septi Slamet Rianto");

        jLabel13.setFont(new java.awt.Font("Yu Mincho", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("NPM :  1641909 , 1642912, 1642913");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_jam, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_tanggal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbl_jam)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbl_tanggal))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Peminjaman.setBackground(new java.awt.Color(153, 153, 0));
        Peminjaman.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peminjaman", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txt_cari_peminjaman.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_cari_peminjaman.setToolTipText("Masukkan Kata Pencarian Peminjaman");
        txt_cari_peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cari_peminjamanActionPerformed(evt);
            }
        });

        btn_cari_peminjaman.setText("Cari");
        btn_cari_peminjaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cari_peminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cari_peminjamanMouseClicked(evt);
            }
        });

        tb_peminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tb_peminjaman);

        btn_edit_peminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/file-edit-16x16.png"))); // NOI18N
        btn_edit_peminjaman.setText(" Edit Data Peminjam");
        btn_edit_peminjaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit_peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_peminjamanActionPerformed(evt);
            }
        });

        btn_edit_peminjaman1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Uparrow2.png"))); // NOI18N
        btn_edit_peminjaman1.setText("  Segarkan Tabel");
        btn_edit_peminjaman1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit_peminjaman1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_peminjaman1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PeminjamanLayout = new javax.swing.GroupLayout(Peminjaman);
        Peminjaman.setLayout(PeminjamanLayout);
        PeminjamanLayout.setHorizontalGroup(
            PeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PeminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                    .addGroup(PeminjamanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_cari_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cari_peminjaman))
                    .addGroup(PeminjamanLayout.createSequentialGroup()
                        .addComponent(btn_edit_peminjaman)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_edit_peminjaman1)))
                .addContainerGap())
        );
        PeminjamanLayout.setVerticalGroup(
            PeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PeminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cari_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari_peminjaman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_edit_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit_peminjaman1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Peminjaman", Peminjaman);

        data_buku.setBackground(new java.awt.Color(153, 153, 0));
        data_buku.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Buku", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txt_cari_buku.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_cari_buku.setToolTipText("Masukkan Kata Pencarian Buku");
        txt_cari_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cari_bukuActionPerformed(evt);
            }
        });

        btn_cari_buku.setText("Cari");
        btn_cari_buku.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cari_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cari_bukuMouseClicked(evt);
            }
        });

        tb_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tb_buku);

        btn_edit_buku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/file-edit-16x16.png"))); // NOI18N
        btn_edit_buku.setText("  Edit Data Buku");
        btn_edit_buku.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_bukuActionPerformed(evt);
            }
        });

        btn_edit_buku1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Uparrow2.png"))); // NOI18N
        btn_edit_buku1.setText("  Segarkan Tabel");
        btn_edit_buku1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit_buku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_buku1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout data_bukuLayout = new javax.swing.GroupLayout(data_buku);
        data_buku.setLayout(data_bukuLayout);
        data_bukuLayout.setHorizontalGroup(
            data_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_bukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(data_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                    .addGroup(data_bukuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_cari_buku, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cari_buku))
                    .addGroup(data_bukuLayout.createSequentialGroup()
                        .addComponent(btn_edit_buku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_edit_buku1)))
                .addContainerGap())
        );
        data_bukuLayout.setVerticalGroup(
            data_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, data_bukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(data_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cari_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari_buku))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(data_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_edit_buku, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit_buku1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data Buku", data_buku);

        data_mahasiswa.setBackground(new java.awt.Color(153, 153, 0));
        data_mahasiswa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Mahasiswa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/file-edit-16x16.png"))); // NOI18N
        jButton1.setText("  Edit Data Mahasiswa");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_cari_mahasiswa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_cari_mahasiswa.setToolTipText("Masukkan Kata Pencarian Mahasiswa");
        txt_cari_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cari_mahasiswaActionPerformed(evt);
            }
        });

        btn_cari_mahasiswa.setText("Cari");
        btn_cari_mahasiswa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cari_mahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cari_mahasiswaMouseClicked(evt);
            }
        });

        tb_mahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_mahasiswa);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Uparrow2.png"))); // NOI18N
        jButton2.setText("  Segarkan Tabel");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout data_mahasiswaLayout = new javax.swing.GroupLayout(data_mahasiswa);
        data_mahasiswa.setLayout(data_mahasiswaLayout);
        data_mahasiswaLayout.setHorizontalGroup(
            data_mahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_mahasiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(data_mahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, data_mahasiswaLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addGroup(data_mahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, data_mahasiswaLayout.createSequentialGroup()
                                .addComponent(txt_cari_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cari_mahasiswa))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        data_mahasiswaLayout.setVerticalGroup(
            data_mahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, data_mahasiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(data_mahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cari_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari_mahasiswa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(data_mahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data Mahasiswa", data_mahasiswa);

        data_karyawan.setForeground(new java.awt.Color(102, 102, 0));
        data_karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_karyawanMouseClicked(evt);
            }
        });

        tb_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tb_karyawan);

        javax.swing.GroupLayout data_karyawanLayout = new javax.swing.GroupLayout(data_karyawan);
        data_karyawan.setLayout(data_karyawanLayout);
        data_karyawanLayout.setHorizontalGroup(
            data_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 814, Short.MAX_VALUE)
            .addGroup(data_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(data_karyawanLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane4)
                    .addGap(16, 16, 16)))
        );
        data_karyawanLayout.setVerticalGroup(
            data_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
            .addGroup(data_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(data_karyawanLayout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addGap(63, 63, 63)))
        );

        jTabbedPane1.addTab("Data Karyawan", data_karyawan);

        data.setText("Data");

        Pengaturan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/proses_1.png"))); // NOI18N
        Pengaturan.setText("Pengaturan");
        Pengaturan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PengaturanActionPerformed(evt);
            }
        });
        data.add(Pengaturan);

        keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/exit.png"))); // NOI18N
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        data.add(keluar);

        jMenuBar1.add(data);

        edit.setText("Edit");
        jMenuBar1.add(edit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void Tanggal_sekarang(){
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat ("dd-MM-yyyy") ;
        lbl_tanggal.setText("Tanggal "+kal.format(sekarang));
    }
  public void jamDigital() {
    ActionListener taskPerformer = new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        String nol_jam = "";
        String nol_menit = "";
        String nol_detik = "";
        Date dt = new Date();
        int nilai_jam = dt.getHours();
        int nilai_menit = dt.getMinutes();
        int nilai_detik = dt.getSeconds();
        if (nilai_jam <= 9) {
          nol_jam = "0";
        }
        if (nilai_menit <= 9) {
          nol_menit = "0";
        }
        if (nilai_detik <= 9) {
          nol_detik = "0";
        }
        String jam = nol_jam + Integer.toString(nilai_jam);
        String menit = nol_menit + Integer.toString(nilai_menit);
        String detik = nol_detik + Integer.toString(nilai_detik);
        lbl_jam.setText("Jam "+jam + ":" + menit + ":" + detik);
      }
    };
    // Timer
    new Timer(1000, taskPerformer).start();
  }
  
    private DefaultTableModel tabmode;
    //private String[] label = {"Username","Nama","Jenis Kelamin","Tempat Lahir","Tanggal Lahir","Alamat"};
    
    public void tampil_tb_buku(){
        Object []baris = {"Kode Buku","Judul Buku","Tanggal Terbit","Pengarang"};
        tabmode = new DefaultTableModel(null, baris);
        tb_buku.setModel(tabmode);
        Connection con = new koneksi_2().getConnection();
        try {
            String sql = "select * from tb_buku order by kode_buku asc";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String kode_buku = hasil.getString("kode_buku");
                String judul_buku = hasil.getString("judul_buku");
                String tanggal_terbit = hasil.getString("tanggal_terbit");
                String pengarang = hasil.getString("pengarang");
                String[] data = {kode_buku, judul_buku, tanggal_terbit, pengarang};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void tampil_tb_peminjaman(){
        Object []baris = {"NPM","Nama","Jurusan","Kode Buku","Judul Buku","Tanggal Terbit","Tanggal Pinjam"};
        tabmode = new DefaultTableModel(null, baris);
        tb_peminjaman.setModel(tabmode);
        Connection con = new koneksi_2().getConnection();
        try {
            String sql = "select * from tb_peminjaman order by NPM asc";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String NPM = hasil.getString("NPM");
                String nama = hasil.getString("nama");
                String jurusan = hasil.getString("jurusan");
                String kode_buku = hasil.getString("kode_buku");
                String judul_buku = hasil.getString("judul_buku"); 
                String tanggal_terbit = hasil.getString("tanggal_terbit");
                String tanggal_pinjam = hasil.getString("tanggal_pinjam");
                String[] data = {NPM, nama, jurusan, kode_buku, judul_buku, tanggal_terbit, tanggal_pinjam};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    public void tampil_tb_mahasiswa(){
        Object []baris = {"NPM","Nama","Tempat Lahir","Tanggal Lhair","Jurusan","Tanggal Masuk"};
        tabmode = new DefaultTableModel(null, baris);
        tb_mahasiswa.setModel(tabmode);
        Connection con = new koneksi_2().getConnection();
        try {
            String sql = "select * from tb_mahasiswa order by NPM asc";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String NPM = hasil.getString("NPM");
                String nama = hasil.getString("nama");
                String tempat_lahir = hasil.getString("tempat_lahir");
                String tanggal_lahir = hasil.getString("tanggal_lahir");
                String jurusan = hasil.getString("jurusan"); 
                String tanggal_masuk = hasil.getString("tanggal_masuk");
                String[] data = {NPM, nama, tempat_lahir, tanggal_lahir, jurusan, tanggal_masuk};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
        
    private void PengaturanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PengaturanActionPerformed
        
    }//GEN-LAST:event_PengaturanActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Mahasiswa(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_edit_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_bukuActionPerformed
        // TODO add your handling code here:
        new Buku(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btn_edit_bukuActionPerformed

    private void btn_edit_peminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_peminjamanActionPerformed
        // TODO add your handling code here:
        new Peminjaman(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btn_edit_peminjamanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        tampil_tb_mahasiswa();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_edit_peminjaman1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_peminjaman1ActionPerformed
        // TODO add your handling code here:
        tampil_tb_peminjaman();
    }//GEN-LAST:event_btn_edit_peminjaman1ActionPerformed

    private void btn_edit_buku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_buku1ActionPerformed
        // TODO add your handling code here:
        tampil_tb_buku();
    }//GEN-LAST:event_btn_edit_buku1ActionPerformed

    private void txt_cari_peminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cari_peminjamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cari_peminjamanActionPerformed

    private void btn_cari_peminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cari_peminjamanMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_cari_peminjamanMouseClicked

    private void txt_cari_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cari_bukuActionPerformed
        // TODO add your handling code here:
        pencarian_buku();
    }//GEN-LAST:event_txt_cari_bukuActionPerformed

    private void btn_cari_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cari_bukuMouseClicked
        // TODO add your handling code here:
        pencarian_buku();
    }//GEN-LAST:event_btn_cari_bukuMouseClicked

    private void txt_cari_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cari_mahasiswaActionPerformed
        // TODO add your handling code here:
        pencarian_mahasiswa();
    }//GEN-LAST:event_txt_cari_mahasiswaActionPerformed

    private void btn_cari_mahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cari_mahasiswaMouseClicked
        // TODO add your handling code here:
        pencarian_mahasiswa();
    }//GEN-LAST:event_btn_cari_mahasiswaMouseClicked

    private void data_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_karyawanMouseClicked
        // TODO add your handling code here:
        new Karyawan(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_data_karyawanMouseClicked

    //pencarian data buku
    public void pencarian_mahasiswa(){
        String cari = txt_cari_mahasiswa.getText();
        //String to=jCombo.getItemAt(i).toString();
        
       Object[] Baris={"NPM","Nama","Tempat Lahir","Tanggal Lhair","Jurusan","Tanggal Masuk"};
       tabmode = new DefaultTableModel(null, Baris);
       tb_mahasiswa.setModel(tabmode);

       //panggil method koneksi
       Connection koneksi = new koneksi_2().getConnection();
       
       //untuk menampilkan di table
       try{
           String sql="Select * from tb_mahasiswa where "
                   + "NPM like '%"+cari+"%' "
                   + "OR nama like '%"+cari+"%' "
                   + "OR tempat_lahir like '%"+cari+"%' "
                   + "OR tanggal_lahir like '%"+cari+"%' "
                   + "OR jurusan like '%"+cari+"%' "
                   + "OR tanggal_masuk like '%"+cari+"%' "
                   + "order by NPM asc";
           java.sql.Statement stmt=koneksi.createStatement();
           java.sql.ResultSet rslt=stmt.executeQuery(sql);
           while(rslt.next()){
               String NPM=rslt.getString("NPM");
               String nama=rslt.getString("nama");
               String tempat_lahir=rslt.getString("tempat_lahir");
               String tanggal_lahir=rslt.getString("tanggal_lahir");
               String jurusant=rslt.getString("jurusan");
               String tanggal_masuk=rslt.getString("tanggal_masuk");
               String[] dataField={NPM,nama,tempat_lahir,tanggal_lahir,jurusant,tanggal_masuk};
               tabmode.addRow(dataField);
           }
       }
       catch(Exception ex){
       }
    }
    
    //pencarian data buku
    public void pencarian_buku(){
        String cari = txt_cari_buku.getText();
        Object[] Baris={"Kode Buku","Judul Buku","Tanggal Terbit","Pengarang"};
        tabmode = new DefaultTableModel(null, Baris);
        tb_buku.setModel(tabmode);

        Connection koneksi = new koneksi_2().getConnection();
        try{
            String sql="Select * from tb_buku where kode_buku like '%"+cari+"%' or judul_buku like '%"+cari+"%' or tanggal_terbit like '%"+cari+"%' or pengarang like '%"+cari+"%' order by kode_buku asc";
            java.sql.Statement stmt=koneksi.createStatement();
            java.sql.ResultSet rslt=stmt.executeQuery(sql);
            while(rslt.next()){
                String kode_buku=rslt.getString("kode_buku");
                String judul_buku=rslt.getString("judul_buku");
                String tanggal_terbit=rslt.getString("tanggal_terbit");
                String pengarang=rslt.getString("pengarang");
                String[] dataField={kode_buku,judul_buku,tanggal_terbit,pengarang};
                tabmode.addRow(dataField);
            }
        }
        catch(Exception ex){
        }
    }
    
    //pencarian peminjaman
    public void pencarian_peminjaman(){
        
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Peminjaman;
    private javax.swing.JMenuItem Pengaturan;
    private javax.swing.JButton btn_cari_buku;
    private javax.swing.JButton btn_cari_mahasiswa;
    private javax.swing.JButton btn_cari_peminjaman;
    private javax.swing.JButton btn_edit_buku;
    private javax.swing.JButton btn_edit_buku1;
    private javax.swing.JButton btn_edit_peminjaman;
    private javax.swing.JButton btn_edit_peminjaman1;
    private javax.swing.JMenu data;
    private javax.swing.JPanel data_buku;
    private javax.swing.JPanel data_karyawan;
    private javax.swing.JPanel data_mahasiswa;
    private javax.swing.JMenu edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem keluar;
    private javax.swing.JLabel lbl_jam;
    private javax.swing.JLabel lbl_tanggal;
    private javax.swing.JTable tb_buku;
    private javax.swing.JTable tb_karyawan;
    private javax.swing.JTable tb_mahasiswa;
    private javax.swing.JTable tb_peminjaman;
    private javax.swing.JTextField txt_cari_buku;
    private javax.swing.JTextField txt_cari_mahasiswa;
    private javax.swing.JTextField txt_cari_peminjaman;
    // End of variables declaration//GEN-END:variables
}
