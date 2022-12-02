package HW_3_2_about_the_multiplication_table;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTableTasks {
    private final Set<ServiceTask> serviceTasks = new HashSet<>();

    public MultiplicationTableTasks() {
        for (int i = 2; i < 10; i++) {
            Random random = new Random();
            while (serviceTasks.size() < 15) {
                serviceTasks.add(new ServiceTask(random.nextInt(10),
                        random.nextInt(10)));
            }
        }
    }

    @Override
    public String toString() {
        return "MultiplicationTable{" +
                serviceTasks;
    }
}

