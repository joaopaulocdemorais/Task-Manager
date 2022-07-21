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
public class ModuloConexao {
    //método resposavel por estabelecer a conexão com o banco de dados
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver 
        String driver = "com.mysql.cj.jdbc.Driver";
        // informações do bando de dados
        String url = "jdbc:mysql://127.0.0.1:3306/dbinfox?characterEncoding=utf-8";
        String user = "dba";
        String password = "Jopacamo@1996";
        // estabelecendo a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
        // parei aluna 10 34:00 minutos 
    }
}
