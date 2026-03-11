/**
 * OOPSBannerApp - UC6: Modularization with Static Functions
 */
public class OOPSBannerApp {

    public static String[] getO() {
        return new String[]{
            " ******* ",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            " ******* "
        };
    }

    public static String[] getP() {
        return new String[]{
            "*******  ",
            "*      * ",
            "*      * ",
            "*******  ",
            "*        ",
            "*        ",
            "*        "
        };
    }

    public static String[] getS() {
        return new String[]{
            " ********",
            "*        ",
            "*        ",
            " ********",
            "        *",
            "        *",
            "******** "
        };
    }

    public static void main(String[] args) {
        String[][] banner = { getO(), getO(), getP(), getS() };

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < banner.length; j++) {
                System.out.print(banner[j][i] + "  ");
            }
            System.out.println();
        }
    }
}