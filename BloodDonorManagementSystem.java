import java.util.*;

public class BloodDonorManagementSystem {
	public static class BloodDonor {
		String name;
		String group;
		int age;
		String place;
		String number;

		static ArrayList<BloodDonor>list = new ArrayList<>();

		public BloodDonor() {
			list.add(this);
		}

		public BloodDonor(String name, String group, int age, String place, String number) {
			this.name = name;
			this.group = group;
			this.age = age;
			this.place = place;
			this.number = number;
			list.add(this);
		}

		public void printInfo() {
			System.out.println(this.name + "\n" + this.group + "\n" + this.age + "\n" + this.place + "\n" + this.number + "\n");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String group;
		String place;

		new BloodDonor("Priyanto Chandra Dey", "A+", 20, "Sylhet", "017XXXXXXXX");
		new BloodDonor("Anik Roy", "O+", 22, "Comilla", "018XXXXXXXX");
		new BloodDonor("Mutahar Mahmud Chy", "O-", 30, "Dhaka", "019XXXXXXXX");
		new BloodDonor("Mahan Roy", "AB+", 25, "Rangpur", "017XXXXXXXX");
		new BloodDonor("Tamim Amin", "AB-", 26, "Rajshahi", "01777XXXXXX");
		new BloodDonor("Puja Chowdhury","O+", 21, "Dhaka", "016XXXXXXXX");

		int task = 1;
		while (task != 0) {
			System.out.println("Enter Your Task:\n1.Add new Donor.\n2.Find nearest Blood Donor\n3.See all donor from the list.\n4.See placewise all donor.\n5.See groupwise all donor.\n6.Exit.");
			task = sc.nextInt();
			sc.nextLine();
			if (task == 6) {
				System.out.println("Thank You");
				break;
			} else if (task == 1) {
				System.out.println("Enter New donor's name:");
				String name = sc.nextLine();
				System.out.println("Enter New donor's Blood Group:");
				group = sc.nextLine();
				System.out.println("Enter the age of New donor:");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the place name of New donor:");
				place = sc.nextLine();
				System.out.println("Enter the mobile number of New donor:");
				String number = sc.nextLine();
				new BloodDonor(name, group, age, place, number);
				System.out.println("New Donor Added in the list.\n\n");
			} else if (task == 2) {
				System.out.println("Finding nearest Blood Donor from the list...");
				System.out.println("Enter patient's Blood Group:");
				group = sc.nextLine();
				System.out.println("Enter patient's location:");
				place = sc.nextLine();
				boolean groupmatch = false;
				boolean placematch = false;
				for (int i = 0; i < BloodDonor.list.size(); i++) {
					if (BloodDonor.list.get(i).group.equals(group)) {
						groupmatch = true;
						if (BloodDonor.list.get(i).place.equals(place)) {
							placematch = true;
							BloodDonor.list.get(i).printInfo();
						}
					}
				}
				if (placematch == false && groupmatch == true) {
					System.out.println("We donot have nearest blood donor for you but we have some donor for you in our list:");
					for (int i = 0; i < BloodDonor.list.size(); i++) {
						if (BloodDonor.list.get(i).group.equals(group)) {
							BloodDonor.list.get(i).printInfo();
						}
					}
				}
				if (groupmatch == false) {
					System.out.println("Sorry We donot have any Donor of your group!");
				}
			} else if (task == 3) {
				System.out.println("Here are all Donors from the list:");
				for (int i = 0; i < BloodDonor.list.size(); i++) {
					BloodDonor.list.get(i).printInfo();
					System.out.println();
				}
			} else if (task == 4) {
				System.out.println("Enter place name:");
				place = sc.nextLine();
				for (int i = 0; i < BloodDonor.list.size(); i++) {
					if (BloodDonor.list.get(i).place.equals(place)) {
						BloodDonor.list.get(i).printInfo();
					}
				}
			} else if (task == 5) {
				System.out.println("Enter group name:");
				group = sc.nextLine();
				for (int i = 0; i < BloodDonor.list.size(); i++) {
					if (BloodDonor.list.get(i).group.equals(group)) {
						BloodDonor.list.get(i).printInfo();
					}
				}
			}
		}
	}
}
