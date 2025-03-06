/*aydensantiago*/
    import java.util.Scanner; 
    public class Election {
        public static void main(String[] args) {
            // Create a Scanner to get input from the user
            Scanner scanner = new Scanner(System.in);
            // Ask for votes in New York
            System.out.print("Enter votes for Aubrey in New York: ");
            double nyAubrey = scanner.nextInt();
            System.out.print("Enter votes for Martinez in New York: ");
            double nyMartinez = scanner.nextInt();
            // Ask for votes in New Jersey
            System.out.print("Enter votes for Aubrey in New Jersey: ");
            double njAubrey = scanner.nextInt();
            System.out.print("Enter votes for Martinez in New Jersey: ");
            double njMartinez = scanner.nextInt();
            // Ask for votes in Connecticut
            System.out.print("Enter votes for Aubrey in Connecticut: ");
            double ctAubrey = scanner.nextInt();
            System.out.print("Enter votes for Martinez in Connecticut: ");
            double ctMartinez = scanner.nextInt();
            // Calculate total votes for each candidate
            double totalAubrey = nyAubrey + njAubrey + ctAubrey;
            double totalMartinez = nyMartinez + njMartinez + ctMartinez;
            double results = totalAubrey + totalMartinez;