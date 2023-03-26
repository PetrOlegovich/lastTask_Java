public class Persons {
    String firstName;

    String lastName;
    String age;
    String gender;

    String child;
    String city;


    public Persons(String personFirstName, String personLastName,
                   String personAge, String personGender, String personChild,
                   String personCity){
        firstName = personFirstName;
        lastName = personLastName;
        age = personAge;
        gender = personGender;
        child = personChild;
        city = personCity;
    }


    public void printOnDisplay(){
        System.out.println(" Имя: "+ firstName+ " Фамилия: " + lastName
                + " Возраст: "+ age +" Пол: "+ gender+ " Дети: " +child
                + " Город: " +city);
    }
    @Override
    public String toString(){
        return String.format("%s %s, %s лет, Пол: %s, Дети: %s, Город: %s", firstName,lastName, age, gender, child, city);
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Persons)){
            return false;
        }

        Persons anotherPerson = (Persons) obj;
        return firstName.equals(anotherPerson.firstName) && age == anotherPerson.age;

    }
    @Override
    public int hashCode() {
        Object[] m = { firstName, lastName, age, gender, child, city };
        int res = 1;
        for (Object x : m) {
            res = 31 * res + x.hashCode();
        }
        return res;
    }

}
