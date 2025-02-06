public class Main {

    public static void main(String[] args) {

        Graphy graphy = new Graphy();

       Queuey queuey = new Queuey();
       queuey.enqueue("Aragorn");
       queuey.enqueue("Arwen");
       queuey.enqueue("Bilbo");
       System.out.println(queuey.toString());
       System.out.println("dequeue: " + queuey.dequeue());
       System.out.println();

        String[] testdata = {"Aragorn", "Arwen", "Bilbo", "Boromir", "Celeborn", "Denethor", "Éomer", "Éowyn", "Faramir", "Galadriel", "Galandriel", "Gimli", "Gandalf", "Glorfindel","Gollum", "Legolas", "Merry", "Pippin", "Radagast", "Sam", "Saruman", "Théoden", "Tom"};
        String[] sortedData = {"Aragorn", "Arwen", "Bilbo", "Boromir", "Celeborn", "Denethor", "Éomer", "Éowyn", "Faramir", "Galadriel", "Galandriel", "Gimli", "Gandalf", "Glorfindel", "Gollum", "Legolas", "Merry", "Pippin", "Radagast", "Sam", "Saruman", "Théoden", "Tom"};

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int today = 3;

        int daysAhead = 365;

        int fututeDayIndex = (today + daysAhead) % 7;

        if (fututeDayIndex < 0) {
            fututeDayIndex += 7;
        }

        System.out.printf("Om %d dagar är det %s\n", daysAhead, weekDays [fututeDayIndex]);



        Stacky stacky = new Stacky(5);
        stacky.push("Frodo");
        stacky.push("Boromir");
        stacky.push("Celeborn");
        stacky.push("Legolas");
        stacky.push("Gimli");
        System.out.println(stacky.toString());


        Person Aragorn = new Person(testdata[0]);
        Person Arwen = new Person(testdata[1]);
        Person Bilbo = new Person(testdata[2]);
        Person Boromir = new Person(testdata[3]);

        Linky linky = new Linky();
        linky.add(Aragorn);
        linky.add(Arwen);
        linky.add(Bilbo);
        linky.add(Boromir);

        System.out.println(linky.toString());
        System.out.println("Linky has " + linky.size() + " nodes");


    }
}
