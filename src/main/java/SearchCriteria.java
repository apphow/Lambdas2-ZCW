import java.util.List;

public class SearchCriteria  {

        public static void printPersonOlderThan(List<Person> roster, int age) {
            for (Person p : roster) {
                if (p.getAge() >= age) {
                    p.printPerson();
                }
            }
        }

        public static void printPersonWithinRange(List<Person> roster, int low, int high) {
            for (Person p: roster) {
                if (low <= p.getAge() && p.getAge() < high) {
                    p.printPerson();
                }
            }
        }

        public static void printPersons(List<Person> people, CheckPerson tester) {
            for(Person p : people) {
                if (tester.test(p)) {
                    p.match();
                }
            }
        }
    }
