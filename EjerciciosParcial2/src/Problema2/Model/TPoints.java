package Problema2.Model;

import java.io.Serializable;

public class TPoints implements Serializable {
    private String id;
    private Integer accesedId;
    private String clientName;
    private int refuelValue;
    private int accumulatedPoints;


    public TPoints(String id, String clientName, int refuelValue, int accumulatedPoints) {
        this.id = id;
        this.clientName = clientName;
        this.refuelValue = refuelValue;
        this.accumulatedPoints = accumulatedPoints;
    }

    public String getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    public int getRefuelValue() {
        return refuelValue;
    }

    public int getAccumulatedPoints() {
        return accumulatedPoints;
    }

    public Integer getAccesedId() {
        return accesedId;
    }

    public void setAccesedId(Integer accesedId) {
        this.accesedId = accesedId;
    }

    public String toString() {
        return "Id: "+id+
                "\nName: "+clientName+
                "\nRefuel value: "+refuelValue+
                "\nAccumulated points: "+accumulatedPoints+" ." +
                "\n===================================";
    }
}
