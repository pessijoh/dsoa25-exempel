public class Main {

    public static void main(String[] args) {
        String[] sortedData = {
                "Aragorn", "Arwen", "Bilbo", "Boromir", "Celeborn", "Denethor", "Éomer", "Éowyn",
                "Faramir", "Galadriel", "Galandriel", "Gimli", "Gandalf", "Glorfindel", "Gollum",
                "Legolas", "Merry", "Pippin", "Radagast", "Sam", "Saruman", "Théoden", "Tom"};

        Person p1 = new Person(sortedData[0]);
        Person p2 = new Person(sortedData[1], p1);
        Person p3 = new Person(sortedData[2], p2);
        Person p4 = new Person(sortedData[3], p3);


        Person current = p4;
        while(current != null) {
            System.out.println(current.getName());
            current = current.next;
        }



        StringArray names = new StringArray(sortedData);


        names.add("Gollum");
        System.out.println(names.toString());

        names.reverse();
        System.out.println(names.toString());



        System.exit(0);
    }
}
