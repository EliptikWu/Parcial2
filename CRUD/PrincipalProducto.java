package CRUD;

import CRUD.modelo.Producto;
import CRUD.repositorio.ProductoRepository;
import CRUD.repositorio.ProductoRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class PrincipalProducto {
    public static void main (String[] args){
        String opc = "1";
        ProductoRepository repo = new ProductoRepositoryImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("PRODUCT MENU \n 1. Add  \n 2. To list \n 3. Edit " +
                    "\n 4. Eliminate  \n 5. Get out \n =>");
            opc = s.next();
            switch (opc) {
                case "1":{
                    System.out.println("Product ID: ");
                    Integer id = s.nextInt();
                    System.out.println("Product Name: ");
                    String nam = s.next();
                    System.out.println("Description: ");
                    String des = s.next();
                    repo.save(new Producto(id,nam,des));
                    break;
                }
                case "2":{
                    List<Producto> productos = repo.findAll();
                    productos.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("===== Edit ====");
                    System.out.print("Product ID: ");
                    Integer idl = s.nextInt();
                    System.out.print("Enter The product Name: ");
                    String nam = s.next();
                    System.out.print("Enter The Description: ");
                    String des = s.next();
                    Producto beaActualizar = new Producto(idl,nam,des);
                    repo.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== Eliminate ======");
                    System.out.print("Enter The Product Id: ");
                    Integer id = s.nextInt();
                    repo.delete(repo.findById(id));
                    repo.findAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    opc = "5";
                    break;
                }
            }
        } while (opc != "5");
    }
}
