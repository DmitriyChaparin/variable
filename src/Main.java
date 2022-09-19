public class Main {
    public static void main(String[] args) {
        double dog = 8;
        dog = dog + 4;
        dog = dog - 3.5;
                System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(paper );
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        System.out.println( boxerFirst + boxerSecond );
        var weightDifference = boxerSecond - boxerFirst;
        System.out.println( "Разница между весами бойцов " + weightDifference + " кг" );
        var weightDifference2 = boxerSecond % boxerFirst;
        System.out.println( "Разница между весами бойцов " + weightDifference2 + " кг" );

var totalTime = 640;
var workingTime = 8;
var amountWorkers = totalTime / workingTime;
System.out.println("Всего работнков в компании " + amountWorkers + " человек");
amountWorkers = amountWorkers + 94;
var totalTime2 = amountWorkers * 8;
System.out.println( "Если в компании работает " + amountWorkers + " человек, то всего " + totalTime2 + " часов работы может быть поделено между сотрудниками"  );


    }
}