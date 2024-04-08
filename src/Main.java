import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(1, "Rodrigo", "rodrigo@gmail.com", new Date(), 3000.00, obj);
        System.out.println(seller);
    }
}