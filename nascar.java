import java.util.*;
import java.lang.*;

public class nascar {
    public static void main(String[] args) {
        // System.out.println("Adam is a good boy");

        /*
         * In Java:
         * Variables are containers which store data values
         * String, int, float, char, boolean
         * How to declare variables:
         * syntax - <dataType> <variableName> = <value>;
         */

        String name = "Adam";
        String channel = "S.Fashion Zr";

        // System.out.println(name);
        // System.out.println(name.length());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
        // System.out.println(name + " from\" " + channel);
        // System.out.println(name + " from\\ " + channel);
        // System.out.println(name + " from\t " + channel);
        // System.out.println(name + " from\n " + channel);

        // System.out.println(name.contains("a"));//It will give the answer in true and
        // false
        // System.out.println(name.charAt(2));// it will show the that what the word no
        // two
        // System.out.println(name.endsWith("am"));//It will give the answer in true and
        // false
        // System.out.println(name.indexOf("dam"));// It will index the word

        int numb1 = 4, numb2 = 7, numb3 = 27;
        // System.out.println( Math.max(numb1, numb2));
        // System.out.println( Math.min(numb1, numb2));
        // System.out.println( Math.sqrt(36));
        // System.out.println( Math.abs(-36));
        // System.out.println( Math.abs(6));
        // System.out.println( Math.random());
        // System.out.println( 4+(8-4)*Math.random());
        // System.out.println( 4+(8-4)*Math.random());
        // System.out.println( 4+(8-4)*Math.random());
        // System.out.println( 4+(8-4)*Math.random());
        // System.out.println(4+(8-4)*Math.random());
        // System.out.println(Math.cbrt(numb3));
        // System.out.println(Math.pow(numb1,2));

        int a = -45, x = 56, y = 67;
        double g = 56.0;
        float b = 45.22f;
        boolean isYoung = false;
        // System.out.println(x);
        // System.out.println(b);
        // System.out.println(isYoung);
        // System.out.println(Math.log(a));
        // System.out.println(Math.round(g));
        //

        /*
         * Rules for constructing name of variables in Java
         * 1. Can contain digits, underscores, dollar signs, letters
         * 2. Should begin with a letter, $ or _
         * 3. Java is case sensitive language which means that
         * harry and Harry are two different variables altogether.
         * 4. Should not contain whitespaces
         * 5. You cannot use reserved keywords from Java
         */
        /*
         * Two types of Java Data Types:
         * 1. Primitive - byte (1 byte), short (2 bytes), int(4 bytes), long (8 bytes),
         * float(4 bytes),
         * double (8 bytes), boolean(1 bit), char (2 bytes).
         * 2. Non Primitive or Reference Data Type -
         */
        byte u = -56;
        double d = 45.635435345d;
        // System.out.println(d);
        char grade = 'A';
        // System.out.println(grade);

        /*
         * Operators in Java
         * 
         * Operand, operator, Operand = Result
         * 4 + 7 = 11
         * 
         * Types of operators in Java
         * Arithmetic operators
         * Assignment operators
         * Logical Operators
         * Comparison Operators
         */
        int num1 = 45, num2 = 78;
        num1 += 3;
        num2 -= 8;
        // Explore these operators - *=, /=, %=
        // System.out.print("The value of num1 + num2 is ");
        // System.out.println(num1 + num2);

        // System.out.print("The value of num1 - num2 is ");
        // System.out.println(num1 - num2);

        // System.out.print("The value of num1 * num2 is ");
        // System.out.println(num1 * num2);

        // System.out.print("The value of num1 / num2 is ");
        // System.out.println(num1 / num2);

        // System.out.print("The value of num1 % num2 is ");
        // System.out.println(num1 % num2);
        // System.out.println(num1 *= num2);
        // System.out.println(num1 /= num2);
        // System.out.println(num1 %= num2);
        // System.out.println(num2++);
        // System.out.println(++num1);
        // System.out.println(num1--);
        // System.out.println(--num1);

        /*
         * Comparison Operators:
         * 1. == : checks for equality of two values
         * 2. != : checks if two values are not equal
         * 3. <
         * 4. >
         * 5. <=
         * 6. >=
         *
         * Logical Operators:
         * 1. && - Logical and operator - returns true only if both conditions are true
         * 2. || - Logical or operator - returns true if any one condition is true
         * 3. ! - Logical not - Reverse the result from true to false and vice versa
         */

        // System.out.println(Math.rint(50.5));
        // System.out.println(Math.rint(-4.0));

        /*
         * double ko =(int) Math.PI*180*10;
         * System.out.println(ko);
         * Scanner s = new Scanner(System.in);
         * 
         * System.out.println("Enter the your age");
         * int age = s.nextInt();
         * System.out.println("your age is "+ age);
         */

        // System.out.println(Math.ceil(age));
        // System.out.println(Math.floor(age));
        // if(age<=18)
        // System.out.println("you are adult");

        // else
        // System.out.println("you are young");

        // if(age>20){

        // System.out.println("You are an adult");
        // }
        // else if(age>5){
        // System.out.println("You are not a kid");

        // }
        // else{
        // System.out.println("You are a kid");
        // }

        /*
         * switch (age){
         * case 12:
         * // System.out.println("You are 12 years old");
         * break;
         * case 56:
         * //System.out.println("You are 56 years old");
         * break;
         * case 16:
         * //System.out.println("You are 16 years old");
         * break;
         * default:
         * //System.out.println("You did not match any of the cases");
         * }
         */

        // int i = 0;
        // while (i < 1000) {
        //     System.out.println(i);
        //     i += 2;

        // }




    //     int j = 0;
    //    do{
    //        System.out.println(j);
    //        j += 1;
    //    }while(j>100);




        //    for(int i=0;i<=10;i++){
        //    if(i==2){
        //        continue;
        //    }
//            else{
//                System.out.println(i);
//            }
        //    System.out.println(i);
      // }



    //    int d1,d2,d3;
    //    System.out.println("values");
    //    for(d1=1;d1<=6;d1++)
    //    {
    //     for(d2=1;d2<=6;d2++){
    //         for(d3=1;d3<=6;d3++){
    //             System.out.println(d1+" "+d2+" "+d3);
    //         }
    //     }

    //            int [] marks = {1,2,3,5};
    //    marks[3] = 34; // this will update marks[3]
    //    System.out.println(marks[0]);
    //    System.out.println(marks[3]);





    //           for(int i=0;i<marks.length;i++){
    //        System.out.println(marks[i]);
    //    }
    //    System.out.println("This is for each loop:");

    //    // For each loop
    //    for(int value:marks){
    //        System.out.println(value);
    //    }

    //    int [][] matrix = {{1,2,3},
    //                        {4,5,6}};
    //    System.out.println(matrix[0][1]);
    //    }


    //           String [] cars = {"Maruti Harry", "Maruti", "Suzuki", "Innova", "Ford Titanium"};
    //    for(String value:cars){
    //        System.out.println(value);
    //    }

    //     Try - Catch
    //    String [] cars = {"Maruti Harry", "Maruti", "Suzuki", "Innova", "Ford Titanium"};

    //    try{
    //        System.out.println(cars[3]);
    //    }
    //    catch(Exception e){
    //        System.out.println(e);
    //    }

    //    System.out.println("Masoom");
    //    System.out.println(sum(5, 7));
    // }

    }


    }

