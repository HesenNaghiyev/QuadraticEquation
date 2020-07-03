import java.util.*;
  class Assigment1 {
    public static void main(String[] args) {

        Double doubleRoot1 = Double.parseDouble(args[0]);
        Double doubleRoot2 = Double.parseDouble(args[1]);
        Double doubleRoot3 = Double.parseDouble(args[2]);

         
        System.out.printf("\n\t\tThis Program Calculates the root of below equation\n\t\t\t%.2fx²%c%.2fx%c%.2f = 0\n\n",doubleRoot1, (doubleRoot2>0) ? '+': '-', Math.abs(doubleRoot2), (doubleRoot3>0) ? '+': '-', Math.abs(doubleRoot3));
        
    
        printRootsOfQuadraticEquation (doubleRoot1, doubleRoot2, doubleRoot3);
    }


    public static double[] rootsOfQuadraticEquation (double a, double b, double c)
     {
         double arr[] = new double[2];
         
       
             arr[0] = -(b + Math.sqrt (myDiscriminant (a, b, c))) / (2 * a);
             arr[1] = -(b - Math.sqrt (myDiscriminant (a, b, c))) / (2 * a);
             if (arr[0] == arr[1])
             {
                double oneRoot[] = new double[1];
                oneRoot[0] = arr[0];
                return oneRoot;
             }
            return arr;
     }
         
     
     
     public static double myDiscriminant (double a, double b, double c)
     {
         return (myPow (b, 2) - 4 * a * c);
     }

     public static double myPow (double a, int b)
     { 
         if (b == 0)
             return 1;
         if (b % 2 == 0)
             return myPow (a*a, b / 2);


            return a * myPow (a, b - 1);
     }
     
     public static boolean hasRoots(double a, double b, double c) 
     {
            return myDiscriminant(a, b, c) >= 0;
     }
      
    
      public static void printRootsOfQuadraticEquation(double a, double b, double c)
     {

    if(hasRoots(a, b ,c))
        System.out.printf("There %s \n", (rootsOfQuadraticEquation(a, b, c).length==2) ? "are two roots" : "is one root");
    else 
        System.out.println("There is not a root of the given equation represented by coefficients");
         
    if(hasRoots(a,b,c))
         for (int i = 0; i<rootsOfQuadraticEquation(a, b, c).length; i++)
         {
         	  if (rootsOfQuadraticEquation(a, b, c).length== 1) {
         	  	  System.out.println("Only Root is : " + rootsOfQuadraticEquation(a, b, c)[i]);
         	  	
         	  }
              

             else{

             if (i==0)
                 System.out.println("Root #1: " + rootsOfQuadraticEquation(a, b, c)[i]);
             else
                 System.out.println("Root #2: " + rootsOfQuadraticEquation(a, b, c)[i]);
           }
         }

     }
 }