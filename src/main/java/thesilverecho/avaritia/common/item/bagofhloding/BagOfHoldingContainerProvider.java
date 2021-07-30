package thesilverecho.avaritia.common.item.bagofhloding;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class BagOfHoldingContainerProvider implements INamedContainerProvider
{
	@Override
	public ITextComponent getDisplayName()
	{
		return new TranslationTextComponent("avaritia.items.bag_of_holding");
	}

	@Override
	public Container createMenu(int p_createMenu_1_, PlayerInventory p_createMenu_2_, PlayerEntity p_createMenu_3_)
	{
		return new BagOfHoldingContainer(p_createMenu_1_, p_createMenu_2_);
	}
}
