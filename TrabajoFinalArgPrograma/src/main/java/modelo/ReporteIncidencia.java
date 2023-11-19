/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author Adriel
 */
public class ReporteIncidencia {
    @Getter @Setter
    private Date fechaAlta;
    private String descripcionProblema;
    private String tipoProblema; //basico, intermedio, complejo.
    private Servicio servicio; // N a 1
    private OperadorMesaAyuda operador; // N a 1
    private Cliente cliente; // N a 1
    private Tecnico tecnico; // N a 1
    private int tiempoEstimadoResolucion;
    private Date fechaPosibleResolucion;
    private String estado; //pendiente, en proceso, resuelto, anulado.
    private String observacionesTecnico;
}
