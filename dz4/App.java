package dz4;

import java.io.*;

import java.time.LocalDateTime;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        Task task1 = new Task(1l,LocalDateTime.now(),"male","Ivan","Grivin");
        Task task2 = new Task(2l,LocalDateTime.now(),"male","Vova","Levanov");
        Task task3 = new Task(3l,LocalDateTime.now(),"female","Irina","Novina");

        List<Task> tasks = new ArrayList<>();

        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        PrintWriter pw = new PrintWriter("/C:/Users/Андрей/Desktop/домашка/dz4/tasks.csv");
        for (Task task : tasks) {
            pw.println(task);
        }
        pw.close();

    }
}