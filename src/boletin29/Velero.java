/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

/**
 *
 * @author fojomars
 */
public class Velero extends Barco{
    private int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles, String matricula, double eslora) {
        super(matricula, eslora);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public double calcularModulo(){
        super.setModulo(super.calcularModulo()+(8*numMastiles));
        return super.getModulo();
    }
}
