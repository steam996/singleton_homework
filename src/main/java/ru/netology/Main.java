package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Logger logger = Logger.getInstance();
    public static void main(String[] args) {

        logger.log("Запускаем программу ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте!");

        logger.log("Просим пользователя ввести входные данные для списка ");
        System.out.println("Введите размер списка");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите верхнюю границу значений элементов списка");
        int maxValue = scanner.nextInt();
        scanner.nextLine();

        List<Integer> sourceList = new ArrayList<>();
        sourceList = handler(sourceList, size, maxValue);
        System.out.println("Исходный список имеет вид - " + sourceList);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог фильтрации");
        int filterParam = scanner.nextInt();
        scanner.nextLine();

        logger.log("Запускаем фильтрацию ");
        List<Integer> resultList = new Filter(filterParam).filterOut(sourceList);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список имеет вид -  " + resultList);
        logger.log("Завершаем программу");

    }

    public static List handler (List <Integer> sourceList, int size, int maxValue){
        logger.log("Создаём и наполняем список");
        Random random = new Random();
        while (sourceList.size()<size){
            sourceList.add(random.nextInt(maxValue));
        }
        return sourceList;
    }
}