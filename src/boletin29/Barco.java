package boletin29;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fojomars
 */
public abstract class Barco {
    private String matricula;
    private double eslora;
    private double modulo;
    private double precio;

    public Barco() {
    }

    public Barco(String matricula, double eslora) {
        this.matricula = matricula;
        this.eslora = eslora;
        modulo=calcularModulo();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getModulo() {
        return modulo;
    }

    public void setModulo(double modulo) {
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Eslora:" + eslora + ", Precio alquiler: " + precio;
    }
    
    public double calcularModulo(){
        modulo=eslora*10;
        return modulo;
    }
    
    public void calcularPrecio(int dias){
        this.precio=dias*modulo;
    }
}
