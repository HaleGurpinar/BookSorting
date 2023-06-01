package com.patika.LeagueTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        ArrayList<String> firstHalfFixture = new ArrayList<>();
        ArrayList<String> secondHalfFixture = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        List<String> teams = new ArrayList<>();
        System.out.println("-------------------Super League--------------------");

        int n=0;
        try {
            System.out.println("Enter number of teams : ");
             n = sc.nextInt();
        }catch (Exception e){
            System.out.println("Please Enter of number !!!");
        }
        try{
            for (int i = 0; i < n; i++) {
                System.out.println("Enter team name : ");
                String t = sc.next();
                teams.add(t.toUpperCase());
            }

            if (n % 2 != 0) {
                teams.add("BAY");
            }
        }catch (Exception e) {
            System.out.println("You Entered Wrong Value !!!!");
        }
        if (teams.size() != 0) {

            System.out.println("The Teams\n");

            for (String t : teams) {
            System.out.println(t);
        }
            System.out.println("#######################################");
        } else {
            System.out.println("Enter the number of teams to play !!!");
        }
        try {
            int round = 1;
            while (round <= 2 * (teams.size() - 1)) {
                System.out.println("Round " + round);

                for (int i = 0; i < teams.size() / 2; i++) {
                    int home = (int) (Math.random() * teams.size());
                    while (list.contains(home)) {
                        home = (int) (Math.random() * teams.size());
                    }
                    int away = (int) ((Math.random() * teams.size()));
                    while (away == home || list.contains(away)) {
                        away = (int) ((Math.random() * teams.size()));
                    }

                    String fiksComb = home + "" + away;

                    while (firstHalfFixture.contains(fiksComb)) {
                        home = (int) ((Math.random() * teams.size()));

                        while (list.contains(home)) {
                            home = (int) ((Math.random() * teams.size()));
                        }

                        away = (int) ((Math.random() * teams.size()));

                        while (away == home || list.contains(away)) {
                            away = (int) ((Math.random() * teams.size()));
                        }
                        fiksComb = home + "" + away;
                    }
                    list.add(home);
                    list.add(away);
                    firstHalfFixture.add(fiksComb);
                    String match = teams.get(home) + " VS " + teams.get(away);
                    secondHalfFixture.add(match);
                }
                for (Object l : secondHalfFixture) {
                    System.out.println(l);
                }


                System.out.println("------------------");
                list.clear();
                secondHalfFixture.clear();
                round++;
            }
        } catch (Exception e) {
            System.out.println("Error Received !!!");
        }


        System.out.println("end");

    }


}
