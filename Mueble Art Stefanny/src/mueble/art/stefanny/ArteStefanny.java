package mueble.art.stefanny;
/*
 * ArteStefanny.java
 *
 * Created on 24-nov-2011, 13:21:55
 */
/*import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;*/

import java.awt.Image;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 *
 * @author Luisa y Estefania
 */
public class ArteStefanny extends javax.swing.JFrame {

    /** Creates new form ArteStefanny *///
    public ArteStefanny() {
        initComponents();

        conexion();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mas = new javax.swing.JTabbedPane();
        factura = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        local = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        valorarticulos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numerofactura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cc = new javax.swing.JComboBox();
        cv = new javax.swing.JComboBox();
        nuevafactura = new javax.swing.JButton();
        consultarfactura = new javax.swing.JButton();
        modificarfactura = new javax.swing.JButton();
        eliminarfactura = new javax.swing.JButton();
        limfactura = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        codigoarticulo = new javax.swing.JComboBox();
        cliente = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cedulacliente = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        agregarcliente = new javax.swing.JButton();
        ModificarCliente = new javax.swing.JButton();
        button1 = new java.awt.Button();
        eliminarcliente = new javax.swing.JButton();
        consultarcliente = new javax.swing.JButton();
        limpiarcliente = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        articulo = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        valor = new javax.swing.JTextField();
        Nuevoarticulo = new javax.swing.JButton();
        modificararticulo = new javax.swing.JButton();
        Eliminararticulo = new javax.swing.JButton();
        consultararticulo = new javax.swing.JButton();
        limarticulo = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        vendedor = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cedulavendedor = new javax.swing.JTextField();
        nombree = new javax.swing.JTextField();
        apellidoo = new javax.swing.JTextField();
        numerotelefono = new javax.swing.JTextField();
        nuevovendedor = new javax.swing.JButton();
        eliminadorvendedor = new javax.swing.JButton();
        modificarvendedor = new javax.swing.JButton();
        consultarvendedor = new javax.swing.JButton();
        limpiarvendedor = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        nuevacomision = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        identificador = new javax.swing.JTextField();
        descripcionn = new javax.swing.JTextField();
        valorr = new javax.swing.JTextField();
        ceduvendedor = new javax.swing.JComboBox();
        modficarcomi = new javax.swing.JButton();
        eliminarcomi = new javax.swing.JButton();
        consultarcomi = new javax.swing.JButton();
        limcomi = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArteStefanny.java");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("ArteStefanny.java"); // NOI18N

        mas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                masAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        factura.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(0, 204, 153));
        jLabel1.setFont(new java.awt.Font("Aharoni", 0, 36));
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("MUEBLE ARTE ");

        jLabel3.setFont(new java.awt.Font("Aparajita", 0, 48));
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("    Stefanny");

        jLabel6.setFont(new java.awt.Font("Utsaah", 0, 24));
        jLabel6.setText("Sistema de Facturacion M.A.S");

