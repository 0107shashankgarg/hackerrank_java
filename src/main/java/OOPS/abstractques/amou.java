package OOPS.abstractques;

public class amou {
    public int amount;

    public amou(int amount) {
        this.amount = amount;

    }

    public static void main(String[] args) {
        amou acct = new amou((int) (Math.random() * 1000));
        acct.changeAmount(-acct.getAmount());
        System.out.println(acct.getAmount());


        String[][] shirt = new String[2][2];
        shirt[0][0] = "red";
        shirt[0][1] = "blue";
        shirt[1][0] = "samll";
        shirt[1][1] = "maedium";

        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {

                System.out.println(shirt[i][j] + ":");
            }

        }

        int[] a = {1, 2, 3};
        System.out.println(a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println(acct.manuplate("1234-5678-4346-4655"));
        // System.out.println(sb.substring(15 ,19));
    }

    public int getAmount() {
        return amount;
    }

    public void changeAmount(int amount) {
        amount += amount;
    }

    public String manuplate(String cre) {

        String x = "XXXX-XXXX-XXXX-";
        StringBuilder sb = new StringBuilder(cre);
        StringBuilder s = sb.insert(0, x);

        return s.toString();
    }


}