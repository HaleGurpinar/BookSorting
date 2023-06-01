package com.patika.LeagueTable;

import java.util.ArrayList;
import java.util.Scanner;

public class League {

    private String team;

    ArrayList<String> teams= new ArrayList<>();
    ArrayList<String> firstHalfFixture= new ArrayList<>();
    ArrayList<String> secondHalfFixture= new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();

    public League() {
    }

    public League(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void generateFixture() {
        System.out.println("-------------------Super League--------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teams number");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter team name");
            String t = sc.next();
            teams.add(t.toUpperCase());
        }
   /*for (String s: teams){
       System.out.println(s);
   }*/
        if (n % 2 != 0) {
            teams.add("BAY");
        }
        for (String t : teams) {
            System.out.println(t);
        }
        try {
            int round = 1;
            while (round >= 2 * (teams.size() - 1)) {
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
        }catch (Exception e ){
            System.out.println("Error Received !!!");
        }


        System.out.println("end");

    }

}
