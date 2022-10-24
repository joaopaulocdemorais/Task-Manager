/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.taskManeger.dal;
import br.com.taskManeger.dal.ModuloConexao;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class Logar {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Logar() {
        conexao = ModuloConexao.conector();
    }
    
    public boolean logar( String user, String senha){
        String sql = "select * from tuser where cpf=? and senha=?;";
        try {
            //as linhas abaixo prepara a consulta ao banco de dados
            pst = conexao.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, senha);
            rs = pst.executeQuery();
            
            if (rs.next()){
                 return true;
            }else{
                JOptionPane.showMessageDialog(null,"USUÁRIO OU SENNHA INCORRETOS");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"NÃO FOI POSSIVEL ENTRAR NO SISTEMA, ENTRE EM CONTATO COM O DESENVOLVEDOR");
            return false;
        }
    }
    
    public int getUser(String user, String senha){
           logar(user, senha);
          try {
              int id = rs.getInt(1);
              return id;
        } catch (Exception e) {
            return 0;
        }
    }

    

}
