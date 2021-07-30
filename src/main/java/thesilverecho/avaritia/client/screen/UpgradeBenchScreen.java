package thesilverecho.avaritia.client.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import thesilverecho.avaritia.common.Avaritia;
import thesilverecho.avaritia.common.container.UpgradeBenchContainer;

import javax.annotation.Nonnull;

public class UpgradeBenchScreen extends ContainerScreen<UpgradeBenchContainer>
{
	private static final ResourceLocation SCREEN = new ResourceLocation(Avaritia.MOD_ID, "textures/gui/xp_screen.png");

	public UpgradeBenchScreen(UpgradeBenchContainer screenContainer, PlayerInventory inv, ITextComponent titleIn)
	{
		super(screenContainer, inv, titleIn);

	}

	@Override
	public void renderTooltip(@Nonnull MatrixStack matrixStack, @Nonnull ITextComponent text, int mouseX, int mouseY)
	{
		super.renderTooltip(matrixStack, text, mouseX, mouseY);
	}

	@Override
	protected void renderBg(@Nonnull MatrixStack matrixStack, float partialTicks, int x, int y)
	{

		if (minecraft == null)
			return;
		minecraft.getTextureManager().bind(SCREEN);
		int relX = (this.width - this.imageWidth) / 2;
		int relY = (this.height - this.imageHeight) / 2;
		this.blit(matrixStack, relX, relY, 0, 0, this.imageWidth, this.imageHeight);
		Minecraft.getInstance().textureManager.bind(new ResourceLocation(Avaritia.MOD_ID, "textures/gui/box.png"));

		this.menu.slots.forEach(slot -> blit(matrixStack, leftPos + slot.x - 1, topPos + slot.y - 1, 0, 0, 18, 18, 18, 18));

	}

	@Override
	protected void renderLabels(@Nonnull MatrixStack matrixStack, int x, int y)
	{

//		fill();

		super.renderLabels(matrixStack, x, y);
		FontRenderer fontRenderer = Minecraft.getInstance().font;
//		String text = "XP Levels: " + container.getXp();
//		int relX = (this.xSize - fontRenderer.getStringPropertyWidth(new StringTextComponent(text))) / 2;
//		int relY = (10 + fontRenderer.FONT_HEIGHT) / 2;
//		drawString(matrixStack, fontRenderer, text, relX, relY, Color.green.getRGB());
//		fill(matrixStack, this.xSize / 4, relY + 15, this.xSize / 4 + 85, relY + 20, Color.green.getRGB());

	}

	@Override
	public void render(@Nonnull MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks)
	{
		super.render(matrixStack, mouseX, mouseY, partialTicks);
		this.renderTooltip(matrixStack, mouseX, mouseY);
	}

}
