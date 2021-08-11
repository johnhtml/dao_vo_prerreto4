package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutilities {
    
    private final static String localDir = System.getProperty("user.dir");
    private final static String UBICACION_DB =
    localDir + "\\ProyectosConstruccion.db";
    //private final static String UBICACION_DB = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_DB;
        return DriverManager.getConnection(url);
    }
}
