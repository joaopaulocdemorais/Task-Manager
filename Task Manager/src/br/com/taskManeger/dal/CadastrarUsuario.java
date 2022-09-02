/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.taskManeger.dal;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author joaop
 */
public class CadastrarUsuario {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
        
    public void cadastrar(String tipo, String nome, String senha, String cpf){
        String sql = "insert into tuser (tipo, nome, cpf, senha) values (?,?,?,?)";
        int t = tipo.equals("ADMINISTRADO")? 1 : 2;
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, t);
            pst.setString(2, nome);
            pst.setString(3, senha);
            pst.setString(4, cpf);
             JOptionPane.showMessageDialog(null,"USUÁRIO CADASTRADO COM SUCESSO!");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"NÃO FOI POSSIVEL CADASTRAR O USUÁRIO, ENTRE EM CONTATO COM O DESENVOLVEDOR");
        }
    }
}
