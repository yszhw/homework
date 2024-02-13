package learning;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class demo{
    public static void main(String[] args){
        System.out.println("<-------第一题------->");
        Book book=new Book("java",2004,"smith");
        book.displayInfo();
        System.out.println("<-------第二题------->");
        Car car=new Car(4,"宝马","白色",200,4);
        car.start();
        car.accelerate(car.getSpeed());
        car.brake();
        car.display();
        System.out.println("------------------");
        Truck truck=new Truck(7000,3,"大重","白色",150,6);
        truck.start();
        truck.accelerate(truck.getSpeed());
        truck.brake();
        truck.display();

        System.out.println("<-------第三题------->");
        Calculator.add(2.0,3.0);
        Calculator.divide(5,2);
        Calculator.multiply(2,5);
        Calculator.subtract(5,2);
        String r=getSum("9000000","1100");
        System.out.println(r);

        System.out.println("<-------第四题------->");
        String[] strs=new String[]{"flower","flow","flight"};
        System.out.println(fun(strs));

    }
    public static String fun(String[] strs){

        int min=strs[0].length();
        int index=0;
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].length()<min){
                index=i;
                min=strs[i].length();
            }
        }
        String goal="";
        int trueCount=0;
        int i,j;
        for(j=1;j<=min;j++){
            goal=strs[index].substring(0,j);
            for(i = 0; i < strs.length; i++) {
                if(strs[i].contains(goal)){
                    trueCount++;
                }
            }
            if(trueCount!= strs.length){
                break;
            }
            trueCount=0;
        }
        return goal=strs[index].substring(0,j-1);
    }
    public static String getSum(String a,String b){
        ArrayList<Integer> la=new ArrayList<>();
        ArrayList<Integer> lb=new ArrayList<>();
        for(int i = a.length()-1;i >= 0;--i){
            la.add(a.charAt(i)-'0');
        }
        for(int i = b.length()-1;i >= 0;--i){
            lb.add(b.charAt(i)-'0');
        }
        StringBuilder sb=new StringBuilder();
        int min;
        if(a.length()<b.length()){
            min=a.length();
        }else {
            min=b.length();
        }

        int n=0;
        int i;
        for(i=0;i<min;i++){
            int m=la.get(i)+ lb.get(i)+n;
            n=0;
            if(m>=10){
                sb.append(m-10);
                n=1;
            }
            else {
                sb.append(m);
            }

        }
        if(la.get(i-1)+ lb.get(i-1)>=10){
            sb.append(1);
        }
        if(i>=la.size()-1){
            for (i=i;i<=lb.size()-1;i++){
                sb.append(lb.get(i).intValue()+n);
                n=0;
            }
        }
        else{
            for (i=i;i<la.size();i++){
                sb.append(la.get(i).intValue()+n);
                n=0;
            }
        }
        sb.reverse();
        return sb.toString();
    }

}


