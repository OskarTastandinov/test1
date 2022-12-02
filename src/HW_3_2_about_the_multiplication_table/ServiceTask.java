package HW_3_2_about_the_multiplication_table;

import java.util.Objects;

public class ServiceTask {
    private final int numb1;
    private final int numb2;

    public ServiceTask(int numb1, int numb2) {
        this.numb1 = numb1;
        this.numb2 = numb2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceTask task = (ServiceTask) o;
        return numb1 == task.numb1 && numb2 == task.numb2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numb1, numb2);
    }

    @Override
    public String toString() {
        return String.format("%s * %s = ?",
                this.numb1, this.numb2);
    }
}
