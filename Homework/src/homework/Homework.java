/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author valera
 */
public class Homework {

    private static int z;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Работу выполнил Гринченко Валерий, РИБО-01-21, Вариант №1" + "\n");
        HashMap<String, Car> carsMap = new HashMap<>();
        carsMap.put("x001xx", new Car("Volvo s90", 2015, "x001xx"));
        carsMap.put("x002xx", new Car("Lada Vesta", 2020, "x002xx"));
        carsMap.put("x003xx", new Car("Kia Rio", 2012, "x003xx"));
        TreeMap<String, Car> sortedCarMap = new TreeMap<>(carsMap);
        System.out.println("Список автомобилей:" + "\n");
        for (Entry<String, Car> entr : sortedCarMap.entrySet()){
            String nomer = entr.getKey();
            String marka = entr.getValue().getmarka();
            int god = entr.getValue().getgod();
            System.out.println(marka + ", " + god + ", " + nomer);
        }
        while (true){
            System.out.println("\n");
            System.out.println("Выбирайте: Добавить новый автомобиль, Удалить автомобиль или Удалить все автомобили");
            System.out.println("1 - Добавить новый автомобиль" + "\n"
                    + "2 - Удалить автомобиль" + "\n"
                    + "3 - Удалить все автомобили" + "\n"
                    + "4 - Отобразить список автомобилей:");
            int i = scan.nextInt();
            System.out.println("\n");
                if (i==1){
                    System.out.println("Марка машины: ");
                    scan.nextLine();
                    String Marka = scan.nextLine();
                    System.out.println("Введите год выпуска машины: ");
                    int God = scan.nextInt();
                    System.out.println("Номер машины: ");
                    String Nomer = scan.next();
                    System.out.println("\n");
                    TreeMap<String, Car> sortedNewCarMap = new TreeMap<>(carsMap);
                    for (Entry<String, Car> entr : sortedNewCarMap.entrySet()){
                        String nomer = entr.getKey();
                        if (nomer.equals(Nomer)){
                            z = 1;
                        }
                    }
                    if (z==1){
                        System.out.println("Автомобиль с таким номером уже есть в списке!");
                    }
                    else{
                        carsMap.put(Nomer, new Car(Marka, God, Nomer));
                        System.out.println("Автомобиль добавлен в список!");
                    }
                }
                if (i==2){
                    System.out.println("Номер машины: ");
                    String Noomer = scan.next();
                    carsMap.remove(Noomer);
                    System.out.println("\n");
                    System.out.println("Автомобиль удален из списка!");
                }
                if (i==3){
                    carsMap.clear();
                    System.out.println("Список автомобилей удален!");
                }
                if (i==4){
                    TreeMap<String, Car> sortedNewCarMap = new TreeMap<>(carsMap);
                    System.out.println("Список автомобилей:" + "\n");
                    for (Entry<String, Car> entr : sortedNewCarMap.entrySet()){
                        String nomer = entr.getKey();
                        String marka = entr.getValue().getmarka();
                        int god = entr.getValue().getgod();
                        System.out.println(marka + ", " + god + ", " + nomer);
                    }
                }
            }
    }
}
