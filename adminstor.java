package abc;

public class adminstor extends person{
	
	public adminstor(String name,int age) {
		super(name,age);
	}
	public void show() {
	System.out.println("管理者的姓名是"+getName()+"年龄是"+getAge());
	}
}
