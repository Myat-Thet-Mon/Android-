package ch5Project;

class BasketballGame {
    private String nameOfTheFirstTeam;
    private String nameOfTheSecondTeam;
    private int scoreOfTheFirstTeam;
    private int scoreOfTheSecondTeam;
    private String statusOfTheGame;

    /**
     * If the driver enter valid name of the team,this method will add one score to the team
     * if the driver enter invalid  name Of the team;this method will do nothing
     *
     * @param nameOfTheTeam
     */
    public void addOnePoint(String nameOfTheTeam) {
        if (nameOfTheTeam.equalsIgnoreCase("first")) {
            scoreOfTheFirstTeam++;
        } else if (nameOfTheTeam.equalsIgnoreCase("second")) {
            scoreOfTheSecondTeam++;
        }
    }

    public void addTwoPoint(String nameOfTheTeam) {
        if (nameOfTheTeam.equalsIgnoreCase("first")) {
            scoreOfTheFirstTeam += 2;
        } else if (nameOfTheTeam.equalsIgnoreCase("second")) {
            scoreOfTheSecondTeam += 2;
        }
    }

    public void addThreePoint(String nameOfTheTeam) {
        if (nameOfTheTeam.equalsIgnoreCase("first")) {
            scoreOfTheFirstTeam += 3;
        } else if (nameOfTheTeam.equalsIgnoreCase("second")) {
            scoreOfTheSecondTeam += 3;
        }
    }

    public String finished() {
        return this.statusOfTheGame = "The game is finished";
    }

    public int scoreOfTheTeam(String teamName) {
        if (teamName.equalsIgnoreCase("first")) {
            return scoreOfTheFirstTeam;
        } else {
            return scoreOfTheSecondTeam;
        }
        //else if(teamName.equalsIgnoreCase("second")){
        //   return scoreOfTheSecondTeam;
        // }
    }

    public String getNameOfTheFirstTeam() {
        return nameOfTheFirstTeam;
    }

    public void setNameOfTheFirstTeam(String nameOfTheFirstTeam) {
        this.nameOfTheFirstTeam = nameOfTheFirstTeam;
    }

    public String getNameOfTheSecondTeam() {
        return nameOfTheSecondTeam;
    }

    public void setNameOfTheSecondTeam(String nameOfTheSecondTeam) {
        this.nameOfTheSecondTeam = nameOfTheSecondTeam;
    }


    public String getStatusOfTheGame() {
        return statusOfTheGame;
    }

    public void setStatusOfTheGame(String statusOfTheGame) {
        this.statusOfTheGame = statusOfTheGame;
    }

    /**
     *
     * @return
     */
    public String nameOfTheTeamCurrentlyWinning() {
        if (scoreOfTheFirstTeam > scoreOfTheSecondTeam) {
            return nameOfTheFirstTeam;
        } else if(scoreOfTheSecondTeam > scoreOfTheFirstTeam){
            return nameOfTheSecondTeam;
        }
        return "";
    }
}

public class Exercise9 {
    public static void main(String[] args) {
        String firstTeamName = "barce";
        String secondTeamName = "mhr";
        BasketballGame obj = new BasketballGame();
        obj.setNameOfTheFirstTeam(firstTeamName);
        obj.setNameOfTheSecondTeam(secondTeamName);
        obj.addOnePoint(firstTeamName);
        obj.addThreePoint(secondTeamName);
        obj.scoreOfTheTeam("first");
        obj.scoreOfTheTeam("second");
      //  System.out.println("First team score " + obj.getScoreOfTheFirstTeam() + "," + " Second team score " +
      //          obj.getScoreOfTheSecondTeam() + ";" + obj.nameOfTheTeamCurrentlyWinning() + " is winning");
        System.out.println(obj.finished());
    }
}
