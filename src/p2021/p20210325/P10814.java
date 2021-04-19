package p2021.p20210325;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P10814 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        User[] users = new User[n];

        for (int i = 0; i < n; i++) {
            users[i] = new User(sc.nextInt(), i, sc.next());
        }

        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                if (u1.getAge() == u2.getAge()) {
                    // 나이가 같으면 입력순서 오름차순정렬
                    return u1.getIdx() - u2.getIdx();
                } else {
                    // 나이가 다르면 나이 오름차순 정렬
                    return u1.getAge() - u2.getAge();
                }
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.print(users[i].getAge() + " ");
            System.out.println(users[i].getName());
        }
    }

    static class User {
        private int age;
        private int idx;
        private String name;

        public User(int age, int idx, String name) {
            this.age = age;
            this.idx = idx;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public int getIdx() {
            return idx;
        }

        public String getName() {
            return name;
        }
    }
}