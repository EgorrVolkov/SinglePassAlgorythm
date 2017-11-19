package ua.training;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        2 – 1
        3 – 1
        4 – 4
        5 – 3
        6 – 1
        7 – 1
        */
        List<Integer> inputArr = new ArrayList<>(Arrays.asList(new Integer[]{4, 5, 6, 4, 5, 3, 4, 2, 4, 5, 7}));

        HashMap<Integer, Integer> answer = new HashMap<>(inputArr.size(), 1);
        for (Integer anInputArr : inputArr) {
            int curNumber = anInputArr;
            if (!answer.containsKey(curNumber))
                answer.put(curNumber, 1);
            else
                answer.put(curNumber, answer.get(curNumber) + 1);
        }

        for (Map.Entry<Integer,Integer> curRecord : answer.entrySet()) {
            System.out.println(curRecord.getKey() + " - " + curRecord.getValue());
        }
    }
}
