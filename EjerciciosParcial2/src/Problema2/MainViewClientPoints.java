package Problema2;

import Problema2.Model.TPoints;
import Problema2.Repository.ClientListRepository;
import Problema2.Repository.ClientRepository;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainViewClientPoints {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc = "1";
        ClientRepository clientRepository = new ClientListRepository();

        do{
            Scanner x= new Scanner(System.in);
            System.out.println("Menu \n 1. Add  \n 2. Obtain All \n 3. Update " +
                    "\n 4. Delete\n 5. Exit \n=>");
            opc = x.next();
            switch (opc){
                case "1": {
                    System.out.println("Id:  ");
                    String id = x.next();
                    System.out.println("Name:");
                    String nam = x.next();
                    System.out.println("Value of refuel");
                    Integer val = x.nextInt();
                    System.out.println("Points: ");
                    Integer poin = x.nextInt();
                    clientRepository.add(new TPoints(id,nam,val,poin));
                    break;
                }
                case "2" : {
                    List<TPoints> clientList = clientRepository.obtainAll();
                    clientList.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("Mantaining time.");
                    break;
                }
                case "4":{
                    System.out.println("Id to sign in.");
                    Integer id = x.nextInt();
                    clientRepository.delete(id);
                    clientRepository.obtainAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    opc = "5";
                    break;
                }

            }
        }while (opc != "5");
    }
}
