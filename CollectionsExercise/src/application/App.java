package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	private static String[][] peopleSkills = { { "Oliver", "programming", "electronics" },
			{ "Jake", "reception", "engineering" },
			{ "Amelia", "programming", "reception", "electronics", "management" },
			{ "Noah", "management", "electronics" }, { "James", "programming", "management", "electronics" },
			{ "Margaret", "engineering", "electronics", "programming", "reception" }, { "Emma", "programming" },
			{ "Jack", "engineering", "electronics", "programming" }, { "Mary", "engineering", "electronics" }, };

	public static void main(String[] args) {

		Rota rota = new Rota();
		
		rota.add(loadData());
		
		System.out.println(rota);

//		rota.nextWeek();
//		rota.nextWeek();
//		
//		System.out.println(rota);
	}

	private static List<Person> loadData() {
		List<Person> people = new ArrayList<>();

		for (var row : peopleSkills) {
			var name = row[0];
			var person = new Person(name);

			for (int i = 1; i < row.length; i++) {
				if(name.equals("Margaret")) {
					person.setOnHoliday(true);
				}
				
				var skill = row[i];
				person.addSkill(Skill.valueOf(skill.toUpperCase()));
			}
			people.add(person);
		}
		
		return people;
	}
}
