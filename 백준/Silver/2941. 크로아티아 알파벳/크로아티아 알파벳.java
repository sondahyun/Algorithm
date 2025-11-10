import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            // 기본형에서는 equals 사용 불가능
            if (s.charAt(i) == 'c') {
                if (i+1 != s.length() && s.charAt(i+1) == '-') {
                    count++;
                    i++;
                    continue;
                } else if (i+1 != s.length() && s.charAt(i+1) == '=') {
                    count++;
                    i++;
                    continue;
                }
                count++;
            } else if (s.charAt(i) == 'd') {
                if (i+1 != s.length() && s.charAt(i+1) == 'z') {
                    if (i+2 != s.length() && s.charAt(i+2) == '=') {
                        i += 2;
                        count++;
                        continue;
                    } else {
                        count++;
                        continue;
                    }
                } else if (i+1 != s.length() && s.charAt(i+1) == '-') {
                    i++;
                    count++;
                    continue;
                }
                count++;
            } else if (s.charAt(i) == 'l') {
                if (i+1 != s.length() && s.charAt(i+1) == 'j') {
                    count++;
                    i++;
                    continue;
                }
                count++;
            } else if (s.charAt(i) == 'n') {
                if (i+1 != s.length() && s.charAt(i+1) == 'j') {
                    count++;
                    i++;
                    continue;
                }
                count++;
            } else if (s.charAt(i) == 's') {
                if (i+1 != s.length() && s.charAt(i+1) == '=') {
                    count++;
                    i++;
                    continue;
                }
                count++;
            } else if (s.charAt(i) == 'z') {
                if (i+1 != s.length() && s.charAt(i+1) == '=') {
                    count++;
                    i++;
                    continue;
                }
                count++;
            } else {
                count++;
            }
        }
        System.out.println(count);

    }
}