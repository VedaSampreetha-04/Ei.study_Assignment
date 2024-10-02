import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a grid with obstacles
        int[][] obstacles = {{2, 2}, {3, 5}};
        Grid grid = new Grid(10, 10, obstacles);

        // Initialize the rover at position (0, 0) facing North (N)
        Rover rover = new Rover(0, 0, 'N', grid);

        // Define commands
        List<Command> commands = new ArrayList<>();
        commands.add(new MoveCommand(rover));
        commands.add(new MoveCommand(rover));
        commands.add(new TurnRightCommand(rover));
        commands.add(new MoveCommand(rover));
        commands.add(new TurnLeftCommand(rover));
        commands.add(new MoveCommand(rover));

        // Execute all commands
        for (Command command : commands) {
            command.execute();
        }

        // Display the final status of the rover
        System.out.println(rover.getStatus());
    }
}
