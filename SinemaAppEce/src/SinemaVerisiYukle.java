import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.*;

public class SinemaVerisiYukle {

    public static List<Film> filmVerileriniYukle() {
        List<Film> filmler = new ArrayList<>();
        try {
            File file = new File("sinema_verileri.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            NodeList filmList = doc.getElementsByTagName("film");
            for (int i = 0; i < filmList.getLength(); i++) {
                Node filmNode = filmList.item(i);
                if (filmNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element filmElement = (Element) filmNode;
                    String adi = filmElement.getElementsByTagName("adi").item(0).getTextContent();
                    int sure = Integer.parseInt(filmElement.getElementsByTagName("sure").item(0).getTextContent());
                    String tur = filmElement.getElementsByTagName("tur").item(0).getTextContent();

                    Film film = new Film(adi, sure, tur);
                    filmler.add(film);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filmler;
    }

    public static List<Salon> salonVerileriniYukle() {
        List<Salon> salonlar = new ArrayList<>();
        try {
            File file = new File("sinema_verileri.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            NodeList salonList = doc.getElementsByTagName("salon");
            for (int i = 0; i < salonList.getLength(); i++) {
                Node salonNode = salonList.item(i);
                if (salonNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element salonElement = (Element) salonNode;
                    int id = Integer.parseInt(salonElement.getElementsByTagName("id").item(0).getTextContent());
                    String adi = salonElement.getElementsByTagName("adi").item(0).getTextContent();

                    Salon salon = new Salon(id, adi);
                    salonlar.add(salon);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return salonlar;
    }

    public static List<Musteri> musteriVerileriniYukle() {
        List<Musteri> musteriler = new ArrayList<>();
        try {
            File file = new File("sinema_verileri.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            NodeList musteriList = doc.getElementsByTagName("musteri");
            for (int i = 0; i < musteriList.getLength(); i++) {
                Node musteriNode = musteriList.item(i);
                if (musteriNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element musteriElement = (Element) musteriNode;
                    int id = Integer.parseInt(musteriElement.getElementsByTagName("id").item(0).getTextContent());
                    String adi = musteriElement.getElementsByTagName("adi").item(0).getTextContent();
                    String email = musteriElement.getElementsByTagName("email").item(0).getTextContent();

                    Musteri musteri = new Musteri(id, adi, email);
                    musteriler.add(musteri);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return musteriler;
    }
}
