//This program is run by Dhruv Vekariya
public class pra_5Main {
    public static void main(String[] args) {
        pra_5 p1=new pra_5();
        pra_5 sc1= new pra_5();
        pra_5 sc2=new pra_5();
        pra_5 sc3 =new pra_5();

        System.out.println("The average of the numbers is :"+sc1.getAverage(4));    //call the function getAverage
        System.out.println("The average of the numbers is :"+sc2.getAverage(4,8)); //call an overloaded function getAverage
        System.out.println("The average of the numbers is :"+sc3.getAverage(4,7,12));  //call an overloaded function getAverage
        System.out.println("This program is run by Dhruv Vekariya(21CE152)");
    }
}
