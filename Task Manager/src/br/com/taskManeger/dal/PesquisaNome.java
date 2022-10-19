/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.taskManeger.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class PesquisaNome {
    
    Connection conexao = null; 
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ResultSet pesquisar(String valor){
        try {
         conexao = ModuloConexao.conector();
         String sql = "select id as ID, nome as NOME, cpf as CPF, senha as Senha, tipo as TIPO from tuser where nome like ?;";
         pst = conexao.prepareStatement(sql);
         pst.setString(1, valor + "%");
         rs = pst.executeQuery();
         return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"NÃO FOI PESQUISAR USUÁRIO, ENTRE EM CONTATO COM O DESENVOLVEDOR");
            return null;
        }
    }
    
    public ResultSet pesquisarCD(String valor){
        try {
         conexao = ModuloConexao.conector();
         String sql = "select id as ID, nome as NOME from tuser where nome like ?;";
         pst = conexao.prepareStatement(sql);
         pst.setString(1, valor + "%");
         rs = pst.executeQuery();
         return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"NÃO FOI PESQUISAR USUÁRIO, ENTRE EM CONTATO COM O DESENVOLVEDOR");
            return null;
        }
    }
    
}
