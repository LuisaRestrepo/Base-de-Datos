/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mueble.art.stefanny;

/**
 *
 * @author Luisa y Estefania
 */
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
/*import java.lang.Object;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.SQLException;*/
import java.util.ResourceBundle;
import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.*;
import java.io.*;



public class ConexionBd {
    
    
    //Declaración de variables globales
	public static ConexionBd Coneccion = null;
    	public DataSource ds;
    	public ResourceBundle rs;
    	public Connection con;



    public ConexionBd () {

    	ds = null;

    }


    public DataSource CrearConeccion() {

    try
        {

        	//Definición del pool de conexion con database.properties
            MysqlConnectionPoolDataSource dso = new MysqlConnectionPoolDataSource();

            String userName = rs.getString("root");
            String password = rs.getString("eafit");
            String stHost = rs.getString("localhost");
            String stDatabaseName = rs.getString("DistribuidoresNyA");
            String stPort = rs.getString("3306");


            dso.setDatabaseName(stDatabaseName);
            dso.setPort(Integer.parseInt(stPort));
            dso.setUser(userName);
            dso.setPassword(password);
            dso.setServerName(stHost);
            ds = dso;

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
		return ds;
	}



	//Metodo getInstance: crea una instancia de la clase ManejadorConecciones

  	public static ConexionBd  getInstance()
    {
        if(Coneccion == null)
        {

            Coneccion = new ConexionBd ();
            //System.out.println("Instanciado");
        }
        return Coneccion;
    }


    //Metodo getResource: crea el resourceBundle con el archivo sistema.properties

    public ResourceBundle getResource(){

    	rs = ResourceBundle.getBundle("BDatos");
    	return rs;
    }



    //Metodo getConn: crea la instancia de la conexión con el Datasourse

    public Connection getConn()
        throws SQLException
    {
        return ds.getConnection();
    }


	//Metodo getDataSource: retorna el DataSource de la conexión

    public DataSource getDataSource()
    {
        return ds;
    }
    
}
    

