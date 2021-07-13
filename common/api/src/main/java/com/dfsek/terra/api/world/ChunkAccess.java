package com.dfsek.terra.api.world;

import com.dfsek.terra.api.Handle;
import com.dfsek.terra.api.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public interface ChunkAccess extends Handle {
    /**
     * Set the block at x,y,z in the chunk data to material.
     * <p>
     * Setting blocks outside the chunk's bounds does nothing.
     *
     * @param x          the x location in the chunk from 0-15 inclusive
     * @param y          the y location in the chunk from 0 (inclusive) - maxHeight (exclusive)
     * @param z          the z location in the chunk from 0-15 inclusive
     * @param blockState the type to set the block to
     */
    void setBlock(int x, int y, int z, @NotNull BlockState blockState);

    /**
     * Get the type and data of the block at x, y, z.
     * <p>
     * Getting blocks outside the chunk's bounds returns air.
     *
     * @param x the x location in the chunk from 0-15 inclusive
     * @param y the y location in the chunk from 0 (inclusive) - maxHeight (exclusive)
     * @param z the z location in the chunk from 0-15 inclusive
     * @return the data of the block or the BlockData for air if x, y or z are outside the chunk's bounds
     */
    @NotNull BlockState getBlock(int x, int y, int z);
}
