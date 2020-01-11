package patternPrograms;

public class PatternPrograms {

    public void rightTriangle(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void leftTriangle(int size){
        for (int i = size; i >0 ; i--) {
            for (int j = 1; j <=size ; j++) {
                if(j>=i){
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    public void printPyramid(int size){
        for (int i = 1; i <=size; i++) {

            for (int j = 0; j <=size-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printDiamond(int n){
        int space = 1;

        space=n-1;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=space; j++) {
                System.out.print(" ");
            }
            space--;


            for (int k = 1; k <=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        space=1;
        int ln=n;
        for (int i = 1; i <=n-1 ; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;
            for (int j = 1; j <= ln - 1; j++) {
                System.out.print("* ");
            }
            ln--;
            System.out.println("");
        }


    }

    public void printReverseDiamond(int size){
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=size+1-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void downwardTriangleStar(int n){
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public void rightPascalsTriangle(int n){
        int size=(n+1)/2;

        for (int i = 1; i <=size ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = size-1; i >0 ; i--) {
            for (int j =1 ; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void leftPascalsTriangle(int n){
        int size=(n+1)/2;

        for (int i = 1; i <=size ; i++) {
            for (int j = 1; j <=size-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int ln=size-1;
        for (int i = 1; i<=size-1; i++) {
            for (int j = 1; j<=i ; j++) {
                System.out.print("  ");
            }
            for (int j =1; j <=ln ; j++) {
                System.out.print("* ");
            }
            ln--;
            System.out.println();
        }
    }


}
