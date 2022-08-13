public class Puppy{
	int puppyAge;	// 成员变量
	public Puppy(String name) {	// 构造方法
		System.out.println("小狗的名字是" + name);
	}
	
	public void setAge(int age) {	// 设置数据
		puppyAge = age;
	}
	public int getAge() {
		System.out.println("小狗的年龄是" + puppyAge);
		return puppyAge;
	}
	
//	public static void main(String[] args) {
//		Puppy myPuppy = new Puppy("toffy");
//		myPuppy.setAge(5);
//		System.out.println(myPuppy.getAge());
//	}
}