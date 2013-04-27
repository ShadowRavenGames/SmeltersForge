package uk.co.shadowravengames.smeltersforge.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class OreItems extends ItemBlock {
	
	public static String[] blockNames = {
		"Sodium",
		"Calcium",
		"Magnesium",
		"Aluminium",
		"Zinc",
		"Lead",
		"Magnetite",
		"Titanium",
		"Chromium",
		"Cobalt",
		"Nickel",
		"Platinum",
		"Mercury",
		"Lithium",
		"Plutonium",
		"Arsenic",
	};

	public OreItems(int i) {
		super(i);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	
	public int getMetadata(int damage) {
		return damage;
	}
	
	public String getItemNameIS(ItemStack itemstack) {
		return (new StringBuilder())
								.append(super.getItemDisplayName(itemstack))
								.append(".")
								.append(blockNames[itemstack.getItemDamage()])
								.toString();
	}
	
}
