package PLCLogic;

public class PLCTag {
    private String name;

    private PLCAddress address;

    public PLCTag(String name, PLCAddress address) {
        this.name = name;
        this.address = address;
    }

    public void setAddress(PLCAddress address) { this.address = address; }

    public PLCAddress getAddress() { return address; }

    @Override
    public String toString() {
        return "PLCTag {" +
                "name='" + name + '\'' +
                ", address=" + address +
                "}\n\r";
    }



}
