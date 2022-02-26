package ch6Project;

class VoteRecorder {
    private static String nameCandidatePresident1;
    private static String nameCandidatePresident2;
    private static String nameCandidateVicePresident1;
    private static String nameCandidateVicePresident2;
    private static int votesCandidatePresident1;
    private static int votesCandidatePresident2;
    private static int votesCandidateVicePresident1;
    private static int votesCandidateVicePresident2;
    private static int myVoteForPresident;
    private static int myVoteForVicePresident;

    public VoteRecorder(String name1, String name2, String name1OfVP, String name2OfVP) {
        VoteRecorder.nameCandidatePresident1 = name1;
        VoteRecorder.nameCandidatePresident2 = name2;
        VoteRecorder.nameCandidateVicePresident1 = name1OfVP;
        VoteRecorder.nameCandidateVicePresident2 = name2OfVP;
    }

    public static void setCandidatesPresident(String name1, String name2) {
        VoteRecorder.nameCandidatePresident1 = name1;
        VoteRecorder.nameCandidatePresident2 = name2;
    }

    public static void setCandidatesVicePresident(String name1, String name2) {
        VoteRecorder.nameCandidateVicePresident1 = name1;
        VoteRecorder.nameCandidateVicePresident2 = name2;
    }

    public static void resetVotes() {
        VoteRecorder.votesCandidatePresident1 = 0;
        VoteRecorder.votesCandidatePresident2 = 0;
        VoteRecorder.votesCandidateVicePresident1 = 0;
        VoteRecorder.votesCandidateVicePresident2 = 0;
    }

    public static int getVotesCandidatePresident1() {
        return votesCandidatePresident1;
    }

    public static int getVotesCandidatePresident2() {
        return votesCandidatePresident2;
    }

    public static int getVotesCandidateVicePresident1() {
        return votesCandidateVicePresident1;
    }

    public static int getVotesCandidateVicePresident2() {
        return votesCandidateVicePresident2;
    }

    public String getCurrentVotePresident() {
        int total = getVotesCandidatePresident1() + getVotesCandidatePresident2();
        String totalVote = Integer.toString(total);
        return totalVote;
    }

    public String getCurrentVoteVicePresident() {
        int total = getVotesCandidateVicePresident1() + getVotesCandidateVicePresident2();
        String totalVote = Integer.toString(total);
        return totalVote;
    }

    public void getAndConfirmVotes(String vote, int choice, String confirm) {
        if (vote.equals("President")) {
            if (confirmVotes(confirm) == true && choice == 1) {
                votesCandidatePresident1++;
            } else if (confirmVotes(confirm) == true && choice == 2) {
                votesCandidatePresident2++;
            }
        } else if (vote.equals("Vice President")) {
            if (confirmVotes(confirm) == true && choice == 1) {
                votesCandidateVicePresident1++;
            } else if (confirmVotes(confirm) == true && choice == 2) {
                votesCandidateVicePresident2++;
            }
        }

    }

    private int getAVote(String name1, String name2) {
    return 0;
    }

    public int getVotes(String confirm, int choice) {
        if (confirm.equals("president") && choice == 1) {
            return votesCandidatePresident1;
        } else if (confirm.equals("president") && choice == 2) {
            return votesCandidatePresident2;
        } else if (confirm.equals("Vice President") && choice == 1) {
            return votesCandidateVicePresident1;
        } else {
            return votesCandidateVicePresident2;
        }
    }

    public boolean confirmVotes(String confirmYesOrNo) {
        if (confirmYesOrNo.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    private void recordVotes(String confirm) {

    }
}

public class Exercise13 {
    public static void main(String[] args) {
        VoteRecorder voteRecorder = new VoteRecorder("Sehun", "Yixing", "Suho", "Chen");
        voteRecorder.setCandidatesPresident("Sehun", "Lay");
        voteRecorder.setCandidatesVicePresident("JunMyeon", "JongDae");
        VoteRecorder.resetVotes();
    }
}
