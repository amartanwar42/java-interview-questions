package numberPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberPrograms {

    public void swapTwoNumberUsingThirdVariable(int a, int b){
        int c=0;
        c=a+b;
        a=c-a;
        b=c-a;
        System.out.println("Number a:"+a);
        System.out.println("Number b:"+b);
    }

    public void swapTwoNumberWithoutUsingThirdVariable(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Number a:"+a);
        System.out.println("Number b:"+b);
    }

    public Boolean primeNumberCheck(int number){
        Boolean result=false;
        int i;
        if(number!=1){
            for ( i = 2; i <number ; i++) {
                if(number%i==0) {
                   break;
                }
            }
            if(number==i){
                System.out.println(i);
                result=true;
            }
        }
        return result;
    }

    public void fibonacciSeries(int len){
        int a=0;
        int b=0;
        int c=1;
        System.out.println(a+b);
        for (int j = 0; j <=len ; j++) {
            a=b;
            b=c;
            c=a+b;

            System.out.println(c);
        }
    }

    public void secondMaxNumber(int[] number){
        int firstMax=0;
        int secondMax=0;

        for (int n:number) {

            if(n>firstMax){
                secondMax=firstMax;
                firstMax=n;
            }
            else if(n>secondMax){
                secondMax=n;
            }
        }

        System.out.println("FirstMaxNumber: "+firstMax);
        System.out.println("SecondMaxNumber: "+secondMax);
    }

    public Boolean armstrongNumber(int number){

        List<Integer> n= new ArrayList<>();
        int sum=0;
        Boolean result=false;
        int inputNumber=number;

        while (inputNumber!=0){
            int temp=inputNumber%10;
            inputNumber=inputNumber/10;
            n.add(temp);
        }

        for (int n1:n) {
             sum = n.stream().map(x -> x * x * x).collect(Collectors.summingInt(Integer::intValue));
        }
        if(sum==number){
           result=true;
        }
        return result;
    }

    public Boolean palindrome(int n){
        int tem=n;
        int reverse=0;
        Boolean result=false;

        while (n!=0){
            int n2=n%10;
            reverse=reverse*10+n2;
            n=n/10;
        }

        if(tem==reverse){
            result=true;
        }
       return result;
    }

    public int factorial(int number){
        int fac=1;

        for (int i = 1; i <=number ; i++) {
            fac=fac*i;
        }

        return fac;
    }
}
