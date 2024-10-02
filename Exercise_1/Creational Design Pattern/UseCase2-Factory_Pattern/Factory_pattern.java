// Task interface
interface Task {
    void executeTask();
}

// Concrete Task implementations
class CodingTask implements Task {
    @Override
    public void executeTask() {
        System.out.println("Executing Coding Task...");
    }
}

class TestingTask implements Task {
    @Override
    public void executeTask() {
        System.out.println("Executing Testing Task...");
    }
}

// Factory class
class TaskFactory {
    public static Task createTask(String type) {
        if (type.equalsIgnoreCase("coding")) {
            return new CodingTask();
        } else if (type.equalsIgnoreCase("testing")) {
            return new TestingTask();
        }
        return null;
    }
}

// Demonstration
public class Factory_pattern {
    public static void main(String[] args) {
        Task codingTask = TaskFactory.createTask("coding");
        codingTask.executeTask();

        Task testingTask = TaskFactory.createTask("testing");
        testingTask.executeTask();
    }
}
