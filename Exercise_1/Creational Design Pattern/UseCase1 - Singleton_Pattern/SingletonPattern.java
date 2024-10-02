class ConfigurationManager {
    private static ConfigurationManager instance;
    private String config;

    // Private constructor to prevent instantiation
    private ConfigurationManager() {
        config = "Default Config"; // Correctly assigning default config
    }

    // Static method to provide access to the single instance (Singleton)
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Getter method to retrieve the current configuration
    public String getConfig() {
        return config;
    }

    // Setter method to update the configuration
    public void setConfig(String config) {
        this.config = config;
    }
}

// Demonstration

public class SingletonPattern {
    public static void main(String[] args) {
        // Retrieve the singleton instance of ConfigurationManager
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Print the default configuration
        System.out.println(configManager.getConfig());

        // Set a custom configuration and print the updated configuration
        configManager.setConfig("Custom Config");
        System.out.println(configManager.getConfig());
    }
}
