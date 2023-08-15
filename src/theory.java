public class theory {
    public static void main(String[] args) {
        int[] issueByMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 12};
        
        printSeparator();
        
        for (int i = 0; i < issueByMonth.length; i++) {
            printIssues(issueByMonth[i], "Monthly report");
            if ((i + 1) % 3 == 0)  printSeparator();
        }
        int total = sum(issueByMonth);
        printIssues(total, "Total report");
    }

    public static void printSeparator() {
        System.out.println("========================");
    }
    public static void printIssues(int issueCount, String message) {
        System.out.printf("%s: %s%n", message, issueCount);
    }
    
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
