/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.taskManeger.dal;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class DeletarUsuario {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
    
    public void deletar(int id){
        try {
            String sql = "delete from tuser where id = ?;";
            conexao = ModuloConexao.conector();
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "USUÁRIO DELETADO!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NÃO FOI DELETAR O USUÁRIO, ENTRE EM CONTATO COM O DESENVOLVEDOR");
        } 
    }
    
}
