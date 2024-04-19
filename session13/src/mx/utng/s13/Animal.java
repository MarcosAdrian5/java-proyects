package mx.utng.s13;

public abstract class Animal {
    private String especie;
    private String genero;
    private int edad;

    public abstract void respirar();

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public String getGenero() {
        return genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
