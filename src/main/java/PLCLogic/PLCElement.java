package PLCLogic;

public abstract class PLCElement{
    private int ID;
    private boolean startState;
    private boolean resultState;
    private int setData;
    private int curData;

    public PLCElement(int ID) {
        this.ID = ID;
    }

    public PLCElement(int ID, boolean startState, boolean resultState, int setData, int curData) {
        this.ID = ID;
        this.startState = startState;
        this.resultState = resultState;
        this.setData = setData;
        this.curData = curData;
    }

    public void doWork() {
        resultState = ((setData == curData) && startState);
    }

    public void startElement() {
        setStartState(true);
    }

    public void stopElement() {
        setStartState(false);
    }

    public boolean isStartState() {
        return startState;
    }

    public void setStartState(boolean startState) {
        this.startState = startState;
    }

    public boolean isResultState() {
        return resultState;
    }

    public void setResultState(boolean resultState) {
        this.resultState = resultState;
    }

    public int getSetData() {
        return setData;
    }

    public void setSetData(int setData) {
        this.setData = setData;
    }

    public int getCurData() {
        return curData;
    }

    public void setCurData(int curData) {
        this.curData = curData;
    }

    public int getID() {
        return ID;
    }
}
