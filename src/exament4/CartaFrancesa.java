/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exament4;

/**
 *
 * @author usuario
 */
public class CartaFrancesa {

    private int palo;
    private int numero;
    private final int AS = 0;
    private final int UNO = 1;
    private final int DOS = 2;
    private final int TRES = 3;
    private final int CUATRO = 4;
    private final int CINCO = 5;
    private final int SEIS = 6;
    private final int SIETE = 7;
    private final int OCHO = 8;
    private final int NUEVE = 9;
    private final int JOTA = 10;
    private final int REINA = 11;
    private final int REY = 12;
    private final int TREBOLES = 0;
    private final int CORAZONES = 1;
    private final int PICAS = 2;
    private final int DIAMANTES = 3;
    private final int COMODINES = 4;

    String numeroCarta = "";
    String paloCarta = "";

    public CartaFrancesa(int palo, int numero) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getPalo() {
        switch (palo) {
            case TREBOLES:
                return TREBOLES;
            case CORAZONES:
                return CORAZONES;
            case PICAS:
                return PICAS;
            case DIAMANTES:
                return DIAMANTES;
            case COMODINES:
                return COMODINES;
            default:
                return -1;
        }

    }

    public int getNumero() {
        switch (numero) {
            case AS:
                return AS;
            case UNO:
                return UNO;
            case DOS:
                return DOS;
            case TRES:
                return TRES;
            case CUATRO:
                return CUATRO;
            case CINCO:
                return CINCO;
            case SEIS:
                return SEIS;
            case SIETE:
                return SIETE;
            case OCHO:
                return OCHO;
            case NUEVE:
                return NUEVE;
            case JOTA:
                return JOTA;
            case REINA:
                return REINA;
            case REY:
                return REY;
            default:
                return -1;
        }

    }

    public String toString() {
        String texto = "";
        if (palo == TREBOLES) {
            texto += numero + " de treboles";
            return texto;
        } else {
            if (palo == PICAS) {
                texto += numero + " de picas";
                return texto;
            } else {
                if (palo == CORAZONES) {
                    texto += numero + " de corazones";
                    return texto;
                } else {
                    if (palo == DIAMANTES) {
                        texto += numero + " de diamantes";
                        return texto;
                    } else {
                        texto += "1 de comodín";
                        return texto;
                    }
                }
            }
        }
        

    }

    public String toCodigo() {
        String codigo = "";
        switch (palo) {
            case TREBOLES:
                codigo += numero + "T";
                return codigo;
            case CORAZONES:
                codigo += numero + "C";
                return codigo;
            case DIAMANTES:
                codigo += numero + "D";
                return codigo;
            case PICAS:
                codigo += numero + "P";
                return codigo;

            case COMODINES:
                codigo += "0J";
                return codigo;

            default:
                return "nulo";
        }

    }

}
