import javax.xml.xpath.*;

import org.xml.sax.InputSource;
import org.w3c.dom.*;

public class xpath {

    static void print(Node e) {
        if (e instanceof Text)
            System.out.print(((Text) e).getData());
        else {
            NodeList c = e.getChildNodes();
            System.out.print("<" + e.getNodeName());
            NamedNodeMap attributes = e.getAttributes();
            for (int i = 0; i < attributes.getLength(); i++)
                System.out.print(" " + attributes.item(i).getNodeName()
                        + "=\"" + attributes.item(i).getNodeValue() + "\"");
            System.out.print(">");
            for (int k = 0; k < c.getLength(); k++)
                print(c.item(k));
            System.out.print("</" + e.getNodeName() + ">" + "\n");
        }
    }

    static void eval(String query, String document) throws Exception {
        XPathFactory xpathFactory = XPathFactory.newInstance();
        XPath xpath = xpathFactory.newXPath();
        InputSource inputSource = new InputSource(document);
        NodeList result = (NodeList) xpath.evaluate(query, inputSource, XPathConstants.NODESET);
        System.out.println("XPath query: " + query);
        for (int i = 0; i < result.getLength(); i++)
            print(result.item(i));
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("1. Print the titles of all MATH courses that are taught in room LIB 204");
        eval("//course[subj='MATH' and place/building='LIB' and place/room='204']/title", "reed.xml");
        System.out.println("\n");

        System.out.println("2. Print the instructor name who teaches MATH 412");
        eval("//course[subj='MATH' and crse='412']/instructor", "reed.xml");
        System.out.println("\n");

        System.out.println("3. Print the titles of all courses taught by Wieting");
        eval("//course[instructor='Wieting']/title", "reed.xml");
    }
}
