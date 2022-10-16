package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (int a: source) {
            if (a < treshold){
                logger.log("Элемент: " + a + " не проходит по условиям фильтрации");
            } else {
                logger.log("Элемент: " + a + " проходит по условиям фильтрации");
                result.add(a);
                count++;
            }

        }
        logger.log("Прошло фильтр" + count + " элемента из  " + source.size());
        return result;
    }
}