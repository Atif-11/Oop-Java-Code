package com.university;

import java.util.Arrays;
import java.util.Scanner;

public class VoteRecorder {
    public static String nameCandidatePresident1;
    public static String nameCandidatePresident2;
    public static String nameCandidateVicePresident1;
    public static String nameCandidateVicePresident2;
    public static int votesCandidatePresident1;
    public static int votesCandidatePresident2;
    public static int votesCandidateVicePresident1;
    public static int votesCandidateVicePresident2;

    private enum MyVoteForPresident { NO_VOTE, VOTE_FOR_PRESIDENT_1, VOTE_FOR_PRESIDENT_2 }
    private enum MyVoteForVicePresident{ NO_VOTE, VOTE_FOR_VICE_PRESIDENT_1, VOTE_FOR_VICE_PRESIDENT_2 }

    public void setCandidatesPresident(String name_1, String name_2){
        nameCandidatePresident1 = name_1;
        nameCandidatePresident2 = name_2;
    }
    public void setCandidatesVicePresident(String name_1, String name_2){
        nameCandidateVicePresident1 = name_1;
        nameCandidateVicePresident2 = name_2;
    }
    public static void resetVotes(){
        votesCandidatePresident1 = 0;
        votesCandidatePresident2 = 0;
        votesCandidateVicePresident1 = 0;
        votesCandidateVicePresident2 = 0;
        System.out.println("\nAll votes have been reset to zero");
    }
    public static String getCurrentVotePresident(){
        String votes;
        votes = String.format("\nThe total number of votes casted for both presidents are %d",votesCandidatePresident1+votesCandidatePresident2);
        return votes;
    }
    public static String getCurrentVoteVicePresident(){
        String votes;
        votes = String.format("\nThe total number of votes casted for both vice presidents are %d",votesCandidateVicePresident1+votesCandidateVicePresident2);
        return votes;
    }
    MyVoteForPresident status ;
    MyVoteForVicePresident status1;
    private static final int Num0 = 0;
    private static final int Num1 = 1;
    private static final int Num2 = 2;

    public void usingEnum(int vote,int vote1){
        switch (vote) {
            case Num1 -> {
                votesCandidatePresident1++;
                status = MyVoteForPresident.VOTE_FOR_PRESIDENT_1;
            }
            case Num2 -> {
                votesCandidatePresident2++;
                status = MyVoteForPresident.VOTE_FOR_PRESIDENT_2;
            }
            case Num0 -> status = MyVoteForPresident.NO_VOTE;
        }
        switch (vote1) {
            case Num1 -> {
                votesCandidateVicePresident1++;
                status1 = MyVoteForVicePresident.VOTE_FOR_VICE_PRESIDENT_1;
            }
            case Num2 -> {
                votesCandidateVicePresident2++;
                status1 = MyVoteForVicePresident.VOTE_FOR_VICE_PRESIDENT_2;
            }
            case Num0 -> status1 = MyVoteForVicePresident.NO_VOTE;
        }
    }
    int vote,vote1;
    public void getAndConfirmVotes() {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
            System.out.println("Please enter the number of candidate for President you want to vote:");
            System.out.printf("0. No Vote \n1. %s\n2. %S\n", nameCandidatePresident1, nameCandidatePresident2);
            vote = sc.nextInt();
            System.out.println("Please enter the number of candidate for VicePresident you want to vote:");
            System.out.printf("0. No Vote \n1. %s\n2. %s\n", nameCandidateVicePresident1, nameCandidateVicePresident2);
            vote1 = sc.nextInt();
            System.out.printf("Please enter 'YES' if these are the correct numbers of candidates you have voted for:\nPresident: %s\nVice President: %s\nEnter 'NO' if you want to change your choice\n ", vote, vote1);
        String confirm = s.nextLine();
            if(confirm.equals("YES")){
                //Recording of Votes
                usingEnum(vote,vote1);
            }
            else getAndConfirmVotes();

    }
    private int getAVote(String name1,String name2){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.printf("Who do you want to vote,Select a number\n0. For No Vote\n1. %s\n2. %s",name1,name2);
        System.out.println(i = sc.nextInt());
        return i;
    }
    int [] vote3 = new int[2];
    private int[] getVotes(){
        System.out.println("The choice for President:");
        vote3[0] = getAVote(nameCandidatePresident1,nameCandidatePresident2);
        System.out.println("The choice for Vice President:");
        vote3[1] = getAVote(nameCandidateVicePresident1,nameCandidateVicePresident2);
        return vote3;
    }
    private boolean confirmVotes(){
        String happy;
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nYou have elected candidate number %d for President",vote3[0]);
        System.out.printf("\nYou have elected candidate number %d for Vice President: ",vote3[1]);
        System.out.println("Enter 'YES', if you are happy with your selection else enter 'NO'");
        happy = sc.nextLine();
        boolean confirm;
        confirm = happy.equals("YES");
        return confirm;

    }

    private void recordVotes(){
        usingEnum(vote3[0],vote3[1]);

    }
    private void displayResults(){
        if(votesCandidatePresident1>votesCandidatePresident2)
            System.out.printf("\nMr. %s won the election of President and got %d votes",nameCandidatePresident1,votesCandidatePresident1);
        else
            System.out.printf("\nMr. %s won the election of President and got %d votes",nameCandidatePresident2,votesCandidatePresident2);
        if(votesCandidateVicePresident1>votesCandidateVicePresident2)
            System.out.printf("\nMr. %s won the election of Vice President and got %d votes",nameCandidateVicePresident1,votesCandidateVicePresident1);
        else
            System.out.printf("\nMr. %s won the election of Vice President and got %d votes",nameCandidateVicePresident2,votesCandidateVicePresident2);
        if(votesCandidatePresident1==votesCandidatePresident2)
            System.out.printf("\nMr. %s got the same votes as Mr. %s\nThat is %d votes",nameCandidatePresident1,nameCandidatePresident1,votesCandidatePresident1);
        if(votesCandidateVicePresident1==votesCandidateVicePresident2)
            System.out.printf("\nMr. %s got the same votes as Mr. %s\nThat is %d votes",nameCandidateVicePresident1,nameCandidateVicePresident1,votesCandidateVicePresident1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String v1,v2,v3,v4;
        VoteRecorder vote = new VoteRecorder();
        System.out.println("Welcome to the Vote Recorder Program");
        System.out.println("Please Enter the names of candidates for President:");
        v1 = sc.nextLine();
        v2 = sc.nextLine();
        vote.setCandidatesPresident(v1,v2);
        System.out.println("Please Enter the names of candidates for Vice President:");
        v3 = sc.nextLine();
        v4 = sc.nextLine();
        vote.setCandidatesVicePresident(v3, v4);
        for(int i = 0; i < 1; i++) {
            System.out.println(Arrays.toString(vote.getVotes()));
            System.out.println(vote.confirmVotes());
            vote.recordVotes();
        }
        vote.getAndConfirmVotes();
        String curr = getCurrentVotePresident();
        System.out.println(curr);
        String viceCurr = getCurrentVoteVicePresident();
        System.out.println(viceCurr);
        vote.displayResults();
        resetVotes();
    }
}
