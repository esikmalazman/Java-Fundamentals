/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class logicOperations {

	/**
	 * @param args the command line arguments
	 */
	public static final String GREEN_BACKGROUD = "\033[42m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLUE = "\u001B[34m";

	public static void main(String[] args) {
		// TODO code application logic here
		while (true) {
			Scanner input = new Scanner(System.in);

			String username;
			String password;

			System.out.println(ANSI_BLUE + "\nPlease Register First Before Proceed:" + ANSI_RESET);
			System.out.println("username: ");
			username = input.next();

			System.out.println("password: ");
			password = input.next();

			// users check = new users(username, password);

			if (username.equals(username) && password.equals(password))
				System.out.println("\n\nYou are logged in");

			Scanner course = new Scanner(System.in);

			double t, s, m, sd;
			System.out.println("###################################################");
			System.out.println("\nWelcome to BOXING DAY SALE," + username);
			System.out.println("\nPlease Select Course");
			System.out.println("\n1.Technology(AI) \n2.Science \n3.Multimedia \n4.Software Developement \n");

			System.out.println("Your Choice is :");
			int number = course.nextInt();
			System.out.println("\n");

			t = 16;
			s = 8;
			m = 12;
			sd = 12;

			switch (number) {
			case 1:
				double stu, bas, pro;
				System.out.println("###################################################");
				System.out.println("Please select plan");
				System.out.println("1)Student\n2)Basic\n3)Pro");
				System.out.println("Your Choice is :");
				int numb = course.nextInt();
				System.out.println("###################################################");

				if (numb == 1) {

					System.out.println(ANSI_BLUE + "Retail price of the course is = " + t + ANSI_RESET);
					System.out.println(ANSI_BLUE + "Student price is 60% off" + ANSI_RESET);
					stu = t * 0.6;
					System.out.println(ANSI_BLUE + "The total price is = " + stu + ANSI_RESET);
					System.out.println("###################################################");

					break;
				}
				if (numb == 2) {

					System.out.println(ANSI_BLUE + "Retail price of the course is  = " + t + ANSI_RESET);
					System.out.println(ANSI_BLUE + "Basic price is 40% off");
					bas = t * 0.4;
					System.out.println(ANSI_BLUE + "The price is = " + bas + ANSI_RESET);
					System.out.println("###################################################");
					break;

				}

				if (numb == 3) {

					System.out.println(ANSI_BLUE + "Retail price of the course is  = " + t + ANSI_RESET);
					System.out.println(ANSI_BLUE + "Student price is 20% off" + ANSI_RESET);
					pro = t * 0.2;
					System.out.println(ANSI_BLUE + "The price is = " + pro + ANSI_RESET);
					System.out.println("###################################################");

					break;

				}

			case 2:
				double stu1, bas1, pro1;
				System.out.println("###################################################");
				System.out.println("Please select plan");
				System.out.println("1)Student\n2)Basic\n3)3Pro");
				System.out.println("Your Choice is :");
				int numb1 = course.nextInt();
				System.out.println("###################################################");

				if (numb1 == 1) {

					System.out.println(ANSI_BLUE + "Retail price of the course is  = " + s + ANSI_RESET);
					System.out.println(ANSI_BLUE + "Student price is 60% off" + ANSI_RESET);
					stu1 = s * 0.6;
					System.out.println(ANSI_BLUE + "The price is = " + stu1 + ANSI_RESET);
					System.out.println("###################################################");
					break;
				}
				if (numb1 == 2) {

					System.out.println(ANSI_BLUE + "Retail price of the course is  = " + s + ANSI_RESET);
					System.out.println(ANSI_BLUE + "Basic price is 40% off" + ANSI_RESET);
					bas1 = s * 0.4;
					System.out.println(ANSI_BLUE + "The price is = " + bas1 + ANSI_RESET);
					System.out.println("###################################################");
					break;
				}
				if (numb1 == 3) {

					System.out.println(ANSI_BLUE + "Retail price of the course is  = " + s + ANSI_RESET);
					System.out.println(ANSI_BLUE + "Pro price is 20% off" + ANSI_RESET);
					pro1 = s * 0.2;
					System.out.println(ANSI_BLUE + "The price is = " + pro1 + ANSI_RESET);
					System.out.println("###################################################");

					break;
				}
			case 3:
				double stu2, bas2, pro2;
				System.out.println("###################################################");
				System.out.println("Please select plan");
				System.out.println("1)Student\n2)Basic\n3)Pro");
				System.out.println("Your Choice is :");
				int numb2 = course.nextInt();
				System.out.println("###################################################");

				if (numb2 == 1) {

					System.out.println(ANSI_BLUE + "Retail price of the course is  = " + m + ANSI_RESET);
					System.out.println(ANSI_BLUE + "Student price is 60% off" + ANSI_RESET);
					stu2 = m * 0.6;
					System.out.println(ANSI_BLUE + "The price is = " + stu2 + ANSI_RESET);
					System.out.println("###################################################");
					break;
				}
				if (numb2 == 2) {

					System.out.println(ANSI_BLUE + "Retail price of the course is  = " + m + ANSI_RESET);
					System.out.println(ANSI_BLUE + "Basic price is 40% off" + ANSI_RESET);
					bas2 = m * 0.4;
					System.out.println(ANSI_BLUE + "The price is = " + bas2 + ANSI_RESET);
					System.out.println("###################################################");
					break;
				}
				if (numb2 == 3) {

					System.out.println(ANSI_BLUE + "Retail price of the course is  = " + m + ANSI_RESET);
					System.out.println(ANSI_BLUE + "Pro price is 20% off" + ANSI_RESET);
					pro2 = m * 0.2;
					System.out.println(ANSI_BLUE + "The price is = " + pro2 + ANSI_RESET);
					System.out.println("###################################################");

					break;
				}

			case 4:
				double stu3, bas3, pro3;
				System.out.println("###################################################");
				System.out.println("Please select plan");
				System.out.println("1)Student\n2)Basic\n3)Pro");
				System.out.println("Your Choice is :");
				int numb3 = course.nextInt();
				System.out.println("###################################################");

				if (numb3 == 1) {

					System.out.println(ANSI_BLUE + "Retail price of the course is  = " + sd + ANSI_RESET);
					System.out.println("Student price is 60% off" + ANSI_RESET);
					stu3 = sd * 0.6;
					System.out.println(ANSI_BLUE + "The price is = " + stu3 + ANSI_RESET);
					System.out.println("###################################################");
					break;
				}
				if (numb3 == 2) {

					System.out.println(ANSI_BLUE + "Retail price of the course is  = " + sd + ANSI_RESET);
					System.out.println(ANSI_BLUE + "Basic price is 40% off" + ANSI_RESET);
					bas3 = sd * 0.4;
					System.out.println(ANSI_BLUE + "The price is = " + bas3 + ANSI_RESET);
					System.out.println("###################################################");
					break;
				}
				if (numb3 == 3) {

					System.out.println(ANSI_BLUE + "Retail price of the course is  = " + sd + ANSI_RESET);
					System.out.println(ANSI_BLUE + "Pro price is 20% off" + ANSI_RESET);
					pro3 = sd * 0.2;
					System.out.println(ANSI_BLUE + "The price is = " + pro3 + ANSI_RESET);
					System.out.println("###################################################");

					break;
				} else {
					System.out.println("YOUR INPUT IS INVALID");
				}
			default:
			}

		}
	}

}