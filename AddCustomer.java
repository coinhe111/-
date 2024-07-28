import java.util.Scanner;
import java.util.InputMismatchException;
public class AddCustomer {
    String info;
    Customers customers[]=new Customers[100];
    Customers totalnum=new Customers();
    public void addCustomer1() {
        System.out.println("--------------添加客户--------------");
        int i=0,id;
        boolean flag=true;
        Scanner scanner=new Scanner(System.in);
        while (flag)
        {
            customers[i]=new Customers();
            System.out.print("姓名：(输入“-1”时停止录入)");
            customers[i].name=scanner.next();
            if (customers[i].name.equals("-1"))
            {
                flag=false;
                System.out.println("用户信息输入完成！");
                break;
            }
            System.out.print("性别：");
            char gender=scanner.next().charAt(0);
            customers[i].setGender(gender);
            System.out.print("年龄：");
            customers[i].setAge();
            System.out.print("电话：");
            customers[i].phoneNum=scanner.next();
            System.out.print("邮箱：");
            customers[i].email=scanner.next();
            i++;
            totalnum.total=i;
        }
    }


    public void changeCustomers() {
        System.out.println("--------------修改客户--------------");
        boolean flag=true;
        int id;
        Scanner scanner=new Scanner(System.in);
        int num= totalnum.total;
        while (flag)
        {
            System.out.print("请输入待修改客户编号(输入“-1”时退出)：");
            id = scanner.nextInt();
            if (id==-1)
            {
                flag=false;
                System.out.println("用户信息修改完成！");
                break;
            }
            if(id<=0||id> totalnum.total)
            {
                System.out.println("输入的编号有误或不存在,请重新输入");
                continue;
            }
            System.out.print("姓名："+"("+customers[id-1].name+")：");
            customers[id-1].name=scanner.next();
            System.out.print("性别："+"("+customers[id-1].gender+")：");
            char gender=scanner.next().charAt(0);
            customers[id-1].setGender(gender);
            System.out.print("年龄："+"("+customers[id-1].age+")：");
            customers[id-1].setAge();
            System.out.print("电话："+"("+customers[id-1].phoneNum+")：");
            customers[id-1].phoneNum=scanner.next();
            System.out.print("邮箱："+"("+customers[id-1].email+")：");
            customers[id-1].email=scanner.next();

        }
    }

    public void deleteCustomers(){
        int id =0;
        char judge;
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;
        System.out.println("--------------删除客户--------------");
        while (flag) {
            System.out.print("请输入待删除客户编号(输入“-1”时退出)：");
            id = scanner.nextInt();
            if (id == -1) {
                flag = false;
                System.out.println("所有删除操作完成！");
                break;
            }
            if(id<=0||id> totalnum.total)
            {
                System.out.println("输入的编号有误或不存在,请重新输入");
                continue;
            }
            System.out.print("确认是否删除？（y/n）");
            judge=scanner.next().charAt(0);
            if(judge=='y'||judge=='Y')
            {
                for (int i = id; i < totalnum.total ; i++) {
                    customers[i-1].email=customers[i].email;
                    customers[i-1].gender=customers[i].gender;
                    customers[i-1].age=customers[i].age;
                    customers[i-1].phoneNum=customers[i].phoneNum;
                    customers[i-1].name=customers[i].name;
                }
                customers[totalnum.total-1].email=null;
                customers[totalnum.total-1].gender=0;
                customers[totalnum.total-1].phoneNum=null;
                customers[totalnum.total-1].name=null;
                customers[totalnum.total-1].age=0;
                totalnum.total--;
            }

        }
    }


    public void showCustomer() {
        System.out.println("--------------客户列表--------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
        for (int i = 0; i < totalnum.total; i++) {
            info=i+1+"\t"+customers[i].name+" "+customers[i].gender+" "+customers[i].age+" "+customers[i].phoneNum+" "+customers[i].email;
            System.out.println(info);
        }
    }

}
