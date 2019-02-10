package xml;
import java.io.IOException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
public class xpath {
	public static void main(String[] args) throws XPathExpressionException, IOException {
		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();
		InputSource inputSource = new InputSource("reed.xml");
			NodeList result = (NodeList) xpath.evaluate("//course[subj='MATH' and place/building/text()='LIB' and place/room/text()='204']/title",inputSource,XPathConstants.NODESET);
//			"//gradstudent[name/lastname='Galanis']/name"
//			"//course[subj='MATH' and place/building/text()='LIB' and place/room/text()='204']/title"
	//		
			System.out.println("Titles of all math courses taught in room lib 204");
			System.out.println("------------------------------");
			for(int i=0;i<result.getLength();i++) {
				Element title=(Element)result.item(i);
				System.out.println(title.getTextContent());
					
			}
			System.out.println("------------------------------");	
//			System.out.println(n);

			NodeList result1 = (NodeList) xpath.evaluate("//course[subj='MATH' and crse='412']/instructor",inputSource,XPathConstants.NODESET);
			System.out.println("Instructor name who teaches MATH 412");
			System.out.println("------------------------------");
			for(int i=0;i<result1.getLength();i++) {
				Element title1=(Element)result1.item(i);
				System.out.println(title1.getTextContent());
					
			}
			System.out.println("------------------------------");
			
			
NodeList result2 = (NodeList) xpath.evaluate("//course[instructor='Wieting']/title",inputSource,XPathConstants.NODESET);
			System.out.println("Titles of all courses taught by Wieting");
			System.out.println("------------------------------");
			for(int i=0;i<result2.getLength();i++) {
				Element title2=(Element)result2.item(i);
				System.out.println(title2.getTextContent());
			}
			System.out.println("------------------------------");
			
		
		}

}
