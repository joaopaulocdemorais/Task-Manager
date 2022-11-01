/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.taskManeger.dal;

import java.sql.*;

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
    
    
    
    public void cadastrar(int idCri, int idSolu, String titulo, String problema, int status){
       String sql = "insert into demandas(IdCri, idSolu, titulo, problema, dStatus) values (?, ?, ?, ?, ?)";
    }
}
