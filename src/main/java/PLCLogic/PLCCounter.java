package PLCLogic;

import PLCLogic.PLCElement;

public class PLCCounter extends PLCElement {

    public PLCCounter(int ID) {
        super(ID);
    }

    public void doWork(){
        super.doWork();
    }

    @Override
    public String toString() {
        return "PLCCounter { Counter ID = " + getID() + ", MaxCount = " + getSetData() + ", " +
                "CounterVal = " + getCurData() + " }";
    }

}
