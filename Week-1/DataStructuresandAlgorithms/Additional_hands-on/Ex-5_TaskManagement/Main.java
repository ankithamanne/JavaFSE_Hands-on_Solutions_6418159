class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int id, String name, String stat) {
        taskId = id;
        taskName = name;
        status = stat;
        next = null;
    }

    public String toString() {
        return taskId + " | " + taskName + " | " + status;
    }
}

public class Main {
    static Task head = null;

    static void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newTask;
        }
    }

    static void displayTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addTask(1, "Design UI", "Pending");
        addTask(2, "Test API", "In Progress");
        displayTasks();
    }
}
