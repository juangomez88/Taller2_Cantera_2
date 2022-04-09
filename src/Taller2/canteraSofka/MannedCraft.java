package Taller2.canteraSofka;

public class MannedCraft extends SpaceCraft {
    private String manufacturing;

    /**
     * metodo constructor de la clase SpaceCraft
     *
     * @param id
     * @param name
     */
    public MannedCraft(int id, String name, String nameManufacturer) {
        super(id, name);
    }

    public String getManufacturing() {
        return manufacturing;
    }

    public void setManufacturing(String manufacturing) {
        this.manufacturing = manufacturing;
    }

    /**
     * metedo abstracto para mostrar los datos de la nave
     */
    @Override
    public void showdataCraft() {
        System.out.println("Space Craft: "+this.getName() );
        System.out.println("Manufacturing by: "+getManufacturing());
        System.out.println("ID of your space Cratf: "+getId());
    }
}
