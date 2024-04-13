/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.brasilsistemas.mysystem;

import br.com.brasilsistemas.mysystem.model.Usuario;
import br.com.brasilsistemas.mysystem.view.CalculadoraView;
import br.com.brasilsistemas.mysystem.view.UsuarioView;

/**
 *
 * @author joanderson.melo
 */
public class MySystem {

    public static void main(String[] args) {
                
        CalculadoraView cv = new CalculadoraView();
        cv.setResizable(true);
        cv.setLocationRelativeTo(null);
        cv.setVisible(true);
        
    }
}
