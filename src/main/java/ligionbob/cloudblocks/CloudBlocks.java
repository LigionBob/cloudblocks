package ligionbob.cloudblocks;

import ligionbob.cloudblocks.blocks.SoftCloudBlock;
import ligionbob.cloudblocks.blocks.SolidCloudBlock;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CloudBlocks implements ModInitializer {

	public static final String modid = "cloudblocks";
	public static final SolidCloudBlock SOLID_CLOUD_BLOCK = new SolidCloudBlock(Block.Settings.of(Material.SNOW_BLOCK).strength(0.1F).breakInstantly().sounds(BlockSoundGroup.SNOW).velocityMultiplier(0.25F));
	public static final SoftCloudBlock SOFT_CLOUD_BLOCK  = new SoftCloudBlock(Block.Settings.of(Material.SNOW_BLOCK).strength(0.1F).breakInstantly().sounds(BlockSoundGroup.SNOW).velocityMultiplier(0.25F).nonOpaque());

	@Override
	public void onInitialize() {
		//Solid Cloud
		Registry.register(Registry.BLOCK, new Identifier(modid, SOLID_CLOUD_BLOCK.getRegName()), SOLID_CLOUD_BLOCK);
		Registry.register(Registry.ITEM,  new Identifier(modid, SOLID_CLOUD_BLOCK.getRegName()), new BlockItem(SOLID_CLOUD_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//Soft Cloud
		Registry.register(Registry.BLOCK, new Identifier(modid, SOFT_CLOUD_BLOCK.getRegName()), SOFT_CLOUD_BLOCK);
		Registry.register(Registry.ITEM,  new Identifier(modid, SOFT_CLOUD_BLOCK.getRegName()), new BlockItem(SOFT_CLOUD_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
