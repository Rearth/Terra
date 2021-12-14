/*
 * This file is part of Terra.
 *
 * Terra is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Terra is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Terra.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.dfsek.terra.config.pack;

import com.dfsek.tectonic.api.config.template.ConfigTemplate;
import com.dfsek.tectonic.api.config.template.annotations.Default;
import com.dfsek.tectonic.api.config.template.annotations.Value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dfsek.terra.api.config.meta.Meta;
import com.dfsek.terra.api.world.chunk.generation.stage.GenerationStage;
import com.dfsek.terra.api.world.chunk.generation.util.provider.ChunkGeneratorProvider;


@SuppressWarnings({ "unused", "FieldMayBeFinal" })
public class ConfigPackTemplate implements ConfigTemplate {
    @Value("id")
    private String id;
    
    @Value("variables")
    @Default
    private @Meta Map<String, @Meta Double> variables = new HashMap<>();
    
    @Value("beta.carving")
    @Default
    private @Meta boolean betaCarvers = false;
    
    @Value("structures.locatable")
    @Default
    private @Meta Map<@Meta String, @Meta String> locatable = new HashMap<>();
    
    @Value("blend.terrain.elevation")
    @Default
    private @Meta int elevationBlend = 4;
    
    @Value("vanilla.mobs")
    @Default
    private @Meta boolean vanillaMobs = true;
    
    @Value("vanilla.caves")
    @Default
    private @Meta boolean vanillaCaves = false;
    
    @Value("vanilla.decorations")
    @Default
    private @Meta boolean vanillaDecorations = false;
    
    @Value("vanilla.structures")
    @Default
    private @Meta boolean vanillaStructures = false;
    
    @Value("author")
    @Default
    private String author = "Anon Y. Mous";
    
    @Value("disable.sapling")
    @Default
    private @Meta boolean disableSaplings = false;
    
    @Value("stages")
    private @Meta List<@Meta GenerationStage> stages;
    
    @Value("version")
    @Default
    private String version = "0.1.0";
    
    @Value("disable.carvers")
    @Default
    private @Meta boolean disableCarvers = false;
    
    @Value("disable.structures")
    @Default
    private @Meta boolean disableStructures = false;
    
    @Value("disable.ores")
    @Default
    private @Meta boolean disableOres = false;
    
    @Value("disable.trees")
    @Default
    private @Meta boolean disableTrees = false;
    
    @Value("disable.flora")
    @Default
    private @Meta boolean disableFlora = false;
    
    @Value("generator")
    private @Meta ChunkGeneratorProvider generatorProvider;
    
    public boolean disableCarvers() {
        return disableCarvers;
    }
    
    public boolean disableFlora() {
        return disableFlora;
    }
    
    public boolean disableOres() {
        return disableOres;
    }
    
    public boolean disableStructures() {
        return disableStructures;
    }
    
    public boolean disableTrees() {
        return disableTrees;
    }
    
    public boolean vanillaMobs() {
        return vanillaMobs;
    }
    
    public boolean vanillaCaves() {
        return vanillaCaves;
    }
    
    public boolean vanillaDecorations() {
        return vanillaDecorations;
    }
    
    public boolean vanillaStructures() {
        return vanillaStructures;
    }
    
    public boolean doBetaCarvers() {
        return betaCarvers;
    }
    
    public ChunkGeneratorProvider getGeneratorProvider() {
        return generatorProvider;
    }
    
    public List<GenerationStage> getStages() {
        return stages;
    }
    
    public String getVersion() {
        return version;
    }
    
    public boolean isDisableSaplings() {
        return disableSaplings;
    }
    
    public String getID() {
        return id;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public Map<String, Double> getVariables() {
        return variables;
    }
    
    public int getElevationBlend() {
        return elevationBlend;
    }
    
    public Map<String, String> getLocatable() {
        return locatable;
    }
}
