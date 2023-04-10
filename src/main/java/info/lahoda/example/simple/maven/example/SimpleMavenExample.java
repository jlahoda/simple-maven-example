package info.lahoda.example.simple.maven.example;

public class SimpleMavenExample {

    public static void main(String[] args) {
        System.err.println("convert: " + convert("Hello!"));
        System.err.println("convert: " + convert(new R("Hello!")));
        System.err.println("convert: " + convert(0));
    }

    private static String convert(Object o) {
        return switch (o) {
            case String s -> "string: " + s;
            case R(var s) -> "R: " + s;
            default -> "other";
        };
    }

    record R(String s) {}
}
