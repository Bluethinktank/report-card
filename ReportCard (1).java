import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Ask user for input
		System.out.println("Enter student name: ");
		String stName = input.nextLine();
		System.out.println("Enter student number: ");
		int stNum = input.nextInt();

		// Create arrays to store unit codes and unit names
		String unitCodes[] = {
			"CMT200",
			"CMT211",
			"CMT208",
			"CMT232",
			"CMT207",
			"CMT212",
			"CMT203",
			"CMT112"
		};
		String unitNames[] = {
			"Computer Archi",
			"System Analysis",
			"Web Development",
			"Programming M",
			"System Design",
			"Java Program",
			"Artificial Int",
			"Data Structures"
		};

		// Create arrays to hold marks for respective units
		int cat1[] = new int[8];
		int cat2[] = new int[8];
		int exam[] = new int[8];

		// Generate random marks for cats and exam
		for (int i = 0; i < 8; i++) {
			cat1[i] = (int)(Math.random() * 11);
			cat2[i] = (int)(Math.random() * 21);
			exam[i] = (int)(Math.random() * 71);
		}

		System.out.println("\t\t\tTHE CATHOLIC UNIVERSITY OF EASTERN AFRICA");
		System.out.println("\t\t\tFACULTY: \tSCIENCE");
		System.out.println("\t\t\tDEPARTMENT: \tCOMPUTER SCIENCE");
		System.out.println("\t\t\tEND OF TRIMESTER RESULTS");
		System.out.println("\nNAME: "+ stName);
		System.out.println("REG. NO.: "+ stNum);

		System.out.println("\n\nUNIT CODE\tUNIT NAME\tCAT1\tCAT2\tTOTAL CAT\tMAIN EXAM\tAGGREGATE\tGRADE");

		for (int i = 0; i < 8; i++) {
			int totalCat = cat1[i] + cat2[i];
			int aggregate  = totalCat + exam[i];
			String grade = getGrade(aggregate);
			System.out.println(unitCodes[i]+"\t\t"+unitNames[i]+"\t"+cat1[i]+"\t"+cat2[i]+"\t"+totalCat+"\t\t"+exam[i]+"\t\t"+aggregate+"\t\t"+grade);
		}
	}

	public static String getGrade(int marks) {
		if (marks >= 70) {
			return "A";
		} else if (marks >= 60) {
			return "B";
		} else if (marks >= 50) {
			return "C";
		} else if (marks >= 40) {
			return "D";
		} else if (marks < 40) {
			return "F";
		}

		return "A";
	}
}