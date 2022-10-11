/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.taskManeger.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class AtualizarUsuario {
    
    Connection conexao = null; 
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public boolean atualizar(String nome, String cpf, String tipo, String senha, String id){
        try {
            int t = tipo.equals("ADMINISTRADOR")? 1 : 2;
            conexao = ModuloConexao.conector();
            String sql = "update tuser set nome = ?, cpf = ?, tipo = ?, senha = ? where id = ?";
            pst = conexao.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, cpf);
            pst.setInt(3, t);
            pst.setString(4, senha);
            pst.setString(5, id);
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    };
}
