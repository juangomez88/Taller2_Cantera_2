package Taller2.canteraSofka;

import java.util.Date;

public class DroneCraft extends SpaceCraft implements IMission {

    private String manufacturing;
    private String mission;
    private Date dateMission;

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public Date getDateMission() {
        return dateMission;
    }

    public void setDateMission(Date dateMission) {
        this.dateMission = dateMission;
    }

    public String getManufacturing() {
        return manufacturing;
    }

    public void setManufacturing(String manufacturing) {
        this.manufacturing = manufacturing;
    }

    /**
     * metodo constructor de la clase SpaceCraft
     * @param id
     * @param name
     * @param nameDrManufacturer
     */
    public DroneCraft(int id, String name, String nameDrManufacturer) {
        super(id, name);
    }

    /**
     * metedo abstracto para mostrar los datos de la nave
     */
    @Override
    public void showdataCraft() {
        System.out.println("Space Craft: "+this.getName() );
        System.out.println("Manufacturing by: "+this.getManufacturing());
        System.out.println("ID of your space Cratf: "+this.getId());
    }

    @Override
    public void mission(String mission, Date dateMission) {
        System.out.println("Mission: "+getMission());
        System.out.println("Date mission"+getDateMission());
    }
}
