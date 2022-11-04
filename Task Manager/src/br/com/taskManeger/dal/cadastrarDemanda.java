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
public class cadastrarDemanda {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 

    public cadastrarDemanda() {
        conexao = ModuloConexao.conector();
    }
    
    
    
    public void cadastrar(int idCri, int idSolu, String titulo, String problema){
       String sql = "insert into demandas(IdCri, idSolu, titulo, problema, dStatus) values (?, ?, ?, ?, ?)";
        try {
           pst = conexao.prepareStatement(sql);
           pst.setInt(1, idCri);
           pst.setInt(2, idSolu);
           pst.setString(3, titulo);
           pst.setString(4, problema);
           pst.setInt(5, 1);
           pst.execute();
           JOptionPane.showMessageDialog(null,"DEMANDA CADASTRADO COM SUCESSO!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"NÃO FOI POSSIVEL CADASTRAR A DEMANDA, ENTRE EM CONTATO COM O DESENVOLVEDOR");
        }
    }
}
