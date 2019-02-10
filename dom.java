package xml;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class dom {

	public static void main(String[] args) throws ParserConfigurationException, MalformedURLException, SAXException, IOException {
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=factory.newDocumentBuilder();
		Document doc = db.parse("reed.xml");
		NodeList courseList=doc.getElementsByTagName("course");
		System.out.println("Titles of all math courses taught in room lib 204\n");
		for(int i=0;i<courseList.getLength();i++) {
			Node c=courseList.item(i);
			if(c.getNodeType()==Node.ELEMENT_NODE) {
				Element course=(Element)c;
				String subject=course.getElementsByTagName("subj").item(0).getTextContent();
				String title=course.getElementsByTagName("title").item(0).getTextContent();
				NodeList p=course.getElementsByTagName("place");
				Element place=(Element) p.item(0);
				String building=place.getElementsByTagName("building").item(0).getTextContent();
				String room=place.getElementsByTagName("room").item(0).getTextContent();
				if(subject.equals("MATH")&& building.equals("LIB")&&room.equals("204")) {
					System.out.println(title);
					System.out.println("-----------------------------");
				}
//				
			}
//			 Node c=courseList.item(i);
//			 NodeList courseDetails=c.getChildNodes();
//			 Node sub=courseDetails.item(3);
//			 Node title=courseDetails.item(9);
//			 Node place=courseDetails.item(19);
//			 
//			
			 };
			 
		}
		
	}

