public class LeapYear {

    /* sprawdz czy dany rok jest przestepny */
    private static boolean leap(int year)
    {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    /* pobierz dane od uzytkownika */
    public static void main(String[] args) {
        int year;
        year = 2020;

        if (leap(year)){
            System.out.println("Podany rok jest przestepny.");
        }
        else {
            System.out.println("Podany rok nie jest przestepny.");
        }
    }
}