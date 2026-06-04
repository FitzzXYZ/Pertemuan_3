import java.util.*;

public class Mahasiswa {
    public static void main(String[] args) {
        List<String> dataList = new ArrayList<>();
        dataList.add("Joko");
        dataList.add("Budi");
        dataList.add("Rina");

        dataList.remove("Budi");

        System.out.println("Data List: " + dataList);
        // Set
        Set<String> dataSet1 = new HashSet<>();
        dataSet1.add("Joko");
        dataSet1.add("Budi");
        dataSet1.add("Miya");
        dataSet1.add("Rina");
        dataSet1.add("Rina");


        System.out.println("Data Set: " + dataSet1);

        Set<String> dataSet2 = new TreeSet<>();
        dataSet2.add("Joko");
        dataSet2.add("Budi");
        dataSet2.add("Miya");
        dataSet2.add("Rina");
        dataSet2.add("Rina");
        System.out.println("Data Set: " + dataSet2);

        Map<String,Integer> StokBuah = new HashMap<>();
        StokBuah.put("Apel", 50);
        StokBuah.put("Mangga", 100);

        StokBuah.remove("Apel");

        System.out.printf("Stock Apel= " + StokBuah.get("Apel"));
        System.out.printf("Stock Mangga= " + StokBuah.get("Mangga"));

    }
}