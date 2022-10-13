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
    
    public void deletar(String id){
        try {
            String sql = "delete from tuser where id = ?;";
            conexao = ModuloConexao.conector();
            pst = conexao.prepareStatement(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "");
        } 
    }
    
}
