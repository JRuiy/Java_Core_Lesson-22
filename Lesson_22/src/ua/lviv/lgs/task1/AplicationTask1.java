package ua.lviv.lgs.task1;

public class AplicationTask1 {

	public static void main(String[] args) {
		
		Cat cat = new Cat("� ��- �����-�����");
		Cow cow = new Cow("� ������- ����-����");
		Dog dog = new Dog("� ��� - �����-�����");
		
		Pet p1 = messege -> System.out.println(messege);
		
		p1.voice(cat.say);
		p1.voice(cow.say);
		p1.voice(dog.say);
		
	}
	
	
}
