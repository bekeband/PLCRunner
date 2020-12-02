package PLCLogic;

public class PLCAddress {
    private String ID;
    private boolean persistent;

    public PLCAddress(String ID) {
        this.ID = ID;
        this.persistent = false;
    }

    public String getID() { return ID; }

    public void setID(String ID) { this.ID = ID; }

    public boolean isPersistent() { return persistent; }

    public void setPersistent(boolean persistent) { this.persistent = persistent; }

    @Override
    public String toString() {
        return "PLCAddress {" +
                "ID='" + ID + '\'' +
                ", persistent=" + persistent +
                '}';
    }
}
