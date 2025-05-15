/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import controladores.ControlaCliente;
import entidades.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class TelaClientes extends javax.swing.JInternalFrame {
    

    ControlaCliente controlaClientes = new ControlaCliente();
   int codigo = 0;
   
    public TelaClientes() {
        initComponents();
        montaTabela();
    }
     private void montaTabela() {
        ArrayList<Cliente> clientes = controlaClientes.recuperarTodos();
        if (clientes == null) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar clientes");
        } else {
            tblClientes.setModel(new AbstractTableModel() {
                @Override
                public String getColumnName(int column) {
                    switch (column) {
                        case 0:
                            return "ID";
                        case 1:
                            return "Nome";
                        case 2:
                            return "CPF";
                        case 3: 
                            return "Endereço";
                        case 4:
                            return "Data Nascimento";
                        default:
                            return "";
                    }
                }

                @Override
                public int getColumnCount() {
                    return 5;
                }

                @Override
                public int getRowCount() {
                    return clientes.size();
                }

                @Override
                public Object getValueAt(int rowIndex, int columnIndex) {
                    Cliente c = clientes.get(rowIndex);

                    if (c != null) {
                        switch (columnIndex) {
                            case 0:
                                return c.getId();
                            case 1:
                                return c.getNome();
                            case 2:
                                return c.getCpf();
                            case 3:
                                return c.getEndereco();
                            case 4:
                                return c.getDataNasc();
                        }

                    }

                    return "n/d";
                }
            });

            tblClientes.getColumnModel().getColumn(0).setMinWidth(80);
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblClientes.getColumnModel().getColumn(0).setMaxWidth(20);
        }
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containertabela = new javax.swing.JTabbedPane();
        tabCadastro = new javax.swing.JPanel();
        lblNome1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCpf1 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblEndereco1 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblDataNascimento1 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnSalvar1 = new javax.swing.JButton();
        tabListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setClosable(true);

        lblNome1.setText("Nome");

        lblCpf1.setText("CPF");

        lblEndereco1.setText("Endereço");

        lblDataNascimento1.setText("Data Nascimento");

        txtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnSalvar1.setBackground(new java.awt.Color(255, 255, 102));
        btnSalvar1.setText("Salvar");
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabCadastroLayout = new javax.swing.GroupLayout(tabCadastro);
        tabCadastro.setLayout(tabCadastroLayout);
        tabCadastroLayout.setHorizontalGroup(
            tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
                .addComponent(btnSalvar1)
                .addGap(63, 63, 63))
            .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabCadastroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNome1)
                        .addComponent(txtNome)
                        .addComponent(lblCpf1)
                        .addComponent(txtCpf)
                        .addComponent(lblEndereco1)
                        .addComponent(txtEndereco)
                        .addComponent(lblDataNascimento1)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        tabCadastroLayout.setVerticalGroup(
            tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCadastroLayout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar1))
                .addGap(126, 126, 126))
            .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabCadastroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblNome1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblCpf1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblEndereco1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblDataNascimento1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(197, Short.MAX_VALUE)))
        );

        containertabela.addTab("Cadastro", tabCadastro);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            tblClientes.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            tblClientes.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            tblClientes.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabListagemLayout = new javax.swing.GroupLayout(tabListagem);
        tabListagem.setLayout(tabListagemLayout);
        tabListagemLayout.setHorizontalGroup(
            tabListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addGap(4, 4, 4))
            .addGroup(tabListagemLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 128, Short.MAX_VALUE))
        );
        tabListagemLayout.setVerticalGroup(
            tabListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addGroup(tabListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        containertabela.addTab("Listagem Clientes", tabListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(containertabela)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(containertabela, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        montaTabela();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed
    Cliente cl = new Cliente();
        String nome = txtNome.getText();
        cl.setNome(nome);
        cl.setCpf(txtCpf.getText());
        cl.setEndereco(txtEndereco.getText());
        cl.setDataNasc(txtDataNascimento.getText());

        if (codigo == 0) {
            boolean retorno = controlaClientes.salvar(cl);
            if (retorno) {
                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
                txtNome.setText("");
                txtCpf.setText("");
                txtEndereco.setText("");
                txtDataNascimento.setText("");

                txtNome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, verifique os logs.");
            }
        } else {
            cl.setId(codigo);
            boolean retorno = controlaClientes.editar(cl);
            if (retorno) {
                JOptionPane.showMessageDialog(null, "Editado com sucesso");
                txtNome.setText("");
                txtCpf.setText("");
                txtEndereco.setText("");
                txtDataNascimento.setText("");

                montaTabela();
                containertabela.setSelectedIndex(1);
                codigo = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, verifique os logs.");
            }
        }
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    String idString = String.valueOf(tblClientes.getValueAt(tblClientes.getSelectedRow(), 0));
        int id = Integer.parseInt(idString);

        Cliente c = controlaClientes.recuperar(id);

        if (c == null) {
            JOptionPane.showMessageDialog(null, "Registro não localizado!");
        } else {

            // preenche a variavel codigo que sera usada para salvar ou editar
            codigo = c.getId();

            // mudar a aba ativa para Cadastro
            containertabela.setSelectedIndex(0);

            // coloca dados nos campos de interface
            txtNome.setText(c.getNome());
            txtCpf.setText(c.getCpf());
            txtDataNascimento.setText(c.getDataNasc());
            txtEndereco.setText(c.getEndereco());

            txtNome.requestFocus();
        }
         
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
   

            String idString = String.valueOf(tblClientes.getValueAt(tblClientes.getSelectedRow(), 0));
        int id = Integer.parseInt(idString);

        boolean retorno = controlaClientes.excluir(id);
        if (retorno) {
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
            montaTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir!");
        }
    
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JTabbedPane containertabela;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf1;
    private javax.swing.JLabel lblDataNascimento1;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JPanel tabCadastro;
    private javax.swing.JPanel tabListagem;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
