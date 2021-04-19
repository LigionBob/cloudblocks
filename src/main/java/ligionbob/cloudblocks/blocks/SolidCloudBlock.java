package ligionbob.cloudblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SolidCloudBlock extends Block {
    private static final String regName = "solid_cloud";
    public SolidCloudBlock(Settings settings) {
        super(settings);
    }
    public String getRegName() {
        return regName;
    }
    @Override
    public void onLandedUpon(World world, BlockPos pos, Entity entity, float distance) {
        entity.handleFallDamage(distance, 0.0F);
    }
}
