import java.util.Scanner;
import java.util.Random;

public class main
{

    public static void main(String[] args)
    {
//        System.out.println("Hello World!");
//        AsciiChars.printLowerCase();
//        AsciiChars.printUpperCase();
//        AsciiChars.printNumbers();

        //Lottery Game 
        System.out.println("\nPlease enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Hello "+name+"! \n\n");
        
        System.out.println("\nWould you like to continue to the interactive section? (yes or no) \n");
        String response = input.next();
        response = format(response);
        Boolean flag;
        
        if (response.equals("yes") || response.equals("y")) {
            flag=true;
        }
        else 
        {
            System.out.println("\nPlease return later to complete the survery. Or not!");
            return;
        }
        
        String pet, yesno, actor;
        Integer petAge, luckyNum, carNum, ranNum, magicBall;
        Integer jerseyNum =1;
        Boolean jersey=false;
        int upperLimit = 65;
        
        while (flag) 
        {
            System.out.println("What is the name of your favorite pet?\n");
            pet = input.next();
            pet = format(pet);
            
            System.out.println("What is the age of your pet? (integer)\n");
            petAge = input.nextInt();
            
            System.out.println("What is your lucky number? (integer)\n");
            luckyNum = input.nextInt();
            
            System.out.println("Do you have a favorite quarterback? If yes, enter jersey number. (yes or no)\n");
            yesno = input.next();
            yesno=format(yesno);
            if (yesno == "yes" || yesno == "y") 
            {
               System.out.println("What is their jersey number?\n");
               jerseyNum = input.nextInt();
               jersey=true;
                
            }
            System.out.println("What is the 2 digit model year of your car? \n");
            carNum = input.nextInt();
            
            System.out.println("What is the name of your favorite actor? \n");
            actor = input.next();
            
            System.out.println("Enter a random number between 1 and 50\n");
            ranNum=input.nextInt();
            //End of input from user section
            
            
            //Generate random numbers 
            Random rand = new Random (upperLimit);
            int rand1 = rand.nextInt(25);
            int rand2 = rand.nextInt(25);
            int rand3 = rand.nextInt(25);
            
            //Generate magic ball number          
            if (jersey) 
            {
                magicBall = jerseyNum*rand1;
            }
            else
            {
                magicBall = luckyNum*rand2;
            }
            
            //Ensure magicBall <= 75
            while (magicBall > 75 ) 
            {
                magicBall-=75;
            }

            
            //Lottery Number 1
            int nonMagicNum1 = (pet.charAt(2));
            while (nonMagicNum1>65) {
                nonMagicNum1-=rand3;
            }
            
            //Lottery Number 2
            int nonMagicNum2 = carNum+luckyNum;
            while (nonMagicNum2>65) {
                nonMagicNum2-=rand2;
            }
            
            //Lottery number 3
            int nonMagicNum3 = rand.nextInt(50)-rand2;
            
            //Lottery number 4
            int nonMagicNum4 = 42;
            
            //Lottery number 5
            int nonMagicNum5 = actor.charAt( (actor.length()-1) );
            while (nonMagicNum5 >65) {
                nonMagicNum5-=rand1;
            }
            
            //Display lottery and magic nums to user
            String comma = ", ";
            String text = "Lottery numbers: "+nonMagicNum1+comma+nonMagicNum2+comma
                    + nonMagicNum3+comma+nonMagicNum4+comma+nonMagicNum5+comma+"Magic ball: "
                    + magicBall;
                    
            System.out.println(text);
            
            //Ask user to play another round. If not no, loop continues. 
            System.out.println("Generate another round? (yes or no)");
            String end = input.next();
            end=format(end);

            if( end.equals("no") ) 
            {
                System.out.println("Thanks for playing! Bye!\n\n");
                flag=false;
            }
            
            
            
            
        }
        
        
        
        
    }

    private static String format(String x)
    {

        x=x.strip();
        x=x.toLowerCase();
        return x;
    }
    
        }