        local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localActionPerformed(evt);
            }
        });

        jLabel8.setText("Valor Articulos");

        jLabel5.setText("Cedula Cliente");

        jLabel4.setText("Numero de Factura");

        jLabel7.setText("Local");

        numerofactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerofacturaActionPerformed(evt);
            }
        });

        jLabel9.setText("Cedula Vendedor");

        cc.setToolTipText("");
        cc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ccMousePressed(evt);
            }
        });
        cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccActionPerformed(evt);
            }
        });

        cv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cvMousePressed(evt);
            }
        });

        nuevafactura.setText("Nueva Factura");
        nuevafactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevafacturaActionPerformed(evt);
            }
        });

        consultarfactura.setText("Consultar Factura");
        consultarfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarfacturaActionPerformed(evt);
            }
        });

        modificarfactura.setText("Modificar Factura");
        modificarfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarfacturaActionPerformed(evt);
            }
        });

        eliminarfactura.setText("Eliminar Factura");
        eliminarfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarfacturaActionPerformed(evt);
            }
        });

        limfactura.setText("Limpiar");
        limfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limfacturaActionPerformed(evt);
            }
        });

        jLabel27.setText("Codigo Articulo");

        codigoarticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                codigoarticuloMousePressed(evt);
            }
        });

        javax.swing.GroupLayout facturaLayout = new javax.swing.GroupLayout(factura);
        factura.setLayout(facturaLayout);
        facturaLayout.setHorizontalGroup(
            facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturaLayout.createSequentialGroup()
                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(facturaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(facturaLayout.createSequentialGroup()
                                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(local, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(numerofactura, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                            .addGroup(facturaLayout.createSequentialGroup()
                                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(facturaLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(facturaLayout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(facturaLayout.createSequentialGroup()
                                            .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(42, 42, 42))))
                                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cv, javax.swing.GroupLayout.Alignment.TRAILING, 0, 163, Short.MAX_VALUE)
                                    .addComponent(cc, 0, 163, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(codigoarticulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(valorarticulos, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))))))
                        .addGap(18, 18, 18))
                    .addGroup(facturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(124, 124, 124)))
                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(facturaLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(nuevafactura, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(consultarfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modificarfactura)
                .addGap(18, 18, 18)
                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limfactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarfactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        facturaLayout.setVerticalGroup(
            facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(facturaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numerofactura, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(facturaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(local, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(valorarticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(facturaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoarticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(facturaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(limfactura)))
                .addGap(18, 18, 18)
                .addGroup(facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevafactura)
                    .addComponent(consultarfactura)
                    .addComponent(modificarfactura)
                    .addComponent(eliminarfactura))
                .addContainerGap())
        );

        mas.addTab("Factura", factura);

        cliente.setBackground(new java.awt.Color(204, 204, 255));
        cliente.setForeground(new java.awt.Color(204, 204, 255));

        jLabel11.setText("Cedula Cliente");

        jLabel12.setText("Nombre");

        jLabel13.setText("Apellido");

        jLabel14.setText("Telefóno");

        jLabel15.setText("Dirección");

        agregarcliente.setText("Agregar Cliente");
        agregarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarclienteActionPerformed(evt);
            }
        });

        ModificarCliente.setText("Modificar Cliente");
        ModificarCliente.setActionCommand("ModificarCliente");
        ModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarClienteActionPerformed(evt);
            }
        });

        button1.setLabel("button1");

        eliminarcliente.setText("Eliminar Cliente");
        eliminarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarclienteActionPerformed(evt);
            }
        });

        consultarcliente.setText("Consultar Cliente");
        consultarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarclienteActionPerformed(evt);
            }
        });

        limpiarcliente.setText("Limpiar");
        limpiarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarclienteActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Utsaah", 0, 48));
        jLabel16.setForeground(new java.awt.Color(255, 51, 102));
        jLabel16.setText("Clientes M.A.S");

        javax.swing.GroupLayout clienteLayout = new javax.swing.GroupLayout(cliente);
        cliente.setLayout(clienteLayout);
        clienteLayout.setHorizontalGroup(
            clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(clienteLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(clienteLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(clienteLayout.createSequentialGroup()
                                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(102, 102, 102))
                                    .addGroup(clienteLayout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cedulacliente, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(nombre)
                            .addComponent(apellido)
                            .addComponent(telefono)
                            .addComponent(direccion))
                        .addGap(101, 101, 101)
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(consultarcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminarcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ModificarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agregarcliente, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(limpiarcliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56))))
        );
        clienteLayout.setVerticalGroup(
            clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteLayout.createSequentialGroup()
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cedulacliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(41, 41, 41)
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(agregarcliente)
                        .addGap(32, 32, 32)
                        .addComponent(ModificarCliente)
                        .addGap(35, 35, 35)
                        .addComponent(eliminarcliente)
                        .addGap(37, 37, 37)
                        .addComponent(consultarcliente)
                        .addGap(32, 32, 32)
                        .addComponent(limpiarcliente)))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        mas.addTab("Cliente", cliente);

        articulo.setBackground(new java.awt.Color(204, 204, 255));

        jLabel22.setText("Codigo");

        jLabel23.setText("Descripcion");

        jLabel24.setText("Valor");

        Nuevoarticulo.setText("Nuevo Articulo");
        Nuevoarticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoarticuloActionPerformed(evt);
            }
        });

        modificararticulo.setText("Modificar Articulo");
        modificararticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificararticuloActionPerformed(evt);
            }
        });

        Eliminararticulo.setText("Eliminar Articulo");
        Eliminararticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminararticuloActionPerformed(evt);
            }
        });

        consultararticulo.setText("Consultar Articulo");
        consultararticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultararticuloActionPerformed(evt);
            }
        });

        limarticulo.setText("Limpiararticulo");
        limarticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limarticuloActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(0, 204, 153));
        jLabel25.setFont(new java.awt.Font("Aharoni", 0, 36));
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("MUEBLE ARTE ");

        jLabel26.setFont(new java.awt.Font("Aparajita", 0, 48));
        jLabel26.setForeground(new java.awt.Color(255, 0, 51));
        jLabel26.setText("    Stefanny");

        imagen.setText("no imagen");

        jLabel32.setFont(new java.awt.Font("Utsaah", 0, 48)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 51, 102));
        jLabel32.setText("Articulo M.A.S");

        javax.swing.GroupLayout articuloLayout = new javax.swing.GroupLayout(articulo);
        articulo.setLayout(articuloLayout);
        articuloLayout.setHorizontalGroup(
            articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(articuloLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Nuevoarticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(articuloLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(modificararticulo)
                        .addGap(30, 30, 30))
                    .addGroup(articuloLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(valor)
                                .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                            .addComponent(descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(23, 23, 23)))
                .addGroup(articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(articuloLayout.createSequentialGroup()
                        .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                        .addGap(74, 74, 74))
                    .addGroup(articuloLayout.createSequentialGroup()
                        .addComponent(Eliminararticulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(consultararticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(articuloLayout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(limarticulo)
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(articuloLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, articuloLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(53, 53, 53))
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        articuloLayout.setVerticalGroup(
            articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(articuloLayout.createSequentialGroup()
                .addGroup(articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(articuloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(articuloLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(articuloLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(articuloLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nuevoarticulo)
                    .addComponent(modificararticulo)
                    .addComponent(Eliminararticulo)
                    .addComponent(consultararticulo))
                .addGap(37, 37, 37)
                .addComponent(limarticulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mas.addTab("Artículo", articulo);

        vendedor.setBackground(new java.awt.Color(204, 204, 255));

        jLabel17.setText("Cedula Vendedor");

        jLabel18.setText("Nombre");

        jLabel19.setText("Apellido");

        jLabel20.setText("Numero Telefono");

        nuevovendedor.setText("Nuevo Vendedor");
        nuevovendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevovendedorActionPerformed(evt);
            }
        });

        eliminadorvendedor.setText("Eliminar Vendedor");
        eliminadorvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminadorvendedorActionPerformed(evt);
            }
        });

        modificarvendedor.setText("Modificar Vendedor");
        modificarvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarvendedorActionPerformed(evt);
            }
        });

        consultarvendedor.setText("Consultar Vendedor");
        consultarvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarvendedorActionPerformed(evt);
            }
        });

        limpiarvendedor.setText("Limpiar");
        limpiarvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarvendedorActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Utsaah", 0, 48));
        jLabel21.setForeground(new java.awt.Color(255, 51, 102));
        jLabel21.setText("Vendedores M.A.S");

        javax.swing.GroupLayout vendedorLayout = new javax.swing.GroupLayout(vendedor);
        vendedor.setLayout(vendedorLayout);
        vendedorLayout.setHorizontalGroup(
            vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendedorLayout.createSequentialGroup()
                .addGroup(vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, vendedorLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
                    .addGroup(vendedorLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numerotelefono)
                            .addComponent(apellidoo)
                            .addComponent(nombree)
                            .addComponent(cedulavendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                .addGap(66, 66, 66)
                .addGroup(vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(limpiarvendedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultarvendedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarvendedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminadorvendedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nuevovendedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        vendedorLayout.setVerticalGroup(
            vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vendedorLayout.createSequentialGroup()
                .addGroup(vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vendedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addGap(30, 30, 30)
                        .addGroup(vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cedulavendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificarvendedor)))
                    .addGroup(vendedorLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(nuevovendedor)
                        .addGap(33, 33, 33)
                        .addComponent(eliminadorvendedor)))
                .addGroup(vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vendedorLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numerotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(vendedorLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(consultarvendedor)))
                .addGap(12, 12, 12)
                .addComponent(limpiarvendedor)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        mas.addTab("Vendedor", vendedor);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel28.setText("Identificador");

        jLabel29.setText("Descripcion ");

        nuevacomision.setText("Nueva Comsion");
        nuevacomision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevacomisionActionPerformed(evt);
            }
        });

        jLabel30.setText("Valor");

        jLabel31.setText("Cedula Vendedor");

        ceduvendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ceduvendedorMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ceduvendedorMousePressed(evt);
            }
        });
        ceduvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceduvendedorActionPerformed(evt);
            }
        });

        modficarcomi.setText("Modificar Comision");
        modficarcomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modficarcomiActionPerformed(evt);
            }
        });

        eliminarcomi.setText("Eliminar Comision");
        eliminarcomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarcomiActionPerformed(evt);
            }
        });

        consultarcomi.setText("Consultar Comision");
        consultarcomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarcomiActionPerformed(evt);
            }
        });

        limcomi.setText("Limpiar");
        limcomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limcomiActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Utsaah", 0, 48)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 51, 153));
        jLabel33.setText("Comision M.A.S");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(descripcionn, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(valorr)
                                    .addComponent(ceduvendedor, 0, 115, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(identificador, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(nuevacomision)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modficarcomi, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarcomi, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(consultarcomi, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(limcomi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(identificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(descripcionn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(valorr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(ceduvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevacomision)
                    .addComponent(modficarcomi)
                    .addComponent(eliminarcomi)
                    .addComponent(consultarcomi))
                .addGap(5, 5, 5)
                .addComponent(limcomi)
                .addContainerGap())
        );

        mas.addTab("Comisión", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mas, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("ArteStefanny.java");

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void numerofacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerofacturaActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_numerofacturaActionPerformed

private void localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_localActionPerformed

private void agregarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarclienteActionPerformed

    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        CallableStatement s = con.prepareCall("CALL Nuevo_Cliente (?,?,?,?,?,?)");
        java.sql.Statement sentencia = con.createStatement();
        s.setInt(1, Integer.parseInt(cedulacliente.getText()));
        s.setString(2, nombre.getText());
        s.setString(3, apellido.getText());
        s.setString(4, telefono.getText());
        s.setString(5, direccion.getText());
        s.execute();
        JOptionPane.showMessageDialog(null, s.getString(6));


        sentencia.close();
        con.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "ERROR CON LA BASE DE DATOS");
        System.out.println(ex);
    }


}//GEN-LAST:event_agregarclienteActionPerformed

private void ModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarClienteActionPerformed
  
     try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        CallableStatement s = con.prepareCall("CALL Mod_Cliente (?,?,?,?,?,?)");
        java.sql.Statement sentencia = con.createStatement();
        s.setInt(1, Integer.parseInt(cedulacliente.getText()));
        s.setString(2, nombre.getText());
        s.setString(3, apellido.getText());
        s.setString(4, telefono.getText());
        s.setString(5, direccion.getText());
        s.execute();
        JOptionPane.showMessageDialog(null, s.getString(6));


        sentencia.close();
        con.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "ERROR CON LA BASE DE DATOS");
        System.out.println(ex);
    }
}//GEN-LAST:event_ModificarClienteActionPerformed

