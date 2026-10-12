public class twodimension_array_practice {
    public static void main(String[] args) {
        int [][] numArray = {{10,11,12,13,14}, {15,16,17,18,19}, {20,21,22,23,24}, {25,26,27,28,29}};
        System.out.println(numArray[0][3]);
        System.out.println(numArray[1][1]);
        System.out.println(numArray[2][4]);
        System.out.println(numArray[3][2]);

        int [][] a = new int [4][5];
        int c = 10;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = c;
                System.out.print(a[i][j] + " ");
                c++;
            }
            System.out.println();
        }
        
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j]*10 + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j]%2==0){
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }

        //Ex7
        int [][] quizGrades = new int [4][5];
        for(int i = 0; i < quizGrades.length; i++){
            for(int j = 0; j < quizGrades[i].length; j++){
                quizGrades[i][j] = 60 + (int)(Math.random() * 41);
                System.out.println(quizGrades[i][j]);
            }
        }
    }
}
