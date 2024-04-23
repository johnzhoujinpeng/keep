package abc;

public class emptets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		manager m=new manager("张三",23,"1000",2000);
		m.work();
		m.eat();
		System.out.println(m.getName()+m.getAge()+m.getSales()+m.getBonus());
		cook c=new cook("李四",25,"500");
		c.work();
		c.eat();

		System.out.println(c.getName()+c.getAge()+c.getSales());
		
//		sdsdsd
	}

}

