package Pattern_By_Anup_Sir;

/**
 *
 * @author user
 */
public class Mandir {
    public static void main(String[] args) {
        int n=12;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0&&j==5)||(i==1&&j==5)||(i==2&&j==5)||(i==1&&j==8)||
                   (i==3&&j==5)||(i==4&&j==4)||(i==4&&j==6)||(i==5&&j==3)||(i==5&&j==7))
                   {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println(" ");
        }
    }
}    




