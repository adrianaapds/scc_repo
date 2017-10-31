/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scc.login.dao;

import br.com.scc.FabricadeConexao.fabricaconexao;
import br.com.scc.login.bean.LoginBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Adriana
 */
public class loginDAO {

    public LoginBean getLoginUsuario(String email) {
        LoginBean bean = new LoginBean();
        try {
            Connection conexao = fabricaconexao.getConnection();

            String sql = "select email,senha, perfil from usuario where email = ?";
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.execute();
            ResultSet rs = stmt.executeQuery(sql );
            while (rs.next()) {
                bean.setEmail(rs.getString("email"));
                bean.setSenha(rs.getString("senha"));
                bean.setPerfil(rs.getString("perfil"));
            }     
            
            conexao.close();
               return bean;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }              
    }
    
}
