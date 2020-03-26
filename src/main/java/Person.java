import java.time.LocalDate;
import java.util.List;

public class Person implements CheckPerson{

    private static boolean getGender;

    public void printPerson() {
    }

    public enum Gender {MALE, FEMALE, CISGENDER, CISHET, NONBINARY, TRANSGENDER}


    private String name;
    private int age;
    private String gender;
    private int cellNumber;


    public Person(String name, LocalDate birthday, String gender, int cellNumber, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.cellNumber = cellNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public int getAge() {return age;}

    public static void printMembers(List<Person> roster, String gender) {
        for (Person p : roster) {
            if (Person.getGender) ;
        }
    }

        public void match(){
            System.out.printf("Name:  ," + name + " " + gender);
        }

        public boolean test(Person p) {
            if(p.getAge() > 35 && p.gender.equals(Gender.MALE)) {
                return true;
            }
                return false;
        }
    }



