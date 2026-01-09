import java.util.ArrayList;  
// ArrayList class import ki, jisse dynamic list use kar sake

public class ArrayListTwo {
    public static void main(String[] args) {

        // Integer type ki ArrayList banayi
        // (7) sirf initial capacity hai, size nahi
        ArrayList<Integer> List = new ArrayList<>(7);

        // Elements add kiye (index, value)
        List.add(0, 10);
        List.add(1, 20);
        List.add(2, 30);
        List.add(3, 60);
        List.add(4, 40);

        // ❌ YAHAN MISTAKE THI PEHLE
        // args.length = 0 hota hai (koi command line argument nahi)
        // Isliye loop nahi chal raha tha

        // ✅ Sahi: ArrayList ke liye size() use hota hai
        for (int i = 0; i < List.size(); i++) {
            // get(i) se i index ka element milta hai
            System.out.print(List.get(i) + " ");
        }

        System.out.println(); // next line ke liye

        // index 2 par value update ki (30 → 300)
        List.set(2, 300);

        // dubara list print kar rahe hain
        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(i) + " ");
        }

        System.out.println();
    }
}
