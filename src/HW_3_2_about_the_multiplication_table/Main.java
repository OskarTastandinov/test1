package HW_3_2_about_the_multiplication_table;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        MultiplicationTableTasks multiplicationTableTasks = new MultiplicationTableTasks();
        System.out.println(multiplicationTableTasks);
        ServiceTask task1 = new ServiceTask(5, 6);
        Set<ServiceTask> set = new HashSet<>();
        set.add(task1);
        System.out.println(set);

    }
}
