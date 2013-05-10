package uk.co.shadowravengames.smeltersforge.blocks;

import uk.co.shadowravengames.smeltersforge.SmeltersForge;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class OreItems extends ItemBlock {

	public static String[] blockNames = {
		"Sodium Ore",
		"Calcium Ore",
		"Magnesium Ore",
		"Aluminium Ore",
		"Zinc Ore",
		"Lead Ore",
		"Magnetite Ore",
		"Titanium Ore",
		"Chromium Ore",
		"Cobalt Ore",
		"Nickel Ore",
		"Platinum Ore",
		"Mercury Ore",
		"Lithium Ore",
		"Plutonium Ore",
		"Arsenic Ore"
	};

	public OreItems(int i) {
		super(i);
		setHasSubtypes(true);
		setCreativeTab(SmeltersForge.smeltersForgeTab);
	}

	public int getMetadata(int damage) {
		return damage;
	}

	public String getUnlocalizedName(ItemStack itemstack) {
		return getUnlocalizedName() + "." + blockNames[itemstack.getItemDamage()];
	}

}
