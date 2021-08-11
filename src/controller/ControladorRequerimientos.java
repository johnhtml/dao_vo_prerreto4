package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.dao.MaterialPropertiesDAO;
import model.vo.MaterialPropertiesVO;

public class ControladorRequerimientos {
    
    private static final MaterialPropertiesDAO materialPropertiesDAO = new MaterialPropertiesDAO();;

    public ControladorRequerimientos() {
    }

    public static ArrayList<MaterialPropertiesVO> consulMaterialesProperties() throws SQLException {
        return materialPropertiesDAO.MaterialesProyecto();
    }
}
