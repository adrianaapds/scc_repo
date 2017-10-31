
package br.com.scc.FabricadeConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Adriana
 */
public class ClienteDAO {
   public static void cadastrar() {

        try {
            Connection conexao = fabricaconexao.getConnection();

            String sql = "insert into cliente (nome,email)"
                    + " values(?,?,?)";
           
            conexao.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
}
}