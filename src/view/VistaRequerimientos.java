package view;

import java.sql.SQLException;
import java.util.ArrayList;
import model.vo.MaterialPropertiesVO;

import controller.ControladorRequerimientos;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    //consulta numero 4
    public static void requerimiento2() {

        System.out.println("############################################################");
        System.out.println("------------Lista de materiales de construcción-------------");
        System.out.println("Para los proyectos: 199, 7, 378, 216 ");
        System.out.println("############################################################");

        try {

            //Comunicarse con el controlador y recibir los resultado
            ArrayList<MaterialPropertiesVO> respuesta = ControladorRequerimientos.consulMaterialesProperties();

            //Recorrer e imprimir los resultado
            for (MaterialPropertiesVO tuplai : respuesta) {
                System.out.printf("Nombre: %s, %d, %d \n",tuplai.getNombre_Material(), tuplai.getPrecio_Unidad(), tuplai.getTotal());
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
