package dev.hoot.bot.account;

import dev.hoot.api.entities.Players;
import dev.hoot.api.game.Game;
import dev.hoot.api.game.Vars;
import net.runelite.api.Player;
import net.runelite.api.VarPlayer;
import net.runelite.api.vars.AccountType;

public class LocalPlayer
{
	public static String getUsername()
	{
		return Game.getClient().getUsername();
	}

	public static String getPassword()
	{
		return Game.getClient().getPassword();
	}

	public static int getTotalLevel()
	{
		return Game.getClient().getTotalLevel();
	}

	public static int getQuestPoints()
	{
		return Vars.getVarp(VarPlayer.QUEST_POINTS.getId());
	}

	public static int getMembershipDays()
	{
		return Game.getMembershipDays();
	}

	public static boolean isMember()
	{
		return getMembershipDays() > 0;
	}

	public static Player getEntity()
	{
		return Players.getLocal();
	}

	public static String getDisplayName()
	{
		return getEntity().getName();
	}

	public static AccountType getAccountType()
	{
		return Game.getClient().getAccountType();
	}
}
