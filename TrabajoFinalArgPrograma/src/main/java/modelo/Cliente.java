/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Adriel
 */
public class Cliente {
    private String razonSocial;
    private long cuit;
    private List<Servicio> Servicios; // N a N
    private List<ReporteIncidencia> reportesIncidencia; // 1 a N
    private DatosContacto datosContacto;
}
