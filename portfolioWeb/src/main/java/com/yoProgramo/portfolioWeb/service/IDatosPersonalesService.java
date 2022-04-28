
package com.yoProgramo.portfolioWeb.service;

import com.yoProgramo.portfolioWeb.model.DatosPersonales;
import java.util.List;


public interface IDatosPersonalesService {
   
    public List<DatosPersonales> obtenerDatosPersonales();
   public DatosPersonales  crearDatosPersonales(DatosPersonales datosPer);
   public void borrarDatosPersonales(Long id);
   public DatosPersonales obtenerDatosPersonales(Long id);
   public void modificarDatosPersonales(DatosPersonales datosPer);
    
}
