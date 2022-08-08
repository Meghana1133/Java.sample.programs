import java.util.Arrays;

public class Intersection {



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a= {1,2,4,5,6};
        int[] b= {2,3,5,7};
        int x=a.length;
        int y=b.length;
        Unionofarray(a,b,x,y);
        Arrays.sort(a);
        Arrays.sort(b);

    }

    public static int Unionofarray(int[] a,int[] b,int x,int y) {
        int j=0;
        int i=0;
        while( i < x && j < y) {
            if(a[i]<b[j]) {
                i++;
            }

            else if(b[j]<a[i]) {
                j++;
            }

            else {
                System.out.print(b[j++]+" ");

                i++;
            }
        }


        return 0;




    }
}
