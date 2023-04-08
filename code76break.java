package code;
import java.util.Scanner;
public class code76break {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		   String name="";
	        String pass="";
	        for (int i=1;i<=3;i++){
	            System.out.println("请输入名字");
	            name=sc.nextLine();
	            System.out.println("请输入密码");
	            pass=sc.nextLine();
	            if ("丁真".equals(name)&&"666".equals(pass)){
	                System.out.println("登录成功");
	                break;
	            }else {
	                System.out.println("登录失败,还有"+(3-i)+"次机会,请重新输入");
	            }
	        }
	        System.out.println("登录成功");
		
	}
}
