package ligionbob.cloudblocks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CloudBlocks implements ModInitializer {

	public static final String modid = "cloudblocks";
	public static final Block CLOUD_BLOCK = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.0F));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier(modid, "cloud"), CLOUD_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(modid, "cloud"), new BlockItem(CLOUD_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

	}
}
