package introconstructors;
// Tili-toli-Task

public class TaskMain {

    public static void main(String[] args) {
        Task task = new Task("Tili-toli hülyeség projekt", "Értelme nulla, de csináljuk! Vegye el az időt a lényegtől.");

        System.out.println("Cím > " + task.getTitle());
        System.out.println("Leírás > " + task.getDescription());

        task.start();
        task.setDuration(5);

        System.out.println("Kezdés időpontja: "
                + task.getStartDateTime()
                + ", időtartama: "
                + task.getDuration()
                + " perc a befejezésig.");
    }
}