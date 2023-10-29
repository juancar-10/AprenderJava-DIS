package org.example;

public class Team {
    Member member = new Member("Pepito", "dark", 11, 2);

    public  Team(){
        //Member member1 = new Member("Juan Carlos", "light", 10, 1);
        //Team myTeam = new Team(member1);
        Team myTeam = new Team(member);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());
    }
    public Team(Member member){
        this.member = member;
    }
     /*public  static void main(){

     }*/
}