private void masAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_masAncestorAdded
// TODO add your handling code here:
}//GEN-LAST:event_masAncestorAdded

private void eliminarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarclienteActionPerformed
 try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        java.sql.Statement sentencia = con.createStatement();
        CallableStatement s = con.prepareCall("CALL Elim_Cliente (? , ? )");
        s.setInt(1, Integer.parseInt(cedulacliente.getText()));
        s.execute();
        JOptionPane.showMessageDialog(null, s.getString(2));

        sentencia.close();
        con.close();
    } catch (Exception ex) {
        System.out.println(ex);
    }
}//GEN-LAST:event_eliminarclienteActionPerformed

private void consultarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarclienteActionPerformed
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        java.sql.Statement sentencia = con.createStatement();
        CallableStatement s = con.prepareCall("CALL Cons_Cliente (" + cedulacliente.getText() + " )");
        s.execute();
        while (s.getResultSet().next()) {
             nombre.setText(s.getResultSet().getString(1));
             apellido.setText(s.getResultSet().getString(2));
             direccion.setText(s.getResultSet().getString(3));
             telefono.setText(s.getResultSet().getString(4));     
            
        }

        sentencia.close();
        con.close();
    } catch (Exception ex) {
        System.out.println(ex);
    }
    
   /* try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        CallableStatement s = con.prepareCall("CALL Cons_Cc_Vendedor ()");
        s.execute();
        ResultSet rs = s.getResultSet();
        while (rs.next()) {
            ceduvendedor.addItem(rs.getString("Cc_Vendedor"));
        }
        s.close();
        con.close();
    } catch (Exception ex) {
        System.out.println(ex);
    }
}     */
    
           /* try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
            java.sql.Statement sentencia = con.createStatement();
            //Vector vector=new Vector(10);
            Object vector = new Object();

            vector = (sentencia.executeUpdate("CALL Cons_Cliente (" + cedulacliente.getText() + " )"));
            // for(int i=0; i<vector.size(); i++){
            // System.out.print(vector.elementAt(i)+"\t");
            //System.out.println("gh");
            // }
            System.out.println(vector);
            //sentencia.executeUpdate(iPro);
            sentencia.close();
            con.close();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CONSULTAR EL CLIENTE");
            System.out.println(ex);
        }*/

     /*  try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        CallableStatement s = con.prepareCall("CALL Nuevo_Cliente ");
        java.sql.Statement sentencia = con.createStatement();
        s.setInt(1, Integer.parseInt(cedulacliente.getText(0)));
        String =  (2, nombre.getText(1));
        s.setString(3, apellido.getText(2));
        s.setString(4, telefono.getText(3));
        s.setString(5, direccion.getText(4));
        s.execute();
      while (s.Read()){
       richTextBox1.Clear();
                 cedulacliente = s.GetValue(0));
                string nombre = Convert.ToString(s.GetValue(1));
                string apellido = Convert.ToString(s.GetValue(2));
                string telefono = Convert.ToString(s.GetValue(3));
                string direccion = Convert.ToString(s.GetValue(4));
                richTextBox1.Text += " " + valor + " " + Tipo + " " + Medida + " \n";
      }
        JOptionPane.showMessageDialog(null, s.getString(6));


        sentencia.close();
        con.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "ERROR CON LA BASE DE DATOS");
        System.out.println(ex);
    
    
    /*  MySqlDataReader Consulta;
            int x = int.Parse(DateTime.Now.Month.ToString()) - 1;
            Consulta = EjecutarComando.EjecutarSQL
            ("select Tipo,Papel, Dimensiones from Megaplotter.Servicio,(select id_servicio ID from (select max(cantidadServicio)Maximo from (Select id_Servicio,cantidadServicio from (select id_servicio, count(id_servicio)cantidadServicio from megaplotter.servicioxsuministro group by id_servicio)t2,(select id_servicio Servicio from Megaplotter.detalle_venta where Mes = ('" + x + "'))t1 where t1.servicio = t2.id_servicio)t4)t6, (Select id_Servicio,cantidadServicio from (select id_servicio, count(id_servicio)cantidadServicio from megaplotter.servicioxsuministro group by id_servicio)t2, (select id_servicio Servicio from Megaplotter.detalle_venta where Mes = (10))t1 where t1.servicio = t2.id_servicio)t5 where t5.cantidadServicio = t6.Maximo)t6 where IdServicio = ID");
            while (Consulta.Read())
            {
                richTextBox1.Clear();
                string valor = Convert.ToString(Consulta.GetValue(0));
                string Tipo = Convert.ToString(Consulta.GetValue(1));
                string Medida = Convert.ToString(Consulta.GetValue(2));
                richTextBox1.Text += " " + valor + " " + Tipo + " " + Medida + " \n";

            }*/

}//GEN-LAST:event_consultarclienteActionPerformed

