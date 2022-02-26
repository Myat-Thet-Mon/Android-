package ch5Project;

class Dog {
    public String name;
    public String breed;
    public int age;

    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age in calendar years: " +
                age);
        System.out.println("Age in human years: " +
                getAgeInHumanYears());
        System.out.println();
    }

    public int getAgeInHumanYears() {
        int humanAge = 0;
        if (age <= 2) {
            humanAge = age * 11;
        } else {
            humanAge = 22 + ((age - 2) * 5);
        }
        return humanAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void equalOrNot(Dog obj) {
        if (this.name.equalsIgnoreCase(obj.name) && this.age == obj.age &&
                this.breed.equalsIgnoreCase(obj.breed)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        Dog balto = new Dog();
        balto.setName("Balto")  ;
        balto.setAge(8);
        balto.setBreed("Siberian Husky");
        balto.writeOutput();
        Dog scooby = new Dog();
        scooby.setName("Scooby");
        scooby.setAge(42);
        scooby.setBreed("Great Dane");
        System.out.println(scooby.getName() + " is a " +
                scooby.getBreed() + ".");
        System.out.print("He is " + scooby.getAge() +
                " years old, or ");
        int humanYears = scooby.getAgeInHumanYears();
        System.out.println(humanYears + " in human years.");
        balto.equalOrNot(scooby);
    }
}
