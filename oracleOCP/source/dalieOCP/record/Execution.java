package dalieOCP.record;

public record Execution(String name, String address) {
    static String welcome;
    static Execution execution;
}