private void limpiarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarclienteActionPerformed
    this.cedulacliente.setText(null);
    this.nombre.setText(null);
    this.apellido.setText(null);
    this.telefono.setText(null);
    this.direccion.setText(null);// TODO add your handling code here:
}//GEN-LAST:event_limpiarclienteActionPerformed

private void nuevafacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevafacturaActionPerformed
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        String query = "CALL Nueva_Factura (" + numerofactura.getText() + " , '" + local.getText() + "' , '" + cc.getSelectedItem() + "' , '" + cv.getSelectedItem() + "' , " + valorarticulos.getText() + "' , '" + codigoarticulo.getSelectedItem() + ")";
        java.sql.Statement sentencia = con.createStatement();
        sentencia.executeUpdate(query);
        
        JOptionPane.showMessageDialog(null, "FACTURA GUARDADO CON EXITO");
        sentencia.close();
        con.close();
    } catch (Exception ex) {
        System.out.println(ex);
    }
  
}//GEN-LAST:event_nuevafacturaActionPerformed

private void consultarfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarfacturaActionPerformed
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        java.sql.Statement sentencia = con.createStatement();
        CallableStatement s = con.prepareCall("CALL Cons_Factura (" + numerofactura.getText() + " )");
        s.execute();
        while (s.getResultSet().next()) {
            System.out.println(s.getResultSet().getString(1));

        }
        s.close();
        con.close();
    } catch (Exception ex) {
        System.out.println(ex);
    }
