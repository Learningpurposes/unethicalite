package dev.hoot.bot.script.paint;

import dev.hoot.api.game.Skills;
import lombok.Value;
import net.runelite.api.Skill;

@Value
public class ExperienceTracker
{
	Skill skill;
	int startExp;
	int startLevel;

	public int getExperienceGained()
	{
		return Skills.getExperience(skill) - startExp;
	}

	public int getLevelsGained()
	{
		return Skills.getLevel(skill) - startLevel;
	}
}
