package gm.rh.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gm.rh.modelo.Empleado;
import gm.rh.servicio.IEmpleadoServicio;

@RestController
@RequestMapping("rh.app") // http://localhost:8080/rh.app
@CrossOrigin(value = "hhtp://localhost:3000")

public class EmpleadoControlador {

    private static final Logger logger =
            LoggerFactory.getLogger(EmpleadoControlador.class);

    @Autowired
    private IEmpleadoServicio empleadoServicio;

    @GetMapping("/empleados") 
    // http://localhost:8080/rh.app/empleados

    public List <Empleado> obtenerEmpleados(){
        var empleados = empleadoServicio.buscarEmpleados();
        empleados.forEach(empleado -> logger.info(empleado.toString()));
        return empleados;
    }

}