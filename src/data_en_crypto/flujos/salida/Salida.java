/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Paquete para flujos de salida y su superclase Salida.
 */
package data_en_crypto.flujos.salida;

import data_en_crypto.flujos.Flujo;
import java.io.File;

/**
 *
 * @author nyx
 */
public class Salida extends Flujo{
    
    protected File f = null;

    public Salida() {
    }

    public Salida(File f) {
        this.f = f;
    }
    
}
