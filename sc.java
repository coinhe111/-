import java.util.InputMismatchException;
import java.util.Scanner;

public class sc {
    private int num;
    boolean flag = true;
    AddCustomer addCustomer=new AddCustomer();
    Scanner sc=new Scanner(System.in);



    public void choice(){
        System.out.print("请选择（1-5）:");
        while(flag) {
            try {
                int num=sc.nextInt();
                if (num == 1) {
                    addCustomer.addCustomer1();
                    choice();
                } else if (num == 2) {
                    addCustomer.changeCustomers();
                    choice();
                } else if (num == 3) {
                    addCustomer.deleteCustomers();
                    choice();
                } else if (num == 4) {
                    addCustomer.showCustomer();
                    choice();
                } else if (num == 5) {
                    System.exit(0);
                } else {
                    System.out.println("输入有误，请输入数字1-5");
                }
            }catch (InputMismatchException e) {
                System.out.println("输入无效，请输入一个有效的整数!");
                sc.nextLine();
                this.choice();
            }
        }
    }
}