package Parcial2;

public class Vehiculo<T,U,V> {
    //Atributos
    private T marca;
    private U modelo;
    private T color;
    private V precio;

    //Constructor

    public Vehiculo(T marca, U modelo, T color, V precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    //Getters y Setters

    public T getMarca() {
        return marca;
    }

    public void setMarca(T marca) {
        this.marca = marca;
    }

    public U getModelo() {
        return modelo;
    }

    public void setModelo(U modelo) {
        this.modelo = modelo;
    }

    public T getColor() {
        return color;
    }

    public void setColor(T color) {
        this.color = color;
    }

    public V getPrecio() {
        return precio;
    }

    public void setPrecio(V precio) {
        this.precio = precio;
    }

    //ToString

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca=" + marca +
                ", modelo=" + modelo +
                ", color=" + color +
                ", precio=" + precio +
                '}';
    }
}
