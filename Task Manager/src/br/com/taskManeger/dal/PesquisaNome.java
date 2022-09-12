/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.taskManeger.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
         String sql = "select * from tuser where nome like ?;";   
        } catch (Exception e) {
        }
        
    return rs;
    }
    
}
