import com.wlc.basicStudy.CountOperate;
import com.wlc.basicStudy.Student;

public class Run {
    public static void main(String[] args) {
//        Student student = new Student();
//
//        CountOperate c = new CountOperate();
//        Thread t1 = new Thread(c);
//        System.out.println(t1.getName());
//        t1.setName("a");
//        t1.start();
//        System.out.println("main " + System.currentTimeMillis());
//        try {
//            t1.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("main " + System.currentTimeMillis());

        CountOperate c = new CountOperate();
        c.start();
        c.interrupt();
//        Thread.currentThread().interrupt();
        System.out.println(c.isInterrupted());
        System.out.println(c.isInterrupted());
    }
}
