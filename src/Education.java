import javax.jws.soap.SOAPMessageHandlers;

public class Education {
    public static void main(String[] args) {
        boolean isBigNumber = true;
        int variable = 10;

        getIsBigNumber(variable);

        int variable2 = 3;
        int variable5 = 5;
        int number = 11;

        int sumAll = getSum(variable, variable2, variable5);
        System.out.println(sumAll);

        String name = "jakieś imię";
        System.out.println(getName(name));
        System.out.println(getIsBigNumber(number));
        ifNumberIsBigPrintSomething(number);

    }
    public static boolean getIsBigNumber(int variable){
        return (variable>100);
        }
            //return variable;
    public static int getSum(int variable, int variable2, int variable5){
        return variable + variable2 + variable5;
    }
    public static String getName(String name){
       return "Tomek";

    }
    public static void ifNumberIsBigPrintSomething(int number){
        if (number>10){
            System.out.println("Unsomething");
        return;
        }
        System.out.println("Something");
    }


        }