// TODO add your handling code here:
}//GEN-LAST:event_consultarfacturaActionPerformed

private void modificarfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarfacturaActionPerformed
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        java.sql.Statement sentencia = con.createStatement();
        sentencia.executeUpdate("CALL Mod_Factura (" + numerofactura.getText() + " , '" + local.getText() + "' , '" + cc.getSelectedItem() + "' , '" + cv.getSelectedItem() + "' , " + valorarticulos.getText() + ")");
        sentencia.close();
        JOptionPane.showMessageDialog(null, "FACTURA MODIFICADO CON EXITO");
        sentencia.close();
        con.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "ERROR AL MODIFICADO LA FACTURA");
        System.out.println(ex);
    }
}//GEN-LAST:event_modificarfacturaActionPerformed

private void eliminarfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarfacturaActionPerformed
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        CallableStatement s = con.prepareCall("CALL Elim_Factura (" + numerofactura.getText() + ", ? )");
        java.sql.Statement sentencia = con.createStatement();
        s.execute();
        JOptionPane.showMessageDialog(null, s.getString(1));
        
        sentencia.close();
        con.close();
    } catch (Exception ex) {
        System.out.println(ex);
    }
}//GEN-LAST:event_eliminarfacturaActionPerformed

private void limfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limfacturaActionPerformed
    this.numerofactura.setText(null);
    this.local.setText(null);
    this.apellido.setText(null);
    this.valorarticulos.setText(null);
}//GEN-LAST:event_limfacturaActionPerformed

private void nuevovendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevovendedorActionPerformed
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        CallableStatement s = con.prepareCall("CALL Nuevo_Vendedor (?,?,?,?,?)");
        java.sql.Statement sentencia = con.createStatement();
        s.setInt(1, Integer.parseInt(cedulavendedor.getText()));
        s.setString(2, nombree.getText());
        s.setString(3, apellidoo.getText());
        s.setString(4, numerotelefono.getText());
        
        s.execute();
        JOptionPane.showMessageDialog(null, s.getString(5));


        sentencia.close();
        con.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "ERROR CON LA BASE DE DATOS");
        System.out.println(ex);
    }
}//GEN-LAST:event_nuevovendedorActionPerformed

