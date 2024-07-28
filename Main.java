import java.util.Scanner;
//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/>
public class Main {
    public static void main(String[] args) {
        System.out.println("------------通用式增删改查系统------------");
        System.out.println("1 添加客户");
        System.out.println("2 修改客户");
        System.out.println("3 删除客户");
        System.out.println("4 客户列表");
        System.out.println("5 退出");
        sc sc1 = new sc();
        sc1.choice();
    }
}