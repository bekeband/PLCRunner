package PLCLogic;

import PLCLogic.PLCElement;

public class PLCTimer extends PLCElement {

    public PLCTimer(int ID) {
        super(ID);
    }

    @Override
    public String toString() {
        return "PLCTimer { Timer ID = " + getID() + ", SetTime = " + getSetData() + ", " +
                "CurTime = " + getCurData() + " }";
    }
}
