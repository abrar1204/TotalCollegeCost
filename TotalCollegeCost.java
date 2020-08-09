
import java.util.Scanner;

public class TotalCollegeCost
{
  public static void main(String[] args)
  {
    double tuition, roomboard, bookssupplies, transportation, othercosts, totalcost;
    Scanner cost = new Scanner(System.in);
    
    System.out.println("Enter the cost of tuition for one year (around 30 credit hours): ");
    tuition = cost.nextDouble();
  
    System.out.println("Enter the cost of room and board for one year: ");
    roomboard = cost.nextDouble();
  
    System.out.println("Enter the cost of your books and other supplies for one year: ");
    bookssupplies = cost.nextDouble();
    
    System.out.println("Enter the cost of transportation for one year: ");
    transportation = cost.nextDouble();
    
    System.out.println("Enter the cost of anything else that hasn't been included while attending college for one year: ");
    othercosts = cost.nextDouble();
    
    totalcost = (tuition + roomboard + bookssupplies + transportation + othercosts) * 4; 
      
    System.out.println("The total cost of attending your four-year college will be: " + totalcost);
  }
}
    
      
      