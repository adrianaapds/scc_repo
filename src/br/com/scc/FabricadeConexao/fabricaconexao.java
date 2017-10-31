
package br.com.scc.FabricadeConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Adriana
 */
public class fabricaconexao {
    
    
     public static Connection getConnection(){
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/meubanco","root","adri1014030");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
