package snehalproject;

import java.util.ArrayList;
import java.util.Scanner;

// Bug cha structure - ha class LoginTest chya baher pahije
class Bug {
    int bugId;
    String bugTitle;
    String severity; // High, Medium, Low
    String status;   // Open, Closed

    Bug(int id, String title, String sev) {
        this.bugId = id;
        this.bugTitle = title;
        this.severity = sev;
        this.status = "Open";
    }
    
    void displayBug() {
        System.out.println("ID: " + bugId + " | Title: " + bugTitle + " | Severity: " + severity + " | Status: " + status);
    }
}

public class LoginTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bug> bugList = new ArrayList<>();
        
        // 3 default bugs takle
        bugList.add(new Bug(101, "Login button not clickable on mobile", "High"));
        bugList.add(new Bug(102, "Payment gateway timeout issue", "High"));
        bugList.add(new Bug(103, "Spelling mistake in About Us page", "Low"));
        
        System.out.println("====== QA Bug Tracking System ======");
        System.out.println("Total Bugs Found: " + bugList.size());
        System.out.println("------------------------------------");
        
        // Sagle bugs dakhav
        for (Bug b : bugList) {
            b.displayBug();
        }
        
        System.out.println("------------------------------------");
        System.out.println("Test Case Status: PASS - Bug report generated successfully");
        
        sc.close();
    }
}