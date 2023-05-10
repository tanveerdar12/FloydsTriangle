        import java.util.Scanner;

       public class FloydsTriangle {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size =sc.nextInt();
        // here the logic is when i+j is even, print 1 otherwise 0.
        int x=size;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1" + " ");
                }else{
                    System.out.print("0" +" ");
                }
            }
            System.out.println(" ");
        }

    }
}
