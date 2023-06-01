package com.patika.LeagueTable;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class League {

    private String team;

    ArrayList<String> teams= new ArrayList<>();
    ArrayList<String> firstHalfFixture= new ArrayList<>();
    ArrayList<String> secondHalfFixture= new ArrayList<>();

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

    public void generateFixture(){
        System.out.println("-------------------Super League--------------------");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter teams number");
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Enter team name");
            String t=sc.next();
            teams.add(t.toUpperCase());
        }
   /*for (String s: teams){
       System.out.println(s);
   }*/
        if(n%2!=0){
            teams.add("BAY");
        }
       /* for (String s: teams){
            System.out.println(s);
        }*/
    }

}
