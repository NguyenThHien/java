import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class LietKeTheoThuTuXuatHien {
    public static void main(String[] args) {
        try {
            // Đọc file nhị phân NHIPHAN.in
            ObjectInputStream myObj = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
            ArrayList<String> list = (ArrayList<String>) myObj.readObject();
            HashSet<String> set1 = new HashSet<>();

            // Tách từ và thêm vào set1
            for (String w : list) {
                String[] words = w.toLowerCase().split("\\s+");
                set1.addAll(Arrays.asList(words));
            }
            myObj.close();

            // Đọc file văn bản VANBAN.in
            Scanner myRe = new Scanner(new File("VANBAN.in"));
            LinkedHashSet<String> resultSet = new LinkedHashSet<>();

            // Lưu trữ các từ xuất hiện trong VANBAN.in và kiểm tra
            while (myRe.hasNext()) {
                String s = myRe.next().toLowerCase();
                if (set1.contains(s)) {
                    resultSet.add(s); // Sử dụng LinkedHashSet để giữ thứ tự
                }
            }
            myRe.close();

            // In ra kết quả
            for (String word : resultSet) {
                System.out.println(word);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}