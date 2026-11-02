import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter exercise number (1-10): ");
        int exercise = scanner.nextInt();

        if (exercise == 1) {
            f1();
        } else if (exercise == 2) {
            f2();
        }else if (exercise == 3) {
            f3();
        }else if (exercise == 4) {
            f4();
        }else if (exercise == 5) {
            f5();
        }else if (exercise == 6) {
            f6();
        }else if (exercise == 7) {
            f7();
        }else if (exercise == 8) {
            f8();
        }else if (exercise == 9) {
            f9();
        }else if (exercise == 10) {
            f10();
        }else{
            System.out.println("Invalid exercise number");
        }
    }

    public static void f1() {
        System.out.println("Enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your height: ");
        String height = scanner.next();
        System.out.println("Enter your last name initial: ");
        char lastName = scanner.next().charAt(0);
        System.out.println("Name: " + firstName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Last name initial: " + lastName);
        System.out.println("Age in 10 years: " + (age+10));
    }

    public static void f2() {
        System.out.println("Enter seconds: ");
        int seconds_input = scanner.nextInt();
        int hours = seconds_input/3600;
        int minutes = (seconds_input%3600)/60;
        int seconds = seconds_input%60;
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }

    public static void f3() {
        System.out.println("Bill: ");
        int bill = scanner.nextInt();
        System.out.println("Tip percentage: ");
        int tip = scanner.nextInt();
        System.out.println("People: ");
        int people = scanner.nextInt();
        System.out.println("Tip: " + bill*(100/15));
        System.out.println("Total: " + bill+bill*(100/15));
        System.out.println("Per person: " + (bill+bill*(100/15))/people);
    }

    public static void f4() {
        System.out.println("Enter price of product 1: ");
        double price1 = scanner.nextDouble();
        System.out.println("Enter quantity of product 1: ");
        int quantity1 = scanner.nextInt();
        System.out.println("Enter price of product 2: ");
        double price2 = scanner.nextDouble();
        System.out.println("Enter quantity of product 2: ");
        int quantity2 = scanner.nextInt();
        System.out.println("Enter price of product 3: ");
        double price3 = scanner.nextDouble();
        System.out.println("Enter quantity of product 3: ");
        double quantity3 = scanner.nextDouble();
        System.out.println("Enter discount percentage");
        double discountPercentage = scanner.nextDouble();

        double totalBeforeDiscount = price1*quantity1+price2*quantity2+price3*quantity3;
        double discountAmount = totalBeforeDiscount * discountPercentage / 100;
        double finalPrice = totalBeforeDiscount - discountAmount;

        System.out.println("Total before discount: " + totalBeforeDiscount);
        System.out.println("Discount amount: " + discountAmount);
        System.out.println("Final price: " + finalPrice);

        System.out.println("Enter amount paid: ");
        double amountPaid = scanner.nextDouble();
        double change = amountPaid - finalPrice;
        System.out.println("Change: " + change);
    }

    public static void f5() {
        System.out.println("Distance: ");
        double distance = scanner.nextDouble();

        System.out.println("Time in minuts: ");
        int minutes = scanner.nextInt();

        double hours = minutes/60.0;
        double avarageSpeed = distance /hours;
        double distanceInOneHour = avarageSpeed;

        System.out.println("Time in hours: " + hours);
        System.out.println("Average speed: " + avarageSpeed + " kn/h");
        System.out.println("Distance in one hour: " + distanceInOneHour + " km");
    }

    public static void f6() {
        System.out.println("Assignment: ");
        double assignment = scanner.nextDouble();
        System.out.println("Quiz: ");
        double quiz = scanner.nextDouble();
        System.out.println("Final exam: ");
        double finalExam = scanner.nextDouble();

        double finalGrade = assignment*0.2+quiz*0.3+finalExam*0.5;

        System.out.println("Final grade: " + finalGrade);
        if (finalGrade >= 60){
            System.out.println("Result: Pass");
        }
        else{
            System.out.println("Result: Fail");
        }
    }

    public static void f7() {
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("The first number is larger.");
        }
        else if (secondNumber > firstNumber){
            System.out.println("The second number is larger.");
        }
        else{
            System.out.println("The numbers are the same.");
        }

        if (firstNumber%2==0){
            System.out.println("First number is even");
        }
        else{
            System.out.println("Second number is odd");
        }

        if (secondNumber%5==0){
            System.out.println("Second number can be divided by 5.");
        }
        else{
            System.out.println("Second number can't be divided by 5.");
        }

        if (firstNumber+secondNumber>0){
            System.out.println("The sum of the numbers is positive");
        }
        else if (firstNumber+secondNumber<0){
            System.out.println("The sum of the numbers is negative");
        }
        else{
            System.out.println("The sum of the numbers is 0");
        }
    }

    public static void f8() {
        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        if (age < 0){
            System.out.println("Invalid age");
        }
        else if (age < 6){
            System.out.println("The tiket will cost for you: " + 0 + " Shekels");
        }
        else if (age < 18){
            System.out.println("The tiket will cost for you: " + 30 + " Shekels");
        }
        else if (age < 65){
            System.out.println("The tiket will cost for you: " + 45 + " Shekels");
        }
        else {
            System.out.println("The tiket will cost for you: " + 25 + " Shekels");
        }

    }

    public static void f9() {
        System.out.println("Enter a string: ");
        String string = scanner.next();
        System.out.println("Number of characters: " + string.length());
        System.out.println("Uppercase: " + string.toUpperCase());
        System.out.println("Lowercase: " + string.toLowerCase());
        System.out.println("First character: " + string.charAt(0));
        System.out.println("Last character: " + string.charAt(string.length()-1));
    }

    public static void f10() {
        int a = 7;
        int b = 2;
        System.out.println(a / b); // expected: 3, result: 3, explanation: a and b are integers, so the division result is rounded down
        System.out.println(a / 2.0); // expected: 3.5, result: 3.5, explanation: a is integer but it's divided by a double type so the result is also double and can store the value after the floating point

        int num = 2147483647;
        System.out.println(num); // expected: 2147483647, result: 2147483647, explanation: it just prints the number
        System.out.println(num + 1); // expected: error, result: -2147483648, explanation: 2147483647 is the biggest number that the int type can contain so when we add 1 it adds 1 to the bits so the next numbers are the negative of the original number, well not exactly, it will be one less because there's 0 but no -0 so -2147483648

        double a1 = 0.1;
        double b1 = 0.2;
        System.out.println(a1 + b1); // expected: 0.3, result: 0.0000...0004, explanation: the numbers after the floating point are stored as divisions of 1 by power of 2 so we can't really the numbers 0.2 and 0.1, for that reason when we set the variables the values 0.2 and 0.1 we actually set a different though very close value, so that when we and them and try to print, the values after the floating point appears
        System.out.println(a1 + b1 == 0.3); // expected: 0.1, result: false, explanation: same thigh as in the last example, when we add 0.2 and 0.1 we get a very close values to 0.3 but not quit, so it's not equal to 0.3 and we get false
    }
}