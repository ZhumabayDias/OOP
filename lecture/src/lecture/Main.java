package lecture;
	class MyClass {
	    int value;
	}

	public class Main {
	    public static void reassignObject(MyClass obj) {
	        obj = new MyClass(); // Создаем новый объект
	        obj.value = 20; // Изменяем значение поля нового объекта
	    }

	    public static void main(String[] args) {
	        MyClass myObj = new MyClass();
	        myObj.value = 5;

	        reassignObject(myObj);

	        System.out.println(); // Выведет 5, так как исходный объект не изменился
	    }
	}

