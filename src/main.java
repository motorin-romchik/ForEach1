public class main {
    public static void main (String args[]){
        int sum = 0;
        int nums [][] = new int [3][5];

        //for
        for (int i = 0; i < 3 ; i++){
            for (int j = 0; j < 5; j++){
                nums [i][j] = (i+1) * (j+1);
            }
        }
        //for each

        for (int x[]: nums) {
            for (int y: x) {
                System.out.println("Value: "+ y);
                sum += y;
            }
        }
        System.out.println("Summ: " + sum);

        int def[] = {6,8,3,7,5,6,1,4};
        int val = 5;
        boolean found = false;

        for (int z : def){
            if (z == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Value was found!" );

        int ik,jk;
        for (ik = 0; ik <10; ik++){
            for (jk = ik; jk<10; jk++){
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
