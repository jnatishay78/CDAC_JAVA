/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pattern_By_Anup_Sir;
public class HollowStar {
    public static void main(String[] args) {
    int n = 11;
    for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if((i==0&&j==5)||(i==1&&j==4)||(i==1&&j==6)||(i==2&&j==0)||(i==2&&j==1)||(i==2&&j==2)||(i==2&&j==3)||(i==2&&j==7)||(i==2&&j==8)||(i==2&&j==9)||(i==2&&j==10)||   
           (i==3&&j==1)||(i==3&&j==9)||(i==4&&j==2)||(i==4&&j==8)||(i==5&&j==3)||(i==5&&j==7)||
           (i==7&&j==1)||(i==7&&j==9)||(i==6&&j==2)||(i==6&&j==8)||
           (i==10&&j==5)||(i==9&&j==4)||(i==9&&j==6)||(i==8&&j==0)||(i==8&&j==1)||(i==8&&j==2)||(i==8&&j==3)||(i==8&&j==7)||(i==8&&j==8)||(i==8&&j==9)||(i==8&&j==10)){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
        System.out.println("");
}
    }
}