private void eliminadorvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminadorvendedorActionPerformed
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        java.sql.Statement sentencia = con.createStatement();
        CallableStatement s = con.prepareCall("CALL Elim_Vendedor (? , ? )");
        s.setInt(1, Integer.parseInt(cedulavendedor.getText()));
        s.execute();
        JOptionPane.showMessageDialog(null, s.getString(2));

        sentencia.close();
        con.close();
    } catch (Exception ex) {
        System.out.println(ex);
    }
}//GEN-LAST:event_eliminadorvendedorActionPerformed

private void modificarvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarvendedorActionPerformed
     try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        CallableStatement s = con.prepareCall("CALL Mod_Vendedor (?,?,?,?,?)");
        java.sql.Statement sentencia = con.createStatement();
        s.setInt(1, Integer.parseInt(cedulavendedor.getText()));
        s.setString(2, nombree.getText());
        s.setString(3, apellidoo.getText());
        s.setString(4, numerotelefono.getText());
        
        s.execute();
        JOptionPane.showMessageDialog(null, s.getString(5));


        sentencia.close();
        con.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "ERROR CON LA BASE DE DATOS");
        System.out.println(ex);
    }
}//GEN-LAST:event_modificarvendedorActionPerformed

private void consultarvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarvendedorActionPerformed
   /* try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
            java.sql.Statement sentencia = con.createStatement();
           // String [] valor = new String [6];
            

            CallableStatement s = con.prepareCall("CALL Cons_Vendedor (" + cedulavendedor.getText() + " )");
            //ResultSet valor =  sentencia.executeUpdate("CALL Cons_Vendedor (" + cedulavendedor.getText() + " )");
            s.execute();
            
            sentencia.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }*/
 /* try {
            java.sql.Statement sentencia = con.createStatement();
             //Vector vector=new Vector(10);
           Object vector = new Object ();

            vector = (sentencia.executeUpdate("CALL Cons_Vendedor (" + cedulavendedor.getText() + " )"));
           // for(int i=0; i<vector.size(); i++){
           // System.out.print(vector.elementAt(i)+"\t");
            //System.out.println("gh");
       // }
            System.out.println(vector);
            //sentencia.executeUpdate(iPro);
            sentencia.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }*/
    
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
                java.sql.Statement sentencia = con.createStatement();
            // String [] valor = new String [6];
            CallableStatement s = con.prepareCall("CALL Cons_Vendedor (" + cedulavendedor.getText() + " )");
            s.execute();
            while (s.getResultSet().next()) {
                //System.out.println(s.getResultSet().getString(1));
                cv.addItem(s.getResultSet().getString(1));
                
            }
            //System.out.println(s.getString(1));
            //sentencia.executeUpdate(iPro);
            sentencia.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

}//GEN-LAST:event_consultarvendedorActionPerformed

private void limpiarvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarvendedorActionPerformed
    this.cedulavendedor.setText(null);
    this.nombree.setText(null);
    this.apellidoo.setText(null);
    this.numerotelefono.setText(null);
}//GEN-LAST:event_limpiarvendedorActionPerformed

private void NuevoarticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoarticuloActionPerformed
   try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        CallableStatement s = con.prepareCall("CALL Nuevo_Articulo (?,?,?,?)");
        java.sql.Statement sentencia = con.createStatement();
        s.setInt(1, Integer.parseInt(codigo.getText()));
        s.setString(2, descripcion.getText());
        s.setInt(3, Integer.parseInt(valor.getText()));
        s.execute();
       JOptionPane.showMessageDialog(null, s.getString(4));
       
        sentencia.close();
        con.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "ERROR CON LA BASE DE DATOS");
        System.out.println(ex);
    }

}//GEN-LAST:event_NuevoarticuloActionPerformed

private void modificararticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificararticuloActionPerformed
     try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        CallableStatement s = con.prepareCall("CALL Mod_Articulo (?,?,?,?)");
        java.sql.Statement sentencia = con.createStatement();
        s.setInt(1, Integer.parseInt(codigo.getText()));
        s.setString(2, descripcion.getText());
        s.setInt(3, Integer.parseInt(valor.getText()));
        s.execute();
       JOptionPane.showMessageDialog(null, s.getString(4));
       
        sentencia.close();
        con.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "ERROR CON LA BASE DE DATOS");
        System.out.println(ex);
    }
}//GEN-LAST:event_modificararticuloActionPerformed

private void EliminararticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminararticuloActionPerformed
    try {

        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        CallableStatement s = con.prepareCall("CALL Elim_Articulo (? , ? )");
        s.setInt(1, Integer.parseInt(codigo.getText()));
        s.execute();
        JOptionPane.showMessageDialog(null, s.getString(2));
        s.close();
        con.close();
    } catch (Exception ex) {
        System.out.println(ex);
        JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR EL ARTICULO");

    }
}//GEN-LAST:event_EliminararticuloActionPerformed

