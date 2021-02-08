import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.net.URL;

public class dom {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(new URL("http://aiweb.cs.washington.edu/research/projects/xmltk/xmldata/data/courses/reed.xml").openStream());

        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName("course");

        System.out.println("Titles of all MATH courses that are taught in room LIB 204 \n");

        for (int i = 0; i < nodeList.getLength(); i++) {

            Node node = nodeList.item(i);

            Element element = (Element) node;

            String subj = element.getElementsByTagName("subj").item(0).getTextContent();
            String building = element.getElementsByTagName("building").item(0).getTextContent();
            String room = element.getElementsByTagName("room").item(0).getTextContent();

            if (subj.equals("MATH") && building.equals("LIB") && room.equals("204")) {

                String title = element.getElementsByTagName("title").item(0).getTextContent();

                System.out.println("<title>" + title + "</title>");
                /*System.out.println("<subj>" + subj + "</subj>");
                System.out.println("<building>" + building + "</building>");
                System.out.println("<room>" + room + "</room>" + "\n");*/
            }
        }
    }
}
