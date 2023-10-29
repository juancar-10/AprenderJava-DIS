package org.example;

public class Team {
    Member member;

    public  Team(){
        Member myMember = new Member("Juan Carlos", "light", 10, 1);
        Team myTeam = new Team(myMember);
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
