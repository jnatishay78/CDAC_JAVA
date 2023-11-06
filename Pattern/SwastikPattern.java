package Paatern_By_Sarvat_Mam;
public class SwastikPattern {
    public static void main(String[] args) {
    int n = 11;
    for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if((i==0&&j==0)||(i==3&&j==3)||(i==1&&j==1)||(i==2&&j==1)||(i==3&&j==1)||(i==4&&j==1)||(i==5&&j==1)||(i==5&&j==2)||(i==5&&j==3)||(i==5&&j==4)||(i==5&&j==5)||(i==5&&j==6)||(i==5&&j==7)||
        (i==5&&j==8)||(i==5&&j==9)||(i==1&&j==5)||(i==2&&j==5)||(i==3&&j==5)||(i==4&&j==5)||(i==5&&j==5)||(i==6&&j==5)||(i==7&&j==5)||(i==8&&j==5)||(i==9&&j==5)||(i==1&&j==6)||(i==1&&j==7)||
        (i==1&&j==8)||(i==1&&j==9)||(i==3&&j==7)||(i==0&&j==10)||(i==10&&j==0)||(i==9&&j==1)||(i==9&&j==2)||(i==9&&j==3)||(i==9&&j==4)||(i==7&&j==3)||(i==6&&j==9)||(i==7&&j==9)||
        (i==8&&j==9)||(i==9&&j==9)||(i==10&&j==10)||(i==7&&j==7)){
            System.out.print("*    ");
        }else{
            System.out.print("     ");
        }
    }
        System.out.println("");
        System.out.println("");
}
    }
}
