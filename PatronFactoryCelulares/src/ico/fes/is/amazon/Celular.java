/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.amazon;
import ico.fes.is.factory.Celulares;

/**
 *
 * @author kwbae
 */
public class Celular implements Celulares {
    private String nombre;
    private double pantalla_pulgadas;
    private String so;
    private String procesador;
    private int almacenamiento_GB;
    private String camaraTrasera;
    private String camaraFrontal;
    private int ram_GB;
    private int bateria_mAh;

    public Celular() {
    }

    public Celular(String nombre, double pantalla_pulgadas, String so, String procesador, int almacenamiento_GB, String camaraTrasera, String camaraFrontal, int ram_GB, int bateria_mAh) {
        this.nombre = nombre;
        this.pantalla_pulgadas = pantalla_pulgadas;
        this.so = so;
        this.procesador = procesador;
        this.almacenamiento_GB = almacenamiento_GB;
        this.camaraTrasera = camaraTrasera;
        this.camaraFrontal = camaraFrontal;
        this.ram_GB = ram_GB;
        this.bateria_mAh = bateria_mAh;
    }

    
    public double getPantalla_pulgadas() {
        return pantalla_pulgadas;
    }

    public void setPantalla_pulgadas(double pantalla_pulgadas) {
        this.pantalla_pulgadas = pantalla_pulgadas;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getAlmacenamiento_GB() {
        return almacenamiento_GB;
    }

    public void setAlmacenamiento_GB(int almacenamiento_GB) {
        this.almacenamiento_GB = almacenamiento_GB;
    }

    public String getCamaraTrasera() {
        return camaraTrasera;
    }

    public void setCamaraTrasera(String camaraTrasera) {
        this.camaraTrasera = camaraTrasera;
    }

    public String getCamaraFrontal() {
        return camaraFrontal;
    }

    public void setCamaraFrontal(String camaraFrontal) {
        this.camaraFrontal = camaraFrontal;
    }

    public int getRam_GB() {
        return ram_GB;
    }

    public void setRam_GB(int ram_GB) {
        this.ram_GB = ram_GB;
    }

    public int getBateria_mAh() {
        return bateria_mAh;
    }

    public void setBateria_mAh(int bateria_mAh) {
        this.bateria_mAh = bateria_mAh;
    }

     @Override
      public String toString(){
          return "Su celular es " + nombre + ", con pantalla " + pantalla_pulgadas + " y S.O. " + so + ", con procesador " + procesador+ ". Almacenamiento de " + almacenamiento_GB + ("GB") + ", su camara trasera es de " + camaraTrasera + ", y su camara frontal " + camaraFrontal + ". Cuenta con memoria RAM de " + ram_GB + "GB" + ", y su bateria es de " + bateria_mAh + "mAh.";
      }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}
