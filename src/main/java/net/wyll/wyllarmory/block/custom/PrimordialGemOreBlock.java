package net.wyll.wyllarmory.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.wyll.wyllarmory.util.ModTags;

public class PrimordialGemOreBlock extends Block {

    public static final BooleanProperty MINED = BooleanProperty.create("mined");

    public PrimordialGemOreBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(MINED, false));
    }

    @Override
    public void attack(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer) {
        interact(pState, pLevel, pPos);
        super.attack(pState, pLevel, pPos, pPlayer);
    }

    private static void interact(BlockState pState, Level pLevel, BlockPos pPos) {
        if (!(Boolean)pState.getValue(MINED)) {
            pLevel.setBlock(pPos, pState.setValue(MINED, true), 3);
        }

    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(MINED);
    }




}
