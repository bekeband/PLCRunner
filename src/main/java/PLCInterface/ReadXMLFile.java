package PLCInterface;

import javax.naming.Name;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.*;

import java.io.File;

public interface ReadXMLFile {

    default void printNodeAttributes(Element element) {
    }

    default void printNodeList(NodeList nodeList) {
        for (int count = 0; count < nodeList.getLength(); count++) {
            Node elemNode = nodeList.item(count);
            if (elemNode.getNodeType() == Node.ELEMENT_NODE) {
// get node name and value
                System.out.println("\nNode Name =" + elemNode.getNodeName() + " [OPEN]");
                System.out.println("Node Content =" + elemNode.getTextContent());
                if (elemNode.hasAttributes()) {
                    NamedNodeMap nodeMap = elemNode.getAttributes();
                    for (int i = 0; i < nodeMap.getLength(); i++) {
                        Node node = nodeMap.item(i);
                        System.out.println("attr name : " + node.getNodeName());
                        System.out.println("attr value : " + node.getNodeValue());
                    }
                }
            }
        }
    }

    default void readXMLFile(String filename) {
        try {
//creating a constructor of file class and parsing an XML file
            File file = new File(filename);
//an instance of factory that gives a document builder
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//an instance of builder to parse the specified xml file
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            Element rootElement = doc.getDocumentElement();
            System.out.println("Root element: " + rootElement.getNodeName());
            NamedNodeMap rootAttributes = rootElement.getAttributes();

            for (int i = 0; i < rootAttributes.getLength(); i++) {
                System.out.println(rootAttributes.item(i));
            }

            if (rootAttributes != null) {
                System.out.println();
            }



//            System.out.println("Version: " + rootElement.getAttributeNode("Version").getName());
//            System.out.println("Version: " + rootElement. getTagName("Version"));


//            System.out.println(doc.getDocumentElement().getAttributes());

//            System.out.println(doc.getDocumentElement().getChildNodes());

/*            if (doc.hasChildNodes()) {
                printNodeList(doc.getChildNodes());
            };*/


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
