public class multiarray 
{
 public static void main(String[] args) 
 {
    int firstarray[][] = {{1,2,3,4,5},{33,44,55,66},{44,56,77}};
    int secondarray[][] = {{1,23,55,23},{34},{99,78}};    

    System.out.println("For the First array");
    display(firstarray);
    System.out.println("\nFor the Second array");
    display(secondarray);

 }   
 public static void display(int x[][])
 {
    for (int rows = 0; rows < x.length; rows++) {
        for(int columns = 0; columns < x[rows].length; columns++)
        {
            System.out.print(x[rows][columns] + "\t");
        }
        System.out.println();
    } 
 }
}
