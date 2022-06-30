public class PolymorphicProcessing {

    public static void main(String[] args) {
        // Пересвідчимось, що кожен представник класу Human має метод sleep
        new Human().sleep();
        new Journalist().sleep();
        new Teacher().sleep();
        new GeographyTeacher().sleep();

        // Пересвідчимось, що кожен нащадок класу Human може бути переданий в процедуру, яка працює з об'єктами типу Human
        letPeopleThink(new Human());
        letPeopleThink(new Journalist());
        letPeopleThink(new Teacher());
        letPeopleThink(new GeographyTeacher());

        // Пересвідчимось, які об'єкти можуть бути передані в процедуру, яка працює з об'єктами типу Teacher
//        teach(new Human());
//        teach(new Journalist());
        teach(new Teacher());
        teach(new GeographyTeacher());
    }

    public static void letPeopleThink(Human human) {
        human.think();
    }

    public static void teach(Teacher teacher) {
        teacher.teach();
    }
}
