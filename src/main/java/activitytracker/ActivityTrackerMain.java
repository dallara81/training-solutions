package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.List;

public class ActivityTrackerMain {

    private static final String NAME_AND_PW = "activitytracker";

    public static void main(String[] args) {

        ActivityDao dao = new ActivityDao(createDataSource());
        for (Activity activity : createActivities()) {
            dao.saveActivity(activity);
        }
        List<Activity> activities = dao.listActivities();
        for (Activity activity : activities) {
            System.out.println(activity);
        }

    }

    private static MariaDbDataSource createDataSource() {

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser(NAME_AND_PW);
            dataSource.setPassword(NAME_AND_PW);
            return dataSource;
        } catch (SQLException se) {
            throw new IllegalStateException("Nem tudok csatlakozni az adatbázishoz!", se);
        }

    }

    private static List<Activity> createActivities() {

        Activity activity1 = new Activity(LocalDateTime.parse("2021-02-01T13:08"),
                "Menekülés a rendőrök elől", ActivityType.RUNNING);
        Activity activity2 = new Activity(LocalDateTime.parse("2021-02-02T14:52"),
                "Félmaraton", ActivityType.RUNNING);
        Activity activity3 = new Activity(LocalDateTime.parse("2021-02-03T15:47"),
                "Aktivitás-típus 3", ActivityType.HIKING);
        Activity activity4 = new Activity(LocalDateTime.parse("2021-02-04T16:31"),
                "Balatoni kör", ActivityType.BIKING);
        Activity activity5 = new Activity(LocalDateTime.parse("2021-02-05T17:29"),
                "Hazaérni a kijárási tilalom előtt", ActivityType.RUNNING);
        Activity activity6 = new Activity(LocalDateTime.parse("2021-02-06T08:43"),
                "Lerúgni egy karácsony nevű kerékpárost kerékpározás közben", ActivityType.BIKING);
        Activity activity7 = new Activity(LocalDateTime.parse("2021-02-07T09:15"),
                "Már megint csak futni a renrődök elől", ActivityType.RUNNING);
        Activity activity8 = new Activity(LocalDateTime.parse("2021-02-08T10:24"),
                "Fejbekúrni egy möszme barmot egy kosárlabdával", ActivityType.BASKETBALL);
        Activity activity9 = new Activity(LocalDateTime.parse("2021-02-09T11:56"),
                "Elfutni a böszme barom koromsötét haverjai elől", ActivityType.RUNNING);

        return List.of(activity1, activity2, activity3, activity4, activity5, activity6, activity7, activity8, activity9);

    }

}