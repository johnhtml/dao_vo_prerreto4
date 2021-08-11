package model.dao;

// ArrayList
import java.util.ArrayList;

// Librerías de sql
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

// Conexion
import util.JDBCutilities;

// VO
import model.vo.MaterialPropertiesVO;

public class MaterialPropertiesDAO {
    
    public ArrayList<MaterialPropertiesVO> MaterialesProyecto() throws SQLException {

        // Crear el arreglo para guardar los registros de la consulta
        ArrayList<MaterialPropertiesVO> respuestaConsulta4 = new ArrayList<MaterialPropertiesVO>();

        // Abrir la conexión a la base de datos
        Connection conexion = JDBCutilities.getConnection();

        // Ejecutar la consulta SQL
        String consulta =   "SELECT mc.Nombre_Material, mc.Precio_Unidad, SUM(c.Cantidad) Total " + 
                            "FROM Proyecto p LEFT JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto " + 
                            " LEFT JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion " + 
                            " WHERE p.ID_Proyecto in (199, 7, 378, 120, 216) " +
                            " GROUP BY mc.Nombre_Material, mc.Precio_Unidad " +
                            " ORDER BY mc.Nombre_Material"
                            ;

        System.out.println(consulta);

        // Ejecutar Consulta(statement)
        Statement stmt = conexion.createStatement();

        // Recorrer Resulset
        ResultSet rs = stmt.executeQuery(consulta);
        while (rs.next()) {
            MaterialPropertiesVO objetoVOi = new MaterialPropertiesVO(
                rs.getString("Nombre_Material"), rs.getInt("Precio_Unidad"), rs.getInt("Total"));
            respuestaConsulta4.add(objetoVOi);
        }

        // Cerrar conexion
        rs.close();
        stmt.close();
        conexion.close();
        return respuestaConsulta4;
    }
}
