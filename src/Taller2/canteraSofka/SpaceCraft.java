package Taller2.canteraSofka;

/**
 * @author Juan Carlos Gomez Jaramillo
 * creo la clase abstracta SpaceCraft la que será la clase padre de mi aplicacion
 */

public abstract class SpaceCraft {
    private int id;
    private String name;
    private int thrustPower;

    /**
     * metodo constructor de la clase SpaceCraft
     */
    public SpaceCraft(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThrustPower() {
        return thrustPower;
    }

    public void setThrustPower(int thrustPower) {
        this.thrustPower = thrustPower;
    }

    /**
     * metedo abstracto para mostrar los datos de la nave
     */
    public abstract void showdataCraft();

}
