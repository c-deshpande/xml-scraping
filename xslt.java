import javax.xml.parsers.*;

import org.w3c.dom.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class xslt {
    public static void main(String[] args) throws Exception {
        File stylesheet = new File("math.xsl");
        File xmlFile = new File("reed.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(xmlFile);
        StreamSource styleSource = new StreamSource(stylesheet);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer(styleSource);
        DOMSource source = new DOMSource(document);
        FileOutputStream outputFile = new FileOutputStream("output.html");
        StreamResult result = new StreamResult(outputFile);
        transformer.transform(source, result);
        System.out.println("output.html has been created...");
    }
}
