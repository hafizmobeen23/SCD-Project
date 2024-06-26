public final class ImmutableStudent {
    private final String name;
    private final int age;

    public ImmutableStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ImmutableStudent{name='" + name + "', age=" + age + "}";
    }
}
