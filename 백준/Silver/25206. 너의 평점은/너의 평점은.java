import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        double totalPoints = 0.0; // (학점 × 과목평점)의 합
        double totalCredits = 0.0; // 학점 총합
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken(); // 과목명 무시
            double credit = Double.parseDouble(st.nextToken()); // 학점
            String grade = st.nextToken(); // 등급
            
            if (grade.equals("P")) continue; // P 등급 제외
            
            double point = getGradePoint(grade);
            totalPoints += credit * point;
            totalCredits += credit;
        }
        System.out.println(totalPoints / totalCredits);
    }

    public static double getGradePoint(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            default:
                return 0.0;
        }
    }
}