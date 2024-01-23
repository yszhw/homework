import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("1,b 2,b 3,a 4,a 5,b");
        System.out.println("请输入想要打印的等腰三角形的行数：");
        a = sc.nextInt();
        showTriangle(a);
        String s = sc.nextLine();
        resverseSUM(s);
        int num=sc.nextInt();
        isPalindrome(num);
        shuiXianHua();
        arrayDemo();
        }
        public static void arrayDemo(){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];

        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0];
        int max=a[0];
        for(int i=0;i<10;i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static void showTriangle(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (2 * n - (2 * i - 1)) / 2; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void resverseSUM(String s) {
        char[] chars = s.toCharArray();
        char a;
        int i = 0;
        int j = chars.length - 1;
        while (i != j) {
            a = chars[j];
            chars[j] = chars[i];
            chars[i] = a;
            i++;
            j--;
        }
        String b = String.valueOf(chars);
        System.out.println(b);
    }
    public static void isPalindrome(int num){
        int a=0;
        int b=num;
        while(num!=0){
            a=a*10;
            a+=num%10;
            num=num/10;
        }
        if(a==b){
            System.out.println("是的") ;
        }
        else{
            System.out.println("不是") ;
        }
    }
    public static void shuiXianHua(){
        for(int i=100;i<=999;i++){
            int a=i%10;
            int b=(i/10)%10;
            int c=i/100;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.print(i);
                System.out.print(' ');
            }
        }

    }

}
