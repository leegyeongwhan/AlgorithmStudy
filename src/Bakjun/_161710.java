package Bakjun;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _161710 {
     public static void main(String[] args) {
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
            SimpleDateFormat sdf2= new SimpleDateFormat("MM");
            SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
            Date date  = new Date();
            System.out.println(sdf1.format(date));
            System.out.println(sdf2.format(date));
            System.out.println(sdf3.format(date));
        }


}
