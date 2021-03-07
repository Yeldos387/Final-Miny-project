package com.company;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.rmi.UnmarshalException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Students students = new Students("newName", "NewSurname", 1789);
        DAO dao = new DaoImpl();
        dao.addStudent(students);

        Scanner scanner = new Scanner(System.in);
        try {
            Socket socket = new Socket("127.0.0.1", 1789);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            PackageData data;
            while (true) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//import java.io.ObjectInputStream;
//        import java.io.ObjectOutputStream;
//        import java.net.Socket;
//        import java.util.Scanner;
//
//public class Client {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        try {
//            Socket socket = new Socket("localhost", 8976);
//            System.out.println("u r connected");
//            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
//            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
//            PackageData data = null;
//            while (true) {
//                System.out.println("1 to list");
//                System.out.println("2 add book");
//                System.out.println("0 exit");
//                String choice = scanner.next();
//                if (choice.equals("1")) {
//                    data = new PackageData("1");
//                    out.writeObject(data);
//                    PackageData list;
//                    if ((list = (PackageData) in.readObject()) !=null){
//                        System.out.println(list.getBooks());
//                    }
//                    out.reset();
//                } else if (choice.equalsIgnoreCase("0")){
//                    System.exit(0);
//                }else if (choice.equalsIgnoreCase("2")){
//                    System.out.println("id: ");
//                    int id = scanner.nextInt();
//                    System.out.println("name ");
//                    String name = scanner.next();
//                    System.out.println("author ");
//                    String author = scanner.next();
//                    Book book = new Book(id,name, author);
//                    data = new PackageData("2",book);
//                    out.writeObject(data);
//                    out.reset();
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//}