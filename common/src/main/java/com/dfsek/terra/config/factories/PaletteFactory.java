package com.dfsek.terra.config.factories;

import com.dfsek.terra.api.TerraPlugin;
import com.dfsek.terra.api.world.palette.NoisePalette;
import com.dfsek.terra.api.world.palette.Palette;
import com.dfsek.terra.api.world.palette.holder.PaletteLayerHolder;
import com.dfsek.terra.config.templates.PaletteTemplate;

public class PaletteFactory implements ConfigFactory<PaletteTemplate, Palette> {
    @Override
    public Palette build(PaletteTemplate config, TerraPlugin main) {
        NoisePalette palette = new NoisePalette(config.getNoise().apply(2403L), config.getNoise().getDimensions() == 2);
        for(PaletteLayerHolder layer : config.getPalette()) {
            palette.add(layer.getLayer(), layer.getSize(), layer.getSampler());
        }
        return palette;
    }
}
