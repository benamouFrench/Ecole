import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;


/*
class SRH_Students {
    private String Name;
    private int age;
    private long mNumber;
    private double grade;
    private String sProg;


    public SRH_Students() {

        Name = "John";
        age = 20;
        mNumber = 333;
        grade = 1.5;
        sProg = "BSc Computer Science";
    }

    public SRH_Students(String name, int age, long mNumber, double grade, String sProg)
    {
        System.out.println("This is a parameterised Constructor with default values");
        this.Name = name;
        this.age =age;
        this.mNumber = mNumber;
        this.grade = grade;
        this.sProg = sProg;
    }

    public SRH_Students(String name, int age, long mNumber, String sProg)
    {
        this.Name = name;
        this.age = age;
        this.mNumber = mNumber;
        this.sProg = sProg;
        grade = 0.0;
    }
    public void study()
    {
        System.out.println("Name: "+ Name + "Age:"+ age + " mNumber: "+mNumber + " Grade: "+grade + " Student Program: "+sProg);
    }

}*/

/*class Car
{
   protected String brand;
   protected int year;
   protected String type;
   protected String colour;

    public Car(String brand, int year, String type, String colour)
    {
        this.brand = brand;
        this.year = year;
        this.type = type;
        this.colour = colour;
    }
}

class Mercedes extends Car
{
   protected String model;
   protected double engine;
   protected double hp;
   protected boolean abs;

    public Mercedes(String brand, int year, String type, String colour, String model, double engine, double hp, boolean abs)
    {
        super(brand,year,type,colour);
        this.model = model;
        this.engine = engine;
        this.hp = hp;
        this.abs = abs;

    }
    public void displayInfo()
    {
        System.out.println("Driving the "+year + " " + brand + " "+ model);
        System.out.println("With Horsepower"+ hp+ " and engine capacity "+engine);
        System.out.println("Colour of the car : "+colour);
        System.out.println("Type of the car "+type);
        System.out.println("ABS? "+abs);
    }
}

    class BMW extends Car {
        protected String model;
        protected double engine;
        protected double hp;
        protected boolean abs;

        public BMW(String brand, int year, String type, String colour, String model, double engine, double hp, boolean abs) {
            super(brand, year, type, colour);
            this.model = model;
            this.engine = engine;
            this.hp = hp;
            this.abs = abs;

        }


        public void displayInfo() {
            System.out.println("Driving the " + year + " " + brand + " " + model);
            System.out.println("With Horsepower" + hp + " and engine capacity " + engine);
            System.out.println("Colour of the car : " + colour);
            System.out.println("Type of the car " + type);
            System.out.println("ABS? " + abs);
        }

    }

class Toyota extends Car {
    protected String model;
    protected double engine;
    protected double hp;
    protected boolean abs;

    public Toyota(String brand, int year, String type, String colour, String model, double engine, double hp, boolean abs) {
        super(brand, year, type, colour);
        this.model = model;
        this.engine = engine;
        this.hp = hp;
        this.abs = abs;

    }


    public void displayInfo() {
        System.out.println("Driving the " + year + " " + brand + " " + model);
        System.out.println("With Horsepower" + hp + " and engine capacity " + engine);
        System.out.println("Colour of the car : " + colour);
        System.out.println("Type of the car " + type);
        System.out.println("ABS? " + abs);
    }

}


class Animal{
    public void makeSound()
    {
        System.out.println("Animal makes a sound ");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }

}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat Meows");
    }

}
*/

abstract class Shape{
    abstract double calculateArea();
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double calculateArea()
    {
        double area;
        area = Math.PI * radius * radius;
        return area;
    }
}
class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public double calculateArea()
    {
        double area;
        area = 0.5 * base * height;
        return area;
    }
}

class Rectangle extends Shape{
    private double lenght;
    private double height;
    public Rectangle(double lenght, double height)
    {
        this.lenght = lenght;
        this.height = height;
    }

    public double calculateArea()
    {
        double area;
        area = lenght * height;
        return area;
    }
}

class Square extends Shape{
    private double lenght;
    public Square(double lenght)
    {
        this.lenght = lenght;
    }

    public double calculateArea()
    {
        double area;
        area = lenght * lenght;
        return area;
    }

}

class BankAccount{
    private double balance;
    public BankAccount(double initialBalance)
    {
        if(initialBalance > 0)
        {
            this.balance = initialBalance;
        }
    }
    // Getter function

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
        }
    }

    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance -= amount;
        }
    }
}


public class Main{
    public static void main(String[] args) {

        Circle c = new Circle(12.5);
        double area = c.calculateArea();
        System.out.println("Area of the circle is : "+area);
        System.out.println();
        Triangle t = new Triangle(5, 6);
        area = t.calculateArea();
        System.out.println("Area of the Triangle is : "+area);
        System.out.println();
        Rectangle r = new Rectangle(7, 9);
        area = r.calculateArea();
        System.out.println("Area of the Rectangle is : "+area);
        System.out.println();
        Square s = new Square(9);
        area = s.calculateArea();
        System.out.println("Area of the Square is : "+area);

        System.out.println();
        Scanner g = new Scanner(System.in);
        BankAccount a1 = new BankAccount(100.000);
        System.out.println("Initial balance -> "+a1.getBalance());
        BankAccount a2 = new BankAccount(300.000);
        System.out.println("Initial balance -> "+a2.getBalance());
        System.out.println("Enter a deposit amount for a1");
        double depoAmount1 = g.nextDouble();
        a1.deposit(depoAmount1);
        System.out.println("New balance for a1 ->"+a1.getBalance());
        System.out.println();
        System.out.println("Enter a deposit amount for a2");
        double depoAmount2 = g.nextDouble();
        a2.deposit(depoAmount2);
        System.out.println("New balance for a2 ->"+a2.getBalance());

        System.out.println("Enter a with amount for a1");
        double withAmount1 = g.nextDouble();
        a1.withdraw(withAmount1);
        System.out.println("New balance for a1"+a1.getBalance());
        System.out.println();

        System.out.println("Enter a with amount for a2");
        double withAmount2 = g.nextDouble();
        a2.withdraw(withAmount2);
        System.out.println("New balance for a2"+a2.getBalance());
/*
        SRH_Students student1 = new SRH_Students();
        SRH_Students student3 = new SRH_Students("Mark", 20, 312122, "BSc IT");
        SRH_Students student2 = new SRH_Students("Alex", 22, 33, 1.0, "MSc");
        System.out.println(student1.Name + " -> Grades : "+student1.grade);
        System.out.println(student2.Name + " -> Grades : "+student2.grade);
        System.out.println(student3.Name + " -> Grades : "+student3.grade);

        student1.study();
        student2.study();
        student3.study();


        Mercedes m1 = new Mercedes("Mercedes", 2024, "SUV", "Metallic Grey", "G-Class", 2500.50, 400.0, true);
        BMW b1 = new BMW("BMW", 2014, "Race Car", "Red", "Mortier-Class", 3000.50, 600.0, true);
        Toyota k1 = new Toyota("Toyota", 2044, "vroum vroum", "Blue", "Bonjour", 2450.50, 900.0, false);
        m1.displayInfo();
        System.out.println();
        b1.displayInfo();
        System.out.println();
        k1.displayInfo();
        */



    }

}
