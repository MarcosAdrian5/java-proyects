package mx.utng.s09;

public class Automovil {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int Kilometraje;
    private Llantas [] llantas = new Llantas[4];
    private Combustible combustible = new Combustible();

    public Automovil(String marca, String modelo, int anioFabricacion, int kilometraje, Llantas llantas, Combustible combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.Kilometraje = kilometraje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash+=marca.hashCode();
        hash+=modelo.hashCode();
        hash+=anioFabricacion;
        hash+=Kilometraje;
        return hash;
    }
    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public void colocaLlantas(Llantas delanteraIzquierda, Llantas delanteraDerecha, Llantas traseraIzquierda, Llantas traseraDerecha){
        llantas[0] = delanteraIzquierda;
        llantas[1] = delanteraDerecha;
        llantas[2] = traseraIzquierda;
        llantas[3] = traseraDerecha;
    }

    public void llenaTanque(){
        combustible.setLitrosActuales(combustible.getLitrosMaximos());
    }

    public void avanzar(){
        if (combustible.getLitrosActuales() > 0) {
            for (Llantas llantas : llantas){
                llantas.rodar();
            }
            combustible.usar();
        } else {
            System.out.println("No hay combustible");
        }
    }
}
