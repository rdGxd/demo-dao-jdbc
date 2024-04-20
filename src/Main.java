import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department dep = DepartmentDao.findById(3);
        System.out.println(dep);

        System.out.println("=== TEST 2: department Delete ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        DepartmentDao.deleteById(id);
        System.out.println("Delete Completed!");

        System.out.println("=== TEST 3: department Update ===");
        dep = DepartmentDao.findById(1);
        dep.setName("Computer Science");
        DepartmentDao.update(dep);
        System.out.println("Updated Department Completed!");

        System.out.println("=== TEST 4: department Insert ===");
        Department newDep = new Department(null, "Novo");
        DepartmentDao.insert(newDep);
        System.out.println("Insert Department Completed!");

        System.out.println("=== TEST 5: findAll ===");
        List<Department> list = DepartmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }
        
        sc.close();
    }
}