import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.*;
import java.io.File;
import java.io.IOException;

public class XMLOlustur {
    public static void main(String[] args) {
        try {
            // XML Document oluşturuluyor
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();

            // Root elemanı oluşturuluyor
            Element rootElement = doc.createElement("sinema");
            doc.appendChild(rootElement);

            // Film elemanları oluşturuluyor
            Element filmler = doc.createElement("filmler");
            rootElement.appendChild(filmler);

            Element film1 = doc.createElement("film");
            filmler.appendChild(film1);
            film1.appendChild(createElement(doc, "adi", "Inception"));
            film1.appendChild(createElement(doc, "sure", "148"));
            film1.appendChild(createElement(doc, "tur", "Bilim Kurgu"));

            Element film2 = doc.createElement("film");
            filmler.appendChild(film2);
            film2.appendChild(createElement(doc, "adi", "Titanic"));
            film2.appendChild(createElement(doc, "sure", "195"));
            film2.appendChild(createElement(doc, "tur", "Romantik"));

            // Salon elemanları oluşturuluyor
            Element salonlar = doc.createElement("salonlar");
            rootElement.appendChild(salonlar);

            Element salon1 = doc.createElement("salon");
            salonlar.appendChild(salon1);
            salon1.appendChild(createElement(doc, "id", "1"));
            salon1.appendChild(createElement(doc, "adi", "Salon A"));

            Element salon2 = doc.createElement("salon");
            salonlar.appendChild(salon2);
            salon2.appendChild(createElement(doc, "id", "2"));
            salon2.appendChild(createElement(doc, "adi", "Salon B"));

            // Musteri elemanları oluşturuluyor
            Element musteriler = doc.createElement("musteriler");
            rootElement.appendChild(musteriler);

            Element musteri1 = doc.createElement("musteri");
            musteriler.appendChild(musteri1);
            musteri1.appendChild(createElement(doc, "id", "1"));
            musteri1.appendChild(createElement(doc, "adi", "Ahmet Yılmaz"));
            musteri1.appendChild(createElement(doc, "email", "ahmet@gmail.com"));

            Element musteri2 = doc.createElement("musteri");
            musteriler.appendChild(musteri2);
            musteri2.appendChild(createElement(doc, "id", "2"));
            musteri2.appendChild(createElement(doc, "adi", "Ayşe Kaya"));
            musteri2.appendChild(createElement(doc, "email", "ayse@gmail.com"));

            // XML dosyasını kaydet
            File outputFile = new File("sinema_verileri.xml");
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(new DOMSource(doc), new StreamResult(outputFile));

            System.out.println("XML Dosyası Oluşturuldu: sinema_verileri.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Element createElement(Document doc, String tag, String value) {
        Element element = doc.createElement(tag);
        element.appendChild(doc.createTextNode(value));
        return element;
    }
}
