package com.dfsek.terra.bukkit.world.block.data;

import com.dfsek.terra.api.platform.block.BlockFace;
import com.dfsek.terra.api.platform.block.data.MultipleFacing;
import com.dfsek.terra.bukkit.world.block.BukkitBlockData;

import java.util.Set;
import java.util.stream.Collectors;

public class BukkitMultipleFacing extends BukkitBlockData implements MultipleFacing {

    public BukkitMultipleFacing(org.bukkit.block.data.MultipleFacing delegate) {
        super(delegate);
    }

    @Override
    public Set<BlockFace> getFaces() {
        return ((org.bukkit.block.data.MultipleFacing) super.getHandle()).getFaces().stream().map(BukkitEnumAdapter::adapt).collect(Collectors.toSet());
    }

    @Override
    public void setFace(BlockFace face, boolean facing) {
        ((org.bukkit.block.data.MultipleFacing) super.getHandle()).setFace(BukkitEnumAdapter.adapt(face), facing);
    }

    @Override
    public Set<BlockFace> getAllowedFaces() {
        return ((org.bukkit.block.data.MultipleFacing) super.getHandle()).getAllowedFaces().stream().map(BukkitEnumAdapter::adapt).collect(Collectors.toSet());
    }

    @Override
    public boolean hasFace(BlockFace f) {
        return ((org.bukkit.block.data.MultipleFacing) super.getHandle()).hasFace(BukkitEnumAdapter.adapt(f));
    }
}
