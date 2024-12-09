/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import DAO.SachDAO;
import com.mysql.cj.result.Row;
import entity.Sach;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


import org.apache.poi.ss.usermodel.Sheet; // For creating sheets
import org.apache.poi.ss.usermodel.Workbook; // For creating workbooks
import org.apache.poi.xssf.usermodel.XSSFWorkbook; // For .xlsx files
import javax.swing.JFileChooser; // For file chooser dialog
import javax.swing.filechooser.FileNameExtensionFilter; // For file filter
import java.io.FileOutputStream; // For writing to files
import java.io.IOException; // For handling IO exceptions
import javax.swing.JOptionPane; // For showing dialog messages
import javax.swing.table.DefaultTableModel;
import com.mysql.cj.result.Row; // This is incorrect for Apache POI
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author Mark
 */
public class TrangChuPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrangChuPanel
     */
    public TrangChuPanel() {
        initComponents();
        getall();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) { // Kiểm tra xem dòng có hợp lệ không
            jTextField2.setText(jTable1.getValueAt(selectedRow, 0).toString()); // ID
            jTextField3.setText(jTable1.getValueAt(selectedRow, 1).toString()); // Tên sách
            jTextField4.setText(jTable1.getValueAt(selectedRow, 2).toString()); // Năm xuất bản
            jTextField5.setText(jTable1.getValueAt(selectedRow, 3).toString()); // Giá
            jTextField9.setText(jTable1.getValueAt(selectedRow, 4).toString()); // Số lượng
        }
    }
});
    }

    public void getall() {
        SachDAO dao = new SachDAO();
        List<Sach> sachList = dao.getAll(); // Lấy danh sách sách từ cơ sở dữ liệu
        DefaultTableModel model = new DefaultTableModel();

        // Thêm cột vào model
        model.addColumn("ID");
        model.addColumn("Tên Sách");
        model.addColumn("Năm Xuất Bản");
        model.addColumn("Giá");
        model.addColumn("số lượng");
        
        // Thêm cột Giá nếu có

        // Thêm dữ liệu vào model
        for (Sach book : sachList) {
            model.addRow(new Object[]{
                book.getId(), // ID của sách
                book.getTenSach(), // Tên sách

                book.getNamXuatBan(), // Năm xuất bản
                book.getGia(),
                book.getSoLuong(),
                
               // Giá
            });
        }

        jTable1.setModel(model); // Gán model vào jTable1 để hiển thị dữ liệu
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 630, 360));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N
        jPanel1.setToolTipText("Chức năng");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton1.setText("Thêm ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 40));

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 40));

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton3.setText("Xoá");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 40));

        jButton5.setBackground(new java.awt.Color(255, 0, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton5.setText("Chi tiết sách");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 30));

        jButton8.setBackground(new java.awt.Color(255, 0, 51));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Coppy");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 80, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 300, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 51, 0));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 30));

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Click");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 360, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setText("Nhập vào ID thêm , sửa");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setText("Tiêu đề sách:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setText("Năm xuất bản:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setText("Giá:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 30, -1));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 160, 30));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 160, 30));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 160, 30));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 160, 30));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 160, 30));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 160, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setText("Nhà xuất bản");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setText("Loại Sách");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 160, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setText("Tác giả");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 160, -1));

        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 51, 0));
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 250, -1));
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 160, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel12.setText("Số lượng");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jButton6.setBackground(new java.awt.Color(0, 255, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Improt picture");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 120, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, 430));

        jButton7.setBackground(new java.awt.Color(255, 0, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("Xuất file Exel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // Lấy dữ liệu từ các JTextField
            int id = Integer.parseInt(jTextField2.getText().trim());
            String ten = jTextField3.getText().trim();
            int namxb = Integer.parseInt(jTextField4.getText().trim());
            double gia = Double.parseDouble(jTextField5.getText().trim());
            String tacgia = jTextField8.getText().trim();
            String nhaxb = jTextField6.getText().trim();
            String theloai = jTextField7.getText().trim();
            Integer soluong = Integer.parseInt(jTextField9.getText().trim());
            // Khởi tạo đối tượng SachDAO để truy xuất cơ sở dữ liệu
            SachDAO sachDAO = new SachDAO();
            Sach sach = sachDAO.findById(id); // Tìm sách theo ID

            if (sach == null) {
                JOptionPane.showMessageDialog(null, "ID sách không tồn tại, không thể cập nhật!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                // Cập nhật thông tin sách
                sach.setId(id);
                sach.setTenSach(ten);
                sach.setNamXuatBan(namxb);
                sach.setGia(gia);
                sach.setTacgia(tacgia);
                sach.setNhaxb(nhaxb);
                sach.setTheloai(theloai);
                sach.setSoLuong(soluong);

                boolean updated = sachDAO.updateBook(sach); // Giả sử updateBook trả về true nếu cập nhật thành công

                if (updated) {
                    JOptionPane.showMessageDialog(null, "Cập nhật thông tin sách thành công!");
                    getall();

                } else {
                    JOptionPane.showMessageDialog(null, "Cập nhật thông tin sách thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {  // Gộp SQLException và NumberFormatException
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra, vui lòng thử lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SachDAO sachDAO = new SachDAO();
    String input = jTextField1.getText().trim();
    Integer id = null;
    String ten = null;
    Integer namXuatBan = null;
    Double gia = null;

    try {
        // Kiểm tra nếu đầu vào là số nguyên
        int intValue = Integer.parseInt(input);
        
        // Nếu giá trị là năm xuất bản (giả định năm xuất bản trong khoảng 1900 - 2100)
        if (intValue >= 1900 && intValue <= 2100) { 
            namXuatBan = intValue;
        }
        // Nếu không phải năm xuất bản, coi đó là ID sách
        else {
            id = intValue;
        }
    } catch (NumberFormatException e1) {
        try {
            // Nếu đầu vào là số thực, có thể là giá
            gia = Double.parseDouble(input);
        } catch (NumberFormatException e2) {
            // Nếu không phải số nguyên hoặc số thực, coi đó là tên sách
            ten = input;
        }
    }

    // Gọi phương thức findByAttributes với các giá trị đã xác định
    List<Sach> foundBooks = sachDAO.findByAttributes(id, ten, namXuatBan, gia);

    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("Tên Sách");
    model.addColumn("Năm Xuất Bản");
    model.addColumn("Giá");

    for (Sach book : foundBooks) {
        model.addRow(new Object[]{
            book.getId(),
            book.getTenSach(),
            book.getNamXuatBan(),
            book.getGia()
        });
    }

    jTable1.setModel(model);   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            // Lấy ID sách từ cột ID của hàng được chọn
            String id = jTable1.getValueAt(selectedRow, 0).toString(); // Giả sử cột 0 là cột chứa id

            // Kiểm tra kiểu dữ liệu
            int masach = Integer.parseInt(id);
            openChiTietSach(masach);
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một sách từ bảng để xem chi tiết.");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void openChiTietSach(int idSach) {
        // Tiêu đề của cửa sổ

        SachDAO dao = new SachDAO();
        Sach sach = dao.findById(idSach);

        if (sach != null) { // Kiểm tra nếu sach không null
            chiTietSachs chitiet = new chiTietSachs();
            chitiet.setIdSach(idSach);

            // Thiết lập các trường thông tin trước khi hiển thị
            chitiet.settensach(sach.getTenSach());
            chitiet.settacgia(sach.getTacgia());
            chitiet.setsoluong(String.valueOf(sach.getSoluong()));
            chitiet.settheloai(sach.getTheloai());
            chitiet.setnhaxuatban(sach.getNhaxb());
            chitiet.setnamxuatban(String.valueOf(sach.getNamXuatBan()));

            // Hiển thị ảnh (nếu có)
            if (sach.getAnh() != null && sach.getAnh().length > 0) {
                chitiet.showImage(sach.getAnh());
            }

            chitiet.pack();
            chitiet.setVisible(true); // Gọi sau khi thiết lập thông tin
        } else {
            JOptionPane.showMessageDialog(null, "Không tìm thấy sách với ID: " + idSach);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
        // Lấy dữ liệu từ các JTextField
        String idStr = jTextField2.getText().trim();
        String ten = jTextField3.getText().trim();
        String namxbStr = jTextField4.getText().trim();
        String giaStr = jTextField5.getText().trim();
        String tacgia = jTextField8.getText().trim();
        String nhaxb = jTextField6.getText().trim();
        String theloai = jTextField7.getText().trim();
        Integer soluong = Integer.parseInt(jTextField9.getText().trim());
        // Reset thông báo lỗi trước khi kiểm tra
        jLabel9.setText(""); // ID error label
        jLabel10.setText(""); // Nam XB error label
        jLabel11.setText(""); // Gia error label

        boolean isValid = true;

        // Kiểm tra xem các trường có rỗng không và hiển thị thông báo lỗi tương ứng
        if (idStr.isEmpty()) {
            jLabel9.setText("Vui lòng nhập ID!");
            jLabel9.setForeground(Color.RED); // Đặt màu đỏ cho thông báo lỗi
            isValid = false;
        }
        if (ten.isEmpty()) {
            jLabel9.setText("Vui lòng nhập tên sách!");
            jLabel9.setForeground(Color.RED);
            isValid = false;
        }
        if (namxbStr.isEmpty()) {
            jLabel10.setText("Vui lòng nhập năm xuất bản!");
            jLabel10.setForeground(Color.RED);
            isValid = false;
        }
        if (giaStr.isEmpty()) {
            jLabel11.setText("Vui lòng nhập giá!");
            jLabel11.setForeground(Color.RED);
            isValid = false;
        }
        

        // Nếu có trường rỗng, dừng việc xử lý
        if (!isValid) {
            return; 
        }

        // Chuyển đổi từ String sang int và double
        int id = Integer.parseInt(idStr);
        int namxb = Integer.parseInt(namxbStr);
        double gia = Double.parseDouble(giaStr);

        // Kiểm tra định dạng giá trị
        if (namxb < 1900 || namxb > 2024) {
            jLabel10.setText("Năm xuất bản phải từ 1900 đến 2024");
            jLabel10.setForeground(Color.RED);
            return;
        }

        if (gia <= 0) {
            jLabel11.setText("Giá phải lớn hơn 0");
            jLabel11.setForeground(Color.RED);
            return;
        }

        // Khởi tạo đối tượng SachDAO để truy xuất cơ sở dữ liệu
        SachDAO sachDAO = new SachDAO();
        Sach sach = sachDAO.findById(id); // Tìm sách theo ID
        if (sach != null) {
            // Nếu id đã tồn tại, hiển thị thông báo lỗi
            jLabel9.setText("ID đã tồn tại");
            jLabel9.setForeground(Color.RED);
            return;
        }

        // Nếu sách không tồn tại, tạo một đối tượng mới và lưu vào cơ sở dữ liệu
        sach = new Sach(id, ten, namxb, gia, tacgia, nhaxb, theloai,soluong);
        boolean saved = sachDAO.save(sach); // Gọi hàm save để thêm sách mới
        if (saved) {
            // Cập nhật label thành công
            jLabel9.setText("Thêm sách thành công!");
            jLabel9.setForeground(Color.GREEN); // Đặt màu xanh cho thông báo thành công
            getall(); // Cập nhật danh sách sách
        } else {
            // Cập nhật label thất bại
            jLabel9.setText("Thêm sách thất bại!");
            jLabel9.setForeground(Color.RED); 
        }
    } catch (NumberFormatException e) {
        // Cập nhật thông báo lỗi nếu không thể chuyển đổi số
        jLabel9.setText("Dữ liệu nhập vào không hợp lệ!");
        jLabel9.setForeground(Color.RED);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteSelectedBook() {
    // Lấy tất cả các hàng được chọn
    int[] selectedRows = jTable1.getSelectedRows();
    if (selectedRows.length == 0) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn ít nhất một quyển sách để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Cảnh báo trước khi xóa
    int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa tất cả các quyển sách đã chọn?", "Xác nhận", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.NO_OPTION) {
        return; // Nếu chọn No thì thoát ra
    }

    // Tạo đối tượng SachDAO
    SachDAO sachDAO = new SachDAO();
    boolean allDeleted = true; // Biến kiểm tra xem tất cả sách có xóa thành công hay không

    // Lấy ID của tất cả sách được chọn
    List<Integer> idsToDelete = new ArrayList<>();
    for (int selectedRow : selectedRows) {
        int id = (int) jTable1.getValueAt(selectedRow, 0); // Giả sử ID là ở cột 0
        idsToDelete.add(id);
    }

    // Xóa tất cả sách được chọn
    for (int id : idsToDelete) {
        boolean isDeleted = sachDAO.delete(id);
        if (!isDeleted) {
            allDeleted = false; // Nếu có sách không xóa được thì cập nhật lại
        }
    }

    // Nếu tất cả sách được xóa thành công
    if (allDeleted) {
        JOptionPane.showMessageDialog(this, "Xóa sách thành công!");

        // Xóa các hàng khỏi bảng
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        // Lặp qua các chỉ mục và xóa các hàng
        for (int i = selectedRows.length - 1; i >= 0; i--) { // Duyệt từ dưới lên để không bị thay đổi chỉ mục khi xóa
            model.removeRow(selectedRows[i]);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi xóa một số sách!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
}


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        deleteSelectedBook();


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "chọn sách đã!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Lấy ID quyển sách từ cột (giả sử ID nằm ở cột đầu tiên)
        int selectedBookId = (int) jTable1.getValueAt(selectedRow, 0);

        // Mở hộp thoại chọn ảnh
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn ảnh");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Ảnh", "jpg", "jpeg", "png", "gif"));

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try (FileInputStream fis = new FileInputStream(selectedFile)) {
                // Đọc file ảnh thành mảng byte
                byte[] imageBytes = new byte[(int) selectedFile.length()];
                fis.read(imageBytes);

                // Lưu ảnh vào cơ sở dữ liệu
                saveImageToDatabase(selectedBookId, imageBytes);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi đọc file ảnh: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một quyển sách để sao chép!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Lấy thông tin sách từ hàng được chọn
    int id = (int) jTable1.getValueAt(selectedRow, 0); // Giả sử ID là ở cột 0
    String tenSach = (String) jTable1.getValueAt(selectedRow, 1);
    int namXuatBan = (int) jTable1.getValueAt(selectedRow, 2);
    double gia = (double) jTable1.getValueAt(selectedRow, 3);
    

    // Tạo đối tượng SachDAO
    SachDAO sachDAO = new SachDAO();

    // Lấy ID lớn nhất hiện tại trong cơ sở dữ liệu và cộng thêm 1 để tạo ID mới
    int newId = sachDAO.getMaxId() + 1;

    // Tạo sách mới với các thông tin giống sách cũ nhưng ID mới
    Sach newBook = new Sach(newId, tenSach, namXuatBan, gia);

    // Lưu sách mới vào cơ sở dữ liệu
    boolean isInserted = sachDAO.save(newBook);
    if (isInserted) {
        JOptionPane.showMessageDialog(this, "Sao chép sách thành công!");

        // Thêm sách mới vào bảng
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
            newBook.getId(),
            newBook.getTenSach(),
            newBook.getNamXuatBan(),
            newBook.getGia(),
            newBook.getSoLuong()
        });
    } else {
        JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi sao chép sách!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    } 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void blurPanel() {
    // Create a BufferedImage to draw the panel onto
    BufferedImage image = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2d = image.createGraphics();
    this.paint(g2d); // Paint the current panel to the BufferedImage
    g2d.dispose();

    // Apply a blur filter to the image
    float[] matrix = new float[25];
    for (int i = 0; i < 25; i++) {
        matrix[i] = 1.0f / 25.0f; // Simple averaging filter
    }
    Kernel kernel = new Kernel(5, 5, matrix);
    ConvolveOp op = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);
    BufferedImage blurredImage = op.filter(image, null);

    // Create a JLabel to display the blurred image
    JLabel blurredLabel = new JLabel(new ImageIcon(blurredImage));
    blurredLabel.setBounds(0, 0, this.getWidth(), this.getHeight());
    this.add(blurredLabel);
    this.repaint();
}    private void saveImageToDatabase(int bookId, byte[] imageBytes) {
        String url = "jdbc:mysql://localhost:3306/sach";
        String username = "root";
        String password = "12345678";

        String sql = "UPDATE sach SET anh = ? WHERE id = ?"; // Cập nhật ảnh của quyển sách theo ID

        try (Connection conn = DriverManager.getConnection(url, username, password); PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Set ảnh vào PreparedStatement
            stmt.setBytes(1, imageBytes);
            stmt.setInt(2, bookId);

            // Thực hiện câu lệnh UPDATE
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Ảnh đã được thêm thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Không thể thêm ảnh vào quyển sách.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi lưu ảnh vào cơ sở dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

//   private void exportToExcel() {
//    try {
//        // Create a new workbook and a sheet
//        Workbook workbook = new XSSFWorkbook();
//        Sheet sheet = workbook.createSheet("Books");
//
//        // Create header row
//        Row headerRow = (Row) sheet.createRow(0);
//        headerRow.createCell(0).setCellValue("ID");
//        headerRow.createCell(1).setCellValue("Tên Sách");
//        headerRow.createCell(2).setCellValue("Năm Xuất Bản");
//        headerRow.createCell(3).setCellValue("Giá");
//
//        // Get the table model and add data to the sheet
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        for (int i = 0; i < model.getRowCount(); i++) {
//            Row row = (Row) sheet.createRow(i + 1); // Create a new row for each data entry
//            for (int j = 0; j < model.getColumnCount(); j++) {
//                // Create a cell in the row and set its value
//                row.createCell(j).setCellValue(model.getValueAt(i, j).toString());
//            }
//        }
//
//        // Write the output to a file
//        JFileChooser fileChooser = new JFileChooser();
//        fileChooser.setDialogTitle("Save Excel File");
//        fileChooser.setFileFilter(new FileNameExtensionFilter("Excel Files", "xlsx"));
//        int userSelection = fileChooser.showSaveDialog(null);
//        if (userSelection == JFileChooser.APPROVE_OPTION) {
//            File fileToSave = fileChooser.getSelectedFile();
//            if (!fileToSave.getName().endsWith(".xlsx")) {
//                fileToSave = new File(fileToSave.getAbsolutePath() + ".xlsx");
//            }
//            FileOutputStream outputStream = new FileOutputStream(fileToSave);
//            workbook.write(outputStream);
//            outputStream.close();
//            workbook.close();
//            JOptionPane.showMessageDialog(this, "Exported successfully to " + fileToSave.getAbsolutePath());
//        }
//    } catch (IOException e) {
//        e.printStackTrace();
//        JOptionPane.showMessageDialog(this, "Error while exporting: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//    }
//}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
