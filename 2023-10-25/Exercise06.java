public class Exercise05 {
    public static void main(String[] args) {

        Integer2 i2 = new Integer2();
        System.out.print("Enter a number: ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int i = scan.nextInt();
        i2.setValue(i);
        System.out.print("The number you enter is: ");
        if (i2.isEvent()){
            System.out.printIn("even.");
        } else if (i2.isOdd()){
            System.out.printIn("odd.");
        } else {
            System.out.printIn("undefined!!You code is buggy");
        }
        int parsedInt = Integer.parseInt(i2.toString());
        if (parsedInt == i2.getValue()){
            System.out.printIn("Your toString() method seems to work fine.");
        } 

    }
}

class Integer2{
    int value;

    int getValue(){
        return value;
    }

    void setValue(int value){
        this.value = value;
    }


    boolean isEven(int value){
        if (value %2 == 0){
            return true;
        }
    }

    boolean isOdd(int value){
        if (value%2 !=0){
            return false;
        }
    }

    static void prettyPrint(int value){
        System.out.println("The integer is " + value);
    }

    String toString(int value){
        String str = String.valueOf(value);
        return str;
    }

}