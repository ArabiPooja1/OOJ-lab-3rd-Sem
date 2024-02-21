class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    private int age;

    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Age cannot be negative");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Son extends Father {
    private int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge);
        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age should be less than Father's age");
        }
        this.sonAge = sonAge;
    }

    public int getSonAge() {
        return sonAge;
    }
}

public class  lab_7_EH{
    public static void main(String[] args) {
        try {
            int fatherAgeInput = Integer.parseInt(args[0]);
            int sonAgeInput = Integer.parseInt(args[1]);

            Father father = new Father(fatherAgeInput);
            Son son = new Son(fatherAgeInput, sonAgeInput);

            System.out.println("Father's age: " + father.getAge());
            System.out.println("Son's age: " + son.getSonAge());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two integer values as command-line arguments.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid ages as command-line arguments.");
        } catch (WrongAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}