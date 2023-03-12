package JEP361_SwitchExpressions;

public class JEP354_preview_JEP361_inJava14 {

    public static void main(String[] args){
        enum Week{
            MONDAY, TUESDAY, WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
        }

        Week day = Week.SATURDAY;
        var response = switch (day){
            case MONDAY, TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> "Attendance Required";
            case SATURDAY,SUNDAY -> {
                String message = "No Attendance";
                yield message+".Its Holiday";
            }
            default -> new IllegalArgumentException();
        };
        System.out.println(response);
}
}
