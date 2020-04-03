package OOPS;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element.toString().equals("###")) //Hints: use instanceof operator
                break;
        }
        return it;

    }

    @SuppressWarnings({"unchecked"})
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
/*        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }
        sc.close();*/
        mylist.add(2);
        mylist.add(12);
        mylist.add("###");
        mylist.add("JAVA");
        mylist.add("GOOD");


        Iterator it = func(mylist);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}
