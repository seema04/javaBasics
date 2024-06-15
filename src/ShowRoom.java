import java.io.*;
import java.util.*;
public class ShowRoom {
    String name;
    long mobNo;
    double cost;
    double dist;
    double amt;

    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of customer:");
        name = in.nextLine();
        System.out.println("Enter mobile number:");
        mobNo = in.nextLong();
        System.out.println("Enter cost:");
        cost  = in.nextDouble();
    }

    void calculate(){
        if(cost > 0 && cost <= 10000){
            dist = cost*0.25;
            amt = cost-dist;
        }else if(cost > 10000 && cost <=50000){
            dist = cost*0.35;
            amt = cost-dist;
        }
    }

    void print(){
        System.out.println("name: "+ name);
        System.out.println("mobNo: "+ mobNo);
        System.out.println("Amount: "+ amt);
    }

    public static void main(String[] args){
        ShowRoom sh = new ShowRoom();
        sh.input();
        sh.calculate();
        sh.print();
    }
}



