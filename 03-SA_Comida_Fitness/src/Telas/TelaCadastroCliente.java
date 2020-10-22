/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import ConexaoBanco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas.A
 */
public class TelaCadastroCliente extends javax.swing.JInternalFrame {

    PreparedStatement pst = null;
    Connection con = null;
    ResultSet rs = null;
    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaCadastroCliente() {
        initComponents();
        con = Conexao.conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxEstadoCivil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtNumCelular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        comboBoxEstado = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboBoxSexo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtNumEndereco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro Cliente");

        comboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viuvo(a)" }));

        jLabel6.setText("Nº Celular:");

        jLabel7.setText("E-mail:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Dados Cadastrais");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Endereço");

        jLabel10.setText("Endereço:");

        jLabel11.setText("Nº:");

        btnRemover.setText("Remover");
        btnRemover.setPreferredSize(new java.awt.Dimension(82, 32));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(82, 32));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        labelNome.setText("Nome: ");

        comboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito", "Federal", "Espírito", "Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));

        jLabel1.setText("CPF:");

        jLabel2.setText("RG:");

        jLabel3.setText("Nacimento:");

        jLabel4.setText("Sexo:");

        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        jLabel5.setText("Esta Civil");

        jLabel12.setText("Bairro:");

        jLabel13.setText("Cidade:");

        jLabel14.setText("Estado:");

        jLabel15.setText("CEP:");

        btnCadastrar.setText("Cadastra");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(82, 32));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel16.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIdCliente))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel9)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataNascimento))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumEndereco))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(comboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txtNumEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadCliente();
    }//GEN-LAST:event_btnCadastrarActionPerformed
    public int validaCamposCliente() {

        if (txtNome.getText().isEmpty() || txtCpf.getText().isEmpty() || txtRg.getText().isEmpty() || txtDataNascimento.getText().isEmpty() || txtNumCelular.getText().isEmpty() || txtEmail.getText().isEmpty() || txtEndereco.getText().isEmpty() || txtNumEndereco.getText().isEmpty() || txtBairro.getText().isEmpty() || txtCidade.getText().isEmpty() || txtCep.getText().isEmpty()){
            return 1;
        } else {
            return 2;
        }
    }
    
    public String preenchaCampo()
    {        
        String textPreencha = "Preencha todos os campos para prosseguir.";
        return textPreencha;        
    }            
    
    public void cadCliente() {
        if (validaCamposCliente() == 2) {
            con = Conexao.conectar();
            String Sql = "INSERT INTO cliente(nome_cliente,cpf_cliente,rg_cliente,sexo_cliente,estadocivil_cliente,datanascimento_cliente,telefonecelular_cliente,email_cliente,endereco_cliente,numrua_cliente,bairro_cliente,cidade_cliente,estado_cliente,cep_cliente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            try {
                pst = con.prepareStatement(Sql);
                pst.setString(1, txtNome.getText());
                pst.setString(2, txtCpf.getText());
                pst.setString(3, txtRg.getText());
                pst.setString(4, comboBoxSexo.getSelectedItem().toString());
                pst.setString(5, comboBoxEstadoCivil.getSelectedItem().toString());
                pst.setString(6, txtDataNascimento.getText());
                pst.setString(7, txtNumCelular.getText());
                pst.setString(8, txtEmail.getText());
                pst.setString(9, txtEndereco.getText());
                pst.setString(10, txtNumEndereco.getText());
                pst.setString(11, txtBairro.getText());
                pst.setString(12, txtCidade.getText());
                pst.setString(13, comboBoxEstado.getSelectedItem().toString());
                pst.setString(14, txtCep.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro:" + preenchaCampo());
            } finally {
                Conexao.desconectar(con);
            }
        } else {
            JOptionPane.showMessageDialog(null,preenchaCampo());
        }
    }

    public void busCliente() {   
        if (txtIdCliente.getText().isEmpty()) {            
            JOptionPane.showMessageDialog(null,"Preencha o campo 'ID' com uma id valida.");        
        }else{
            con = Conexao.conectar();
            String Sql = "SELECT * FROM cliente WHERE id_cliente=?";

            try {
                pst = con.prepareStatement(Sql);
                pst.setString(1, txtIdCliente.getText());
                //JOptionPane.showMessageDialog(null, pst);
                rs = pst.executeQuery();

                if (rs.next()) {
                    txtNome.setText(rs.getString(2));
                    txtCpf.setText(rs.getString(3));
                    txtRg.setText(rs.getString(4));
                    comboBoxSexo.setSelectedItem(rs.getString(5));
                    comboBoxEstadoCivil.setSelectedItem(rs.getString(6));
                    txtDataNascimento.setText(rs.getString(7));
                    txtNumCelular.setText(rs.getString(8));
                    txtEmail.setText(rs.getString(9));
                    txtEndereco.setText(rs.getString(10));
                    txtNumEndereco.setText(rs.getString(11));
                    txtBairro.setText(rs.getString(12));
                    txtCidade.setText(rs.getString(13));
                    comboBoxEstado.setSelectedItem(rs.getString(14));
                    txtCep.setText(rs.getString(15));
                    JOptionPane.showMessageDialog(null, "Cliente localizado com sucesso!");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro:" + e);
            } finally {
                Conexao.desconectar(con);
            }
        }
    }
    
    public void deleteCliente() {
        
        if (txtIdCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo 'ID' com uma id valida.");
        } else {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente remover esse usuario?", title, JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                //Usuário clicou em Sim. Executar o código correspondente.
                JOptionPane.showMessageDialog(null, "Ok, você sabe o que faz.");
                con = Conexao.conectar();
                String Sql = "DELETE FROM cliente WHERE id_cliente=?";
                try {
                    pst = con.prepareStatement(Sql);
                    pst.setString(1, txtIdCliente.getText());
                    pst.execute();

                    JOptionPane.showMessageDialog(null, "Usuario removido com sucesso!");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro:" + e);

                } finally {
                    Conexao.desconectar(con);
                }

            } else if (resposta == JOptionPane.NO_OPTION) {
                //Usuário clicou em não. Executar o código correspondente.
            }
        }
    }
    
    public void updateCliente() {
        if (validaCamposCliente() == 2) {
            con = Conexao.conectar();

            String Sql = "UPDATE cliente SET nome_cliente=?,cpf_cliente=?,rg_cliente=?,sexo_cliente=?,estadocivil_cliente=?,datanascimento_cliente=?,telefonecelular_cliente=?,email_cliente=?,endereco_cliente=?,numrua_cliente=?,bairro_cliente=?,cidade_cliente=?,estado_cliente=?,cep_cliente=? WHERE id_cliente=?";

            try {
                pst = con.prepareStatement(Sql);
                pst.setString(1, txtNome.getText());
                pst.setString(2, txtCpf.getText());
                pst.setString(3, txtRg.getText());
                pst.setString(4, comboBoxSexo.getSelectedItem().toString());
                pst.setString(5, comboBoxEstadoCivil.getSelectedItem().toString());
                pst.setString(6, txtDataNascimento.getText());
                pst.setString(7, txtNumCelular.getText());
                pst.setString(8, txtEmail.getText());
                pst.setString(9, txtEndereco.getText());
                pst.setString(10, txtNumEndereco.getText());
                pst.setString(11, txtBairro.getText());
                pst.setString(12, txtCidade.getText());
                pst.setString(13, comboBoxEstado.getSelectedItem().toString());
                pst.setString(14, txtCep.getText());
                pst.setString(15, txtIdCliente.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Funcionario atualizado com sucesso!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro:" + e);

            } finally {
                Conexao.desconectar(con);
            }
        } else {
            JOptionPane.showMessageDialog(null, preenchaCampo());
        }
    }
        
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        busCliente();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        updateCliente();        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        deleteCliente();
    }//GEN-LAST:event_btnRemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.JComboBox<String> comboBoxEstadoCivil;
    private javax.swing.JComboBox<String> comboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelNome;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumCelular;
    private javax.swing.JTextField txtNumEndereco;
    private javax.swing.JTextField txtRg;
    // End of variables declaration//GEN-END:variables
}
