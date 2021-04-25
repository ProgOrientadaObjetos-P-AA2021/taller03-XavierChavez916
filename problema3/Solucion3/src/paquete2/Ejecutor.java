/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author xavierchavez
 */
public class Ejecutor {

    public static void main(String[] args) {
        InstitucionEducativa ins1 = new InstitucionEducativa();
        ins1.establecerNombre("Miguel Riofrio");
        ins1.establecerTipoInstitucion("Publica");
        ins1.establecerNumeroAlumno(100);
        ins1.establecerNumeroDocente(10);
        ins1.establecerNumeroSede(2);
        
        InstitucionEducativa ins2 = new InstitucionEducativa();
        ins2.establecerNombre("La Dolorosa");
        ins2.establecerTipoInstitucion("Privada");
        ins2.establecerNumeroAlumno(1100);
        ins2.establecerNumeroDocente(30);
        ins2.establecerNumeroSede(4);

        System.out.printf("---------Datos Institucionales--------\nNombre: %s\n"
                + "Tipo Institución: %s\nNúmero de alumnos: %d\n"
                + "Número de docentes: %d\nNúmero de sedes: %d\n"
                + "---------Datos Institucionales--------\nNombre: %s\n"
                + "Tipo Institución: %s\nNúmero de alumnos: %d\n"
                + "Número de docentes: %d\nNúmero de sedes: %d\n",
                ins1.obtenerNombre(), ins1.obtenerTipoInstitucion(),
                ins1.obtenerNumeroAlumno(), ins1.obtenerNumeroDocente(),
                ins1.obtenerNumeroSede(), ins2.obtenerNombre(), 
                ins2.obtenerTipoInstitucion(),
                ins2.obtenerNumeroAlumno(), ins2.obtenerNumeroDocente(),
                ins2.obtenerNumeroSede());

    }

}
