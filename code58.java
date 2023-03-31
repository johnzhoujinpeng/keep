package code;

import java.util.Scanner;

public class code58 {
	
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个成绩");
    double grade = sc.nextDouble();

    if (grade>8.0){
        System.out.println("进入决赛");
        System.out.println("请输入性别");
        char gender=sc.next().charAt(0);

        if (gender=='男'){
            System.out.println("进入男子组");
        }else if (gender=='女'){
            System.out.println("进入女子组");
        }else System.out.println("输入性别错误,请重新输入");

    }else System.out.println("淘汰");


		
		
		
}
	}


