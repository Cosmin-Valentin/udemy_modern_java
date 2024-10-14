package application;

import java.util.HashSet;
import java.util.Set;
import static application.Skill.*;

public class VitalSkillSet extends HashSet<Skill> {
	private static final long serialVersionUID = 1L;
	private Set<Skill> vitalSkills = Set.of(PROGRAMMING, MANAGEMENT, RECEPTION);

	public boolean isComplete() {
		for (var skill : vitalSkills) {
			if (!contains(skill)) {
				return false;
			}
		}
		return true;
	}
}
