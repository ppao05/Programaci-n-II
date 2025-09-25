/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5_10;

/**
 *
 * @author ppasa
 */
public class CuentaBancaria {
    
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; 
    private Titular titular;               

    public CuentaBancaria(String cbu, double saldo, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(
            "CLV-" + cbu.substring(0, 4), 
            java.time.LocalDate.now().toString()
        );
        this.titular = titular;

        
        titular.setCuenta(this);
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [cbu=" + cbu + ", saldo=" + saldo + 
               ", claveSeguridad=" + claveSeguridad + ", titular=" + titular + "]";
    }
}

