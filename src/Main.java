public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание 3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        System.out.println(dog1);
        var cat1 = 3.6 ;
        cat1 = cat1 - 1.6;
        System.out.println(cat1);
        var paper1 = 763789;
        paper1 = paper1 - 7639;
        System.out.println(paper1);

        System.out.println("Задание 4");
        var friend = 19;
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);

        System.out.println("Задание 6");
        var box1 = 78.2;
        var box2 = 82.7;
        var totalweight = box1 + box2;
        System.out.println(" Общий вес бойцов " + totalweight +" кг");

        System.out.println("Задание 7");
        var difference = box2 - box1;
        System.out.println(" Разница в весе между бойцами " + difference + " кг ");

        System.out.println("Задание 8");
        var hour = 640;
        hour = hour / 8;
        System.out.println(" Всего работников в компании " + hour + " человек " );
        var worker = 80;
        var hour1 = 640;
        worker = worker + 94;
        var openinghours = hour1 / worker;
        System.out.println(" Если в компании работает " + worker + " человек, то всего " + openinghours + " часов работы может быть поделено между сотрудниками " );


    }
}