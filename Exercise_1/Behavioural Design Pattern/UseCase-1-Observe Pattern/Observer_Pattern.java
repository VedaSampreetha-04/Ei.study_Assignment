import java.util.*;

// Observer interface
interface Observer {
    void update(String task);
}

// Subject interface
interface Subject {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}

// Concrete Subject (TaskManager)
class TaskManager implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String newTask;

    public void addTask(String task) {
        this.newTask = task;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(newTask);
        }
    }
}

// Concrete Observer (User)
class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String task) {
        System.out.println(name + " notified about new task: " + task);
    }
}

// Demonstration
public class Observer_Pattern {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        taskManager.addObserver(user1);
        taskManager.addObserver(user2);

        taskManager.addTask("Complete Assignment");
    }
}
