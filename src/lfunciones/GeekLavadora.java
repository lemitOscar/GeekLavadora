package lfunciones;

/*
 shif +alt  lo muevo
 ctrl+e borrar linea 
 ctrl+shif+flecha clonar linea
 ctrl+shif+c comentar
 shif+alt+f estructurar codigo
 */

public class GeekLavadora {

    private int kilos = 0, llenadoCom = 0, TipoRo = 0, lavadoComp = 0, secadoComp = 0;

    public GeekLavadora(int kilos, int tipo) {
        this.kilos = kilos;
        this.TipoRo = tipo;
    }

    private void Llenado() {
        if (kilos <= 12) {
            llenadoCom = 1;
            System.out.println("llenando...");
            System.out.println("llenado Completo...");
        } else {
            System.out.println("exediste la carga de ropa..");
        }
    }

    private void Lavado() {
        Llenado();
        if (llenadoCom == 1) {
            if (TipoRo == 1) {
                System.out.println("ropa blanca /lavado suave");
                System.out.println("lavando...");
                lavadoComp = 1;
            } else if (TipoRo == 2) {
                System.out.println("rompa de color /lavado intenso");
                System.out.println("lavando...");
                lavadoComp = 1;
            } else {
                System.out.println("el tipo de topa no esta disponible");
                System.out.println("alv...");
            }
        }
    }

    private void Secado() {
        Lavado();
        if (lavadoComp == 1) {
            System.out.println("secanado...");
            secadoComp = 1;
        }
    }

    public void CicloFinalizado() {
        Secado();
        if (secadoComp == 1) {
            System.out.println("tu ropa esta lista");
        }
    }
//get y set

    public int getTipoRo() {
        return TipoRo;
    }

    public void setTipoRo(int TipoRo) {
        this.TipoRo = TipoRo;
    }

}
