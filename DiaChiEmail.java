import java.util.*;

public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine(); // Đọc dòng mới sau số lượng test cases

        Map<String, Integer> emailCount = new HashMap<>();
        List<String> emails = new ArrayList<>();

        while (t-- > 0) {
            String s = in.nextLine().trim();
            String[] a = s.split("\\s+");
            StringBuilder res = new StringBuilder();
            String lastElement = a[a.length - 1].toLowerCase();
            res.append(lastElement);

            // Thêm ký tự đầu tiên của mỗi phần trước phần tử cuối cùng
            for (int i = 0; i < a.length - 1; i++) {
                res.append(a[i].substring(0, 1).toLowerCase());
            }

            String baseEmail = res.toString() + "@ptit.edu.vn";
            int count = emailCount.getOrDefault(baseEmail, 0);

            String email;
            if (count > 0) {
                email = res.toString() + (count + 1) + "@ptit.edu.vn";
            } else {
                email = baseEmail;
            }

            emailCount.put(baseEmail, count + 1);
            emails.add(email);
        }

        // In các email đã được tạo ra
        for (String email : emails) {
            System.out.println(email);
        }

        in.close(); // Đóng Scanner sau khi hoàn tất
    }
}