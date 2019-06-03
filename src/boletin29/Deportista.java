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
public class Deportista extends Barco{
    private double potencia;
    private int numCamarotes;

    public Deportista() {
    }

    public Deportista(double potencia, int numCamarotes, String matricula, double eslora) {
        super(matricula, eslora);
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public double calcularModulo(){
        super.setModulo(super.calcularModulo()+(2/potencia + 25/numCamarotes));
        return super.getModulo();
    }
}
