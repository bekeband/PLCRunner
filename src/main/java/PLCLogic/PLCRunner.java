package PLCLogic;

import PLCHardware.*;
import PLCInterface.InputReads;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PLCRunner extends PLCMemory implements InputReads {

    private Stack<Object> calculateStack;

    private List<Object> plcElements;

    private List<PLCTag> plcTagList;

    public PLCRunner() {
        plcTagList = new ArrayList<>();
        plcElements = new ArrayList<Object>();
        calculateStack = new Stack<Object>();
    }

    public List<Object> getPlcElements() {
        return plcElements;
    }

    public void addElement(PLCElement addElement) {
        plcElements.add(addElement);
    }

    public List<PLCTag> getPlcTagList() {
        return plcTagList;
    }

    public void setPlcTagList(List<PLCTag> plcTagList) {
        this.plcTagList = plcTagList;
    }

    public String tagListToString() {
        return plcTagList.toString();
    }

    @Override
    public void readInputs(List<Object> destination) {
        for (int i = 0; i < readPortsCount; i++) {
            
        }
    }
}
