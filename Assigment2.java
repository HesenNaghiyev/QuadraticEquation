
public class Assigment2 {

    public static final int CONST=1;

    public static void main(String[] args) {
       
        Byte firstNumerator = Byte.parseByte(args[0]);
        Byte firstDenominator = Byte.parseByte(args[1]);
        Byte secondNumerator = Byte.parseByte(args[2]);
        Byte secondDenominator = Byte.parseByte(args[3]);  // Since the input range is between [1 10] as said in Assigment requirements, l thought that, Byte is enough for this assignment.

         System.out.println("\n");
         System.out.println("The eqution is provided by You is ("  + firstNumerator+"/"+firstDenominator +") + (" + secondNumerator+ "/"+ secondDenominator+")"+"\n");
         fraction(firstNumerator,firstDenominator,secondNumerator,secondDenominator);
      }

    public static int GCD (int a, int b)
    {
        if(a==0) return b;
        if(b==0) return a;   
        if(a>b) return GCD (a%b, b);   
        return GCD(a, b%a);
    }

    public static int LCM (int a, int b){  
        return (a*b)/GCD(a,b);
    }

    public static void fraction(int a, int b, int c, int d){
        int denominator = LCM (b, d);
        int numerator = (LCM (b, d)/b)*a + (LCM (b, d)/d)*c; 
     
        int denominatorFinal = denominator / GCD (denominator, numerator);
        int numeratorFinal = numerator / GCD (denominator,numerator);
       
        if (denominatorFinal==CONST) {
          	 System.out.println("\t\t Answer is  "+numeratorFinal);  
          }

        else
          {

        if (denominatorFinal==numeratorFinal) 
            System.out.println("\t\t Answer is  "+CONST);
        else 
            System.out.println("\t\t Answer is  "+numeratorFinal + "/" +denominatorFinal);
    }

    }
}

