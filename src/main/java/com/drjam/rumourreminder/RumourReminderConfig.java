package com.drjam.rumourreminder;

import java.awt.Color;

import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup("RumourReminder")
public interface RumourReminderConfig extends Config {
	String CONFIG_GROUP = "RumourReminder";

	@ConfigItem(
			keyName = "highlightTurnIn",
			name = "Highlight Turn In",
			description = "Highlight the hunter you were given the rumour by",
			position = 0
	)
	default boolean highlightTurnInhunter() {
		return true;
	}

	@ConfigSection(
			name = "Turn In Style",
			description = "Style for the turn in hunter",
			position = 2,
			closedByDefault = true
	)
	String turnInSection = "turnInSection";

	@ConfigItem(
			position = 0,
			keyName = "turnInHull",
			name = "Highlight hull",
			description = "Configures whether or not hunter should be highlighted by hull",
			section = turnInSection
	)
	default boolean turnInHull()
	{
		return false;
	}

	@ConfigItem(
			position = 1,
			keyName = "turnInTile",
			name = "Highlight tile",
			description = "Configures whether or not hunter should be highlighted by tile",
			section = turnInSection
	)
	default boolean turnInTile()
	{
		return false;
	}

	@ConfigItem(
			position = 2,
			keyName = "turnInOutline",
			name = "Highlight outline",
			description = "Configures whether or not the model of the hunter should be highlighted by outline",
			section = turnInSection
	)
	default boolean turnInOutline()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			position = 3,
			keyName = "turnInColor",
			name = "Highlight Color",
			description = "Color of the hunter highlight border, menu, and text",
			section = turnInSection
	)
	default Color turnInColor()
	{
		return Color.GREEN;
	}

	@Alpha
	@ConfigItem(
			position = 4,
			keyName = "turnInFillColor",
			name = "Fill Color",
			description = "Color of the hunter highlight fill",
			section = turnInSection
	)
	default Color turnInFillColor()
	{
		return new Color(0, 255, 0, 20);
	}

	@ConfigItem(
			position = 5,
			keyName = "turnInBorderWidth",
			name = "Border Width",
			description = "Width of the highlighted hunter border",
			section = turnInSection
	)
	default double turnInBorderWidth()
	{
		return 2;
	}

	@ConfigItem(
			position = 6,
			keyName = "turnInOutlineFeather",
			name = "Outline feather",
			description = "Specify between 0-4 how much of the model outline should be faded",
			section = turnInSection
	)
	@Range(
			min = 0,
			max = 4
	)
	default int turnInOutlineFeather()
	{
		return 0;
	}

	@ConfigSection(
			name = "Whistle Warning",
			description = "Warning for when you have no charges left on your Quetzal Whistle",
			position = 3,
			closedByDefault = false
	)
	String whistleWarningSection = "whistleWarningSection";
	
	@ConfigItem(
		keyName = "whistleWarning",
		name = "Enable Whistle Warning",
		description = "Warns you when you have no charges left on your Quetzal Whistle",
		position = 0,
		section = whistleWarningSection
	)
	default boolean whistleWarning() {
		return true;
	}

	@ConfigItem(
		keyName = "whistleWarningCharges",
		name = "Whistle Charges",
		description = "The number of charges left on your Quetzal Whistle when the warning will be displayed",
		position = 1,
		section = whistleWarningSection
	)
	default int whistleWarningCharges() {
		return 0;
	}

	@Alpha
    @ConfigItem(
            keyName = "whistleWarningTextColor",
            name = "Text color",
            description = "Configures the color of the whistle warning text",
            position = 2,
			section = whistleWarningSection
    )
    default Color whistleWarningTextColor() {
        return Color.RED;
    }

    @Range(
            max = 100
    )
    @ConfigItem(
            keyName = "whistleWarningTextSize",
            name = "Text size",
            description = "Configures the size of the whistle warning text",
            position = 3,
			section = whistleWarningSection
    )
    default int whistleWarningTextSize() {
        return 16;
    }

	@ConfigItem(
			keyName = "highlightTargetCreature",
			name = "Highlight Target Creature",
			description = "Highlight the creature of your current rumour (e.g. Dark kebbit)",
			position = 1
	)
	default boolean highlightTargetCreature() {
		return true;
	}

	@ConfigSection(
			name = "Target Creature Style",
			description = "Style for the rumour target creature",
			position = 4,
			closedByDefault = true
	)
	String targetSection = "targetSection";

	@ConfigItem(position = 0, keyName = "targetHull", name = "Highlight hull",
			description = "Highlight the creature by hull", section = targetSection)
	default boolean targetHull() { return false; }

	@ConfigItem(position = 1, keyName = "targetTile", name = "Highlight tile",
			description = "Highlight the creature's tile", section = targetSection)
	default boolean targetTile() { return false; }

	@ConfigItem(position = 2, keyName = "targetOutline", name = "Highlight outline",
			description = "Highlight the creature's model by outline", section = targetSection)
	default boolean targetOutline() { return true; }

	@Alpha
	@ConfigItem(position = 3, keyName = "targetColor", name = "Highlight Color",
			description = "Color of the creature highlight", section = targetSection)
	default Color targetColor() { return Color.CYAN; }

	@Alpha
	@ConfigItem(position = 4, keyName = "targetFillColor", name = "Fill Color",
			description = "Color of the creature highlight fill", section = targetSection)
	default Color targetFillColor() { return new Color(0, 255, 255, 20); }

	@ConfigItem(position = 5, keyName = "targetBorderWidth", name = "Border Width",
			description = "Width of the creature highlight border", section = targetSection)
	default double targetBorderWidth() { return 2; }

	@ConfigItem(position = 6, keyName = "targetOutlineFeather", name = "Outline feather",
			description = "Specify between 0-4 how much of the model outline should be faded",
			section = targetSection)
	@Range(min = 0, max = 4)
	default int targetOutlineFeather() { return 0; }

	@ConfigItem(
			keyName = "infoBoxTimeoutMinutes",
			name = "Hide infobox after (minutes)",
			description = "Hide the rumour infobox after this many minutes without Hunter XP. 0 = never",
			position = 10
	)
	@Range(min = 0, max = 240)
	default int infoBoxTimeoutMinutes() {
		return 10;
	}
}
