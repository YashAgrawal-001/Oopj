class Student {
    String name;     int age;
    // Constructor
    Student(String n, int a) {         name = n;
        age = a;
    }
    void display() {
        System.out.println(name + " - " + age);
    }
     public static void main(String[] args) {
        Student s1 = new Student("Yash", 20);         s1.display();
    }
}