private void consultararticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultararticuloActionPerformed
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        java.sql.Statement sentencia = con.createStatement();
        CallableStatement s = con.prepareCall("CALL Cons_Articulo (" + codigo.getText() + " )");
        s.execute();
        ResultSet rs = s.getResultSet();
        while (rs.next()) {
            descripcion.setText(rs.getString("Codigol_Articulo"));
            valor.setText(rs.getString("Valor"));
           

        }

        s.close();
        con.close();
    } catch (Exception ex) {
        System.out.println(ex);
    }
    String dir="C:\\Users\\Luisa\\Desktop\\practica BD\\Mueble Art Stefanny\\src\\mueble\\art\\stefanny\\Images\\Portada.jpg";
    int codigo1 = 1;
 
    try
    {
        codigo1 = Integer.parseInt(codigo.getText());
    }
    catch(NumberFormatException e)
    {
        codigo.setText("##?");
    }
    switch(codigo1)
    {
        
        case 123:  dir="C:\\Users\\Luisa\\Desktop\\practica BD\\Practica Final\\Mueble Art Stefanny\\src\\mueble\\art\\stefanny\\Images\\Cajoneras.jpg";
                            break;
        case 236:  dir="C:\\Users\\Luisa\\Desktop\\practica BD\\Practica Final\\Mueble Art Stefanny\\src\\mueble\\art\\stefanny\\Images\\Juego Muebles Colores.jpg";
                            break;
            
            
        case 456:  dir="C:\\Users\\Luisa\\Desktop\\practica BD\\Practica Final\\Mueble Art Stefanny\\src\\mueble\\art\\stefanny\\Images\\Cama.jpg";
                            break;
            
        case 852: dir="C:\\Users\\Luisa\\Desktop\\practica BD\\Practica Final\\Mueble Art Stefanny\\src\\mueble\\art\\stefanny\\Images\\Closet.jpg";
                            break;
            
        case 789:  dir="C:\\Users\\Luisa\\Desktop\\practica BD\\Practica Final\\Mueble Art Stefanny\\src\\mueble\\art\\stefanny\\Images\\Comedor.jpg";
                            break;
            
        case 951: dir="C:\\Users\\Luisa\\Desktop\\practica BD\\Practica Final\\Mueble Art Stefanny\\src\\mueble\\art\\stefanny\\Images\\Esquinero.jpg";
                            break;
            
        case 842:  dir="C:\\Users\\Luisa\\Desktop\\practica BD\\Practica Final\\Mueble Art Stefanny\\src\\mueble\\art\\stefanny\\Images\\Multimueble Piramide.jpg";
                            break;
            
        case 862: dir="C:\\Users\\Luisa\\Desktop\\practica BD\\Practica Final\\Mueble Art Stefanny\\src\\mueble\\art\\stefanny\\Images\\Multimueble.jpg";
                            break;
        
    }
    
    ImageIcon ico = new ImageIcon(dir);
    imagen.setIcon(new ImageIcon(ico.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT)));
    
    

}//GEN-LAST:event_consultararticuloActionPerformed

private void limarticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limarticuloActionPerformed
    this.codigo.setText(null);
    this.descripcion.setText(null);
    this.valor.setText(null);

}//GEN-LAST:event_limarticuloActionPerformed

private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded


}//GEN-LAST:event_jPanel1AncestorAdded

private void nuevacomisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevacomisionActionPerformed
try {
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
            String query="CALL Nuevo_Comision (" + identificador.getText() + " , '" + descripcionn.getText() + "' , '" + valorr.getText() + "' , '"  + ceduvendedor.getSelectedItem()+")";
            java.sql.Statement sentencia = con.createStatement();
            sentencia.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "COMISION GUARDADO CON EXITO");
            sentencia.close();
             con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
}//GEN-LAST:event_nuevacomisionActionPerformed

private void modficarcomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modficarcomiActionPerformed
try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
            java.sql.Statement sentencia = con.createStatement();
            sentencia.executeUpdate ("CALL Mod_Comision (" + identificador.getText() + " , '" + descripcionn.getText() + "' , " + valorr.getText() + " , "  + ceduvendedor.getSelectedItem() + ")");
             JOptionPane.showMessageDialog(null, "COMISION MODIFICADO CON EXITO");
            sentencia.close();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICADO LA COMISION");
            System.out.println(ex);
        }

}//GEN-LAST:event_modficarcomiActionPerformed

private void eliminarcomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarcomiActionPerformed
try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
            CallableStatement s = con.prepareCall("CALL Elim_Comision (" + identificador.getText() + ", ? )");
            java.sql.Statement sentencia = con.createStatement();
            s.execute();
            JOptionPane.showMessageDialog(null, s.getString(1));
            sentencia.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
}//GEN-LAST:event_eliminarcomiActionPerformed

private void consultarcomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarcomiActionPerformed
try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
            java.sql.Statement sentencia = con.createStatement();
             Object vector = new Object();
            vector = (sentencia.executeUpdate("CALL Cons_Comision (" + identificador.getText() + " )"));
            System.out.println(vector);
            sentencia.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
}//GEN-LAST:event_consultarcomiActionPerformed

