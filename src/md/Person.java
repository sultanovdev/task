package md;

public class Person {
    String name;
    int age;
    String gender;
    String profession;

    // Konstruktor
    public Person(String name, int age, String gender, String profession) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
    }

    // Ma'lumotlarni chiqarish
    public void sout() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Profession: " + profession);
    }
}
