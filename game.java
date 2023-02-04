import java.util.Scanner;

class game {
    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);
        //quit statement

        int won=0;
        int losses=0;
        int ter=0;
        while(ter!=3){

            System.out.println("Enter your move by using rock, paper, scisser.if you want to exit the game use quit");
             String myMove = choose.nextLine();

        if(myMove.equals("quit")){
            break;
        }
        // write our move
        if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissor")) {
            System.out.println("your move isn't correct");
        } else {

            // genrate random number (0,1,2) in 3 nunber

            int rand = (int) (Math.random() * 3);
            String oppenentMove = " ";
            if (rand == 0) {
                oppenentMove = "rock";
            } else if (rand == 1) {
                oppenentMove = "paper";
            } else {
                oppenentMove = "scissor";
            }
            System.out.println("OppnentMove:" + oppenentMove);

            if (myMove.equals(oppenentMove)) {
                System.out.println("Match Draw");

            } 
            else if ((myMove.equals("rock") && oppenentMove.equals("scissor"))
                    || (myMove.equals("paper") && oppenentMove.equals("rock"))
                    || (myMove.equals("scissor") && oppenentMove.equals("paper"))) {
                System.out.println("You win :)" );
                won++;

            }
            else{
                System.out.println("you have lost the Game:(");
                losses++;
            }
        }
      ter++; 
    }
    if(won>losses){
        System.out.println("you have won "+ won +" game than losse "+losses +":)");
    }
    else if(won<losses){
        System.out.println("you have losse "+ losses +" game than won "+won +":(");
    }
    else{
        System.out.println("you have losse "+ losses +" and won " +won + " equal games" );
    }
    System.out.println("Thanks for playing :)");
       
    }
}