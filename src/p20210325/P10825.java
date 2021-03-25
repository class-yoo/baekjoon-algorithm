package p20210325;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P10825 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getKor() == s2.getKor()) {
                    if (s1.getEng() == s2.getEng()) {
                        if (s1.getMath() == s2.getMath()) {
                            return s1.getName().compareTo(s2.getName());
                        } else {
                            return s2.getMath() - s1.getMath();
                        }
                    } else {
                        return s1.getEng() - s2.getEng();
                    }
                } else {
                    // s1:30, s2:40 => 30 - 40 = -10 오름차순 >> s1, s2
                    // s1:30, s2:40 => 40 - 30 =  10 내림차순 >> s2, s1 양수면 뒤, 앞 정렬
                    // 음수면 앞, 뒤 정렬 | 양수면 뒤, 앞 정렬
                    return s2.getKor() - s1.getKor(); // 양수면 내림차순 뒤에서 앞에꺼 뺌
                }
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(students[i].getName());
        }
    }

    static class Student {
        private String name;
        private int kor;
        private int eng;
        private int math;

        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        public String getName() {
            return name;
        }

        public int getKor() {
            return kor;
        }

        public int getEng() {
            return eng;
        }

        public int getMath() {
            return math;
        }
    }
}