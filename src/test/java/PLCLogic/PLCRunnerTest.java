package PLCLogic;

import org.junit.Test;

import java.util.ArrayList;

public class PLCRunnerTest {

    @Test
    public void getPlcTagList() {
    }

    @Test
    public void setPlcTagList() {
    }

    public static void main(String[] args) {

        PLCTag plcTag = new PLCTag("press OK", new PLCAddress("IN01"));
        ArrayList<PLCTag> plcTagList = new ArrayList();
        plcTagList.add(new PLCTag("press OK", new PLCAddress("IN01")));
        plcTagList.add(new PLCTag("24V OK", new PLCAddress("IN02")));
        plcTagList.add(new PLCTag("HUT_OK", new PLCAddress("IN03")));
        plcTagList.add(new PLCTag("FUT_ERR", new PLCAddress("IN04")));
        plcTagList.add(new PLCTag("KERSZIV_BE", new PLCAddress("OUT01")));

        PLCRunner plcrunner = new PLCRunner();
        plcrunner.addElement(new PLCTimer(1));
        plcrunner.addElement(new PLCCounter(2));
        plcrunner.addElement(new PLCTimer(11));
        plcrunner.addElement(new PLCTimer(15));
        plcrunner.addElement(new PLCCounter(152));

        plcrunner.setPlcTagList(plcTagList);

        for (Object nextElement : plcrunner.getPlcElements()) {
            System.out.println("Element : " + nextElement);
        }

        System.out.println(plcrunner.tagListToString());

        plcrunner.readXMLFile("C:\\Users\\Beke András\\IdeaProjects\\PLCRunner\\src\\test\\java\\PLCLogic\\TestNull.gwp");
        plcrunner.readTXTFile("C:\\Users\\Beke András\\IdeaProjects\\PLCRunner\\src\\test\\java\\PLCLogic\\TestCSV.csv");

    }
}