package xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class xslt {

	public static void main(String[] args) throws TransformerException, FileNotFoundException {
		TransformerFactory factory=TransformerFactory.newInstance();
		OutputStream h=new FileOutputStream("xslt.html");
		StreamSource stream=new StreamSource("math.xsl");
		StreamSource in=new StreamSource("reed.xml");
		StreamResult out=new StreamResult(h);
		Transformer transformer=factory.newTransformer(stream);
		transformer.transform(in, out);
		System.out.println("Output file xslt.html generated successfully");
	}

}
