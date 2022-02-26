package ch6Project;

import java.util.Scanner;

class RoomOccupancy{
    private static int numberInRoom=0;
    private static int totalNumber=0;

    public RoomOccupancy(int totalNumber){
        RoomOccupancy.totalNumber=totalNumber;
    }
    public void addOneToRoom(){
        numberInRoom++;
        totalNumber+=1;
    }
    public void removeOneFromRoom(){
        numberInRoom--;
        totalNumber--;
    }
    public int getNumber(){
        return numberInRoom;
    }

    public int getTotalNumber(){
        return totalNumber;
    }
}
public class Exercise8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter total number");
        int total=input.nextInt();
        RoomOccupancy roomOccupancy=new RoomOccupancy(total);
        roomOccupancy.addOneToRoom();
        roomOccupancy.addOneToRoom();
        roomOccupancy.addOneToRoom();
        roomOccupancy.removeOneFromRoom();
        System.out.println("Number of people in room "+roomOccupancy.getNumber());
        System.out.println("Total number of people "+roomOccupancy.getTotalNumber());

    }
}
