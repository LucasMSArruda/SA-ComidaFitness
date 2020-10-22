package ConexaoBanco;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas.A
 */
public class Conexao {
    
        public static Connection conectar()
    {
       Connection con = null;
       final String URL = "jdbc:mysql://localhost:3306/safitness?useTimezone=true&serverTimezone=UTC";
       final String USE = "root";
       final String PASS = "root";
       
       try{
       
           con = DriverManager.getConnection(URL,USE,PASS);
           return con;
       
       }catch (Exception e){
       
           return null;
       }           
    }
    
    public static void desconectar(Connection con)
    {   
        try{
            con.close();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    
    }
    
}
