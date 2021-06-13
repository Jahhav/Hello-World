class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int a = 6, b = 17;
        int days = 85;
        int allDays = 17 * 7;
        int allHours = allDays * a;

        System.out.println(17 * 5);
        System.out.println(days * a);

        int tyden = 6 * 7;
        int weeklyHours = 52;


        System.out.println(tyden);
        System.out.println("All Hours: " + allHours);

        int per = weeklyHours / tyden;
        int zby = weeklyHours % tyden;
        System.out.println(per + zby);







    }




}