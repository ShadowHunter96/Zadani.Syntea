import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.Book;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Zadejte cestu k souboru:");
        Scanner sc = new Scanner(System.in);
        String pathName = sc.nextLine();


        System.out.println("Zadejte rok zlomu:");

        Integer yearBreakthrough = Integer.parseInt(sc.nextLine());


        try {
            File csvFile1 = new File("knihy_Stare.csv");
            File csvFile2 = new File("knihy_Nove.csv");
            PrintWriter out1 = new PrintWriter(csvFile1);
            PrintWriter out2 = new PrintWriter(csvFile2);
            ObjectMapper mapper = new XmlMapper();
            InputStream inputStream = new FileInputStream(new File(pathName));
            TypeReference<List<Book>> typeReference = new TypeReference<List<Book>>() {
            };
            List<Book> books = mapper.readValue(inputStream, typeReference);
            out1.println("ISBN, Nazev, Autor, Vydano");
            out2.println("ISBN, Nazev, Autor, Vydano");
            for (Book p : books) {
                if (p.getVydano() <= yearBreakthrough) {

                    out1.printf("%s, %s, %s, %d\n", p.getIsbn(), p.getNazev(), p.getAutor(), p.getVydano());
                } else {
                    out2.printf("%s, %s, %s, %d\n", p.getIsbn(), p.getNazev(), p.getAutor(), p.getVydano());
                }
            }
            out1.close();
            out2.close();
            System.out.println("Třídění proběhlo úspěšně!");
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.exit(-2);
        }


    }
}
