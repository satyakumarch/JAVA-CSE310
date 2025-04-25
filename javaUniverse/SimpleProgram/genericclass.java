public class genericclass {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setObject("hello, world");
        String str = stringBox.getObject();
        System.out.println("String box value: " + str);
        Box<Integer> integerBox = new Box<>();
        // Assuming you want to set and print the integerBox value as well
        integerBox.setObject(42); // Example value
        Integer intValue = integerBox.getObject();
        System.out.println("Integer box value: " + intValue);
    }
}

class Box<T> {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
