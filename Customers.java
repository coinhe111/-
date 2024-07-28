import java.util.InputMismatchException;
import java.util.Scanner;

public class Customers {
    int total=0,age;
    String name;
    char gender;
    String phoneNum,email;
    Scanner sc=new Scanner(System.in);
    public int getAge() {
        return age;
    }

    public void setAge() {
        try {
            int age1=sc.nextInt();
            this.age = age1;
            if (this.age < 0) {
                System.out.print("您输入的数据有误，请重新输入：");
                setAge();
            }
        }catch (InputMismatchException e) {
            System.out.print("输入无效，请输入一个有效的整数:");
            sc.nextLine();
            setAge();
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
        if (this.gender!='男'&&this.gender!='女')
        {
            System.out.print("您输入的数据有误，请重新输入：");
            char temp=sc.next().charAt(0);
            setGender(temp);
        }
    }
}
