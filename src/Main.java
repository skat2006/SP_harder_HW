public class Main {
    private static final Lesson_1_3 tasks3 = new Lesson_1_3();
    private static final Lesson_1_4 tasks4 = new Lesson_1_4();

    public static void main(String[] args) {
        //тема 1.3
        System.out.println(tasks3.task6(25,50_000));
        System.out.println(tasks3.task7(25,60_000, 330_000));

        //тема 1.4
        tasks4.task4();
        tasks4.task5();
    }
}