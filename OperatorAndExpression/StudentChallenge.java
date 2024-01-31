package OperatorAndExpression;
import java.util.*;
import java.lang.*;
public class StudentChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // float base,height,area;
        // base=sc.nextFloat();
        // height=sc.nextFloat();
        // area=base*height/2;
        // System.out.println(area);



        float canh1,canh2,canh3,area1;
        double areaMain;
        canh1=sc.nextFloat();
        canh2=sc.nextFloat();
        canh3=sc.nextFloat();
        area1=(canh1+canh2+canh3)/2;
        areaMain=Math.sqrt(area1*(area1-canh1)*(area1-canh2)*(area1-canh3));
        System.out.println(areaMain);




    }
}