package uk.co.shadowravengames.smeltersforge.items;

import uk.co.shadowravengames.smeltersforge.lib.Reference;
import net.minecraft.item.Item;

public class CobbleChunkItem extends Item {
	public CobbleChunkItem(int i) {
		super(i);
	    setTextureFile(Reference.ITEM_SPRITE_SHEET);
	    setIconIndex(66);
	}
}
