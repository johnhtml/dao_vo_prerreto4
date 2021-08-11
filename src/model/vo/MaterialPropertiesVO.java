package model.vo;

public class MaterialPropertiesVO {
    
    private String Nombre_Material;
    private Integer Precio_Unidad;
    private Integer Total;

    // Constructors
    public MaterialPropertiesVO() {
    }

    public MaterialPropertiesVO(String nombre_Material, Integer precio_Unidad, Integer total) {
        Nombre_Material = nombre_Material;
        Precio_Unidad = precio_Unidad;
        Total = total;
    }
    
    // Getters and setters
    public String getNombre_Material() {
        return Nombre_Material;
    }
    public void setNombre_Material(String nombre_Material) {
        Nombre_Material = nombre_Material;
    }
    public Integer getPrecio_Unidad() {
        return Precio_Unidad;
    }
    public void setPrecio_Unidad(Integer precio_Unidad) {
        Precio_Unidad = precio_Unidad;
    }
    public Integer getTotal() {
        return Total;
    }
    public void setTotal(Integer total) {
        Total = total;
    }

}