private void limcomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limcomiActionPerformed
    this.identificador.setText(null);
    this.descripcionn.setText(null);
    this.valorr.setText(null);
}//GEN-LAST:event_limcomiActionPerformed

private void ceduvendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ceduvendedorMouseClicked

}//GEN-LAST:event_ceduvendedorMouseClicked

private void ceduvendedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ceduvendedorMousePressed
try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        CallableStatement s = con.prepareCall("CALL Cons_Cc_Vendedor ()");
        s.execute();
        ResultSet rs = s.getResultSet();
        while (rs.next()) {
            ceduvendedor.addItem(rs.getString("Cc_Vendedor"));
        }
        s.close();
        con.close();
    } catch (Exception ex) {
        System.out.println(ex);
    }
}//GEN-LAST:event_ceduvendedorMousePressed

private void ccMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ccMousePressed
try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        CallableStatement s = con.prepareCall("CALL Cons_Cedula_Cliente ()");
        s.execute();
        ResultSet rs = s.getResultSet();
        while (rs.next()) {
            cc.addItem(rs.getString("Cc_Cliente"));
        }
        s.close();
        con.close();
    } catch (Exception ex) {
        System.out.println(ex);
    }
}//GEN-LAST:event_ccMousePressed

private void cvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cvMousePressed
try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        CallableStatement s = con.prepareCall("CALL Cons_Cc_Vendedor ()");
        s.execute();
        ResultSet rs = s.getResultSet();
        while (rs.next()) {
            cv.addItem(rs.getString("Cc_Vendedor"));
        }
        s.close();
        con.close();
    } catch (Exception ex) {
        System.out.println(ex);
    }


}//GEN-LAST:event_cvMousePressed

private void codigoarticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoarticuloMousePressed
try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
        CallableStatement s = con.prepareCall("CALL Cons_Cc_Articulo ()");
        s.execute();
        ResultSet rs = s.getResultSet();
        while (rs.next()) {
            codigoarticulo.addItem(rs.getString("Codigol_Articulo"));
        }
        s.close();
        con.close();
    } catch (Exception ex) {
        System.out.println(ex);
    }
    
}//GEN-LAST:event_codigoarticuloMousePressed

private void ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccActionPerformed

}//GEN-LAST:event_ccActionPerformed

private void ceduvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceduvendedorActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_ceduvendedorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminararticulo;
    private javax.swing.JButton ModificarCliente;
    private javax.swing.JButton Nuevoarticulo;
    private javax.swing.JButton agregarcliente;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField apellidoo;
    private javax.swing.JPanel articulo;
    private java.awt.Button button1;
    private javax.swing.JComboBox cc;
    private javax.swing.JTextField cedulacliente;
    private javax.swing.JTextField cedulavendedor;
    private javax.swing.JComboBox ceduvendedor;
    private javax.swing.JPanel cliente;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox codigoarticulo;
    private javax.swing.JButton consultararticulo;
    private javax.swing.JButton consultarcliente;
    private javax.swing.JButton consultarcomi;
    private javax.swing.JButton consultarfactura;
    private javax.swing.JButton consultarvendedor;
    private javax.swing.JComboBox cv;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField descripcionn;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton eliminadorvendedor;
    private javax.swing.JButton eliminarcliente;
    private javax.swing.JButton eliminarcomi;
    private javax.swing.JButton eliminarfactura;
    private javax.swing.JPanel factura;
    private javax.swing.JTextField identificador;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limarticulo;
    private javax.swing.JButton limcomi;
    private javax.swing.JButton limfactura;
    private javax.swing.JButton limpiarcliente;
    private javax.swing.JButton limpiarvendedor;
    private javax.swing.JTextField local;
    private javax.swing.JTabbedPane mas;
    private javax.swing.JButton modficarcomi;
    private javax.swing.JButton modificararticulo;
    private javax.swing.JButton modificarfactura;
    private javax.swing.JButton modificarvendedor;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombree;
    private javax.swing.JButton nuevacomision;
    private javax.swing.JButton nuevafactura;
    private javax.swing.JButton nuevovendedor;
    private javax.swing.JTextField numerofactura;
    private javax.swing.JTextField numerotelefono;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField valor;
    private javax.swing.JTextField valorarticulos;
    private javax.swing.JTextField valorr;
    private javax.swing.JPanel vendedor;
    // End of variables declaration//GEN-END:variables
    private Connection con;

    public void conexion() {
        try {
            this.setVisible(true);
            con = DriverManager.getConnection("jdbc:mysql://localhost/muebleartestefanny", "root", "eafit");
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select nombre from muebleartestefanny.Tbl_Cliente");

            while (rs.next()) {

                System.out.println(rs.getString("nombre"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
