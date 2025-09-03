class FinalExample {
    final int value = 100; // cannot be changed
    void display() {
        System.out.println("Final value: " + value);
    }
    public static void main(String[] args) {
        FinalExample obj = new FinalExample();         obj.display();
    }
}
