/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ESTUDIANTE
 */
public class Dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int i;
        int[] vdados = new int[11];
        final int veces = 1000000;
        int fmax;
        int rmax;

        SecureRandom r;

        try {
            r = SecureRandom.getInstance("SHA1PRNG");
            for (i = 0; i < veces; i++) {

                ++vdados[r.nextInt(6) + r.nextInt(6)];

            }
            fmax = vdados[0];
            rmax = 2;
            System.out.printf("%s%12s%n", "Dado", "Frecuencia");
            for (i = 0; i < vdados.length; i++) {
                System.out.printf("%3d%12d%12.3f%n", i + 2, vdados[i]);

                if (vdados[i] > fmax) {
                    fmax = vdados[i];
                    rmax = i+2;
                }
                }

                System.out.println("El Numero Que Mas Cae Es:" + rmax + "Con Una Frecuencia De:" + fmax);

            

        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Error" + Dados.class.getName() + "\n" + ex.getMessage());
        }

    }

}
