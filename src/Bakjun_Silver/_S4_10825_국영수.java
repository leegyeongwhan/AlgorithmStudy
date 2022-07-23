package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _S4_10825_국영수 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Student student = null;
        List<Student> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            student = new Student(st.nextToken(), Integer.parseInt(st.nextToken())
                    , Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            list.add(student);
        }

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //국어점수가 클때
                if (o1.kor < o2.kor) {
                    return 1;
                } else if (o1.kor == o2.kor) {
                    if (o1.eng > o2.eng) {
                        return 1;
                    } else if (o1.eng == o2.eng) {
                        if (o1.math < o2.math) {
                            return 1;
                        } else if (o1.math == o2.math) {
                            return o1.name.compareTo(o2.name);
                        }
                    }
                }
                return -1;
            }
        };
        Collections.sort(list, comparator);
        for (Student student1 : list) {
            System.out.println(student1.name);
        }
    }
}

class Student {
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }


}
