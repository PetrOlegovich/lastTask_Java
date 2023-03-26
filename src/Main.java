import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Persons> massPers = new ArrayList<>();

        Persons person1 = new Persons( "Витя", "Адександров","35","муж","да","Уфа");
        Persons person2 = new Persons( "Лена", "Головач","175","жен","нет","Зурбаган");
        Persons person3 = new Persons( "Гравий", "Трубецкой","13","муж","нет","Катманду");
        Persons person4 = new Persons( "Виалетта", "Сыроварова","45","жен","да","Учкудук");
        Persons person5 = new Persons( "Лена", "Иглатенко","17","жен","нет","СтранаОЗ");

        massPers.add(person1);
        massPers.add(person2);
        massPers.add(person3);
        massPers.add(person4);
        massPers.add(person5);

        for (Persons person : massPers) {
            if (Integer.parseInt(person.age) > 20) {

                System.out.print("Больше 20 лет :    ");
                System.out.println(person);

            }


        }
        System.out.println();
        System.out.println(person2 == person5 );
        System.out.println(person2.equals(person5));
        System.out.println(person2.firstName == person5.firstName);

        System.out.println();
        System.out.println(person2.hashCode());
        System.out.println(person5.hashCode());
    }
}