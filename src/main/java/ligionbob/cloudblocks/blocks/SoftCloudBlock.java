package ligionbob.cloudblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;

public class SoftCloudBlock extends Block {
    private static final String regName = "soft_cloud";
    public SoftCloudBlock(Settings settings) {
        super(settings);
    }
    public static String getRegName() {
        return regName;
    }
}
